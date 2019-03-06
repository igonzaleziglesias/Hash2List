/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterhash2list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Usuario
 */
public class Hash2List extends ClassList {

    public Hash2List(ClassHash mapHash) {
//        Iterator it = mapHash.mapHash.keySet().iterator();
//        while (it.hasNext()) {
//            lista.add(mapHash.mapHash.get(it.next()));
//        }

        lista = new ArrayList<String>(mapHash.map.values());

    }

}
