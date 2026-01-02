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
