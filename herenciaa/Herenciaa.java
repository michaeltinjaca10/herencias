/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaa;
import herenciaa.Espada_de_madera;
import herenciaa.Esapda_de_hierro;

public class Herenciaa {

    
    
    public static void main(String[] args) {
        Espada_de_madera espada_uno = new Espada_de_madera();
        System.out.println("Espada de madera");
        espada_uno.daño();
        espada_uno.durabilidad();
        espada_uno.resistencia();
        espada_uno.textura();
        espada_uno.vida();
        System.out.println("___________________________________");
        Esapda_de_hierro esapda_dos = new Esapda_de_hierro();
        System.out.println("Espada de hierro");
        esapda_dos.daño();
        esapda_dos.durabilidad();
        esapda_dos.inmune_al_fuego();
        esapda_dos.resistencia();
        esapda_dos.textura();
        esapda_dos.vida();
    }
    
}
