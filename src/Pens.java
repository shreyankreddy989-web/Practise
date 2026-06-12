public class Pens {

    String company;
    String colour;
    String manufacture;

    int units;

    double price;

    boolean colourBlue;

    public Pens(String company,
                String colour,
                String manufacture,
                int units,
                double price,
                boolean colourBlue) {

        this.company = company;
        this.colour = colour;
        this.manufacture = manufacture;
        this.units = units;
        this.price = price;
        this.colourBlue = colourBlue;
    }

    public void company() {
        System.out.println(company);
    }

    public void colour() {
        System.out.println(colour);
    }

    public void manufacture() {
        System.out.println(manufacture);
    }

    public void units() {
        System.out.println(units);
    }

    public void price() {
        System.out.println(price);
    }

    public static void main(String[] args) {

        Pens pen = new Pens(
                "Oxo",
                "Black",
                "November",
                17,
                10.0,
                false
        );
          System.out.println(pen.company);
          System.out.println(pen.colour);
          System.out.println(pen.manufacture);
        pen.company();
        pen.colour();
        pen.manufacture();
        pen.units();
        pen.price();
    }
}