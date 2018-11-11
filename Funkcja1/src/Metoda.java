public class Metoda {


   private String Imie;
   private String Nazwisko;
   private int wiek;
   private static int liczba=0;

public Metoda(String imie,String nazwisko,int wiek) {
        this.Imie = imie;
        this.Nazwisko = nazwisko;
        this.wiek = wiek;
        liczba++;
    }
public void biegaj(){

    System.out.println("szybciej");
}



    public static int obliczaj(){


    return liczba;
    }



    public String toString(){
    return "Metoda imie="+Imie+"nazwisko="+Nazwisko+"wiek"+wiek;
}

    public String getImie() {
        return Imie;
    }

    public void setImie(String imie) {
        if(Imie.endsWith("n"))
            this.Imie=imie;
    }
    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek){
    if(wiek>0)
    this.wiek=wiek;
    }
}
