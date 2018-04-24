public class LinkedList<T> {

  private Node<T> last;
  private Node<T> first;

  LinkedList() {
    first = null;
    last = null;
  }

  public int find(T a) {
    int i = 1;
    Node<T> curr = (Node<T>) getFirst();
    while (curr != null) {
      if (curr.data.equals(a)) {
        return i;
      }
      else {
        i++;
        curr = curr.next;
      }
    }
    return -1;
  }

  public void findWay(double positionX, double positionY, double PosX) {
    if(!isEmpty()) {
      Node<T> curr = first;
      Akuarium isi = (Akuarium) curr.data;
      positionX = isi.getPosX();
      positionY = isi.getPosY();
      do {
        isi = (Akuarium) curr.data;
        if (positionY < isi.getPosY()) {
          positionX = isi.getPosX();
          positionY = isi.getPosY();
        }
        else if (positionY == isi.getPosY()) {
          if (abs(positionX - PosX) > abs(isi.getPosX() - PosX)) {
            positionX = isi.getPosX();
            positionY = isi.getPosY();
          }
        }

        curr = curr.next;
      } while (curr != null);
    }
    else {
      positionX = -999;
    }
  }

  public boolean isEmpty() {
    return (first == null);
  }

  public void add(T a) {
    Node<T> temp = new Node<T>();
    temp.data = a;
    temp.next = null;

    if (first == null) {
      first = temp;
      last = temp;
    }
    else {
      last.next = temp;
      last = last.next;
    }
    System.out.println("Telah ditambahkan ke Linked List");
  }

  // Menghapus list dengan data a dari dalam list dan menuliskan pesan
  // error jika elemen tersebut tidlistInteger.remove(A);ak ada dalam list

  public void remove(T a) {
    int idx = find(a);
    System.out.println(a);
    Node<T> curr = first;
    Node<T> prev = null;
    if (idx == -1) {
      System.out.println("Elemen tidak ada di dalam List");
    }
    else {
      for (int i = 1; i < idx; i++) {
        prev = curr;
        curr = curr.next;
      }
      if (prev == null) {
        first = curr.next;
        last = null;
      }
      else {
        if (curr.next == null) {
          prev.next = null;
          last = prev;
        }
        prev.next = curr.next;
      }
      curr = null;
    }
  }

  public T remove(double x, double y) {
    Node<T> curr = first;
    T isi = (T) new Objek();
    Akuarium temp = new Akuarium(0,0);
    while (curr != null) {
      isi = curr.data;
      if (temp.getPosX() == x && temp.getPosY() == y) {
        break;
      }
      else {
        curr = curr.next;
      }
    }
    this.remove(isi);
    return isi;
  }

  // Mengambil nilai list yang sudah diberikan posisinya
  public T get(int idx) {
    if (idx == 1) {
      return first.data;
    }
    else {
      Node<T> curr = first;
      for (int i = 1; i < idx; i++) {
        curr = curr.next;
      }
      return curr.data;
    }
  }

  // TAMBAHAN
  // Menulikan seluruh isi list dengan newline untuk setiap data.
  // Fungsi juga akan menuliskan pesan kosong jika list kosong
  public void printList() {
    if (!isEmpty()) {
      Node<T> curr = first;
      do {
        System.out.println(curr.data);
        curr = curr.next;
      } while (curr != null);
    }
    else {
      System.out.println("List kosong");
    }
  }

  public Node<T> getFirst() {
    return first;
  }

  public double abs (double a) {
    if (a > 0) {
      return a;
    }
    else {
      return -a;
    }
  }

  public static void main(String [] args){
    LinkedList<Integer> listInteger = new LinkedList<Integer>();
    for(int i = 1; i <=10;  i++){
      listInteger.add(new Integer(i));
    }
    listInteger.remove(5);
    listInteger.printList();

  }
}
