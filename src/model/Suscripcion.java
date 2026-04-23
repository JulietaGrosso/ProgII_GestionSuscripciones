package model;

import model.enums.TipoSuscripcion;

public class Suscripcion {
    private static int codigoContador = 1;
    private int idUsuario;
    private int diaVigencia;
    private int codigoVigencia;
    private TipoSuscripcion tipo;

    //solo suscripxion familiar
    private Integer pinParental;

    public Suscripcion(int idUsuario, int diaVigencia, TipoSuscripcion tipo, Integer pinParental){
        this.codigoVigencia = Suscripcion.codigoContador+1;
        this.idUsuario = idUsuario;
        this.diaVigencia = diaVigencia;
        Suscripcion.codigoContador=Suscripcion.codigoContador+1;

        if(tipo == TipoSuscripcion.FAMILIAR){
            this.pinParental = pinParental;
        }else{
            this.pinParental = null;
        }


    }


    public int getIdUsuario(){
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario){
        this.idUsuario = idUsuario;
    }

    public int getDiaVigencia() {
        return diaVigencia;
    }

    public void setDiaVigencia(int diaVigencia) {
        this.diaVigencia = diaVigencia;
    }

}
