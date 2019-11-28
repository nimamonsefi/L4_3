/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nimamonsefi
 */
public class Student {
    private String name;
    private double math;
    private double physics;
    private double chemistry;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) throws MyException{
        this.math = math;
        if(math<10){
            throw new MyException();
        }
    }

    public double getPhysics() {
        return physics;
    }

    public void setPhysics(double physics) throws MyException{
        this.physics = physics;
        if(physics<10){
            throw new MyException();
        }
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) throws MyException{
        this.chemistry = chemistry;
        if(chemistry<10){
            throw new MyException();
        }
    }
    
    
}
