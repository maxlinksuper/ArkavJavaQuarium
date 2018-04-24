import java.util.Random;
import java.lang.Math;

import static java.lang.Math.atan2;
import static java.lang.Math.cos;
import static java.lang.Math.sin;

/* Kelas turunan dari akuarium untuk menggenerate ikan */
class Ikan extends Akuarium
{
  private static final int TeenStandard = 3;
  private static final int AdultStandard = 6;
  private static int fishPopulation;
  private static final double PI = 3.14159265;
  private static final int slowSpeed = 50;
  private static final int fastSpeed = 100;
  private FishLevel level;
  private boolean hunger;
  private boolean direction;
  private String imageIkan;
  // Time counting for state changing
  private double timeHungry;
  // The path fish go
  private double moveDirection;
  // Time left to Move into that direction
  private double moveDuration;
  // Umur
  private int hasEaten;

  // Definisi Level Ikan
  public enum FishLevel {
    BabyFish, TeenFish, AdultFish
  };

  /* Konstruktor untuk menentukan posisi ikan ketika pertama kali dibangkitkan*/
  public Ikan() {
    super(100,100);

  }

  public Ikan(double _x, double _y, double nowTime) {
    super(_x,_y);
    level = FishLevel.BabyFish;
    hunger = false;
    timeHungry = nowTime;
    fishPopulation++;
    moveDirection = 0;
    moveDuration = 0;
    hasEaten = 0;
  }

//  public Ikan(double _x, double _y, double nowTime /*string fileGambar*/) {
//    super(_x,_y);
//    level = FishLevel.BabyFish;
//    hunger = false;
//    timeHungry = nowTime;
//    fishPopulation++;
//    moveDirection = 0;
//    moveDuration = 0;
//    hasEaten = 0;
//  }

  /* Method untuk menentukan apakah ikan lapar atau tidak */
  public boolean getHunger() {
    return hunger;
  }

  /* Method untuk mengeset apakah ikan lapar atau tidak */
  public void setHunger(boolean _hunger) {
    hunger = _hunger;
  }

  /* Method untuk pergerakan ikan */
  public void Move(double sec_since_last) {
    Random rand = new Random();
    if (moveDuration < 0) {
      moveDuration = ((double) (rand.nextDouble() % 1000))/(double) 200;
      moveDirection = ((double) (rand.nextDouble() % 360))/((double)180)* PI;
      if (cos(moveDirection) > 0) {
        setDirection(true);
      }
      else {
        setDirection(false);
      }
    }
    else {
      moveDuration -= sec_since_last;
    }

    if (hunger) {
      double newPosX = super.getPosX() + fastSpeed*cos(moveDirection)*sec_since_last;
      double newPosY = super.getPosY() + fastSpeed*sin(moveDirection)*sec_since_last;

      if ((newPosX > 39) && (newPosX < 1024 - 39) && (newPosY > 154) && (newPosY < 768 - 139)) { //1024 = SCREEN_HEIGHT, 768 = SCREEN_WIDTH
        super.setPosX(newPosX);
        super.setPosY(newPosY);
      }
      else {
        moveDuration = ((double) (rand.nextDouble() % 1000))/(double) 200;
        moveDirection = ((double) (rand.nextDouble() % 360))/((double)180)* PI;
        if (cos(moveDirection) > 0) {
          setDirection(true);
        }
        else {
          setDirection(false);
        }
      }
    }
    else {
      double newPosX = super.getPosX() + slowSpeed*cos(moveDirection)*sec_since_last;
      double newPosY = super.getPosY() + slowSpeed*sin(moveDirection)*sec_since_last;

      if ((newPosX > 39) && (newPosX < 1024 - 39) && (newPosY > 154) && (newPosY < 768 -139)) { //1024 = SCREEN_HEIGHT, 768 = SCREEN_WIDTH
        super.setPosX(newPosX);
        super.setPosY(newPosY);
      }
      else {
        moveDuration = ((double) (rand.nextDouble() % 1000))/(double) 200;
        moveDirection = ((double) (rand.nextDouble() % 360))/((double)180)* PI;
        if (cos(moveDirection) > 0) {
          setDirection(true);
        }
        else {
          setDirection(false);
        }
      }
    }
  }

  public void Move(double sec_since_last, double _x, double _y) {
    double y = super.getPosY();
    double x = super.getPosX();
    double arahKejar = atan2(_y-y, _x-x);
    double newPosX = x + fastSpeed*cos(arahKejar)*0.01;
    double newPosY = y + fastSpeed*sin(arahKejar)*0.01;

    if (cos(arahKejar) > 0) {
      setDirection(true);
    }
    else {
      setDirection(false);
    }
    setPosX(newPosX);
    setPosY(newPosY);
  }

  // setter and getter
  public FishLevel getLevel() {
  return level;
}

  public void setLevel(FishLevel _level) {
    level = _level;
  }

  public double getTimeHungry() {
    return timeHungry;
  }

  public void setTimeHungry(double _timeHungry) {
    timeHungry = _timeHungry;
  }

  public static int getFishPopulation() {
    return fishPopulation;
  }

  public double getMoveDirection() {
    return moveDirection;
  }

  public void setMoveDirection(double _moveDirection){
    moveDirection = _moveDirection;
  }

  public double getMoveDuration() {
    return moveDuration;
  }

  public void setMoveDuration(double _moveDuration){
    moveDuration = _moveDuration;
  }

  /* Method yang tidak melakukan apapun */
  public static void Eat() {

  }

  /* Method yang tidak melakukan apapun */
  public boolean DropCoin(double sec_since_last) {
    return false;
  }

  // COPY THIS TO OBJECT AND SNAIL
  /* Method untuk mengeset posisi dari objek dan ikan pada akuarium */
  public void setPos(double _x, double _y){
    super.setPos(_x, _y);
  }

  /* Method untuk mengeset posisi dari objek dan ikan pada sumbu x */
  public void setPosX(double _x){
    super.setPosX(_x);
  }

  /* Method untuk mengeset posisi dari objek dan ikan pada sumbu y */
  public void setPosY(double _y){
    super.setPosY(_y);
  }

  /* Method untuk menentukan posisi dari objek dan ikan pada sumbu x */
  public double getPosX() {
    return super.getPosX();
  }

  /* Method untuk menentukan posisi dari objek dan ikan pada sumbu y */
  public double getPosY() {
    return super.getPosY();
  }

  // setter and getter
  public void setDirection(boolean b){
    direction = b;
  }

  public boolean getDirection() {
    return direction;
  }

  public void setImageFile(String _imageFile) {
    imageIkan = _imageFile;
  }

  public String getImageFile() {
    return imageIkan;
  }

  // setter and getter
  public  void setHasEaten(int _y) {
    hasEaten = _y;
  }

  public int getHasEaten() {
    return hasEaten;
  }

  public void updateLevel() {
    if (hasEaten > TeenStandard && hasEaten < AdultStandard) {
      level = FishLevel.TeenFish;
    }
    else if (hasEaten > AdultStandard) {
      level = FishLevel.AdultFish;
    }
  }
}