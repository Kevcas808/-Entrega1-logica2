package src;
import java.util.ArrayList;    // Se importa la libreria

public class ListaSimple {

	public static void main(String[] args) {
		     
		        ArrayList<Integer> numeros = new ArrayList<>();     //Creacion de lista

		        numeros.add(10);
		        numeros.add(20);
		        numeros.add(30);    // Se ponen los numeros en la lista ya creada
		        numeros.add(40);
		        numeros.add(50);
		        numeros.add(88);
		        
		        for (int numero : numeros) {      // Se utliza un ciclo for para que la lista siga 
		            System.out.println(numero);   // se imprime los numeros en pantalla
		        }
		        	numeros.remove(Integer.valueOf(30));  // Comando para eliminar un dato de la lista
		        
		            System.out.println("Lista después de eliminar 30:");  // Mensaje de notificacion 
		            for (int numero : numeros) {     //Se utiliza el for para que vea toda la lista de los numeros
		                System.out.println(numero);
		            } 
		            if (numeros.contains(20)) {           // Comsndo para buscar un elemento de la lista
		                System.out.println("El número 20 está en la lista.");
		            } else {
		                System.out.println("El número 20 no está en la lista.");
		            }
		            System.out.println("Se agrega el numero 30");
		            numeros.add(30);
		            System.out.println("El tamaño de la lista es: " + numeros.size()); // Se obtiene y muestra el tamaño de la lista
		        }
		    }
