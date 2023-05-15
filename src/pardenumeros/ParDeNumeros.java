package pardenumeros;
import pardenumeros.entidades.Numeros;
import pardenumeros.servicios.ServiciosParDeNumeros;

public class ParDeNumeros {
    public static void main(String[] args) {
        Numeros p1= new Numeros();
        ServiciosParDeNumeros parS = new ServiciosParDeNumeros();
        parS.mostrarValores(p1.getNum1(), p1.getNum2());
        Double aux=parS.devolverMayor(p1.getNum1(), p1.getNum2());
        System.out.println("Es el mayor: "+aux);
        parS.calcularPotencia(p1.getNum1(), p1.getNum2());
        parS.calcularRaiz(p1.getNum1(), p1.getNum2());
    }
}
