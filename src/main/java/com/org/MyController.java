package com.org;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class MyController {

//    @Autowired
//    UserRepo userRepo;
    @GetMapping("/view")
    public String home(){
        return "this is view page this is view in git!!";
    }
    @GetMapping("/welcome")
    public String welcomes(){
        return "this is welcome page!! this changes by akash system";
    }

//    @PostMapping("/add")
//    public String addUser(@RequestBody UserEntity userEntity){
//        userRepo.save(userEntity);
//        return "successfully add user in your db!!";
//    }
//    @GetMapping("/showalluser")
//    public List  show(){
//        List<UserEntity> all = userRepo.findAll();
//        return all;
//    }

}
