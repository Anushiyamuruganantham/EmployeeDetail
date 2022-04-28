package com.office.employeedetails.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employeeinfo")

public class Employee {
    private int id;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int first_name;
    private String last_name;
    private String designation;
    private String email;
    private String mobno;

}
