import java.util.*;
public class FindMax <T extends Comparable> {
        List<T> a=new ArrayList<>();
        public FindMax(T... a){
            Collections.addAll(this.a,a);
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            Integer a1 = 10,a2 = 20,a3 = 30,a4 =50;
            new FindMax<Integer>(a1,a2,a3,a4).findMax();

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
            findMaxMultiple(a);
        }
        public <T extends Comparable> void findMaxMultiple(List<T> a){
            T maxEle = a.get(0);
            for(T ele: a){
                if(maxEle.compareTo(ele) < 0){
                    maxEle = ele;
                }
            }
            System.out.println(maxEle);
        }
}
