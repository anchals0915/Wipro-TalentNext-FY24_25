// Honda.java
package abstraction_packages_exception_handling.assignments.packages.solution4;

import abstraction_packages_exception_handling.assignments.packages.solution3.com.automobile.Vehicle;

public class Honda extends Vehicle {
    int speed = 120;

    public int getSpeed() {
        return speed;
    }

    public void cdplayer() {
        System.out.println("Controlling CD Player!!!");
    }

    @Override
    public String getModelName() {
        return "Honda";
    }

    @Override
    public String getRegistrationNumber() {
        return "KA1CR21CS027";
    }

    @Override
    public String getOwnerName() {
        return "Ms. Anchal Singh";
    }
}
