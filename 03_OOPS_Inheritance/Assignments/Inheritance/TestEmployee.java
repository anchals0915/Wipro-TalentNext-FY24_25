
class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Anchal Singh", 100000, "15/09/2003", "NIN-96639152");
        System.out.println(e1.getName());
        System.out.println(e1.getAnnualSalary());
        System.out.println(e1.getStartingYear());

        e1.setAnnualSalary(2_00_00_000);
        System.out.println(e1.getAnnualSalary());

        System.out.println(e1.getStartingYear());
    }
}
