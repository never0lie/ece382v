package jpf2019.getsign;

public class GetSign_1c {
    public boolean change(boolean oldVal, boolean newVal) {
        return oldVal;
    }

    public int lib(int x) {
        if (change(x == 0, false)) {
            return 0;
        }

        if (change(x < 0, x <= 0)) {
            return -1;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        (new GetSign_1c()).lib(2);
    }
}

/*
orig:

def lib(x):
    if x == 0:
        return 0
    elif x < 0:
        return -1
    else:
        return 1

def getSign(x):
    return lib(x)

 */

/*
upgr:

def lib(x):
    if x <= 0:
        return -1
    else:
        return 1

def getSign(x):
    return lib(x)

 */