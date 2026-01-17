package stream_learning;

import java.util.List;

public class Employee {

    private int empId;
    private String empName;
    private String empAddress;
    private String empMail;
    private String department;
    private double salary;
   // private List<String> empPhoneNumber;

    // default constructor:
   Employee(){};

    // Parameterised Constructor:


    Employee(int empId,String empName,String empAddress,String empMail,String department,double salary)
    {
        this.empId=empId;
        this.empName=empName;
        this.empAddress=empAddress;
        this.empMail=empMail;
        this.department=department;
        this.salary=salary;
      //  this.empPhoneNumber=empPhoneNumber;
    }

    // Getter and Setter:


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

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getEmpMail() {
        return empMail;
    }

    public void setEmpMail(String empMail) {
        this.empMail = empMail;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    // toString


    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAddress='" + empAddress + '\'' +
                ", empMail='" + empMail + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
