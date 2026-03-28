/**
 * 2. Wzorując się na przykładzie 1 napisz program Mieszkancy, który będzie przechowywał
 * liczbę mieszkańców zamieszkujących w trzech budynkach, gdzie w każdym znajduje
 * się 10 mieszkań. Program powinien zakładać tablicę 3x10 i wypełniać ją losową liczbą
 * (całkowitą) mieszkańców z przedziału 1-8 a następnie wyliczać średnią liczbę
 * mieszkańców w każdym bloku i wyświetlać ją na ekranie w formacie #.##.
 */
public class Mieszkancy {
    public static void main(String[] args) {
        final int ileBud = 3;
        final int ileLokalow = 10;
        int[][] meszkancy = new int[ileBud][ileLokalow];
        for (int bud = 0; bud < ileBud; bud++) {
            int suma = 0;
            System.out.printf("--------Blok numer %d:\n", bud+1);
            for (int lokal = 0; lokal < ileLokalow; lokal++) {
                meszkancy[bud][lokal] = (int) (Math.round(Math.random()*7) + 1);
                System.out.printf("W mieszkanie numer %d są %d mieszkańców\n", lokal+1, meszkancy[bud][lokal]);
                suma += meszkancy[bud][lokal];
            }
            double srednia = suma / ileLokalow;
            System.out.printf("Średnia liczba mieszkańców w bloku %d jest: %.2f\n", bud+1, srednia);
        }
    }
}
/*
import java.text.DecimalFormat;
public class TemperaturyCzteryTyg {
 public static void main(String[] args) {
 //deklarujemy i tworzymy tablicę 4 x 7
 final int TYGODNIE = 4;
 final int DNI_TYG = 7;
 double[][] tempCzteryTyg = new double[TYGODNIE][DNI_TYG];
 //losujemy wartości tempratur 0.. 15 st Celsjusza
 //pętla po każdym tygodniu
 for( int tyg=0; tyg<TYGODNIE; tyg++){
 //pętla po każdym dniu tygodnia
 for( int dni=0; dni<DNI_TYG; dni++){
 //losujemy temperatury i zaokrąglamy
 tempCzteryTyg[tyg][dni] = Math.round(Math.random()*15);
 }
 }
 //wypisujemy wylosowane temperatury
 //pętla po każdym tygodniu
 for( int tyg=0; tyg<TYGODNIE; tyg++) {
 System.out.println("Temperatury " + (tyg+1) + " tygodnia:");
 //pętla po każdym dniu tygodnia
 for (int dni = 0; dni < DNI_TYG; dni++) {
 System.out.print("Dzień " + (dni+1));
 System.out.println(" wynosi " + tempCzteryTyg[tyg][dni]);
 }
 }
 //definiujemy format wypisywania liczb rzeczywistych
 //chcemy aby były pokazywane 2 miejsca po przecinku:
 DecimalFormat ft = new DecimalFormat("#.##");
 //liczymy średnią w każdym tygodniu
 for (double[] tydzien : tempCzteryTyg) {
 //w tej zmiennej będziemy sumować tempertury z tygodnia
 double suma = 0.0;
 for (double dzien : tydzien) {
 //sumujemy temperatury
 suma = suma + dzien; //lub prościej: suma += dzien;
 }
 //liczymy średnią dzieląc sumę przez liczbę dni
 double srednia = suma / DNI_TYG;
 //wypisujemy średnią
 System.out.print("Średnia temperatur wynosi: ");
 //wypisujemy sformatowaną do 2 miejsc średnią:
 System.out.println(ft.format(srednia));
 }
 }
}
 */