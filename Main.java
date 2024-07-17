//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {






        Book book = new Book ("Book",10,"hussam");
        Movie movie = new Movie("Movie",20,"ali");
        System.out.println("book original price : " +book.getPrice());
        System.out.println("book price after discount : "+book.getDiscount());

        System.out.println("movie original price : "+movie.getPrice());
        System.out.println("movie price after discount : "+ movie.getDiscount());

       MovablePoint m = new MovablePoint(2,5,4,6);
        System.out.println(m);
        m.moveRight();
        System.out.println(m);
        m.moveUp();
        System.out.println(m);
        m.setxSpeed(10);
        m.moveLeft();
        System.out.println(m);
        m.setySpeed(20);
        m.moveDown();
        System.out.println(m);



    }
}