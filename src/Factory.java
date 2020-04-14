import pers.Vet;

import java.util.HashMap;

import pers.Staff;

public class Factory{

    HashMap< Long, Object> veterinarianList = new HashMap<Long,Object>();

    int numVets = 10;
    for (i=0; i<=numVets;i++){ 

        public void createNewVet(){
            // long vetID = Main.CreateStaffID(); 
            Vet vet = new Vet(staffFunction, staffFirstName, staffLastName, staffSalary, medicalSpeciality);

            veterinarianList.put(Main.CreateStaffID(), vet);
        }
    }
}