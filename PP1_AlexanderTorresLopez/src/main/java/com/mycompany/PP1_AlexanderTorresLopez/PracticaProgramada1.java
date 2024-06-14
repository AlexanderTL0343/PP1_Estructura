/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pp1_alexandertorreslopez;

import java.util.Date;

/**
 *
 * @author Alexander
 */
public class PracticaProgramada1 {

    public static void main(String[] args) {
        int[] notas={35,57,100,90,84,75,99,20,67,11};//asignamos las notas obtenidas por el estudiante
        Date fDN= new Date(2003, 07, 31);// le asignamos fechas de nacimiento al estudiante
        Persona estudiante= new Persona("Hector", "Hernandez", fDN, notas);// usamos el constructor para crear al estudiante
         double aux=estudiante.promedioRecursivo(0, 0);
         System.out.println("Promedio de:"+estudiante.getNombre()+estudiante.getApellidos()+aux);
    }
}
