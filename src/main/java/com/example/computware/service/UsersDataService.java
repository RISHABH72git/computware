package com.example.computware.service;

import com.example.computware.dao.UsersRepository;
import com.example.computware.dto.LoginReqDto;
import com.example.computware.dto.addUserDto;
import com.example.computware.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;


@Service
public class UsersDataService implements UserDetailsService {

    @Autowired
    UsersRepository usersRepository;


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return usersRepository.findAllByEmail(email);
    }

    public void addUser(addUserDto userDto) throws  Exception {

        if (usersRepository.findByEmail(userDto.getEmail()) != null){
            throw new Exception("email already exists");
        }
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        Users user = new Users();
        String encodedpass=passwordEncoder.encode(userDto.getPassword());
        user.setPassword(encodedpass);
        user.setEmail(userDto.getEmail());
        user.setFullName(userDto.getFullname());
        user.setCountry(userDto.getCountry());
        user.setSchoolName(userDto.getSchoolname());
        user.setState(userDto.getState());
        user.setDistrict(userDto.getDistrict());
        user.setMobileNo(userDto.getMobileno());
        user.setKeyValue(userDto.getKeyvalue());
        Date date=new Date();
        user.setRegisterTime(date);
        usersRepository.save(user);
    }


    public List<Users> get() {
        return usersRepository.findAll();
    }
}
