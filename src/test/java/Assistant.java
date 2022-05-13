import java.util.ArrayList;
import java.util.Scanner;

public class Assistant extends Dentist{

    private static Scanner scan = new Scanner(System.in);
    public Assistant(String patientName, String timeStap) {
        super(patientName, timeStap);
    }


    public static void refreshAppoitment(ArrayList<Dentist>allappoitments){
        Dentist appoitment = findDentistIn(allappoitments);
        String name, time;
        System.out.println("Please enter new patient name:");
        name = scan.nextLine();
        System.out.println("Please enter new time: ");
        time = scan.nextLine();

        //replace old object with a newly created object
        allappoitments.set(allappoitments.indexOf(appoitment), new Dentist(name,time));
        System.out.println("You have successfully updated the appoitment time!");
    }


    //Finds appoitment
    private static Dentist findDentistIn(ArrayList<Dentist>allAppoitments){
        Dentist appoitment = new Dentist();
        String name = "";
        while(name.isEmpty()){
            System.out.println("Enter last name of Patient: ");
            name = scan.nextLine();
            for(Dentist userElement : allAppoitments){
                if(userElement.getPatientName().equals(name)){
                    return userElement;
                }
            }
            name = "";
        }
        return appoitment;
    }


}
