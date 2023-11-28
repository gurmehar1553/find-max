import java.util.*;
public class FindMax <T extends Comparable> {
        T a,b,c;
        public FindMax(T a,T b,T c){
            this.a = a;
            this.b = b;
            this.c = c;
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            Integer a = sc.nextInt();
            Integer b = sc.nextInt();
            Integer c = sc.nextInt();
            new FindMax<Integer>(a,b,c).findMax();

            Float f1 = sc.nextFloat();
            Float f2 = sc.nextFloat();
            Float f3 = sc.nextFloat();
            new FindMax<Float>(f1,f2,f3).findMax();

            String s1 = sc.next();
            String s2 = sc.next();
            String s3 = sc.next();
            new FindMax<String>(s1,s2,s3).findMax();
        }
        private void findMax(){
            findMaxMultiple(a,b,c);
        }
        public <T extends Comparable> void findMaxMultiple(T... a){
            T maxEle = a[0];
            for(T ele: a){
                if(maxEle.compareTo(ele) < 0){
                    maxEle = ele;
                }
            }
            System.out.println(maxEle);
        }
}
