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
public class AdapterHash2List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //        ClashHash miHash = new ClashHash();
//        miHash.putValue(10, "uno");
//        miHash.putValue(11, "dos");
//        miHash.putValue(12, "tres");
//        
//        Hash2List miHash2List = new Hash2List(miHash);
//        MostrarClassList.Mostrar(miHash2List);
//
//        ClashHash prueba1 = new ClashHash();
//        ClassList prueba2 = new ClassList();
//
//        prueba1.putValue(0, "1");
//        System.out.println(prueba1.getValue(0));
//        prueba2.putElement("1");
//        System.out.println(prueba2.getElement(0));
//        
//        MostrarClassList mostrar = new MostrarClassList();
//        mostrar.Mostrar(prueba2);
        ClassHash miHash = new ClassHash();
        miHash.putValue(10, "uno");
        miHash.putValue(11, "dos");
        miHash.putValue(12, "tres");

        Hash2List miHash2List = new Hash2List(miHash);
        MostrarClassList.Mostrar(miHash2List);
    }

}
