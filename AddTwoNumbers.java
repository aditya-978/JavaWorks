import java.util.LinkedList;
class Solution {
    public LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2){
        LinkedList<Integer> l3 = new LinkedList<>();
        int i=0;
        int rem = 0;
        while (i<=l1.size()){
            if(i==l1.size()){
                if(rem <= 0){
                    break;
                }
                l3.add(i, rem);
                break;
            }
            int sum = l1.get(i)+ l2.get(i)+rem;
            rem = 0;
            if (sum>=10){
                rem = sum/10;
                sum = sum%10;
            }
            l3.add(i, sum);
            i++;
        }
        return l3;
    }
}
public class AddTwoNumbers {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(9);
        l2.add(9);
        l2.add(9);
        l2.add(9);
        l2.add(9);
        l2.add(9);
        l2.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);
/*
        l1.add(4);
        System.out.println(l1.size());
        System.out.println(l2.size());
*/
        Solution s = new Solution();

        if(l1.size()>l2.size()){
            int size = l1.size()- l2.size();
            for (int i = l1.size()-1; i >size; i--) {
                l2.add(l2.size(), 0);
            }
        }
        if(l2.size()>l1.size()){
            int size = l2.size()- l1.size();
            for (int i = l2.size()-1; i >size; i--) {
                l1.add(l1.size(), 0);
            }
        }
        LinkedList<Integer> l3 = s.addTwoNumbers(l1,l2);
        for(int i=0; i< l3.size();i++){
            System.out.print(l3.get(i)+" ");
        }
    }
}