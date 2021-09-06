
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class SolveOption {

    Valication valication = new Valication();
    ArrayList<Experience> ListExperiences = new ArrayList<>();
    ArrayList<Fresher> ListFreshers = new ArrayList<>();
    ArrayList<Intern> ListInterns = new ArrayList<>();

    public SolveOption() {
    }

    ///// OPTION 1//////
    public void CreateExperience() {
        System.out.println("Make new information of Experience cadidate: ");
        int ID = valication.getValueID(ListExperiences, ListFreshers, ListInterns);
        String FristName = valication.getFristName();
        String LastName = valication.getLastName();
        int Date = valication.getDate();
        String Address = valication.getAddress();
        String Phone = valication.getPhone();
        String Email = valication.getEmail();
        int Type = 0;
        int ExpInYear = valication.getExpInYear();
        String ProSkill = valication.getProSkill();
        Experience experience = new Experience(ID, FristName, LastName, Date, Address, Phone, Email, Type, ExpInYear, ProSkill);
        ListExperiences.add(experience);
        /// add more or display
        boolean checkYesNo = valication.checkYesNO();
        if (checkYesNo == true) {
            CreateExperience();
        } else {
            System.out.println("");
            NameFieldExprience();
            for (Experience e : ListExperiences) {
                System.out.println(e.toString());
            }
        }

    }
    
    public void NameFieldExprience() {
        String s = String.format("%-5s%-15s%-15s%-10s%-10s%-15s%-30s%-5s%-10s%-10s",
                "ID", "First name", "Last name", "Date", "Address", "Phone", "Email", "Type", "ExpYear", "ProSkill");
        System.out.println(s);
    }

    ///// OPTION 2 ////
    public void CreateFresher() {
        System.out.println("Make new information of Fresher cadidate: ");
        int ID = valication.getValueID(ListExperiences, ListFreshers, ListInterns);
        String FristName = valication.getFristName();
        String LastName = valication.getLastName();
        int Date = valication.getDate();
        String Address = valication.getAddress();
        String Phone = valication.getPhone();
        String Email = valication.getEmail();
        int Type = 1;
        int GraduationDate = valication.getGraduationDate();
        String GraduationRank = valication.getGraduationRank();
        String Education = valication.getEducation();
        Fresher fresher = new Fresher(ID, FristName, LastName, Date, Address, Phone, Email, Type, GraduationDate, GraduationRank, Education);
        ListFreshers.add(fresher);
        /// add more or display
        boolean checkYesNo = valication.checkYesNO();
        if (checkYesNo == true) {
            CreateFresher();
        } else {
            System.out.println("");
            NameFieldFresher();
            for (Fresher f : ListFreshers) {
                System.out.println(f.toString());
            }
        }
    }

    public void NameFieldFresher() {
        String s = String.format("%-5s%-15s%-15s%-10s%-10s%-15s%-30s%-5s%-10s%-10s%-15s",
                "ID", "First name", "Last name", "Date", "Address", "Phone", "Email", "Type",
                "GraDate", "GraRank", "Education");
        System.out.println(s);
    }

    //////OPTION 3//////////
    public void CreateIntern() {
        System.out.println("Make new information of Intern cadidate: ");
        int ID = valication.getValueID(ListExperiences, ListFreshers, ListInterns);
        String FristName = valication.getFristName();
        String LastName = valication.getLastName();
        int Date = valication.getDate();
        String Address = valication.getAddress();
        String Phone = valication.getPhone();
        String Email = valication.getEmail();
        int Type = 2;
        String Major = valication.getMajors();
        int Semester = valication.getSemester();
        String University = valication.getUniversity();
        Intern intern = new Intern(ID, FristName, LastName, Date, Address, Phone, Email, Type, Major, Semester, University);
        ListInterns.add(intern);
        /// add more or display
        boolean checkYesNo = valication.checkYesNO();
        if (checkYesNo == true) {
            CreateExperience();
        } else {
            System.out.println("");
            NameFieldIntern();
            for (Intern i : ListInterns) {
                System.out.println(i.toString());
            }
        }
    }

    public void NameFieldIntern() {
        String s = String.format("%-5s%-15s%-15s%-10s%-10s%-15s%-30s%-5s%-10s%-10s%-10s",
                "ID", "First name", "Last name", "Date", "Address", "Phone", "Email", "Type",
                "Majors", "Semester", "University");
        System.out.println(s);
    }

    ////////////OPTION 4////////////
    public void Search() {
        DisplayExperience();
        DisplayFresher();
        DisplayIntern();
        String name = CandidateName();
        int type = CandicateType();
        Resoult(name, type);
    }

    public void DisplayExperience() {
        System.out.println("===========EXPERIENCE CANDIDATE============");
        for (Experience e : ListExperiences) {
            System.out.println(e.getFirstName() + " " + e.getLastName());
        }
    }

    public void DisplayFresher() {
        System.out.println("==========FRESHER CANDIDATE==============");
        for (Fresher f : ListFreshers) {
            System.out.println(f.getFirstName() + " " + f.getLastName());
        }
    }

    public void DisplayIntern() {
        System.out.println("===========INTERN CANDIDATE==============");
        for (Intern i : ListInterns) {
            System.out.println(i.getFirstName() + " " + i.getLastName());
        }
    }

    public String CandidateName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Candidate name (First name or Last name): ");
        String name = sc.nextLine();
        return name;
    }

    public int CandicateType() {
        Scanner sc = new Scanner(System.in);
        String StringType = null;
        int Type = 0;
        while (true) {
            try {
                System.out.print("Input type of candidate: ");
                StringType = sc.nextLine();
                Type = Integer.parseInt(StringType);
                if (Type == 0 || Type == 1 || Type == 2) {
                    return Type;
                } else {
                    System.out.println("Invaild of candicate type!");
                }
            } catch (Exception e) {
                System.out.println("Invaild of candicate type!");
            }
        }
    }

    public void Resoult(String name, int type) {
        if (type == 0) {
            SearchNameforExp(name);
        }
        if (type == 1) {
            SearchNameforFresher(name);
        }
        if (type == 2) {
            SearchNameforIntern(name);
        }
    }

    public void SearchNameforExp(String name) {
        boolean check = false;
        if (ListExperiences.size() == 0) {
            System.out.println("List is empty!");
            return;
        }
        NameFieldExprience();
        for (Experience e : ListExperiences) {
            if (e.getFirstName().contains(name) || e.getLastName().contains(name)) {
                System.out.println(e.toString());
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Invaild of prist name or last name!");
        }
    }

    public void SearchNameforFresher(String name) {
        boolean check = false;
        if (ListFreshers.size() == 0) {
            System.out.println("List is empty!");
            return;
        }
        NameFieldFresher();
        for (Fresher f : ListFreshers) {
            if (f.getFirstName().contains(name) || f.getLastName().contains(name)) {
                System.out.println(f.toString());
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Invaild of prist name or last name!");
        }

    }

    public void SearchNameforIntern(String name) {
        boolean check = false;
        if (ListInterns.size() == 0) {
            System.out.println("List is empty!");
            return;
        }
        NameFieldIntern();
        for (Intern i : ListInterns) {
            if (i.getFirstName().contains(name) || i.getLastName().contains(name)) {
                System.out.println(i.toString());
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Invaild of prist name or last name!");
        }
    }
}
