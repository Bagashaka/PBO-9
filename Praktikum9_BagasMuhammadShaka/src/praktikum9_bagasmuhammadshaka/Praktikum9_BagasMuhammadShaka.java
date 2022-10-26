package praktikum9_bagasmuhammadshaka;

public class Praktikum9_BagasMuhammadShaka {
//    public String atributBukanStatic = "Atribut Bukan Static";
//    static String atributStatic = "Atribut Static";
//    
//    public void bukanStatic(){
//    System.out.println("Bukan Static");
//    }
//    
//    static void methodStatic(){
//    System.out.println("Method Static");
//    }
public static class Tabung {
   private static final double phi = 3.14;
   
   public static double Volume (double jari,double tinggi){
        double volume = phi*jari*jari*tinggi;
        return volume;
   }
      public static double LuasPermukaan(double jari ,double tinggi){
      double LuasPermukaan = 2*phi*jari*(jari+tinggi);
      return LuasPermukaan;
   }
  }    

    public static void main(String[] args){     
       double r = 13;
       double t = 30;
       double vol = Tabung.Volume(r, t);
       double lp = Tabung.LuasPermukaan(r, t);
       
       System.out.println(vol);
       System.out.println(lp);
//     Praktikum9_BagasMuhammadShaka prak = new Praktikum9_BagasMuhammadShaka();
//    //Atribut
//     System.out.println(prak.atributBukanStatic);
//     System.out.println(atributStatic);
//     
//     //method
//     prak.bukanStatic();
//     methodStatic(); 
  } 
}
