
class MathOperation {
    public static void main(String[] args) {

        int[] arr = new int[5];
        int sum = 0;
        float avg = 0.0f;

        try {

            if (args.length != 5) {
                throw new Exception("Please enter only 5 numbers.");
            }

            for (int i = 0; i < args.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
                sum += arr[i];
            }

            if (sum != 0) {
                avg = (float) sum / 5;
            }
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + avg);

        } catch (ArithmeticException e) {
            System.out.println(e.getClass().getName());
        } catch (NumberFormatException e) {
            System.out.println(e.getClass().getName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
