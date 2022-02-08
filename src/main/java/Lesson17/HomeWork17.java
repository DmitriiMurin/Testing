package Lesson17;

public class HomeWork17 {

    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        boolean s = true;
        if (sb1.length() == sb2.length()) {
        for (int i=0; i<sb1.length(); i++){
        if (sb1.charAt(i) != sb2.charAt(i)){
            s= false;
            break;
        }
        }
        } else {
            s= false;

        }
        return s;
    }


        public static void main (String[]args){
        StringBuilder sb1 = new StringBuilder("9ello");
        StringBuilder sb2 = new StringBuilder("0ello");
        boolean a = HomeWork17.ravenstvo(sb1,sb2);
            System.out.println(a);
        }


}