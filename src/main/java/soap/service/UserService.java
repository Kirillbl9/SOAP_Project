package soap.service;

import soap.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private static final Map<Double, User> users = new HashMap<>();

    @PostConstruct
    public void initialize() {

        User anton = new User();
        anton.setName("Anton");
        anton.setEmpId(1);
        anton.setSalary(12000);
        anton.setAge(30);

        User peter = new User();
        peter.setName("Peter");
        peter.setEmpId(2);
        peter.setSalary(12000);
        peter.setAge(45);



        users.put(peter.getAge(), peter);
        users.put(anton.getAge(), anton);
    }


    public User getUsers(Double age) {
        return users.get(age);
    }
}
