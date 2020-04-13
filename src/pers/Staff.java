package pers;

public abstract class Staff {
    public static long staffIDCounter = 000000;
    public static long CreateStaffID(){
        return (staffIDCounter++);
        }
    long staffID = CreateStaffID();
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


}
