
public class Bitmanipulation{
    public static void main(String[] args) {
        getithbit(7, 2);
        evenorodd(7);
    }
    
    public static void evenorodd(int n){
        int bit = 1;
        if((n & bit)==0){
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }
    }
    public static void getithbit(int n,int i){
        if((n & (1<<i)) == 0){
            System.out.println("ith bit is 0");
        }else {
            System.out.println("ith bit is 1");
        }
    }

}