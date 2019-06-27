package com.example.springboot.userserviceprovider.demo.Impl;



import bean.UsersAdderss;
import com.alibaba.dubbo.config.annotation.Service;


import org.springframework.stereotype.Component;
import service.UserService;

import java.util.Arrays;
import java.util.List;

/*
  1.将服务提供者注册到注册中心
        导入dubbo依赖、引入操作zookeeper客户端的curator
        配置服务提供者
  2.让消费者去注册中心订阅服务提供者的服务地址
 */
@Service
@Component
public class UserServiceImpl implements UserService {
    public List<UsersAdderss> getUserAddressList(String userId) {
        UsersAdderss usersAdderss1=new UsersAdderss(1,"北京朝阳","1","delamey","110","yes");
        UsersAdderss usersAdderss2=new UsersAdderss(2,"香港九龙","1","nuct","120","yes");
        return Arrays.asList(usersAdderss1,usersAdderss2);
    }
}
