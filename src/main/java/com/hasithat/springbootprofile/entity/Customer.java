package com.hasithat.springbootprofile.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {


    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private String phone;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date dob;
}
