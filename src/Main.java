import model.GestorSuscripciones;
import model.Suscripcion;
import model.enums.TipoSuscripcion;
import model.exceptions.PinInvalidoException;

import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {


        Suscripcion suscripcion = new Suscripcion(1, 20, TipoSuscripcion.ESTANDAR);

        Suscripcion suscripcion2 = new Suscripcion(2, 25, TipoSuscripcion.PREMIUM);

        Suscripcion suscripcion3 = new Suscripcion(3, 23, TipoSuscripcion.FAMILIAR, 1234);

        Suscripcion suscripcion4 = new Suscripcion(4, 10, TipoSuscripcion.PREMIUM);

        Suscripcion suscripcion5 = new Suscripcion(5, 25, TipoSuscripcion.FAMILIAR, 4567);





        GestorSuscripciones gestorSuscripciones = new GestorSuscripciones();

        //1-Agregar una nueva suscripción a la lista.
        gestorSuscripciones.agregarSuscripcion(suscripcion);
        gestorSuscripciones.agregarSuscripcion(suscripcion2);
        gestorSuscripciones.agregarSuscripcion(suscripcion3);
        gestorSuscripciones.agregarSuscripcion(suscripcion4);
        gestorSuscripciones.agregarSuscripcion(suscripcion5);

        //para probar la exception
        try{
            Suscripcion suscripcion6 = new Suscripcion(6, 22, TipoSuscripcion.FAMILIAR, 55554);
            gestorSuscripciones.agregarSuscripcion(suscripcion6);

        } catch (Exception e) {
            e.printStackTrace();
        }

        //2-Listar todas las suscripciones, mostrando el tipo de plan y sus detalles.

        gestorSuscripciones.mostrarSuscripciones();

        //3-Buscar una suscripción específica por su código único.

       Suscripcion encontrada = gestorSuscripciones.buscarSuscripcion(3);
        if(encontrada != null){
            System.out.println("Suscripcion encontrada: " + encontrada);
        } else System.out.println("Suscripcion no existente");


        //4-Crear un método que organice las suscripciones existentes en un Map

        Map<TipoSuscripcion, List<Suscripcion>> mapa = gestorSuscripciones.organizarSuscrip();
        System.out.println("Suscripciones organizadas por tipo:");
        for(Map.Entry<TipoSuscripcion, List<Suscripcion>> entry : mapa.entrySet()){
            System.out.println("Tipo: " + entry.getKey());
            for (Suscripcion s : entry.getValue()) {
                System.out.println(" " + s.toString());
            }
            System.out.println("----------------------");
        }

        }





}