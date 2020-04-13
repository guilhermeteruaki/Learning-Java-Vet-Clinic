package pers;

public abstract class Staff {
   
        private static long staffIDCounter = 000000;
        public  long CreateStaffID(){
            return (staffIDCounter++);
            }
        public long staffIDCounter(){
            return staffIDCounter;
        }
        
    
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


}
