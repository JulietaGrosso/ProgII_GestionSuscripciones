package model;

import model.enums.TipoSuscripcion;
import model.exceptions.PinInvalidoException;


public class Suscripcion {
    private static int codigoContador = 0;
    private int idUsuario;
    private int diaVigencia;
    private int codigoVigencia;
    private TipoSuscripcion tipo;

    //solo suscripcion familiar
    private Integer pinParental;

    public Suscripcion(int idUsuario, int diaVigencia, TipoSuscripcion tipo ){
        this.codigoVigencia = Suscripcion.codigoContador+1;
        this.idUsuario = idUsuario;
        this.diaVigencia = diaVigencia;
        this.tipo = tipo;
        Suscripcion.codigoContador=Suscripcion.codigoContador+1;
        this.pinParental = null;

    }

    public Suscripcion(int idUsuario, int diaVigencia, TipoSuscripcion tipo, int pinParental){
        this.codigoVigencia = Suscripcion.codigoContador+1;
        this.idUsuario = idUsuario;
        this.diaVigencia = diaVigencia;
        this.tipo = tipo;
        Suscripcion.codigoContador=Suscripcion.codigoContador+1;

        if(pinParental < 1000 || pinParental > 9999){
            throw new PinInvalidoException("PIN inválido");
        }
        this.pinParental = pinParental;

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


    public int getCodigoVigencia() {
        return codigoVigencia;
    }


    public TipoSuscripcion getTipo() {
        return tipo;
    }

    public void setTipo(TipoSuscripcion tipo) {
        this.tipo = tipo;
    }

    public Integer getPinParental() {
        return pinParental;
    }

    public void setPinParental(Integer pinParental) {
        this.pinParental = pinParental;
    }


    @Override
    public String toString() {
        return "Suscripcion{" +
                "diaVigencia=" + diaVigencia +
                ", tipo=" + tipo +
                ", codigoVigencia=" + codigoVigencia +
                '}';
    }
}
