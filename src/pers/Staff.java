package pers;

public class Staff {
   
       
    long staffID;
    String staffFunction;
    String staffFirstName;
    String staffLastName;
    double staffSalary;

public long getStaffID(){
    return this.staffID;
 }
public String getStaffName(){
    return (this.staffFirstName + " "+  this.staffLastName);
}
public double getSalary(){
    return this.staffSalary;
}
public long setStaffID(long staffIDNumber){
    this.staffID = staffIDNumber;
}

}
