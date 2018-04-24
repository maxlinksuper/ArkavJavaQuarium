public class Siput extends Akuarium{
  public static final int SNAIL_SPEED = 50;
  public boolean directionSiput;
  public String imageSiput;

  public Siput(double _x) {
    super(_x, 768.0 -100.0);
    //Construct("image/snail"); OOP nanti
  }

  /* Method untuk pergerakan siput */

  public void Move(boolean arah, double sec_since_last) {
    double x = super.getPosX();
    double newPosX;
    if (arah) {
      newPosX = x + SNAIL_SPEED * sec_since_last;
    }
    else {
      newPosX = x - SNAIL_SPEED * sec_since_last;
    }

    setDirection(arah);
    super.setPosX(newPosX);
  }

  /* setter and getter interface */
  public void setDirection(boolean x) {
    directionSiput = x;
  }

  public boolean getDirection() {
    return directionSiput;
  }

  public void setImageSiput(String a) {
    imageSiput = a;
  }

  public String getImageFile() {
    return imageSiput;
  }

  /* Method untuk mengeset posisi dari objek dan ikan pada akuarium */
  public void setPos(double _x, double _y) {
    super.setPos(_x,_y);
  }

  public void setPosX(double _x) {
    super.setPosX(_x);
  }

  public void setPosY(double _y) {
    super.setPosY(_y);
  }

  public double getPosX() {
    return super.getPosX();
  }

  public double getPosY() {
    return super.getPosY();
  }
}