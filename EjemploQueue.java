import java.util.LinkedList;
import java.util.Queue;

public class EjemploQueue {
    public static void main(String[] args){
        /* Queue -> Cola(FIFO) : First in, first out */
        Queue<String> cola = new LinkedList<>();
        cola.offer("Cliente 1");
        cola.offer("Cliente 2");
        cola.offer("Cliente 3");

        /* recupera(no elimina) la cabeza de la cola */
        System.out.println(cola.peek());

        /* Recupera(y elimina) la cabeza de la cola */
        System.out.println(cola.poll());
        System.out.println(cola.poll());

        /*  
            add() -> lanza excepción si falla
            offer() -> devuelve false
        */
        cola.offer("Cliente 4");
        cola.offer("Cliente 5");
        for(String cliente : cola){
            System.out.println(cliente);
        }
    }
}
