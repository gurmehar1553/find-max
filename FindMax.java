import java.util.*;
public class FindMax {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
//            Integer a = sc.nextInt();
//            Integer b = sc.nextInt();
//            Integer c = sc.nextInt();
//            findMax(a,b,c);
//
//            Float f1 = sc.nextFloat();
//            Float f2 = sc.nextFloat();
//            Float f3 = sc.nextFloat();
//            findMax(f1,f2,f3);

            String s1 = sc.next();
            String s2 = sc.next();
            String s3 = sc.next();
            findMax(s1,s2,s3);
        }
        public static <T extends Comparable> void findMax(T a,T b,T c){
            T ans = a;
            if(ans.compareTo(b) < 0){
                ans = b;
            }
            if(ans.compareTo(c) < 0){
                ans = c;
            }
            System.out.println(ans);
        }


}
