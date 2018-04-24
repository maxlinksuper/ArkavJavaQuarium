/**
 * Merepresentasikan Objek yang ada di dalam Akuarium.
 * Objek merupakan kelas turunan dari Akuarium.
 */
public class Objek extends Akuarium {

  /**
   * Konstanta untuk kecepatan gerak objek.
   */
  private static final int Speed = 50;

  /**
   * Konstanta untuk waktu maksimal objek berada
   * di dasar akuarium.
   */
  private static final int TIME_MAX_AT_BOTTOM = 3;

  /**
   * Lama waktu objek berada di dasar akuarium.
   */
  private static double timeAtBottom = 0;

  /**
   * Objek bergerak sesuai dengan posisi
   * yang dideklarasikan pada akuarium.
   */
  public Objek() {
    super(0,0);
    timeAtBottom = 0;
  }

  /**
   * Objek bergerak sesuai dengan posisi yang
   * dideklarasikan pada Akuarium.
   * @param _x Posisi objek pada absis di
   *           akuarium.
   * @param _y Posisi objek pada ordinat di
   *           akuarium.
   */
  public Objek(double _x, double _y){
    super(_x, _y);
    timeAtBottom = 0;
  }

  /**
   * Objek bergerak sesuai dengan posisi yang
   * dideklarasikan pada Akuarium dan memunculkan
   * gambar objek dari library.
   * @param _x Posisi objek pada absis di
   *           akuarium.
   * @param _y Posisi objek pada ordinat di
   *           akuarium.
   * @param imageFile nama gambar objek yang
   *                  akan ditampilkan.
   */
  public Objek(double _x, double _y, String imageFile){
    super(_x, _y);
    timeAtBottom = 0;
  }

  /**
   * Objek bergerak dengan kecepatan yang ditentukan
   * dan dibatasi pergerakannya oleh layar serta
   * sesuai dengan waktu maksimal pada dasar Akuarium.
   * @param sec_since_last waktu yang dicatat terakhir
   *                       setelah pergerakan objek.
   */
  public void Move(double sec_since_last){
    double y = super.getPosY();
    double newPosY = y + Speed * sec_since_last;

    if (newPosY >= 768 - 100){// 768 = SCREEN_HEIGHT
      timeAtBottom = timeAtBottom + sec_since_last;
    } else {
      super.setPosY(newPosY);
    }
  }

  /**
   * Waktu pada dasar Akuarium diset sehingga dapat
   * diketahui kapan objek pada dasar Akuarium harus
   * hilang dan tidak bisa digunakan lagi.
   * @param _timeAtBottom lama objek berada pada
   *                      dasar akuarium.
   */
  public static void setTimeAtBottom(double _timeAtBottom){
    timeAtBottom = _timeAtBottom;
  }

  /**
   * Mendapatkan lama objek berada di dasar Akuarium
   * dalam satuan detik.
   * @return lama objek telah berada di dasar Akuarium.
   */
  public static double getTimeAtBottom(){
    return timeAtBottom;
  }

  /**
   * Menghilangkan objek dari dasar Akuarium
   * jika telah berada lebih dari tiga detik.
   * @return apakah objek dapat dihilangkan atau
   *         tidak dari dasar Akuarium.
   */
  public static boolean remove(){
    if (timeAtBottom > 3){
      return true;
    } else {
      return false;
    }
  }

  /**
   * Mendapatkan posisi objek pada absis berapa.
   * @return absis dari objek.
   */
  public double getPosX(){
    return super.getPosX();
  }

  /**
   * Mendapatkan posisi objek pada ordinat berapa.
   * @return ordinat dari objek.
   */
  public double getPosY(){
    return super.getPosY();
  }
}