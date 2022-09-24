package in.datalayer.starters;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class MongoConfig {
    private String uri="mongodb://nosqlfree:vQ6ZbFmv5@x.x.x.x:27017/?authSource=admin";

    public MongoClient getClient(){
        MongoClient mc = MongoClients.create(uri);
        return mc;
    }
}
