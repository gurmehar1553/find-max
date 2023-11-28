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

            String s1 = sc.next();
            String s2 = sc.next();
            String s3 = sc.next();
            findStringMax(s1,s2,s3);
        }
        public static void findStringMax(String a,String b,String c){
            String max = a;
            if(max.compareTo(b) < 0){
                max = b;
            }
            if(max.compareTo(c) < 0){
                max = c;
            }
            System.out.println(max);
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
