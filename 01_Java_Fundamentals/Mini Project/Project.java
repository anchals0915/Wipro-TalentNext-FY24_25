
class Project {

    public static void main(String[] args) {

        int[] empNo = { 1001, 1002, 1003, 1004, 1005, 1006, 1007 };
        String[] empName = { "Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay" };
        String[] joinDate = { "01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "1/1/2000",
                "12/06/2006" };
        char[] designationCode = { 'e', 'c', 'k', 'r', 'm', 'e', 'c' };
        String[] dept = { "R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM" };
        int[] basic = { 20000, 30000, 10000, 12000, 50000, 23000, 29000 };
        int[] hra = { 8000, 12000, 8000, 6000, 20000, 9000, 12000 };
        int[] it = { 3000, 9000, 1000, 2000, 20000, 4400, 10000 };

        String[] designation = new String[7];
        int[] da = new int[7];
        int[] salary = new int[7];

        if (args.length == 0) {
            System.out.println("Please enter Empno...");
            return;
        }
        int empid = Integer.parseInt(args[0]);

        if (indexOf(empNo, empid) == -1) {
            // emp Number doesnot exists
            System.out.println("There is no employee with empid : " + empid);

        } else {
            // emp Number exsits
            updatedesignation(designationCode, designation);
            updateDA(designationCode, da);
            updateSalary(basic, hra, da, it, salary);

            int index = indexOf(empNo, empid);

            System.out.printf("%-8s \t %-15s \t %-15s \t %-15s \t %s\n", "Emp No.", "Emp Name", "Department",
                    "Designation", "Salary");
            System.out.printf("%-8d \t %-15s \t %-15s \t %-15s \t %d\n", empNo[index], empName[index], dept[index],
                    designation[index], salary[index]);

        }
    }

    public static int indexOf(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static void updateSalary(int[] basic, int[] hra, int[] da, int[] it, int[] salary) {
        for (int i = 0; i < salary.length; i++) {
            salary[i] = basic[i] + hra[i] + da[i] - it[i];
        }
    }

    public static void updateDA(char[] designationCode, int[] da) {
        for (int i = 0; i < da.length; i++) {
            char code = designationCode[i];
            switch (code) {
                case 'e' -> da[i] = 20000;
                case 'c' -> da[i] = 32000;
                case 'k' -> da[i] = 12000;
                case 'r' -> da[i] = 15000;
                case 'm' -> da[i] = 40000;
                default -> da[i] = 0;
            }
        }
    }

    public static void updatedesignation(char[] designationCode, String[] designation) {
        for (int i = 0; i < designation.length; i++) {
            char code = designationCode[i];
            switch (code) {
                case 'e' -> designation[i] = "Enginner";
                case 'c' -> designation[i] = "Consultant";
                case 'k' -> designation[i] = "Clerk";
                case 'r' -> designation[i] = "Receptionist";
                case 'm' -> designation[i] = "Manager";
                default -> designation[i] = "";
            }
        }
    }
}
