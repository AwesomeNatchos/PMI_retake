import java.util.ArrayList;
import java.util.Scanner;


//Created by Natcha Uthaug
public class Main {
    private static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        /*
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

    }*/


    public static void main(String[] args) {
        //Default users
        ArrayList<Dentist>allAppoitments = new ArrayList<>();
        Dentist appoitment1 = new Dentist("Zina", "Monday 10:00");
        Dentist appoitment2 = new Dentist("Mari", "Monday 11:00");
        Dentist appoitment3 = new Dentist("Luna", "Monday 12:00");
        allAppoitments.add(appoitment1);
        allAppoitments.add(appoitment2);
        allAppoitments.add(appoitment3);


        boolean main = true;
        while(main){
            int choice;
            System.out.println("Welcome to dentist appoitments");
            System.out.println("Options: ");
            System.out.println("1) see all appoitments");
            System.out.println("2) Add appoitment");
            System.out.println("3) Edit appoitment");
            System.out.println("4) Delete Appoitments");
            System.out.println("0) Exit");

            System.out.println("Please enter options");
            choice = scan.nextInt();

            switch (choice){
                case 1:
                    System.out.println("---- ALL APPOITMENTS----");
                    Dentist.getAppoitment(allAppoitments);
                    break;
                case 2:
                    System.out.println("------ ADD APPOITMENTS----");
                    Dentist appoitment = Dentist.new_Appoitment();
                    allAppoitments.add(appoitment);
                    break;
                case 3:
                    System.out.println("------ EDIT APPOITMENTS-----");
                    Assistant.refreshAppoitment(allAppoitments);
                    break;
                case 4:
                    System.out.println("------- DELETE APPOITMENT-----");
                    Dentist.resign(allAppoitments);
                    break;
                case 0:
                    System.out.println("Have a splendid day!");
                    main = false;
            }


        }

    }
}
