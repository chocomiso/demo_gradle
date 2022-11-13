package com.example.demo_gradle;

import java.util.List;

public interface UserRepositoryCustom {
    List<User> findByName(String name);
}
