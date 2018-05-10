/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornos;

/**
 *
 * @author ASIR 7L
 */
public class calculadora {
    private int num1;
    private int num2;
    public calculadora(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    public int suma(){
        int result=num1+num2;
        return result;
    }
    public int resta(){
        int result=num1-num2;
        return result;
    }
    public int multiplicacion(){
        int result =num1*num2;
         return result;
    }
    public int divide(){
        int result= num1/num2;
        return result;
    }
}
