public class Movie extends Product{


    private String director ;
    public Movie(){

    }

    public Movie(String name, double price,String director) {
        super(name, price);
        this.director = director;
    }

    @Override
    public double getDiscount() {
        return getPrice()-(getPrice()*0.5);
    }
}
