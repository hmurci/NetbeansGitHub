/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author fernando
 */
public class Empleado1 {
    //Atributos
    /**
     * 
     * Nombre del empleado
     */
    private String nombre;
    /**
     * 
     * Apellido del empleado
     */
    
    
    private String apellido;
    /**
     * 
     * Edad del empleado
     */
    private int edad;
    /**
     * 
     * Salario del empleado
     */
    private double salario;

    //Metodos publicos

    /**
     * Suma un plus al salario del empleado si el empleado tiene mas de 40 años
     * @param sueldoPlus
     * @return aumento
     */
    public boolean plus(double sueldoPlus) {
        boolean aumento = false;
        if (edad > 40 && compruebaNombre()) {
            salario += sueldoPlus;
            aumento = true;
        }
        return aumento;
    }

    //Metodos privados
    /**
     * Comprueba que el nombre no este vacio
     * @return true
     */
    private boolean compruebaNombre() {
        if (nombre.equals("")) {
            return false;
        }
        return true;
    }

    //Constructores

    /**
     * Constructor por defecto
     * 
     */
    public Empleado1() {
        this("", "", 0, 0);
    }

    /**
     * Constructor que pide:
     * @param nombre A
     * @param apellido B
     * @param edad 12
     * @param salario 1500
     */
    public Empleado1(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }
}
