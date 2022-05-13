/*
(4 points) Implement the ***Dentist*** class, which handle appointments (patientName, appointment).
        The class should have a ***newAppointment*** (add a new patient with appointment), a ***resign***
        (remove the given appointment of a patient), and a ***getAppointments*** (return the details of actually stored
        appointments as a String: <name of patient> <appointment>) method.

*/

import java.util.ArrayList;
import java.util.Scanner;

public class Dentist {
    String patientName;
    String timeStap;

    private static Scanner scan = new Scanner(System.in);

    //Constructors
    public Dentist(String patientName, String timeStap) {
        this.patientName = patientName;
        this.timeStap = timeStap;
    }
    public Dentist() {}

    //New Appoitment
    public static Dentist new_Appoitment(){
        String name, time;
        Dentist patient;
        System.out.println("Please enter name of patient: ");
        name = scan.nextLine();
        System.out.println("Enter time: ");
        time = scan.nextLine();

        patient = new Dentist(name,time);

        System.out.println("you have now successfully created a new appoitment!");
        return patient;
    }

    //Add Appoitments to ArrayList
    public static void addPatientsToArray(ArrayList<Dentist>allAppoitments,Dentist appoitment ){
        allAppoitments.add(appoitment);
    };

    //Delete appoitment
    public static void resign(ArrayList<Dentist>allAppoitments){
        Dentist appoitment = findDentistIn(allAppoitments);
        System.out.println("We have successfully deleted the appoitment");
    }

    //get Appoitment
    public static void getAppoitment(ArrayList<Dentist>allAppoitments){
        ArrayList<Dentist> appoitments = allAppoitments;
        for(Dentist app: allAppoitments){
            System.out.println("Patient name: " + app.getPatientName() + "\t Appoitment time: " + app.getTimeStap());
        }

    }


    private static Dentist findDentistIn(ArrayList<Dentist>allAppoitments){
        Dentist appoitment = new Dentist();
        String name = "";
        while(name.isEmpty()){
            System.out.println("Enter last name of Patient: ");
            name = scan.nextLine();
            for(Dentist appoitments : allAppoitments){
                if(appoitments.getPatientName().equals(name)){
                    return appoitment;
                }
            }
            name = "";
        }
        return appoitment;
    }


    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getTimeStap() {
        return timeStap;
    }

    public void setTimeStap(String timeStap) {
        this.timeStap = timeStap;
    }
}
