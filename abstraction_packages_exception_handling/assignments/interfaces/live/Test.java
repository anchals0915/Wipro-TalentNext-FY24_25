package abstraction_packages_exception_handling.assignments.interfaces.live;

import abstraction_packages_exception_handling.assignments.interfaces.music.wind.Saxophone;
import abstraction_packages_exception_handling.assignments.interfaces.music.Playable;
import abstraction_packages_exception_handling.assignments.interfaces.music.string.Veena;



public class Test {
    public static void main(String[] args) {
        Veena v = new Veena();
        Playable veena = v;

        Saxophone s = new Saxophone(); 
        Playable saxo = s;

        veena.play(); 
        saxo.play(); 
    }
}
