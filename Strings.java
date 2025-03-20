
public class Strings {
    public static void main(String[] args) {
        // Strings are Immutable.

       String name = "Sumit Meena"; 
        System.out.println(name.substring(0,11));
       //System.out.println(substring(name, 3,7));
      
    }
    public static void printvowel(String str){
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i)== 'a' || str.charAt(i) =='e' ||str.charAt(i) =='i'|| str.charAt(i) =='o'||str.charAt(i) =='u'){
                System.out.println(str.charAt(i) + " Vowel");
            } 
        }
    }
    public static void printletters(String str){
        for(int i =0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static String substring(String str, int si, int ei){
       String substr = "";
       for(int i=si; i<ei; i++){
        substr += str.charAt(i);
       }
       return substr;
    }
}