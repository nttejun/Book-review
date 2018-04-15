package videoRental;

public class Run {
    public static void main(String args[]){

        Customer jun = new Customer("jun");
        Rental zutopia = new Rental(new Movie("Zutopia", 0), 2);
        Rental avengers = new Rental(new Movie("Avengers", 1), 3);
        jun.addRental(zutopia);
        jun.addRental(avengers);
        System.out.println(jun.statement());

    }
}
