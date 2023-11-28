import java.util.*;
public class FindMax {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            Integer a = sc.nextInt();
            Integer b = sc.nextInt();
            Integer c = sc.nextInt();

            findIntMax(a,b,c);
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
