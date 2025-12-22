public class EjemploThrowable{
    public static void main(String[] args){
        try{
            int resultado = 10/0;
            System.out.println(resultado);
        }
        catch(Throwable t){
            System.out.println("Ocurrió un error | Mensaje: " + t.getMessage());
            t.printStackTrace();
        }
    }
}

/*
Throwable en un catch no se recomienda en producción
porque atrapa errores graves como OutOfMemoryError 
ó puede ocultar fallos críticos del sistema

Throwable se recomienda usar bajo las siguientes circunstancias
- Frameworks
- Loggin global
- Pruebas
- Código muy controlado (por ejemplo, wrappers de ejecución)
*/