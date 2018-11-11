public class Test_Metoda {
    public static void main(String[] args) {


        Metoda m1 = new Metoda("Jan", "Kowalski",21);
        m1.setWiek(12);
        m1.setImie("kozak");
        Metoda m2 =new Metoda("ann","dziwal",12);
        System.out.println(Metoda.obliczaj());
        m1.biegaj();
    }
}