/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trix
 */
public class NodoArista {
    NodoVertice direccion;
    NodoArista arriba,abajo;
    
    public NodoArista(NodoVertice d){
        direccion=d;
        arriba=abajo=null;
    }
}
