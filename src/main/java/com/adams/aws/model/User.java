package com.adams.aws.model;

import javax.persistence.*;

@Entity
@Table(uniqueConstraints ={ @UniqueConstraint(columnNames = {"cpf"})})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(length = 32,nullable = false)
    private String name;

    @Column(length = 11,nullable = false)
    private String cpf;

    @Column(length = 20,nullable = false)
    private String phone;

    @Column(length = 32,nullable = false)
    private String email;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
