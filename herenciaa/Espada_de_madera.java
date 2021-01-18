/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaa;

/**
 *
 * @author Michael
 */
public class Espada_de_madera {
    public Espada_de_madera(){
        
    }
    
    protected  int vida,resistencia,daño,durabilidad;
    protected String textura;
    
    
    public void vida(){
        vida = 100;
        System.out.println("La espada tiene: "+vida);
    }
    public void resistencia(){
        resistencia = 100;
        System.out.println("La esapda tiene: "+resistencia);
    }
    public void daño(){
        daño = 10;
        System.out.println("La esapda hace de daño: "+daño);
    }
    public void durabilidad(){
        durabilidad = 100;
        System.out.println("La espada tiene de durabilidad: "+durabilidad);
    }
    public void textura(){
        textura = "cafe";
        System.out.println("La espada tiene de textur: "+textura);
    }
}
