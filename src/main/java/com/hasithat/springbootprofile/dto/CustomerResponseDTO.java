package com.hasithat.springbootprofile.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponseDTO {

    private int id;
    private String name;
    private String email;
    private String phone;
    private String dob;
}
