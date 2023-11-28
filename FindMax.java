import java.util.*;
public class FindMax {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            Integer a = sc.nextInt();
            Integer b = sc.nextInt();
            Integer c = sc.nextInt();
            findIntMax(a,b,c);

            Float f1 = sc.nextFloat();
            Float f2 = sc.nextFloat();
            Float f3 = sc.nextFloat();
            findFloatMax(f1,f2,f3);
        }
        public static void findFloatMax(Float a,Float b,Float c){
            Float maxFLoat = a;
            if(maxFLoat.compareTo(b) < 0){
                maxFLoat = b;
            }
            if (maxFLoat.compareTo(c) < 0){
                maxFLoat = c;
            }
            System.out.println(maxFLoat);
        }
        public static void findIntMax(Integer a,Integer b,Integer c){
            Integer maxInt = a;
            if(maxInt.compareTo(b) < 0){
                maxInt = b;
            }
            if(maxInt.compareTo(c) < 0){
                maxInt = c;
            }
            System.out.println(maxInt);
        }

}
