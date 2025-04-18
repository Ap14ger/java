package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmacth.calculos.Clasificacion;

public class Episodio implements Clasificacion {
    private int numero;

    private  String nombre;

    private  Serie serie;

    private  int totalVisualizaciones;

    public int getTotalVisualizaciones() {
        return totalVisualizaciones;
    }

    public void setTotalVisualizaciones(int totalVisualizaciones) {
        this.totalVisualizaciones = totalVisualizaciones;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public Serie getSerie() {
        return serie;
    }

    @Override
    public int getClasificacion() {
        if(totalVisualizaciones > 100){
            return  4;
        }else{
            return  2;
        }
    }


    public void setNumero(int i) {
    }

    public void setNombre(String laCasaTargeyen) {
    }

    public void setSerie(Serie casaDragon) {
    }
}
