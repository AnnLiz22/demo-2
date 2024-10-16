package com.example.demo.service;

import com.example.demo.model.User;
import java.util.List;

public interface UserService {

  User add(User user);
  List<User> getAllUsers();

  User getUser(Long id);

  User update(Long id);

  void delete(Long id);

}
