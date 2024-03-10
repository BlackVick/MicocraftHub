package com.micocrafthub.api.controllers.v1;

import com.micocrafthub.api.interfaces.IUserService;
import com.micocrafthub.api.models.dtos.AddUser;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private IUserService service;

    public UserController(IUserService service){
        this.service = service;
    }

    //add user
    @PostMapping("/add")
    public String addUser(@RequestBody AddUser req){
        service.createUser(req);
        return "User added successfully";
    }

}
