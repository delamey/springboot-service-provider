package com.example.springboot.userserviceprovider.demo.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.springboot.userserviceprovider.demo.Entity.UserEntity;
import com.example.springboot.userserviceprovider.demo.Mapper.User1Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import service.GetuserService;

import java.util.List;
@Service
@Component
public class getService implements GetuserService {
    @Autowired
    private User1Mapper user1Mapper;
    public  String reString;
    @Override
    public String getUsers() {
        List<UserEntity> users=user1Mapper.getAll();
        for (UserEntity userEntity:users) {
            reString+=users.toString();

        }
        System.out.println(reString);
        return reString;
    }
}
