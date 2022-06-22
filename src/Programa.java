public class Programa
{
    // Pagrindinė funkcija (window.onload = function() {} atitikmuo iš JavaScript)
    public static void main(String[] args)
    {
        // Kuriuosi kintamuosius.
        // Skaitiniai, sveikieji (integer) kintamieji
        byte maziausias = 120;              // nuo -128 iki 127
        short truputiDidesnis = 10000;      // nuo 32,768 iki 32,767
        int populiariausias = 1000000;      // nuo -2 milijardų iki 2 milijardų (DAŽNIAUSIAI NAUDOJAMAS)
        long didziausias = Long.MAX_VALUE;  // nuo -2^63 iki 2^63


        // Išvedu tuos skaitinius kintamuosius į konsolę.
        System.out.println("maziausias = " + maziausias);
        System.out.println("truputiDidesnis = " + truputiDidesnis);
        System.out.println("populiariausias = " + populiariausias);
        System.out.println("didziausias = " + didziausias);


        // Realieji kintamieji (skaičiai su kableliu)
        float maziauTikslesnis = 0.35f;             // 32-bitų tikslumo, retesnio naudojimo
        double labiauTikslesnis = 0.75;             // 64-bitų tikslumo, šitas yra naudojamas dažniausiai

        // Išvedu realiųjų skaičių kintamuosius į konsolę
        System.out.println("labiauTikslesnis = " + labiauTikslesnis);
        System.out.println("maziauTikslesnis = " + maziauTikslesnis);


        // Tekstiniai kintamieji
        char raide = 'r';
        String zodis = "belekoks tekstas";

        // Išvedu tekstinius kintamuosius
        System.out.println("zodis = " + zodis);
        System.out.println("raide = " + raide);


        // Automatinis konvertavimas iš mažesnio duomenų tipo į didesnį
        byte x = 25;
        int y = x + 5;


        // Priverstinis konvertavimas iš didesnio į mažesnį.
        int mazesnis = 84;
        int didesnis = 159685;

        short mazesnisShort = (short) mazesnis;
        short didesnisShort = (short) didesnis;

        System.out.println("didesnis = " + didesnis + "didesnisShort = " + didesnisShort);
        System.out.println("mazesnis = " + mazesnis + "mazesnisShort = " + mazesnisShort);



        // Trečias konvertavimas naudojant funkcijas
        String tekstinisSkaicius = "2458";
        int konvertuotasSkaicius = Integer.parseInt(tekstinisSkaicius);
        short konvertuotasShort = Short.parseShort(tekstinisSkaicius);

        System.out.println("konvertuotasShort = " + konvertuotasShort);
        System.out.println("konvertuotasSkaicius = " + konvertuotasSkaicius);

    }
}
