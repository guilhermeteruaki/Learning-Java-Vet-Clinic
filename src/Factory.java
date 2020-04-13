import pers.Vet;
import pers.Staff;

public class Factory{
// call createStaffID in Staff.java so that the name of the new vet should be the StaffID generated
    public void createNewVet(){
        long vetID = CreateStaffID();

       Vet vetID = new Vet(staffFunction, staffFirstName, staffLastName, staffSalary, medicalSpeciality);
    }

    

}