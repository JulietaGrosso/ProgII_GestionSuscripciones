package model;

import model.enums.TipoSuscripcion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestorSuscripciones {
    private List<Suscripcion> listaSuscripciones;

    public GestorSuscripciones(){
        this.listaSuscripciones = new ArrayList<>();
    }




    public void agregarSuscripcion(Suscripcion suscripcion){
            this.listaSuscripciones.add(suscripcion);


    }

    public void mostrarSuscripciones(){
        System.out.println("Suscripciones:");
        for(Suscripcion suscripcion : this.listaSuscripciones){
            System.out.println(suscripcion.toString());
        }
    }

    public Suscripcion buscarSuscripcion(int codigoVigencia) {
        for (Suscripcion suscripcion : this.listaSuscripciones) {
            if (suscripcion.getCodigoVigencia() == codigoVigencia) {
                return suscripcion;
            }
        }
        return null;

    }


    public Map<TipoSuscripcion, List<Suscripcion>> organizarSuscrip(){
        Map<TipoSuscripcion, List<Suscripcion>> mapa = new HashMap<>();

        for(Suscripcion suscripcion :  this.listaSuscripciones){
            TipoSuscripcion tipo = suscripcion.getTipo();

            mapa.putIfAbsent(tipo, new ArrayList<>());
            mapa.get(tipo).add(suscripcion);
        }
        return mapa;
    }




}
