package com.example.demo;

public class SV {
//lớp Sv (có 4 thuộc tính) đc sư dụng trong phương thức add của homecontroller để lưu thông tin mới vào hệ thống
    public String id;
    public String name;
    public String dob;
    public String department;

    public String getId() {
        return id;
    //public string có kiểu trả về là string
    //truy xuất, trả về gtri string của thuộc tính id của đt SV
    }
    public void setId(String id) {
        this.id = id;
    //phương thức void sẽ k trả về bất cứ gtri nào mà chỉ thiết lập tên của thuộc tính
    // tham số đầu vào đại diện gtr mới của thuộc tính
    
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
}
