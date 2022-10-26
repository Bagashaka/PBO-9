package praktikum9_bagasmuhammadshaka;

public class Tabung {
   private static final double phi = 3.14;
   
   public static double Volume (double jari ,double tinggi){
      double Volume = phi*jari*jari*tinggi;
      return Volume;       
   }
   public static double LuasPermukaan(double jari ,double tinggi){
      double LuasPermukaan = 2*phi*jari*(jari+tinggi);
      return LuasPermukaan;
   }
}
