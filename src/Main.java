public class Main {
   public static void main(String[]args){
       sum(5,5);
       stampaCarattere('C');
       sum2(5,5);
       stampaCarattere2('D');
       autoBoxing();
       System.out.println(" ");
       unboxing();

   }
   static void sum(int num, int num2){
       System.out.println(num + num2);
   }
   static void stampaCarattere(char carattere){
       System.out.println(carattere);
   }
   static void sum2(Integer num, Integer num2){
       System.out.println(num + num2);
   }
   static void stampaCarattere2(Character carattere){
       System.out.println(carattere);
   }
   static void autoBoxing(){
       int numero = 35;
       Integer numero2 = numero;
       System.out.println(("Valore primitivo: " + numero));
       System.out.println(("Valore wrapper: " + numero2));
       double numeroDouble = 4.5;
       Double numeroDouble2 = numeroDouble;
       System.out.println(("Valore primitivo: " + numeroDouble));
       System.out.println(("Valore wrapper: " + numeroDouble2));
       char carattere = 'A';
       Character carattere2 = carattere;
       System.out.println(("Valore primitivo: " + carattere));
       System.out.println(("Valore wrapper: " + carattere2));

   }
   static void unboxing(){
       Integer oggettoInteger = new Integer(22);
       Double oggettoDouble = new Double(2.2);
       Character oggettoCharacter = new Character('B');
       int numero =oggettoInteger.intValue();
       char carattere = oggettoCharacter.charValue();
       double numeroDouble = oggettoDouble.doubleValue();
       System.out.println(("Valore wrapper: " + oggettoInteger));
       System.out.println(("Valore primitivo: " + numero));
       System.out.println(("Valore wrapper: " + oggettoDouble));
       System.out.println(("Valore primitivo: " + numeroDouble));
       System.out.println(("Valore wrapper: " + oggettoCharacter));
       System.out.println(("Valore primitivo: " + carattere));

   }
}
