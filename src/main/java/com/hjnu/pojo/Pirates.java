package com.hjnu.pojo;

import org.springframework.boot.context.properties.*;
import org.springframework.stereotype.*;

import java.util.*;

@Component
@ConfigurationProperties(prefix = "pirates")
public class Pirates {
        String name;
        Integer age;
        Object[] teammates;

    @Override
    public String toString() {
        return "pirates{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", teammates=" + Arrays.toString(teammates) +
                '}';
    }

    public Pirates() {
    }

    public Pirates(String name, Integer age, Object[] teammates) {
        this.name = name;
        this.age = age;
        this.teammates = teammates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Object[] getTeammates() {
        return teammates;
    }

    public void setTeammates(Object[] teammates) {
        this.teammates = teammates;
    }


}
