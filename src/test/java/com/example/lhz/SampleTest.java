package com.example.lhz;

import com.example.lhz.entity.User;
import com.example.lhz.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
@SpringBootTest
public class SampleTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test(){
        List<User> users = userMapper.selectList(null);
        System.out.println(users.toArray());
    }
}
