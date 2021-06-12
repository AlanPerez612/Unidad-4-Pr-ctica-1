/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trix
 */
public class NodoVertice {
    char dato;
    NodoVertice sig,ant;
    NodoArista arista;
    
    public NodoVertice(char d){
        dato=d;
        sig=ant=null;
        arista=null;
    }
    
    public boolean insertarArista(NodoVertice direccion){
        NodoArista nuevo = new NodoArista(direccion);
        if(nuevo==null)return false;
        if(arista==null){
            arista=nuevo;return true;
        }
        ultimo();
        arista.abajo=nuevo;
        nuevo.arriba=arista;
        return true;
    }

    private void ultimo() {
        while(arista.abajo!=null){
            arista=arista.abajo;
        }
    }
    
    private void primero(){
        while(arista.arriba!=null){
            arista=arista.arriba;
        }
    }
    
    public NodoArista buscarArista(NodoVertice direccion){
        if(arista==null)return null;
        primero();
        for(NodoArista buscar=arista;buscar!=null;buscar=buscar.abajo){
            if(buscar.direccion==direccion)return buscar;
        }
        return null;
    }
    
    private boolean unaSolaArista(){
        return arista.abajo == null && arista.arriba==null;
    }
    
    public boolean eliminarArista(NodoVertice direccion){
        if(arista==null)return false;
        NodoArista temp = buscarArista(direccion);
        //No se encontró arista de origen a destino.
        if(temp==null)return false;
        if(temp==arista){
            if(unaSolaArista())arista=null;
            else{
                arista = arista.abajo;
                temp.abajo.arriba = temp.abajo = null;
            }
            return true;
        }
        //está en último.
        if(temp.abajo==null){
            temp.arriba.abajo=temp.arriba=null;
            return true;
    }
        //quitar arista de enmedio de lista de aristas
        temp.arriba.abajo = temp.abajo;
        temp.abajo.arriba = temp.arriba;
        temp.abajo=temp.arriba=null; 
        return true;
    }
    public String toString(){
        String respuesta = "[" + dato + "]";
        NodoArista auxiliar = arista;
        while(auxiliar != null){
            respuesta += " -> " + auxiliar.direccion.dato;
            auxiliar = auxiliar.abajo;
        }
        return respuesta;
    }
}
