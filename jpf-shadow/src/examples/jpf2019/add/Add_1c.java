package jpf2019.add;

class Add_1c {
    int change(int oldVal,int newVal) {return oldVal;}

    int add(int a, int b) {

        int c = change(a, b);
        int d = change(b, a);

        if (c > d) {
            return 1;
        } else {
            return 2;
        }

    }

    public static void main(String[] args) {
        (new Add_1c()).add(5, 900);
    }
}