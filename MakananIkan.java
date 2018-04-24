/**
 * Merepresentasikan makanan ikan yang muncul
 * di Akuarium dan dapat dimakan oleh Ikan.
 */
public class MakananIkan extends Objek {
/**
 * Banyak kemunculan makananan ikan di Akuarium.
 */
private static int iterasiGambar;

/**
 * Makanan ikan akan muncul sekali setiap kali
 * diklik gambar yang merepresentasikannya.
 */
public MakananIkan(){
  iterasiGambar = 1;
}

/**
 * Makanan ikan akan bergerak dari koordinat
 * dimana diklik pada bagian Akuarium dan
 * bergereak sampai berada di bagian dasar Akuarium.
 * @param _x absis dari posisi makanan ikan.
 * @param _y ordinat dari posisi makanan ikan.
 */
public MakananIkan(int _x, int _y){
  super(_x, _y /*input file gambar*/);
  iterasiGambar = 1;
}

/**
 * Mendapatkan banyaknya kemunculan gambar
 * makanan ikan pada akuarium.
 * @return iterasiGambar banyaknya kemunculan
 *                       gambar makanan ikan
 *                       di akuarium.
 */
public static final int getIterasiGambar(){
  return iterasiGambar;
}

/**
 * Memperbarui banyaknya iterasi gambar.
 * Jika sudah mencapai tiga kali akan
 * kembali lagi ke satu dan di-inkremen.
 */
public static void updateIterasiGambar(){
  if (iterasiGambar == 3){
    iterasiGambar = 1;
  }
  else {
    iterasiGambar = iterasiGambar + 1;
  }
}

/**
 * Mengecek kesamaan posisi absis dan ordinat
 * makanan ikan sesuai dengan batasan posisi
 * yang ditentukan oleh objek.
 * @return menghasilkan apakah posisi absis dan ordinat
 *         dari makanan ikan sama.
 */
public boolean EqualMakananIkan(MakananIkan a) {
  return (this.getPosX() == a.getPosX()) && (this.getPosY() == a.getPosY());
  }
}