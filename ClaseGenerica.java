package clasegenerica;

import java.util.Scanner;

/*
 * @author DIEGO LOPEZ
 */
public class ClaseGenerica {

    public static void main(String[] args) {
        
        ArrayList datos = new ArrayList(4);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresar nombre :");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingresar edad :");        
        int edad = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Su nombre y edad son : " + nombre + ", " + edad);
        
        System.out.println("Ingresar EPS :");
        String eps = scanner.nextLine();
        
        System.out.println("Ingrese su fecha de nacimiento");
        String fecha = scanner.nextLine();
        
        System.out.println("Su fecha de nacimiento y EPS vinculada son : " + fecha + ", " + eps);
        
        Pair<String, Integer> name_age = new Pair<>(nombre, edad);
        Pair<String, String> eps_date = new Pair<>(fecha, eps);
        
        Usuario usuario = new Usuario(name_age.getFirst(), name_age.getSecond(), eps_date.getFirst(), eps_date.getSecond());
        
        datos.add(usuario);
        System.out.println("El usuario se registró");
        Usuario usuarios = (Usuario) datos.get(0);
        
        System.out.println("El nombre es:" + usuarios.getNombre());
        System.out.println("La edad es: " + usuarios.getEdad());
        System.out.println("La fecha de nacimiento es: " + usuarios.getFecha());
        System.out.println("La EPS es: " + usuarios.getEps());
    }
}
