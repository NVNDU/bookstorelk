package lk.bookstore.onlinebookshop.Service.ServiceImplenetation;

import lk.bookstore.onlinebookshop.Entity.User;
import lk.bookstore.onlinebookshop.Repository.UserRepository;
import lk.bookstore.onlinebookshop.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(()->new NoSuchElementException("User is not found!"));
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Long id, User user) {
        User exUser = getUserById(id);
        exUser.setUsername(user.getUsername());
        exUser.setEmail(user.getEmail());
        exUser.setPno(user.getPno());
        exUser.setPwd(user.getPwd());
        return saveUser(exUser);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
