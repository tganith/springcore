package com.mylabs.springcore.autowired.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    @Value("100")
    private int empId;
    @Value("myname")
    private String empName;



    /*scenario1 for autowiredByType
    @Autowired
    private Address myAddress;

    public Address getMyAddress() {
        return myAddress;
    }

    public void setMyAddress(Address myAddress) {
        this.myAddress = myAddress;
    }*/

     //scenario2 for autowiredByType

    private Address address;

    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }






    /*scenario for autowiredByName
    @Autowired
    private Address address;

    public Address getAddress() {
        return address;
    }*/

   /* //scenario for constructor

    private Address address;
    @Autowired
    Employee(Address address){
        this.address = address;
        System.out.println("employee object created !!!");
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



    public void display() {
        System.out.println("Emp Id :"+empId+" ,Emp Name:"+empName);
    }
}
