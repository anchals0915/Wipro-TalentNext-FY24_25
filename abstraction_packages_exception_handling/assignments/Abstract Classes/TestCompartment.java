
abstract class Compartment 
{
    public abstract String notice();
}

class FirstClass extends Compartment {

    @Override
    public String notice() {
        return "First Class Compartment";
    }
}

class Ladies extends Compartment {

    @Override
    public String notice() {
        return "Ladies Compartment";
    }
}

class General extends Compartment {
    @Override
    public String notice() {
        return "Ladies Compartment";
    }
}

class Luggage extends Compartment {

    @Override
    public String notice() {
        return "Luggage Compartment";
    }
}

public class TestCompartment {
    public static void main(String[] args) {
        // Declare the array of Compartment of size 10
        Compartment[] c = new Compartment[10] ;
        
        // create a compartment of type as decided randomly generated integer 
        // in the range 1 to 4 

        // Check the polymorphic behaviour of the notice method.
        // [i.e. based on the random number generated, the first compartment 
        // can be luggage , the second one csould be ladies and so on ]
    }
}
