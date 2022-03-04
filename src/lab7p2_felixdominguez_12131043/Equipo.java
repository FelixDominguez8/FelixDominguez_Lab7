/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_felixdominguez_12131043;

/**
 *
 * @author Lenovo I7
 */
public class Equipo {
    private String nombre;
    private int ganados=0;
    private int empatados=0;
    private int perdidos=0;
    private int favor=0;
    private int contra=0;
    private int diferencia=0;
    private int puntos=0;

    public Equipo() {
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public Equipo(String nombre, int ganados, int empatados, int perdidos, int favor, int contra, int diferencia, int puntos) {
        this.nombre = nombre;
        this.ganados = ganados;
        this.empatados = empatados;
        this.perdidos = perdidos;
        this.favor = favor;
        this.contra = contra;
        this.diferencia = diferencia;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGanados() {
        return ganados;
    }

    public void setGanados(int ganados) {
        this.ganados = ganados;
    }

    public int getEmpatados() {
        return empatados;
    }

    public void setEmpatados(int empatados) {
        this.empatados = empatados;
    }

    public int getPerdidos() {
        return perdidos;
    }

    public void setPerdidos(int perdidos) {
        this.perdidos = perdidos;
    }

    public int getFavor() {
        return favor;
    }

    public void setFavor(int favor) {
        this.favor = favor;
    }

    public int getContra() {
        return contra;
    }

    public void setContra(int contra) {
        this.contra = contra;
    }

    public int getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(int diferencia) {
        this.diferencia = diferencia;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", ganados=" + ganados + ", empatados=" + empatados + ", perdidos=" + perdidos + ", favor=" + favor + ", contra=" + contra + ", diferencia=" + diferencia + ", puntos=" + puntos;
    }
    
}
