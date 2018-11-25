//class TapeDeck {
//    boolean canRecord = false;
//
//    void playTape(){
//        System.out.println("tape playing");
//    }
//
//    void recordTape(){
//        System.out.println("tape recording");
//    }
//}
//
//
//
//
//class TapeDeckTestDrive {
//    public static void main (String[] args) {
//        TapeDeck t = new TapeDeck();
//        t.canRecord = true;
//        t.playTape();
//
//        if (t.canRecord == true) {
//            t.recordTape();
//        }
//    }
//}


//class DVDPlayer {
//
//    boolean canRecord = false;
//
//    void recordDVD(){
//        System.out.println("DVD recording");
//    }
//
//    void playDVD(){
//        System.out.println("DVD playing");
//    }
//}
//
//class DVDPlayerTestDrive {
//    public static void main (String[] args) {
//
//        DVDPlayer d = new DVDPlayer();
//        d.canRecord = true;
//        d.playDVD();
//
//        if (d.canRecord == true) {
//            d.recordDVD();
//        }
//    }
//
//
//}


//Code Magnets

//class DrumKit {
//    boolean topHat = true;
//    boolean snare = true;
//
//    void playSnare(){
//        System.out.println("bang bang ba-bang");
//    }
//
//    void playTopHat(){
//        System.out.println("ding ding da-ding");
//    }
//}
//
//
//class DrumKitTestDrive {
//    public static void main (String[] args){
//
//        DrumKit d = new DrumKit();
//        d.playSnare();
//        d.snare = false;
//        d.playTopHat();
//
//        if(d.snare == true) {
//            d.playSnare();
//        }
//    }
//}

//Pool Puzzle

//class Echo {
//    int count = 0;
//    void hello(){
//    System.out.println("helloooo... ");
//    }
//}

//class EchoTestDrive {
//    public static void main(String[] args) {
//        Echo e1 = new Echo();
//        Echo e2 = e1;
//
//        int x = 0;
//        while (x < 4) {
//            e1.hello();
//            e1.count=e1.count+1;
//            if(x==3) {
//                e2.count=e2.count+1;
//            }
//            if(x>0){
//                e2.count=e2.count+e1.count;
//            }
//            x=x+1;
//
//            System.out.println(e2.count);
//
//        }
//    }
//}

