package com.office.employeedetails.employeeDto;

import lombok.Data;

@Data
public class EmployeeDTO {
    private int id;
    private String first_name;
    private String last_name;
    private String designation;
    private String email;
    private String mobno;

}
