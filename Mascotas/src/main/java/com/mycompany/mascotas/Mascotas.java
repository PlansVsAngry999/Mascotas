package com.mycompany.mascotas;
/**
 * Programa que le dice al usuario cual es la mascota adecuada para el (Perro, gato o conejo).
 * @author Ricardo Daniel Hernandez Sosa (PlansVsAngry999).
 * NO FUNCIONARA porque utiliza un metodo para leer caracteres que es para leer ENTEROS.
 */
import java.util.Scanner;
public class Mascotas {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int puntos;
        char respuesta;
        System.out.println("---Test para saber que mascota es la ideal para ti---");
        System.out.println("             -Perro-Conejo-Gato-");
        System.out.println();
        puntos=0;
        //Pregunta 01
        System.out.println("¿Que palabra crees que te describe mejor?");
         System.out.println("a) Extrovertido");
         System.out.println("b) Independiente");
         System.out.println("c) Introvertido");
        respuesta=(char) sn.nextInt();
        System.out.println("    ");
        switch(respuesta){
            case 'a':
              puntos=puntos+1;
              break;
            case 'b':          
              puntos=puntos+2;
              break;
            case 'c':
              puntos=puntos+3;
              break;
            default:
              System.out.println("ERROR... Ingresa una letra de los incisos. ");
        }
        //Pregunta 02
        System.out.println("¿Que tipo de actividades prefieres?");
         System.out.println("a) Al exterior");
         System.out.println("b) Al interior");
         System.out.println("c) Cualquiera suena bien");
        respuesta=(char) sn.nextInt();
        System.out.println();
        switch(respuesta){
            case 'a':
              puntos=puntos+1;
              break;
            case 'b':          
              puntos=puntos+2;
              break;
            case 'c':
              puntos=puntos+3;
              break;
            default:
              System.out.println("ERROR... Ingresa una letra de los incisos. ");
        }
        //Pregunta 03
        System.out.println("Escoge una comida");
         System.out.println("a) Salchichas");
         System.out.println("b) Pescado");
         System.out.println("c) Ensalada de frutas");
        respuesta=(char) sn.nextInt();
        System.out.println();
        switch(respuesta){
            case 'a':
              puntos=puntos+1;
              break;
            case 'b':          
              puntos=puntos+2;
              break;
            case 'c':
              puntos=puntos+3;
              break;
            default:
              System.out.println("ERROR... Ingresa una letra de los incisos. ");
        }  
        //Pregunta 04
        System.out.println("¿Como eres con tus seres queridos?");
         System.out.println("a) Encimoso");
         System.out.println("b) Distante");
         System.out.println("c) Los saludo de vez en cuando");
        respuesta=(char) sn.nextInt();
        System.out.println();
        switch(respuesta){
            case 'a':
              puntos=puntos+1;
              break;
            case 'b':          
              puntos=puntos+2;
              break;
            case 'c':
              puntos=puntos+3;
              break;
            default:
              System.out.println("ERROR... Ingresa una letra de los incisos. ");
        }
        //Pregunta 05
        System.out.println("¿Que haces cuando te enojas?");
         System.out.println("a) Grito, pero se me pasa muy rapido");
         System.out.println("b) Guardo rencor por mucho tiempo aunque no reacciono con violencia");
         System.out.println("c) Muerdo y busco mi espacio");
        respuesta=(char) sn.nextInt();
        System.out.println();
        switch(respuesta){
            case 'a':
              puntos=puntos+1;
              break;
            case 'b':          
              puntos=puntos+2;
              break;
            case 'c':
              puntos=puntos+3;
              break;
            default:
              System.out.println("ERROR... Ingresa una letra de los incisos. ");
        }
        //Pregunta 06
        System.out.println("¿Cuanto tiempo necesitas descansar al dia?");
         System.out.println("a) Varias horas");
         System.out.println("b) Todo el dia");
         System.out.println("c) Muy pocas horas");
        respuesta=(char) sn.nextInt();
        System.out.println();
        switch(respuesta){
            case 'a':
              puntos=puntos+1;
              break;
            case 'b':          
              puntos=puntos+2;
              break;
            case 'c':
              puntos=puntos+3;
              break;
            default:
              System.out.println("ERROR... Ingresa una letra de los incisos. ");
        }
        //Pregunta 07
        System.out.println("¿Que situacion prefieres?");
         System.out.println("a) Salir a correr al parque");
         System.out.println("b) Quedarme en el sofa todo el dia");
         System.out.println("c) Saltar y bailar por horas");
        respuesta=(char) sn.nextInt();
        System.out.println();
        switch(respuesta){
            case 'a':
              puntos=puntos+1;
              break;
            case 'b':          
              puntos=puntos+2;
              break;
            case 'c':
              puntos=puntos+3;
              break;
            default:
              System.out.println("ERROR... Ingrese una letra de los incisos. ");
        }
       //RESULTADOS
        System.out.println("Su total de puntos fue "+puntos);
        System.out.println("Su mascota ideal es: ");
        if (puntos<=7){
            System.out.println(" --Perro--");
            System.out.println(" Eres una persona muy imperactiva y fiel, te gusta pasar tiempo con tus ");
            System.out.println(" seres querido y hacer todo tipo de actividades. Eres muy optimista y feliz.");
        }
        if (puntos>=14){
            System.out.println(" --Gato--");
            System.out.println(" Eres una persona muy independiente, te gusta tu espacio pero tambien disfrutas ");
            System.out.println(" compartir el tiempo con tus seres queridos mientras no crucen tus limites.");
        }
         if (puntos>=21){
            System.out.println(" --Conejo--");
            System.out.println(" Eres una persona muy callada y tranquila, casi siempre estas en tus propios ");
            System.out.println(" asuntos pero de vez en cuando de gusta salir de tu burbuja a convivir con tus seres queridos.");
        }
    }
}
