import java.io.*;
import java.util.Scanner;


public class Piranha extends Ikan{

  public static int HARGA_PIRANHA = 1000;
  // Atribut konstanta khusus Piranha
  public static int CoinOut_Time_Piranha = 5;
  public static int FreeHungry_Time_Piranha = 7;
  public static int GetFood_Time_Piranha = 7;

  /* Konstruktor untuk menentukan posisi ikan ketika pertama kali dibangkitkan*/
  public Piranha() {
    super(0,0,0);
  }

  /**
   * @param _x
   * @param _y
   */
  public Piranha(int _x, int _y) {
    super(_x, _y, FreeHungry_Time_Piranha);
  }

  public static void Eat() {

  }

  /**
   * @param sec_since_last
   * @return
   */
  public  boolean DropCoin(double sec_since_last) {
    return false;
  }

  public static int getHARGA_PIRANHA() {
    return HARGA_PIRANHA;
  }

  /**
   * @return
   */
  // Atribut konstanta khusus Piranha
  public static int getCoinOut_Time_Piranha() {
    return CoinOut_Time_Piranha;
  }

  public static int getFreeHungry_Time_Piranha() {
    return FreeHungry_Time_Piranha;
  }

  public static int getGetFood_Time_Piranha() {
    return GetFood_Time_Piranha;
  }

  /**
   * @param a
   * @return
   */
  public boolean equalPiranha(Piranha a){
    return (super.getPosX() == a.getPosX()) && (super.getPosY() == a.getPosY());
  }
}