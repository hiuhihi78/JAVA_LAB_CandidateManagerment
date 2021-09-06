/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Valication valication = new Valication();
        SolveOption option = new SolveOption();
        int choice = 0;
        while(true){
            System.out.println("");
            System.out.println("CANDIDATE MANAGEMENT SYSTEM");
            System.out.println("1.Experience");
            System.out.println("2.Fresher");
            System.out.println("3.Internship");
            System.out.println("4.Searching");
            System.out.println("5.Exit");
            choice = valication.getChoice();
            switch(choice){
                case 1:
                    System.out.println("");
                    option.CreateExperience();
                    break;
                case 2:
                    System.out.println("");
                    option.CreateFresher();
                    break;
                case 3:
                    System.out.println("");
                    option.CreateIntern();
                    break;
                case 4:
                    System.out.println("");
                    option.Search();
                    break;
                case 5:
                    System.out.println("Thank you!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invaild of choice!");
                    break;
            }
        }
    }
    
}
