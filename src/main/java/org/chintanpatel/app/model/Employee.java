package org.chintanpatel.app.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Table(name = "tbl_employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ColumnDefault("nextval('tbl_employee_employee_id_seq')")
    @Column(name = "employee_id", nullable = false)
    private Long employeeId;

    @Size(max = 255)
    @NotEmpty(message = "NotEmpty.employee.firstName")
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Size(max = 255)
    @NotEmpty(message = "NotEmpty.employee.middleName")
    @Column(name = "middle_name", nullable = false)
    private String middleName;

    @Size(max = 255)
    @NotEmpty(message = "NotEmpty.employee.lastName")
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Size(max = 255)
    @NotEmpty(message = "NotEmpty.employee.gender")
    @Column(name = "gender", nullable = false)
    private String gender;

    @NotEmpty(message = "NotEmpty.employee.programmingLanguage")
    @Column(name = "programming_language", columnDefinition = "varchar [](255) not null")
    private String[] programmingLanguage;

    @Size(max = 255)
    @NotEmpty(message = "NotEmpty.employee.email")
    @Email(message = "Email.employee.email")
    @Column(name = "email", nullable = false)
    private String email;

    @Size(max = 255)
    @NotEmpty(message = "NotEmpty.employee.mobile")
    @Column(name = "mobile", nullable = false)
    private String mobile;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "NotNull.employee.birthDate")
    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    @Size(max = 255)
    @NotEmpty(message = "NotEmpty.employee.userName")
    @Column(name = "user_name", nullable = false)
    private String userName;

    @Size(min = 8, max = 15, message = "Size.employee.password")
    @NotEmpty(message = "NotEmpty.employee.password")
    @Column(name = "password", nullable = false, length = 15)
    private String password;


    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String[] programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}