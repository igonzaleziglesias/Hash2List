/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterhash2list;

import java.util.HashMap;

/**
 *
 * @author Usuario
 */
public class ClassHash implements InterfaceHash {//definimos los metodos del map, implementando la interfaz map

    public HashMap<Integer, String> map = new HashMap<Integer, String>();

    @Override
    public void putValue(int indice, String dato) {
        map.put(indice, dato);
    }

    @Override
    public String getValue(int indice) {
        return map.get(indice);
    }

}
