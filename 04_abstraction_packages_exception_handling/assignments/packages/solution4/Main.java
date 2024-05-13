// Main.java
package abstraction_packages_exception_handling.assignments.packages.solution4;

import abstraction_packages_exception_handling.assignments.packages.solution4.com.automobile.fourwheeler.Ford;
import abstraction_packages_exception_handling.assignments.packages.solution4.com.automobile.fourwheeler.Logan;
import abstraction_packages_exception_handling.assignments.packages.solution4.com.automobile.twowheeler.Hero;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        Honda honda = new Honda();
        Ford ford = new Ford();
        Logan logan = new Logan();
        
        System.out.println("Hero's speed: " + hero.getSpeed()+" km/hr");
        hero.radio();
        
        System.out.println("Honda's speed: " + honda.getSpeed()+" km/hr");
        honda.cdplayer();
        
        System.out.println("Ford's speed: " + ford.speed()+" km/hr");
        ford.tempControl();
        
        System.out.println("Logan's speed: " + logan.speed()+" km/hr");
        logan.gps();
    }
}
