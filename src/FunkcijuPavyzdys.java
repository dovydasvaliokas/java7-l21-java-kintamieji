public class FunkcijuPavyzdys {
    public static void main(String[] args) {
        double ilgis = 15.37;
        double plotis = 3.28;

        double plotas = staciakampioPlotas(ilgis, plotis);
        System.out.println("plotas = " + plotas);

        System.out.println("staciakampioPlotas(50, 2.5) = " + staciakampioPlotas(50, 2.5));


        int x = 5;
        int y = 10;

        int plotasXY = (int) staciakampioPlotas(x, y);
        System.out.println("plotasXY = " + plotasXY);
    }


    // Papildomos funkcijos
    public static double staciakampioPlotas(double a, double b) {
        return a * b;
    }
}
