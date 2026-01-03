import java.util.PriorityQueue;
import java.util.Queue;

public class EjemploPriorityQueue {
    public static void main(String[] args) {
        /*  En priority queue no aplica FIFO sino la prioridad
            Primero sale el elemento con mayor prioridad
            En este caso por default el de menor valor
        */
        Queue<Integer> prioridades = new PriorityQueue<>();
        prioridades.offer(5);
        prioridades.offer(1);
        prioridades.offer(3);
        while(!prioridades.isEmpty()){
            System.out.println(prioridades.poll());
        }
        /*
            La prioridad se decide por orden natural "Comparable"
            Para números -> menor primero, para Strings -> orden alfabético
        */

        // PriorityQueue con objetos
        Queue<Tarea> tareas = new PriorityQueue<>(
            (a,b) -> Integer.compare(a.prioridad, b.prioridad)
        );
        tareas.offer(new Tarea("Bug crítico", 1));
        tareas.offer(new Tarea("Mejora", 3));
        tareas.offer(new Tarea("Refactor", 2));
        System.out.println(tareas.poll().nombre); // --> bug crítico

        /*  En PriorityQueue solo el primer elemento es correcto
            solo se garantiza que el elemento que sale con peek o poll
            es el de mayor prioridad segun el criterio definido
            
            en este caso por ejemplo: [1, 2, 3, 5] ó [1, 3, 2, 5]
            ambos son válidos, java no promete que el resto
            esté ordenado.

            Todo esto se debe a que PriorityQueue usa un heap binario,
            no una lista ordenado. Un heap solo garantiza: Padre <= Hijos
        */
    }

    static class Tarea{
        String nombre;
        int prioridad;

        Tarea(String nombre, int prioridad){
            this.nombre = nombre;
            this.prioridad = prioridad;
        }
    }
}
