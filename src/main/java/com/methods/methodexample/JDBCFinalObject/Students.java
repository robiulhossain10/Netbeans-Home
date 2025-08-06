package com.methods.methodexample.JDBCFinalObject;

import java.sql.Timestamp;
import java.time.LocalDate;

public class Students {

    private Long id;
    private String first_name;
    private String last_name;
    private String email;
    private Gender gender;
    private LocalDate dob;
    private Timestamp create_at;
    private boolean is_deleted;

    public Students(String first_name, String last_name, String email, Gender gender, LocalDate dob, Timestamp create_at, boolean is_deleted) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.gender = gender;
        this.dob = dob;
        this.create_at = create_at;
        this.is_deleted = is_deleted;
    }

    public Students(Long id, String first_name, String last_name, String email, Gender gender, LocalDate dob, Timestamp create_at, boolean is_deleted) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.gender = gender;
        this.dob = dob;
        this.create_at = create_at;
        this.is_deleted = is_deleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Timestamp getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Timestamp create_at) {
        this.create_at = create_at;
    }

    public boolean isIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(boolean is_deleted) {
        this.is_deleted = is_deleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Students{");
        sb.append("id=").append(id);
        sb.append(", first_name=").append(first_name);
        sb.append(", last_name=").append(last_name);
        sb.append(", email=").append(email);
        sb.append(", gender=").append(gender);
        sb.append(", dob=").append(dob);
        sb.append(", create_at=").append(create_at);
        sb.append(", is_deleted=").append(is_deleted);
        sb.append('}');
        return sb.toString();
    }

  
    
    
    
}
