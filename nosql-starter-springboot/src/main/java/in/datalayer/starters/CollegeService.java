package in.datalayer.starters;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeService {
    @Autowired
    private CollegeRepository collegeRepository;

    private Gson gson = new Gson();

    public void displayAllDocuments(){
        List<College> docs = collegeRepository.findAll();
        for(College c: docs) {
            System.out.println(gson.toJson(c,College.class));
        }
    }
}
