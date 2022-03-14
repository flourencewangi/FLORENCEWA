
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FLORENCE
 */
public class lifeexpectancy {
    public static void main(String[] args){
    Scanner scn = new Scanner (System.in);
     int LEM;
     int LEF;
    System.out.println("Enter gender ");
     char gender = scn.next().charAt(0);
     System.out.println("Enter the age of the father");
             int fathersage = scn.nextInt();
             if(fathersage == 200){
             System.exit(0);
             }
             else if(gender == 'm'){
                LEM =(fathersage/2)+20;
                System.out.println("Life expectancy is;" +LEM);
             }
             else{
                LEF =(fathersage/3)+30;
                 System.out.println("Life expectancy is;" +LEF);
                
             }
          
     }
}
    
