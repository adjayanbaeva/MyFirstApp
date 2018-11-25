//class XCopy {
//    public static void main (String[] args) {
//        int orig = 42;
//        XCopy x = new XCopy();
//        int y = x.go(orig);
//        System.out.println(orig+" "+y);
//    }
//
//    int go(int arg){
//        arg=arg*2;
//        return arg;
//    }
//
//}

//
//class Clock {
//    String time;
//
//    void setTime(String t){
//        time=t;
//    }
//
//    public String getTime(){
//        return time;
//    }
//}
//
//class ClockTestDrive {
//    public static void main(String[] args){
//        Clock c=new Clock();
//
//        c.setTime("1245");
//        String tod = c.getTime();
//        System.out.println("time: "+tod);
//    }
//}

//class Mix4 {
//    int counter = 0;
//
//    public static void main(String[] args) {
//        int count = 0;
//        Mix4[] m4a = new Mix4[20];
//        int x = 0;
//        while (x<9) {
//            m4a[x] = new Mix4();
//            m4a[x].counter = m4a[x].counter + 1;
//            count = count + 1;
//            count = count + m4a[x].maybeNew(x);
//            x = x + 1;
//        }
//        System.out.println(count + " "
//                + m4a[1].counter);
//    }
//
//     int maybeNew(int index) {
//        if (index < 5) {
//            Mix4 m4 = new Mix4();
//            m4.counter = m4.counter + 1;
//            return 1;
//        }
//        return 0;
//    }
//}

class Puzzle4 {
    public static void main(String[] args) {
        Puzzle4b[] obs = new Puzzle4b[6];
        int y = 1;
        int x = 0;
        int result = 0;
        while (x < 6) {
            obs[x] = new Puzzle4b();
            obs[x].ivar = y;
            y = y * 10;
            x = x + 1;
        }
        x = 6;
        while (x > 0) {
            x = x - 1;
            result = result + obs[x].doStuff(x);
        }
        System.out.println("result " + result);
    }
}

class Puzzle4b {
    int ivar;
    public int doStuff(int factor) {
        if (ivar > 100) {
            return ivar * factor;
        } else {
            return ivar * (5 - factor);
        }
    }
}





