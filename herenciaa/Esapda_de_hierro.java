/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaa;
import herenciaa.Espada_de_madera;

/**
 *
 * @author Michael
 */
public class Esapda_de_hierro extends Espada_de_madera {

    public Esapda_de_hierro() {

    }
    protected String inmune_al_fuego;
    
    public void vida(){
        vida = 120;
        System.out.println("La espada de hierro tiene: "+vida);
    }
    public void resistencia(){
        resistencia = 120;
        System.out.println("La espada tiene de rsistencia : "+resistencia);
    }
    public void daño(){
        daño = 20;
        System.out.println("La espada tiene de daño: "+daño);
    }
    public void textura (){
        textura = "gris claro";
        System.out.println("La armadura tiene de textura: "+textura);
    }
    public void inmune_al_fuego(){
        inmune_al_fuego = "inmune";
        System.out.println("No le quita vida"+inmune_al_fuego);
    }
    
}
