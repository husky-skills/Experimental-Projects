package models;

import models.Department;


import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by Mahendra on 30-06-2016.
 */

@Entity
public class UserDetails {
    @Id
    @GeneratedValue
    private int Id;
    //@Column
    private String fullName;
    @ElementCollection
    private Set<Address> addresses;
    @Embedded
    private Department department;
    private Date DOB;
    @Transient
    private String SomeText;

    public UserDetails(){}

    public UserDetails(String fullName, Set<Address> addresses, Department department, Date DOB, String someText) {
        this.fullName = fullName;
        this.addresses = addresses;
        this.department = department;
        this.DOB = DOB;
        SomeText = someText;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getSomeText() {
        return SomeText;
    }

    public void setSomeText(String someText) {
        SomeText = someText;
    }
}
