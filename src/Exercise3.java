//class TestArrays {
//    public static void main (String [] args){
//        int[] index = new int[4];
//        index[0]=1;
//        index[1]=3;
//        index[2]=0;
//        index[3]=2;
//        String[] islands = new String[4];
//        islands[0]="Bermuda";
//        islands[1]="Fiji";
//        islands[2]="Azores";
//        islands[3]="Cozumel";
//        int y=0;
//        int ref;
//        while (y<4) {
//            ref=index[y];
//            System.out.print("island= ");
//            System.out.println(islands[ref]);
//            y=y+1;
//        }
//    }
//}


//class Triangle {
//    double area;
//    int height;
//    int length;
//    public static void main (String [] args) {
//        int x=0;
//        Triangle [] ta = new Triangle[4];
//        while (x<4) {
//            ta[x]=new Triangle();
//            ta[x].height=(x+1)*2;
//            ta[x].length=x+4;
//            ta[x].setArea();
//            System.out.print("triangle "+x+", area");
//            System.out.println("=" +ta[x].area);
//            x=x+1;
//
//        }
//        int y=x;
//        x=27;
//        Triangle t5 = ta[2];
//        ta[2].area = 343;
//        System.out.print("y= "+y);
//        System.out.println(", t5 area= "+t5.area);
//    }
//
//    void setArea(){
//        area=(height*length)/2;
//    }
//}

//class HeapQuiz {
//    int id = 0;
//    public static void main(String [] args) {
//        int x = 0;
//        HeapQuiz [ ] hq = new HeapQuiz[5];
//        while ( x < 3 ) {
//            hq[x] = new HeapQuiz();
//            hq[x].id = x; } x = x + 1;
//        hq[3] = hq[1];
//        hq[4] = hq[1];
//        hq[3] = null;
//        hq[4] = hq[0];
//        hq[0] = hq[3];
//        hq[3] = hq[2];
//        hq[2] = hq[0];
//    }
//}

//class ExampleTwoDimArray {
//    public static void main(String[] args){
//        int[][]  TwoDim= new int[4][3];
//
//        int temp = 10;
//
//        for (int i=0; i<4; i++){
//            for(int j=0; j<3; j++){
//
//
//                TwoDim[i][j]=temp;
//                temp+=10;
//                System.out.print(TwoDim[i][j]+" ");
//            }
//            System.out.println();
//
//        }
//
//    }
//}

//class ExampleString {
//    public static void main(String[] args){
//        String x = "James Dean";
//        System.out.println("Hello " + x);
//        System.out.println(x.toUpperCase());
//        System.out.println(x.substring(2));
//        System.out.println(x.charAt(0));
//
//        String age = "37";
//        String salary = "78965.83";
////        Wrapper classes
//        int a = Integer.parseInt(age)+2;
//        System.out.println(a);
//
//        double s = Double.parseDouble(salary)*.15;
//        System.out.println(s);
//
//
//
//
//
//    }
//}

//class ExerciseA {
//    public static void main(String[] args){
//        double salary=100;
//        double tax;
//
//        if (salary<15000){
//            tax = salary*0.10;
//
//        } else if(salary >= 15000 && salary < 40000 ) {
//            tax = salary*0.20;
//        }else{
//            tax=salary*0.30;
//        }
//        System.out.println("Your tax is "+tax+"$");
//    }
//}

//class ExerciseB {
//    public static void main (String[] args){
//        String[] nums = {"10", "20", "30", "40"};
//        int total = 0;
//        for(String temp: nums){
//            total=total+Integer.parseInt(temp);
//        }
//        System.out.println("Total="+total);
//
//    }
//}

class ExerciseC {
    public static void main(String[] args){
        String a = "Hello World";
        System.out.println(a.substring(6).toLowerCase());
    }
}