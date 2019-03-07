/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterhash2list;

/**
 *
 * @author Usuario
 */
public class MostrarClassList {

    public static void Mostrar(ClassList list) {//definimos el metodo para mostrar la lista, que vamos a querer usar con el map

        System.out.println("indice elemento");
        for (int i = 0; i <= list.lista.size() - 1; i++) {
            System.out.println(i + "      " + list.getElement(i));
        }

    }
}
