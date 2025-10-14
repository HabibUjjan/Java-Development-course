package com.student.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.student.dao.BookDao;
import com.student.dao.MemberDao;
import com.student.dao.IssueDao;

import com.student.daoimpl.BookDaoImpl;
import com.student.daoimpl.MemberDaoImpl;
import com.student.daoimpl.IssueDaoImpl;

@Configuration
public class AppConfig {
    @Bean
    @Scope("singleton")
    public BookDao bookDao() {
        return new BookDaoImpl();
    }
    @Bean
    @Scope("singleton")
    public MemberDao memberDao() {
        return new MemberDaoImpl();
    }
    @Bean
    @Scope("singleton")
    public IssueDao issueDao() {
        return new IssueDaoImpl();
    }
}

