package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Veterinaria {
    private LinkedList <TipoDomestico> listaDomesticos;
    private LinkedList <TipoSalvaje> listaSalvajes;

    public Veterinaria(){
        listaDomesticos = new LinkedList<>();
        listaSalvajes = new LinkedList<>();
    }

    public LinkedList<TipoDomestico> getListaDomesticos() {
        return listaDomesticos;
    }

    public void setListaDomesticos(LinkedList<TipoDomestico> listaDomesticos) {
        this.listaDomesticos = listaDomesticos;
    }

    public LinkedList<TipoSalvaje> getListaSalvajes() {
        return listaSalvajes;
    }

    public void setListaSalvajes(LinkedList<TipoSalvaje> listaSalvajes) {
        this.listaSalvajes = listaSalvajes;
    }

    public void agregarDomestico(TipoDomestico domestico){
        listaDomesticos.add(domestico);
    }

    public void agregarSalvaje(TipoSalvaje salvaje){
        listaSalvajes.add(salvaje);
    }

    public void mostrarDomestico(){
        mostrarMensaje(listaDomesticos.toString());
    }

    public void mostrarSalvaje(){
        mostrarMensaje(listaSalvajes.toString());
    }

    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}