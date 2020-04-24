package pers;

import java.util.HashMap;

public class Admin extends Staff{
    
    private String adminSector;
    public String adminJob;


    public Admin (String staffFirstName,String staffLastName, double staffSalary, String adminSector){
        this.staffFirstName = staffFirstName;
        this.staffLastName = staffLastName;
        this.staffSalary = staffSalary;
        this.adminSector = adminSector;

    }
    
    public String getAdminSector(){
        return adminSector;
    }
    public void setAdminJob(String adminJob){
        this.adminJob = adminJob;
        }
    public String getAdminJob(){
        return adminJob;
    } 
}