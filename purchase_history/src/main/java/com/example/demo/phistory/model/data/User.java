package com.example.demo.phistory.model.data;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "User")
public class User {
    @Id
    @Column
    public int user_id;

    @Column
    public String name;
}
