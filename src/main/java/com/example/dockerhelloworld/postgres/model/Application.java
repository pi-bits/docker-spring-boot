package com.example.dockerhelloworld.postgres.model;

import javax.persistence.*;

@Entity
@Table(name = "APP_ID")
public class Application {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "app_id_seq")
    @SequenceGenerator(name = "app_id_seq", sequenceName = "app_id_seq")
    @Column(name = "id")
    private Integer id;
    private String case_id;
    private Integer account_number;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCase_id() {
        return case_id;
    }

    public void setCase_id(String case_id) {
        this.case_id = case_id;
    }

    public Integer getAccount_number() {
        return account_number;
    }

    public void setAccount_number(Integer account_number) {
        this.account_number = account_number;
    }


    protected Application() {
    }

    public Application(String case_id, Integer account_number) {
        this.case_id = case_id;
        this.account_number = account_number;
    }

}
