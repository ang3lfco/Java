import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EjemploMap {
    public static void main(String[] args){
        
        /* Mapa<clave, valor> dónde la clave es única*/
        Map<String, Integer> edades = new HashMap<>();
        edades.put("Juan", 25);
        edades.put("Ana", 30);
        edades.put("Luis", 20);

        /* obtener un valor */
        System.out.println(edades.get("Ana"));
        
        /* verificar si existe una clave */
        System.out.println(edades.containsKey("Juan"));

        /* tamaño del mapa */
        System.out.println(edades.size());

        /* Recorrer un Mapa: claves y valores */
        for(Map.Entry<String,Integer> entry : edades.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        /* Solo las claves */
        for(String clave : edades.keySet()){
            System.out.println(clave);
        }

        /* Solo valores */
        for(Integer valor : edades.values()){
            System.out.println(valor);
        }

        System.out.println("----------------------------");
        /* operaciones más comunes */
        edades.remove("Luis");
        for(Map.Entry<String, Integer> entry : edades.entrySet()){
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }

        System.out.println("----------------------------");
        edades.put("Kelly", 28);
        for(Map.Entry<String, Integer> entry : edades.entrySet()){
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }

        System.out.println("----------------------------");
        edades.clear();
        for(Map.Entry<String, Integer> entry : edades.entrySet()){
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }


        System.out.println("----------------------------");

        Map<Integer, Usuario> usuarios = new HashMap<>();
        usuarios.put(1, new Usuario("Angel", "angel@mail.com"));
        usuarios.put(2, new Usuario("Omar", "omar@mail.com"));
        Usuario usuario = usuarios.get(2);
        System.out.println(usuario.nombre + " | " + usuario.email);


        System.out.println("----------------------------");
        Map<String, List<String>> alumnosConCursos = new HashMap<>();
        alumnosConCursos.put("Miguel", List.of("Calculo", "Algebra lineal"));
        alumnosConCursos.put("Maria", List.of("Diseño", "Publicidad"));
        System.out.println(alumnosConCursos.get("Miguel"));
    }

    static class Usuario{
        String nombre, email;

        Usuario(String nombre, String email){
            this.nombre = nombre;
            this.email = email;
        }
    }
}
