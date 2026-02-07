class Solution {
    public String reverseVowels(String s) {
        char [] arr = s.toCharArray();
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            char chl = arr[l];
            char chr = arr[r];
            if (isvowel(chl) && isvowel(chr)) {
                arr[l] = chr;
                arr[r] = chl;
                l++;
                r--;
            } else if (isvowel(chl)) {
                r--;
            } else if (isvowel(chr)) {
                l++;
            } else {
                l++;
                r--;
            }
        }
        return new String(arr);
    }

    boolean isvowel(char ch){
        if(ch=='a' || ch=='A'){
            return true;
        }
        else if(ch=='e' || ch=='E'){
            return true;
        }
         else if(ch=='i' || ch=='I'){
            return true;
        }
         else if(ch=='o' || ch=='O'){
            return true;
        }
         else if(ch=='u' || ch=='U'){
            return true;
        }
        else{
            return false;
        }
    }
}