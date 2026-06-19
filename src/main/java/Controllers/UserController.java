package Controllers;

import java.util.List;

import com.kashish.springboot_beginner.models.User;
import com.kashish.springboot_beginner.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserService userService;
    public UserController(UserService userService){
        this.userService=userService;
    }
    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id){
        User user=userService.getUserById(id);
        if(user!=null){
            return ResponseEntity.ok(user);
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping
    public User addnewUser(@RequestBody User user){
        return userService.addUser(user);
    }





}
