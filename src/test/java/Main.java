import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Default appoitments
        ArrayList<Dentist>allAppoitments = new ArrayList<>();
        Dentist appoitment1 = new Dentist("Zina", "Monday 10:00");
        Dentist appoitment2 = new Dentist("Mari", "Monday 11:00");
        Dentist appoitment3 = new Dentist("Luna", "Monday 12:00");
        allAppoitments.add(appoitment1);
        allAppoitments.add(appoitment2);
        allAppoitments.add(appoitment3);


        System.out.println("Patient " + appoitment1.getPatientName() + " has and appoitment " + appoitment1.getTimeStap());
        System.out.println("Patient " + appoitment2.getPatientName() + " has and appoitment " + appoitment2.getTimeStap());
        System.out.println("Patient " + appoitment3.getPatientName() + " has and appoitment " + appoitment3.getTimeStap());

        //User can add input
        Dentist appoitmentUserInput = Dentist.new_Appoitment();
        allAppoitments.add(appoitmentUserInput);

        //Delete patient
        Dentist.resign(allAppoitments);

        //Print out all the appoitments
        Dentist.getAppoitment(allAppoitments);

        //Refresh appoitment
        Assistant.refreshAppoitment(allAppoitments);






    }
}
