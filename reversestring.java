import java.util.*;
 class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        char char1;
       String nchar="";

        for(int i=0;i<=name.length();i++){
            char1 = name.charAt(i);
            nchar = char1+nchar;

        }
    }
}
