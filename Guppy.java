import java.io.*;
import java.util.Scanner;

public class Guppy extends Ikan{

  public static int HARGA_GUPPY = 100;
  public static double CoinOut_Time_Guppy = 4;
  public static int FreeHungry_Time_Guppy = 5;
  public static int GetFood_Time_Guppy = 5;
  private double lastCoinDrop;
  private static int populationNumber = 0;
  public Guppy(){
    super(0,0,0);
    populationNumber++;
    lastCoinDrop = CoinOut_Time_Guppy;
  }

  /**
   * @param _x
   * @param _y
   */
  public Guppy(double _x, double _y){
    super(_x,_y, FreeHungry_Time_Guppy /*input nama koin*/);
    populationNumber++;
    lastCoinDrop = CoinOut_Time_Guppy;
  }
  public static void decreaseNumberOfGuppy(){
    populationNumber--;
  }

  /**
   * @param a
   * @return
   */
  public boolean equalGuppy(Guppy a){
    return (super.getPosX() == a.getPosX()) && (super.getPosY() == a.getPosY());
  }

  /**
   * @return
   */
  public static int getPopulationNumber() {
    return populationNumber;
  }

  public static void Eat() {

  }

  /**
   * @param sec_since_last
   * @return
   */
  public boolean DropCoin(double sec_since_last) {
    if (lastCoinDrop - sec_since_last < 0) {
      lastCoinDrop = CoinOut_Time_Guppy;
      return true;
    }

    else {
      lastCoinDrop -= sec_since_last;
      return false;
    }
  }

  /**
   * @return
   */
  public double getLastCoinDrop(){
    return lastCoinDrop;
  }

  /**
   * @param _lastCoinDrop
   */
  public void setLastCoinDrop(double _lastCoinDrop){
    lastCoinDrop = _lastCoinDrop;
  }

  public static int getHARGA_GUPPY() {
    return HARGA_GUPPY;
  }

  public static double getCoinOut_Time_Guppy() {
    return CoinOut_Time_Guppy;
  }

  public static int getFreeHungry_Time_Guppy() {
    return FreeHungry_Time_Guppy;
  }

  public static int getGetFood_Time_Guppy() {
    return GetFood_Time_Guppy;
  }
}