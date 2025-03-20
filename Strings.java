
public class Strings {
    public static void main(String[] args) {
        // Strings are Immutable.

       String name = "Sumit Meena"; 
        System.out.println(name.substring(0,11));
       //System.out.println(substring(name, 3,7));
      
    }
    // public static String substring(String str, int si, int ei){
    //    String substr = "";
    //    for(int i=si; i<ei; i++){
    //     substr += str.charAt(i);
    //    }
    //    return substr;
    // }
}