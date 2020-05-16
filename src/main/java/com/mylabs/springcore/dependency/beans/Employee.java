package com.mylabs.springcore.dependency.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    @Value("100")
    private int empId;
    @Value("myname")
    private String empName;

    @Autowired
    private Address address;

    // it's working fien with without CI and SI

   // constructor Injection
  /*  public Employee(Address address) {
        this.address = address;
    }*/

    // setter Injection
  /*  public void setAddress(Address address) {
        this.address = address;
    }*/


    public Employee(){
        System.out.println("employee object created !!!");
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Address getAddress() {
        return address;
    }


    public void display() {
        System.out.println("Emp Id :"+empId+" ,Emp Name:"+empName);
    }
}
