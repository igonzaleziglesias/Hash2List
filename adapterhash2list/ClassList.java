/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterhash2list;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ClassList implements InterfaceList {

    public ArrayList<String> lista = new ArrayList<String>();

    @Override
    public void putElement(String e) {
        lista.add(e);
    }

    @Override
    public String getElement(int pos) {
        return lista.get(pos);
    }
}
