/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trix
 */
public class Grafo {
    NodoVertice vertice;
    
    public Grafo(){
        vertice=null;
    }
    public boolean insertarVertice(char dato){
        NodoVertice nuevo = new NodoVertice(dato);
        if(nuevo==null)return false;
        
        if(vertice==null){
            vertice = nuevo;
            return true;
        }
        ultimo();
        vertice.sig=nuevo;
        nuevo.ant=vertice;
        return true;
    }

    private void ultimo() {
        while(vertice.sig!=null){
            vertice=vertice.sig;
        }
    }
    
    private void primero(){
        while(vertice.ant!=null){
            vertice=vertice.ant;
        }
    }
    
    private NodoVertice buscarVertice(char dato){
        if(vertice == null) return null;
        primero();
        for(NodoVertice buscar = vertice; buscar != null; buscar = buscar.sig){
            if(buscar.dato == dato){
                return buscar;
            }
        }
        return null;
    }
    
    public boolean insertarArista(char origen, char destino){
        NodoVertice nodoOrigen = buscarVertice(origen);
        NodoVertice nodoDestino = buscarVertice(destino);
        
        if(nodoOrigen == null || nodoDestino == null) return false;
        return nodoOrigen.insertarArista(nodoDestino);
    }
    
    public boolean eliminarArista(char origen, char destino){
        NodoVertice nodoOrigen = buscarVertice(origen);
        NodoVertice nodoDestino = buscarVertice(destino);
        
        if(nodoOrigen ==null || nodoDestino==null)return false;
        return nodoOrigen.eliminarArista(nodoDestino);
    }
    
    public boolean unSoloVertice(){
        return vertice.ant == null && vertice.sig == null;
    }
    
    public boolean eliminarVertice(char dato){
        if(vertice==null)return false;
        NodoVertice temp = buscarVertice(dato);
        if(temp==null)return false;
        //1.- Que el vertice no tenga aristas a otros vértices.
        if(temp.arista!=null)return false;
        //2.- Que otros vertices no tengan aristas a este vértice.
        quitaAristaDeOtrosVertices(temp);
        //primer nodo:
        if(temp==vertice){
            if(unSoloVertice()) vertice=null;
            else{
                vertice=temp.sig;
                temp.sig.ant=temp.sig=null;
            }
            return true;
        }
        //ESTÁ EN EL ÚLTIMO:
        if(temp.sig==null){
            temp.ant.sig  = temp.ant = null;
            return true;
        }
        //TEMP ESTÁ EN MEDIO:
        temp.ant.sig=temp.sig;
        temp.sig.ant=temp.ant;
        temp.sig=temp.ant=null;
        return true;
               
    }

    private void quitaAristaDeOtrosVertices(NodoVertice NodoEliminar) {
       primero();
       for(NodoVertice buscar =vertice; buscar!=null;buscar=buscar.sig){
           buscar.eliminarArista(NodoEliminar);
       }
    }
    
    public boolean [][]generarMatriz(){
        if(vertice == null) return null;
        int a= conteo(),o=0;
        boolean matriz[][]= new boolean[a][a];
        for (int i = 0; i < a; i++) {
            for (int j= 0; j < a; j++) {
                matriz[i][j] = false;
            }
        }
        for(int i = 0; i < a ; i++){
            o=0;
            while(i!=o){
                o++;
                vertice=vertice.sig;
            }
            NodoArista aux = vertice.arista;
            primero();
            while(aux!=null){
                o=0;
                while(aux.direccion != vertice){
                    vertice=vertice.sig;
                    o++;
                }
                matriz[i][o]=true;
                aux=aux.abajo;
                primero();
            }
        }
        return matriz;
    }
    
    public int conteo() {
        if(vertice==null)return 0;
        int i=0;
        primero();
        NodoVertice aux= vertice;
        while(aux!=null){
            i++;
            aux=aux.sig;
        }
        return i;
    }
    
    public String generarLista(char dato){
        return buscarVertice(dato).toString();
    }
    
    public boolean validarCamino(char[] camino){
        boolean respuesta = false;
        if(camino.length == 1){
            return buscarVertice(camino[0]) == null ?
                    respuesta : true;
        }
        for(int i = 0; i < camino.length -1; i++){
            if(buscarVertice(camino[i]).buscarArista(buscarVertice(
            camino[i+1])) != null){
                respuesta = true;
            }
        }
        return respuesta;
    }
}

