
import java.util.ArrayList;
import java.util.Scanner;
import java.math.BigInteger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Valication {

    public Valication() {
    }

    Scanner sc = new Scanner(System.in);

    public int getChoice() {                //getting number choice of option
        String Stringchoice = null;
        int choice = 0;
        while (true) {
            try {
                System.out.print("Enter your choice: ");
                Stringchoice = sc.nextLine();
                choice = Integer.parseInt(Stringchoice);
                return choice;
            } catch (Exception e) {
                System.out.println("Invaild of choice!");
            }
        }
    }

//    : Date of Birth, Phone, Email  // all
//            , Year of Experience, // expirent
//                    Rank of Graduation. ///intern
    public int getID() { // getID normal not check similar ID in the list
        String StringID = null;
        int ID = 0;
        while (true) {
            try {
                System.out.print("Enter ID: ");
                StringID = sc.nextLine();
                ID = Integer.parseInt(StringID);
                return ID;
            } catch (Exception e) {
                System.out.println("Invaild of choice");
            }
        }
    }

    public int getValueID(ArrayList<Experience> experiences, ArrayList<Fresher> freshers, ArrayList<Intern> interns) { //check ID is only one in all list
        int ID = 0;
        boolean check = false;
        while (true) {
            check = false;
            ID = getID();
            for (Experience e : experiences) {
                if (e.getID() == ID) {
                    check = true;
                    System.out.println("This ID was exited! rennter");
                    break;
                }
            }
            for (Fresher f : freshers) {
                if (f.getID() == ID) {
                    check = true;
                    System.out.println("This ID was exited! rennter");
                    break;
                }
            }
            for (Intern i : interns) {
                if (i.getID() == ID) {
                    check = true;
                    System.out.println("This ID was exited! rennter");
                    break;
                }
            }
            if (check == false) {
                return ID;
            }
        }
    }

    public String getFristName() {  /// getFristName normal
        System.out.print("Enter the first name: ");
        String FristName = sc.nextLine();
        if (FristName.length() == 0) {
            System.out.println("Invaild of FristName!");
            getFristName();
        }
        return FristName;
    }

    public String getLastName() {    /// getLastName normal
        System.out.print("Enter the Last name: ");
        String LastName = sc.nextLine();
        if (LastName.length() == 0) {
            System.out.println("Invaild of LastName!");
            getLastName();
        }
        return LastName;
    }

    public int getDate() {
        String StringDate = null;
        int Date = 0;
        while (true) {
            try {
                System.out.print("Enter Date: ");
                StringDate = sc.nextLine();
                Date = Integer.parseInt(StringDate);
                if (StringDate.length() == 4 && Date >= 1900 && Date <= 2021) {
                    return Date;
                } else {
                    System.out.println("Invaild of Date!");
                }
            } catch (Exception e) {
                System.out.println("Invaild of Date!");
            }
        }
    }

    public String getAddress() {
        System.out.print("Enter address: ");
        String Address = sc.nextLine();
        if (Address.length() == 0) {
            System.out.println("Invaild of Address!");
            getAddress();
        }
        return Address;
    }

//    public int getPhone() {
//        String StringPhone = null;
//        BigInteger Phone ;
//        boolean checkPhone = false;
//        while (true) {
//            try {
//                System.out.print("Enter phone: ");
//                StringPhone = sc.nextLine();
//                if (StringPhone.length() >= 10) {
//                    checkPhone = checkPhone(StringPhone);
//                    if (checkPhone == true) {
//                        return Integer.valueOf(StringPhone);
//                    } else {
//                        System.out.println("Invaild of phone!");
//                    }
//                } else {
//                    System.out.println("Invaild of phone!");
//                }
//            } catch (Exception e) {
//                System.out.println("Invaild of phone!");
//            }
//
//        }
//    }
    public String getPhone() {
        Scanner sc = new Scanner(System.in);
        String Phone = null;
        while (true) {
            try {
                System.out.print("Enter phone: ");
                Phone = sc.nextLine();
                if (Phone.length() >= 10 && checkPhone(Phone) == true) {
                    return Phone;
                } else {
                    System.out.println("Invaild of Phone number!");
                }
            } catch (Exception e) {
                System.out.println("Invaild of Phone number!");
            }
        }
    }

    public boolean checkPhone(String Phone) {  ///////check phone number
        String numbers = "0123456789";
        char[] arr = Phone.toCharArray();
        for (char c : arr) {
            if (!numbers.contains(c + "")) {
                return false;
            }
        }
        return true;
    }

    public String getEmail() {
        String Email = null;
        boolean check = false;
        while (true) {
            check = false;
            System.out.print("Enter Email: ");
            Email = sc.nextLine();
            char[] EmailToChar = Email.toCharArray();
            check = checkCharEmail(EmailToChar);
            if (check == true) {
                String[] arr = Email.split("@");
                if (arr.length == 2) {
                    return Email;
                } else {
                    System.out.println("Invaild of email!");
                }
            } else {
                System.out.println("Invaild of email!");
            }
        }
    }

    public boolean checkCharEmail(char[] EmailToChar) { // check in the email have only have char @ 
        boolean check = true;
        int count = 0;
        for (char c : EmailToChar) {
            if (c == '@') {
                count = count + 1;
            }
        }
        if (count == 1) {
            return true;
        } else {
            return false;
        }
    }

    /// type candidate not enter
    public int getExpInYear() {
        String StringExpInYear = null;
        int ExpInYear = 0;
        while (true) {
            try {
                System.out.print("Enter Year of Experience: ");
                StringExpInYear = sc.nextLine();
                ExpInYear = Integer.parseInt(StringExpInYear);
                if (ExpInYear > 0 && ExpInYear <= 100) {
                    return ExpInYear;
                } else {
                    System.out.println("Invaild of Year of Experience!");
                }
            } catch (Exception e) {
                System.out.println("Invaild of Year of Experience!");
            }
        }
    }

    public String getProSkill() {
        System.out.print("Enter Professional Skill: ");
        String ProSkill = sc.nextLine();
        if (ProSkill.length() == 0) {
            System.out.println("Invaild Professional skill!");
            getProSkill();
        }
        return ProSkill;
    }

    public int getGraduationDate() {
        String StringGraduationDate = null;
        int GraduationDate = 0;
        while (true) {
            try {
                System.out.print("Enter time graduation: ");
                StringGraduationDate = sc.nextLine();
                GraduationDate = Integer.parseUnsignedInt(StringGraduationDate);
                if (StringGraduationDate.length() == 4 && GraduationDate >= 1900 && GraduationDate <= 2021) {
                    return GraduationDate;
                } else {
                    System.out.println("Invaild of time graduation!");
                }
            } catch (Exception e) {
                System.out.println("Invaild of time graduation!");
            }
        }
    }

    public String getGraduationRank() {
        String GraduationRank = null;
        String[] TypeRank = {"Excellence", "Good", "Fair", "Poor"};
        while (true) {
            System.out.print("Enter rank of graduation: ");
            GraduationRank = sc.nextLine();
            for (String s : TypeRank) {
                if (s.equalsIgnoreCase(GraduationRank)) {
                    return GraduationRank;
                }
            }
            System.out.println("Invaild rank of graduation!");
        }
    }

    public String getEducation() {
        System.out.print("Enter the education: ");
        String Education = sc.nextLine();
        if (Education.length() == 0) {
            System.out.println("Invaild of Education!");
            getEducation();
        }
        return Education;
    }

    public String getMajors() {
        System.out.print("Enter the major: ");
        String Majors = sc.nextLine();
        if (Majors.length() == 0) {
            System.out.println("Invaid of Majors!");
            getMajors();
        }
        return Majors;
    }

    public int getSemester() {
        String StringSemester = null;
        int Semester = 0;
        while (true) {
            try {
                System.out.print("Enter Semesmeter: ");
                StringSemester = sc.nextLine();
                Semester = Integer.parseUnsignedInt(StringSemester);
                return Semester;
            } catch (Exception e) {
                System.out.println("Invaild of Semester!");
            }
        }
    }

    public String getUniversity() {
        System.out.print("Enter university: ");
        String University = sc.nextLine();
        if (University.length() == 0) {
            System.out.println("Invaild of University");
            getUniversity();
        }
        return University;
    }

    public boolean checkYesNO() {
        String check = null;
        while (true) {
            System.out.print("Do you want to continue ?(Y/N): ");
            check = sc.nextLine();
            if (check.equalsIgnoreCase("Y")) {
                return true;
            }
            if (check.equalsIgnoreCase("N")) {
                return false;
            }
        }
    }

}
