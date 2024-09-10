package Core_Java_mini_project1;

import java.util.Scanner;

public class PanAadhaarMatcherApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AadhaarService aadhaarService = new AadhaarService();
        panService panService = new panService();

        System.out.println("Enter the Aadhar Number:");
        String aadhaarNumber  = sc.nextLine();


        Aadhar aadhaar = aadhaarService.getAadhaarByNumber(aadhaarNumber);
        Pan pan = panService.getPanByAadhaarNumber(aadhaarNumber);
        if(aadhaar!= null && pan != null){
            System.out.println("Aadhar Details = " + aadhaar);
            System.out.println("Pan Details = " + pan);
        }
        else{
            System.out.println("No Matching found");
        }
    }
}
