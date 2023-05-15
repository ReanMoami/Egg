/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pardenumeros.servicios;

import static java.lang.Math.max;
import static java.lang.Math.pow;
import static java.lang.Math.round;
import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
/**
 *
 * @author Familia
 */
public class ServiciosParDeNumeros {
    public void mostrarValores(double n1,double n2)
    {
        System.out.println("El primer numero es:  "+n1);
        System.out.println("El segundo numero es:  "+n2);
    }
    public Double devolverMayor(double n1,double n2){
        return max(n1, n2);
    }
    public void calcularPotencia(double n1,double n2){
        long aux1 = round(n1*10);
        long aux2 = round(n2*10);
        if (aux1>aux2) {
            System.out.println("N1>N2  La potencia es: "+pow(aux1, aux2));
        } else {
            System.out.println("N1<N2  La potencia es: "+pow(aux2, aux1));
        }
        System.out.println(aux1);
        System.out.println(aux2);
    }
        public void calcularRaiz(double n1,double n2){
        long aux1 = round(abs(n1)*10);
        long aux2 = round(abs(n2)*10);
        if (aux1>aux2) {
            System.out.println("N1>N2  La potencia es: " + sqrt(aux2));
        } else {
            System.out.println("N1<N2  La potencia es: "+sqrt(aux1));
        }
    }

}
