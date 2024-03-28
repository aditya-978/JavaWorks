package Assignment.Recursion;

public class SkipACharacter {

    //    using iteration
    static void usingIteration(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!='a' && s.charAt(i)!='A'){
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }

    //using recursion
    static void usingRecursion(String s, String ans){
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);
        if(ch=='a'||ch=='A'){
            usingRecursion(s.substring(1),ans);
        } else{
            usingRecursion(s.substring(1),ans+ch);
        }
    }

    //using recursion but returning String instead of printing
    static String useRecursion(String s){
        if(s.isEmpty()){
            return "";
        }
        char ch = s.charAt(0);
        if(ch=='a'||ch=='A'){
            return useRecursion(s.substring(1));
        } else{
            return ch+useRecursion(s.substring(1));
        }
    }

    //skipping a string(sequence of characters)
    static String skipString(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("apple")|| s.startsWith("Apple")){
            return skipString(s.substring(5));
        } else{
            return s.charAt(0)+skipString(s.substring(1));
        }
    }

    public static void main(String[] args) {
        String s = "Aditya Jh";
        System.out.println(skipString(s));
    }
}