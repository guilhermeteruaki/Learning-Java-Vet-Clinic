package pers;

public class Staff {
   
       
    long staffID;
    String staffFirstName;
    String staffLastName;
    double staffSalary;

public long getStaffID(){
    return this.staffID;
 }
public String getStaffName(){
    return (this.staffFirstName + " "+  this.staffLastName);
}

public String getStaffFirstName(){
    return this.staffFirstName;
}
public String getStaffLastName(){
    return this.staffLastName;
}
public double getSalary(){
    return this.staffSalary;
}
public long setStaffID(long staffIDNumber){
    return this.staffID = staffIDNumber;
}

}
