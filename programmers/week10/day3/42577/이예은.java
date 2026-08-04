import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        int a=0, b=1;
        while(true) {
            if(a>=phone_book.length-1) return true;
            if(phone_book[b].startsWith(phone_book[a])) return false;
            a++;
            b++;
        }
    }
}