/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.pp1_alexandertorreslopez;

import java.util.Date;

/**
 *
 * @author Alexander
 */
public class Persona {
    //Atributos
    private String Nombre;
    private String Apellidos;
    private Date Fecha_De_Nacimiento;
    private int[] notas;

    public Persona(String Nombre, String Apellidos, Date Fecha_De_Nacimiento, int[] notas) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Fecha_De_Nacimiento = Fecha_De_Nacimiento;
        this.notas = notas;
    }
    //Getters y setters
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public Date getFecha_De_Nacimiento() {
        return Fecha_De_Nacimiento;
    }

    public void setFecha_De_Nacimiento(Date Fecha_De_Nacimiento) {
        this.Fecha_De_Nacimiento = Fecha_De_Nacimiento;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }
    // metodo recursivo para calcular promedio notas
    public double promedioRecursivo(int i , int acumulado){
        if(i == 11-1)//validamos si i es igual a 10
        {
            return acumulado/10;// si la validacion es correcta aqui se procesa el promedio 
        }
        
        return promedioRecursivo(i+1,acumulado+notas[i]);// si no se llega al final de la lista de notas se llama recursivamente a promedioRecursivoy se actualiza el acumulado sumando notas[i]
    }
    

}
