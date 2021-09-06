/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Experience extends Candidates{
    private int ExpInYear;
    private String ProSkill;

    public Experience() {
    }

    public Experience( int ID, String FirstName, String LastName, int Date,
            String Address, String Phone, String Email, int Type,int ExpInYear, 
            String ProSkill) 
    {
        super(ID, FirstName, LastName, Date, Address, Phone, Email, Type);
        this.ExpInYear = ExpInYear;
        this.ProSkill = ProSkill;
    }

    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int ExpInYear) {
        this.ExpInYear = ExpInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String ProSkill) {
        this.ProSkill = ProSkill;
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format("%-10d%-10s", ExpInYear,ProSkill);
    }
    
    
}
