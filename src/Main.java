/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author nimamonsefi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Student s=new Student();
        
        System.out.print("Enter Your Math Mark : ");
        try {
            s.setMath(scanner.nextDouble());
            System.out.println("Passed !!!");
        } catch (Exception e) {
            System.out.println("Faild !!!");
        }
        
        System.out.print("Enter Your Physics Mark : ");
        try {
            s.setPhysics(scanner.nextDouble());
            System.out.println("Passed !!!");
        } catch (Exception e) {
            System.out.println("Faild !!!");
        }
        
        System.out.print("Enter Your Chemistry Mark : ");
        try {
            s.setChemistry(scanner.nextDouble());
            System.out.println("Passed !!!");
        } catch (Exception e) {
            System.out.println("Faild !!!");
        }
    }
    
}
