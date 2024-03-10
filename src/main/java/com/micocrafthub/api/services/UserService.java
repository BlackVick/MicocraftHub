package com.micocrafthub.api.services;

import com.micocrafthub.api.entities.User;
import com.micocrafthub.api.interfaces.IUserService;
import com.micocrafthub.api.models.dtos.AddUser;
import com.micocrafthub.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public void createUser(AddUser req) {
        User newUser = new User();
        newUser.setFirstName(req.getFirstName());
        newUser.setLastName(req.getLastName());
        newUser.setAge(req.getAge());
        userRepository.save(newUser);
    }
}
