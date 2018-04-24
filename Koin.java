import java.util.Scanner;

/**
 * Merepresentasikan koin yang dihasilkan oleh ikan
 * setelah sekian waktu berada di dalam Akuarium
 * dan telah diberikan makanan oleh player.
 */
public class Koin extends Objek{

  public enum CoinType {Bronze, Silver, Gold, Diamond1, Diamond2, Diamond3};
  /**
   * Value dari setiap koin yang muncul berupa
   * Bronze, Silver, atau Gold.
   */
  private CoinType value;

  /**
   * Konstanta dari banyaknya koin saat awal permainan.
   */
  private static int numberOfCoin = 0;

  /**
   * Koin yang merupakan default value saat dihasilkan
   * oleh ikan saat awal permainan adalah Bronze.
   */
  public Koin(){
    value = CoinType.Bronze;
  }

  /**
   * Koin yang dihasilkan oleh ikan akan bergerak
   * sesuai absis dan ordinat yang telah ditentukan
   * oleh batasan Objek.
   * Koin dapat bertambah terus menerus seiring dengan
   * ikan yang diberikan makanan dan valuenya dapat
   * meningkat dari Bronze sampai Gold.
   * @param _value tipe dari koin yang dihasilkan
   *               oleh ikan setelah diberi makan.
   * @param _x absis dari pergerakan koin yang
   *           dihasilkan oleh ikan.
   * @param _y ordinat dari pergerakan koin yang
   *           dihasilkan oleh ikan.
   */
  public Koin(CoinType _value, int _x, int _y){
    super(_x, _y /*input nama koin*/);
    numberOfCoin = numberOfCoin + 1;
    value = _value;
  }

  /**
   * Banyak koin yang ada di akuarium dapat
   * berkurang seiring berjalannya waktu.
   */
  public static void decreaseNumberOfCoin(){
    numberOfCoin = numberOfCoin - 1;
  }

  /**
   * Menentukan apakah posisi absis dan ordinat
   * koin dalam bergerak sesuai dengan batasan
   * yang telah ditentukan.
   * @return validasi apakah koordinat posisi koin
   *         telah sama.
   */
  public boolean EqualKoin(Koin a){
    return (this.getPosX() == a.getPosX()) && (this.getPosY() == a.getPosY());
  }

  /**
   * Mendapatkan value dari setiap koin yang dihasilkan
   * ikan di dalam akuarium.
   * @return value atau tipe dari setiap koin.
   */
  public CoinType getValue(){
    return value;
  }

  /**
   * Mendapatkan total banyaknya koin yang dihasilkan
   * oleh ikan-ikan selama berada di Akuarium.
   * @return banyak koin yang dihasilkan dan dimiliki
   *         oleh pemain.
   */
  public static int getNumberOfCoin(){
    return numberOfCoin;
  }

  /**
   * Mendapatkan file image dari koin untuk
   * ditampilan pada layar akuarium.
   * @return memunculkan koin yang ditampilkan
   *         di akuarium sesuai dengan tipe dari
   *         valuenya dengan default diamond.
   */
  public String getImageFile(){
    CoinType _value = this.getValue();
    Scanner s = new Scanner(System.in);
//    _value = s.nextStr();
//    switch (_value){
//      case("Bronze"):
//        return ("image/coin3");
//      break;
//      case("Silver"):
//        return ("image/coin2");
//      break;
//      case("Gold"):
//        return ("image/coin1");
//      break;
//      case("Diamond1"):
//        return ("image/diamond3");
//      break;
//      case("Diamond2"):
//        return ("image/diamond2");
//      break;
//      default:
//        return ("image/diamond1");
//      break;
    return "Ayamayaman";
  }

  /**
   * Menambahkan uang ke pemain setiap kali mendapatnya
   * koin dengan tipe tertentu.
   * @return menambah sejumlah uang ke pemain sesuai value dari
   *         koin yang didapatkan.
   */
  public int addMoney(int money){
    CoinType _value = this.getValue();
//    Scanner s = new Scanner(System.in);
//    _value = s.nextStr();
//    switch (_value){
//      case(CoinType.Bronze):
//        money += 10;
//        break;
//      case("Silver"):
//        money += 20;
//      case("Gold"):
//        money += 40;
//      case("Diamond1"):
//        money += 100;
//      case("Diamond2"):
//        money += 200;
//      default:
//        return money + 300;
//    }
    if (_value == CoinType.Bronze) {
      money += 10;
    }
    else if (_value == CoinType.Silver) {
      money += 20;
    }
    else if (_value == CoinType.Gold) {
      money += 40;
    }
    else if (_value == CoinType.Diamond1) {
      money += 100;
    }
    else {
      money += 300;
    }
    return money;
  }
}