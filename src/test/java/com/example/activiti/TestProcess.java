package com.example.activiti;

import org.activiti.engine.IdentityService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.identity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: Tang Jiujia
 * @version: 2017/11/2 0002 22:16
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestProcess {

    @Autowired
    IdentityService identityService;
    @Autowired
    RuntimeService runtimeService;

    @Test
    public void testRun(){
        User tang = identityService.newUser("Tang");
        tang.setFirstName("Tang");
        tang.setEmail("56565");
        identityService.saveUser(tang);

        User tang1 = identityService.createUserQuery().userId("Tang").singleResult();
        System.out.println("The result is "+tang1.getFirstName()+"@"+tang1.getEmail());
    }
}


















