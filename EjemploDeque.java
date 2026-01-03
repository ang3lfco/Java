import java.util.ArrayDeque;
import java.util.Deque;

public class EjemploDeque {
    public static void main(String[] args) {
        /* Queue - doble cola; permite agregar y quitar por ambos extremos */
        Deque<String> deque = new ArrayDeque<>();
        // como cola
        deque.offer("A");
        deque.offer("B");
        
        //como pila
        deque.push("C");
        System.out.println(deque); // --> [C, A, B]
        // offer agrega al final, push al inicio

        /* Deque usado como Stack; Stack está obsoleto */
        Deque<Integer> pila = new ArrayDeque<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println(pila);
        System.out.println(pila.pop());
        System.out.println(pila.pop());
        System.out.println(pila);

        /* ejemplo con algo real - historial(undo/redo) */
        Deque<String> historial = new ArrayDeque<>();
        historial.push("Escribir");
        historial.push("Borrar");
        historial.push("Pegar");
        System.out.println(historial.pop()); // pegar
        System.out.println(historial.pop()); // borrar

        /* otro caso real - ventana deslizante */
        Deque<Integer> ventana = new ArrayDeque<>();
        int[] nums = {1, 3, -1, -3, 5};
        for(int n : nums){
            ventana.addLast(n);
            if(ventana.size() > 3){
                ventana.pollFirst();
            }
            System.out.println(ventana);
        }
    }
}