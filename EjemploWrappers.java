import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class EjemploWrappers{
    public static void main(String[] args){

        /*
        Autounboxing y unboxing son conceptos claves
        Java convierte en automatico entre primitivos
        y wrappers.
        */

        // Autounboxing, primitivo > wrapper
        Integer entero = 10;
        Double decimal = 3.14;
        Boolean activo = true;
        Character letra = 'A';

        //Unboxing, wrapper > primitivo
        int e = entero;
        double d = decimal;
        boolean a = activo;
        char l = letra;

        System.out.println("Básico:");
        System.out.println(entero + ", " + decimal + ", " + activo + ", " + letra);

        /* Parseo de strings */
        int num = Integer.parseInt("100");
        double precio = Double.parseDouble("19.99");
        boolean valido = Boolean.parseBoolean("true");

        System.out.println("Parseo: ");
        System.out.println(num + ", " + precio + ", " + valido);


        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        System.out.println("Colecciones:");
        numeros.forEach(System.out::println);

        /* Los wrappers permiten valores nulos */
        Integer edad = null;
        if(edad == null){
            System.out.println("Edad no definida: " + edad);
        }

        /* Los wrappers permiten acceder a métodos útiles */
        int max = Integer.max(10, 50);
        int min = Integer.min(10, 50);
        int compare = Integer.compare(10, 20);
        System.out.println(max);
        System.out.println(min);
        System.out.println(compare);

        /* Nota: nunca usar == para comparar wrappers, usar equals() */
        /* == Referencia en cache | equals valor */

        // Comparación correcta de wrappers
        Integer x = 100;
        Integer y = 100;
        System.out.println(x.equals(y));
        System.out.println(x == y); //puede ser true por cache(-128 a 127)

        /* Integer cache de -128 a 127 */
        /* Ejemplo de Integer cache */
        Integer a1 = 127;
        Integer a2 = 127;
        Integer b1 = 128;
        Integer b2 = 128;
        System.out.println(a1 == a2);
        System.out.println(b1 == b2);


        /* Wrappers en mapas */
        Map<String, Double> productos = new HashMap<>();
        productos.put("Laptop", 1200.50);
        productos.put("Mouse", 25.99);
        productos.forEach((k, v) -> System.out.println(k + ": $" + v));


        /* Optional + wrapper */
        /* 
        Optional fue introducido en java 8 y es para representar un valor
        que puede existir o no y así evitar el famoso NullPointerException
        "Esto es un Optional que puede contener un valor o estar vacío"
        */
        /* Optional no guarda null, guarda vacío */
        Optional<Integer> opcion = Optional.ofNullable(null);
        int valorSeguro = opcion.orElse(0);
        System.out.println(valorSeguro);


        /*  Casting avanzado 
            Number "Superclase" es una clase abstracta que es padre
            de todos los wrappers numéricos 
            (Integer, Double, Long, Float, Short, Byte.)
            
            Una variable Number puede apuntar a cualquier tipo numérico wrapper
        */
        Number numeroGenerico = Integer.valueOf(50);
        int valorFinal = numeroGenerico.intValue();
        System.out.println(valorFinal);
        /*  El tipo real del objeto es Integer pero el tipo de la referencia es Number
            intValue() es un método abstracto de Number y todas sus subclases
            lo implementan, gracias a polimorfismo se ejecuta y no hay
            casting explícito como: (Integer) numeroGenerico
        */


        /* Wrapper como constantes */
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE: " + Double.MIN_VALUE);
    }
}
