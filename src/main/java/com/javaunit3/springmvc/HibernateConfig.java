package com.javaunit3.springmvc;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.*;

@Configuration
public class HibernateConfig {
    @Bean
    public SessionFactory getFactory() {
        SessionFactory factory = new org.hibernate.cfg.Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(MovieEntity.class)
                .buildSessionFactory();

        return factory;
    }
    @Entity
    @Table(name = "votes")
    public class VoteEntity {
        @Id
        @GeneratedValue
        private Integer id;

        @Column(name = "voter_Name")
        private String voterName;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getVoterName() {
            return voterName;
        }

        public void setVoterName(String voterName) {
            this.voterName = voterName;
        }
    }
}

