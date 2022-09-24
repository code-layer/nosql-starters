package in.datalayer.starters;

import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.conversions.Bson;

public class Application
{
    public static void main( String[] args )
    {
        MongoConfig config = new MongoConfig();

        //get mongo connection
        MongoClient mc = config.getClient();
        MongoDatabase md= mc.getDatabase("datalayer");
        MongoCollection<Document> coll= md.getCollection("college");

        displayAllDocuments(coll);
        findById(coll,1001);
        //close connection
        mc.close();
        System.out.println("End of nosql-starter-java");
    }

    private static void findById(MongoCollection<Document> coll, int _id) {
        System.out.println(" *** Find by _id " + _id);
        Bson filter = Filters.eq("_id", _id);
        FindIterable<Document> docs = coll.find(filter);
        MongoCursor<Document> docsCursor = docs.cursor();
        while(docsCursor.hasNext())
            System.out.println(docsCursor.next());
    }

    private static void displayAllDocuments(MongoCollection<Document> coll) {
        System.out.println(" *** Display all docs");
        FindIterable<Document> docs = coll.find();
        MongoCursor<Document> docsCursor = docs.cursor();
        while(docsCursor.hasNext())
            System.out.println(docsCursor.next());
    }
}
