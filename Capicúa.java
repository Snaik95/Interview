/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capicúa;

import java.util.Scanner;

/**
 *
 * @author Christian Ramirez
 */
public class Capicúa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);//se créo una instancia de la libreria Scanner para almacenar y leer valores en variables
        System.out.println("Ingresa un número: ");//se pidio el numero a procesar en la capicúa
        int numero=scanner.nextInt();//se lee el número que se ingreso y se guarda en la vareable numero
        Capicúa capicúa = new Capicúa();//se creo un instancia capicúa
        capicúa.procesoCapicua(numero,0,numero);//se creo un objeto capicúa al cual aplicar el proceso de validación y se le dio cómo propiedades 3 valores, el primero fue el numero que se le pidio al usuario el cual será aplicado al proceso, el segundo fue un valor 0 solo para tomar en cuenta ese espacio y poder regresar en su lugar el contador de iteraciones y el tercero fue solo para guardar de nuevo el valor del numero que ingreso el usuario solo por si el valor del primer puesto sufria algun cambio
    }
    //Método del procesoCapicua para ejecutar las validaciones
    public void procesoCapicua(long numero,long contador,long primerValor) {
        //Proceso espejo para voltear el número
        //variables utilizables enel proceso
        long diferencia = numero;
        long numeroEspejo = 0;
        long restante = 0;
        long suma;
        //validacion en caso que el valor de la variable numero sea céro
        while (diferencia != 0) {
            restante = diferencia % 10; 
            numeroEspejo = numeroEspejo * 10 + restante;
            diferencia = diferencia / 10; 
        }
        //se asigna valor a la vareable suma para repetir el proceso espejo pero con otras vareables para poder compararlos mas adelante
        suma=numero+numeroEspejo;
        //invertir el resultado de la suma
        long diferencia2 = suma;
        long numeroEspejo2 = 0;
        long restante2 = 0;
        while (diferencia2 != 0) {
            restante2 = diferencia2 % 10; 
            numeroEspejo2 = numeroEspejo2 * 10 + restante2;
            diferencia2 = diferencia2 / 10; 
        }
        //se créo un contador para contar el numero de las iteraciones ejecutadas
        contador=contador+1;
        //validación, si el numero de la suma del promer proceso es el mismo al del segúndo valór 
        if(suma==numeroEspejo2){
            //en caso de que el valor de las vareables fuese el mismo se imprime
            System.out.println("Número de entrada");
            System.out.println("   "+primerValor);
            System.out.println("Ultimo número de Iteración");
            System.out.println("   "+suma);
            System.out.println("No.Iteraciones:");
            System.out.println("   "+contador);
        }
        //en caso de que no sea igual,se manda a llamar a si mismo el método con el resultado de la suma ademas con el valor del contador y del numer que ingreso el usuario para ejecutar de nuevo el proceso capicua
            else{
                procesoCapicua(suma,contador,primerValor);
            }
    }
}
