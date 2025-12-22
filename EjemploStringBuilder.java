public class EjemploStringBuilder{
    public static void main(String[] args){
        
        StringBuilder sb = new StringBuilder();
        sb.append("Hola");
        sb.append(" ");
        sb.append("mundo");
        String resultado = sb.toString();
        System.out.println(resultado);

        // con capacidad inicial
        StringBuilder sbAvanzado = new StringBuilder(50);
        // ejemplo construcción dinámica
        sbAvanzado.append("Usuario: ").append("Angel").append("\n");
        sbAvanzado.append("Edad: ").append(26).append("\n");
        sbAvanzado.append("Activo: ").append(true).append("\n");
        System.out.println(sbAvanzado);

        //insertar texto en una posición específica
        sbAvanzado.insert(0, "--- Datos del usuario ---\n");
        System.out.println(sbAvanzado);

        //reemplazar parte del texto
        sbAvanzado.replace(
            sbAvanzado.indexOf("Edad"),
            sbAvanzado.indexOf("Edad") + 4,
            "Años"
        );
        System.out.println(sbAvanzado);

        // eliminar una parte
        int inicio = sbAvanzado.indexOf("Activo");
        //(hasta donde, desde donde) más uno
        int fin = sbAvanzado.indexOf("\n", inicio) + 1;
        sbAvanzado.delete(inicio, fin);
        System.out.println(sbAvanzado);

        // invertir
        StringBuilder sbInvertido = new StringBuilder(sbAvanzado);
        sbInvertido.reverse();
        System.out.println(sbInvertido);
    }
}