
public class Solution1 {
    public static void main(String[] args) {
        Author a1 = new Author("Jojo Moyes", "jojomoyes@gmail.com", 'F');
        Book b1 = new Book("Me Before You", a1, 30, 10);

        System.out.println(b1.getName());
        System.out.println(b1.getPrice());
        System.out.println(b1.getQtyInStock());
        System.out.println(b1.getAuthor().getName());
        System.out.println(b1.getAuthor().getEmail());
        System.out.println(b1.getAuthor().getGender());
    }
}
