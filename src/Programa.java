public class Programa
{
    // Pagrindinė funkcija (window.onload = function() {} atitikmuo iš JavaScript)
    public static void main(String[] args)
    {
        // Kuriuosi kintamuosius.
        // Skaitiniai, sveikieji (integer) kintamieji
        byte maziausias = 120;              // nuo -128 iki 127
        short truputiDidesnis = 10000;      // nuo 32,768 iki 32,767
        int populiariausias = 1000000;      // nuo -2 milijardų iki 2 milijardų
        long didziausias = Long.MAX_VALUE;  // nuo -2^63 iki 2^63


        // Išvedu tuos skaitinius kintamuosius į konsolę.
        System.out.println("maziausias = " + maziausias);
        System.out.println("truputiDidesnis = " + truputiDidesnis);
        System.out.println("populiariausias = " + populiariausias);
        System.out.println("didziausias = " + didziausias);


    }
}
