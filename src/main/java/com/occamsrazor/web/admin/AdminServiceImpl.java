package com.occamsrazor.web.admin;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
////

@Service
public class AdminServiceImpl implements AdminService{
    @Autowired AdminDao adminDao;


    @Override
    /*employNumber, passwd, <name, position>, profile,<email, phoneNumber>, registerDate;*/
    public void register(Admin admin) {
        System.out.println("2. AdminServiceImpl register "+admin);
        admin.setEmployNumber(createEmployNumber());//4자리 랜덤
        admin.setPasswd("1");
        admin.setRegisterDate(createCurrentDate()); //찾는것, 자바에서 현재 날짜...로직?
        adminDao.insert(admin);
    }

    private String createCurrentDate() {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

    private String createEmployNumber() {
        String startNum ="";
        for(int i=0;i<4;i++) {
            startNum += String.valueOf((int)(Math.random()*10));
        }
        System.out.println(startNum);
        return startNum;
    }
    @Override
    public List<Admin> findAll() {
        return adminDao.selectAll();
    }
    @Override
    public Admin findOne(String employNumber) {
        return adminDao.selectOne(employNumber);
    }
    @Override
    public void modify(Admin admin) {
        adminDao.update(admin);
    }
    @Override
    public void remove(Admin admin) {
        adminDao.delete(admin);
    }
}