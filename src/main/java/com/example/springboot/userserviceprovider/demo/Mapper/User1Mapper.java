package com.example.springboot.userserviceprovider.demo.Mapper;
import  com.example.springboot.userserviceprovider.demo.Entity.UserEntity;

import java.util.List;

public interface User1Mapper {
    List<UserEntity> getAll();

    void insert(UserEntity user);
}
