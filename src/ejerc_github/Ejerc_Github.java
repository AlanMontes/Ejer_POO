package ejerc_github;
import java.util.Scanner;
public class Ejerc_Github{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  
        int Niniciales = 1;
        String iniciales = "";
        
        System.out.println("Bienvenido, por favor introduzca su nombre completo, separado por espacios '1 entre cada nombre o apellido': ");
        System.err.println("EJEMPLO: Alan Jesus Montes Silva");
        String nombre = sc.nextLine();
        System.out.println("Su nombre es: "+nombre);                    
          //Lo comentado es una variante del programa que muestra el numero de la inicial y esta misma
          //System.out.println("");
          /*  if(nombre.charAt(0) != ' '){
            System.out.println("Su inicial "+ Niniciales +" es : "+nombre.charAt(0));
          } */        
       for(int i = 0; i < nombre.length(); i++){         
           if(nombre.charAt(i) == ' '){
               //System.out.println("Su inicial "+ Niniciales +" es : "+nombre.charAt(i+1)); 
               iniciales = iniciales+" "+nombre.charAt(i+1);
               Niniciales++;
           }
       } 
        //System.out.println("");
        if(nombre.charAt(0) != ' '){
            String ini = nombre.charAt(0)+iniciales;
            System.out.println("INICIALES: "+ini.toUpperCase());}
        else{System.out.println("INICIALES: "+iniciales.toUpperCase());}
   }   
}
