package jpf2019.loopmul2;

class LoopMul2_1c {
  boolean change(boolean oldVal, boolean newVal) {return oldVal;}
  int change(int oldVal, int newVal) {return oldVal;}

  public int lib() {
    int a = 3;
    int b = 4;
    int c = 0;
    int i = 0;
    while (change(i < b,i < a)) {
      c += change(-a, b);
      i += 1;
    }
    return c;
  }

  public static void main(String[] args) {
    
    (new LoopMul2_1c()).lib();
  }
}