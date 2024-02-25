package Assignment.Arrays;

public class PangramSentence {
        static boolean checkIfPangram(String sentence) {
            if(sentence.length()<26)
                return false;
            int[] arr= new int[26];
            for(int i=0;i<sentence.length();i++) {
                int val = sentence.charAt(i)-97;
                arr[val]=-1;
            }
            for(int i=0;i<arr.length;i++) {
                if(arr[i]==0)
                    return false;
            }
            return true;
        }

    public static void main(String[] args) {
        String sen = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sen));
    }
}
