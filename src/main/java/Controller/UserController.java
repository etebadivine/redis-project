//package Controller;
//
//
//import Model.User;
//import Repository.UserRepository;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Map;
//
//@RestController
//@RequestMapping( value = "/rest/user",method = RequestMethod.GET)
//public class UserController {
//
//    private UserRepository userRepository;
//
//    public UserController(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//    @GetMapping("/add/{id}/{name}")
//    public User add(@PathVariable("id") final String id,
//                    @PathVariable("name") final String name){
//        userRepository.save(new User(id,name,20000L));
//        return userRepository.findById(id);
//
//    }
//
//    @GetMapping("/update/{id}/{name}")
//    public User update(@PathVariable("id") final String id,
//                    @PathVariable("name") final String name){
//        userRepository.update(new User(id,name,60000L));
//        return userRepository.findById(id);
//
//    }
//
//    @GetMapping("/all")
//    public Map<String, User> update(){
//        return userRepository.findAll();
//
//    }
//}
