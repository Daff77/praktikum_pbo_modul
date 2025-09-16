/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan5;

/**
 *
 * @author Daffa Danendra
 */
public class HockeyDemo implements Hockey, event{
    
    public void setHomeTeam(String name){
        System.out.println("Home team: " + name);
    }
    
    public void setVisitingTeam(String name){}
    public void homeGoalScored(){}
    public void visitingGoalScored(){}
    public void endOfPeriod(int period){}
    public void overtimePeriod(int ot){}
    
    public static void main(String[] args) {
        HockeyDemo hd = new HockeyDemo();
        hd.setHomeTeam("India");
        hd.organize();
    }
    
    public void organize(){
        System.out.println("Match organized.");
    }
}
