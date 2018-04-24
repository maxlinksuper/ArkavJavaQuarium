import java.util.Scanner;

/**
 * Merepresentasikan Akuarium yang menjadi tempat
 * untuk objek dan ikan bergerak.
 * Akuarium memiliki koordinat yang nantinya
 * menjadi acuan bagi objek dan ikan untuk bergerak.
 */
public class Akuarium {

  /**
   * Absis pada akuarium yang menjadi acuan
   * untuk bergerak.
   */
  private double x;

  /**
   * Ordinat pada akuarium yang menjadi acuan
   * untuk bergerak.
   */
  private double y;

  /**
   * Koordinat pada akuarium yang terdiri dari
   * sumbu x dan y.
   * @param _x absis pada koordinat yang menjadi
   *           acuan gerak pada akuarium.
   * @param _y ordinat pada koordinat yang menjadi
   *           acuan gerak pada akuarium.
   */
  public Akuarium(double _x, double _y){
    x = _x;
    y = _y;
  }

  /**
   * Menentukan posisi pada akuarium dengan
   * absis dan ordinat pada sumbu kartesian.
   * @param _x absis pada koordinat kartesian
   * @param _y ordinat pada koordinat kartesian
   */
  public void setPos(double _x, double _y){
    x = _x;
    y = _y;
  }

  /**
   * Menentukan posisi x yang merupakan absis
   * pada akuarium.
   * @param _x absis yang menjadi acuan untuk posisi.
   */
  public void setPosX(double _x){
    x = _x;
  }

  /**
   * Menentukan posisi y yang merupakan ordinat
   * pada akuarium.
   * @param _y ordinat yang menjadi acuan untuk posisi.
   */
  public void setPosY(double _y){
    y = _y;
  }

  /**
   * Mendapatkan absis yang telah ditentukan pada akuarium.
   * @return absis dari akuarium.
   */
  public double getPosX() {
    return x;
  }

  /**
   * Mendapatkan ordinat  yang telah ditentukan pada akuarium.
   * @return ordinat dari akuarium.
   */
  public double getPosY() {
    return y;
  }
}