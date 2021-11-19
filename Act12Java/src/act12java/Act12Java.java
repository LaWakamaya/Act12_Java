/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act12java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alan Franco
 */
public class Act12Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean salir = false;
        int opcion = 0;
        
        AddressBook contactos = new AddressBook();
        
        System.out.println("------Lista de contactos------");
        while(!salir){
            System.out.println("Elija una opcion:");
            System.out.println("1. Lista de contactos");
            System.out.println("2. Agregar nuevo contacto");
            System.out.println("3. Eliminar un contacto");
            System.out.println("0. Salir");
            try{
                opcion = Integer.parseInt(br.readLine());
            }catch(Exception e){
                opcion = 0;
                System.out.println("No se selecciono una opcion");
            }
            switch(opcion){
                case 1:{
                    contactos.list();
                    break;
                }
                
                case 2:{
                    System.out.println("Ingrese el nombre del contacto");
                    String nom = br.readLine();
                    System.out.println("Ingrese el telefono del contacto");
                    String tel = br.readLine();
                    contactos.create(tel, nom);
                    System.out.println("Contacto agregado");
                    break;
                }
                
                case 3:{
                    System.out.println("Ingrese el telefono del contacto a eliminar");
                    String tel = br.readLine();
                    contactos.delete(tel);
                    break;
                }
                
                case 0:{
                    contactos.save();
                    salir = true;
                    break;
                }
                
                default:{
                    System.out.println("Seleccione una opcion valida");
                }
            }
            
        }
        
    }
    
}
