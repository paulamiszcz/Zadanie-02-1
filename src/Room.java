public class Room {
    public static void main(String[] args) {

        Monitor monitor1 = new Monitor("BENQ", 22, 499.99);
        //monitor1.producent = "BENQ";
        //monitor1.rozmiar = 22;
        //monitor1.cena = 499.99;

        Monitor monitor2 = new Monitor("DELL", 22, 349.99);
        //monitor2.producent = "DELL";
        //monitor2.rozmiar = 22;
        //monitor2.cena = 349.99;


        System.out.println("Pierwszy monitor: " + monitor1.producent + ", " + monitor1.rozmiar + " cale, " + monitor1.cena + "zł");
        System.out.println("Drugi monitor: " + monitor2.producent + ", " + monitor2.rozmiar + " cale, " + monitor2.cena + "zł");
    }
}