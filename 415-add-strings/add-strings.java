class Solution {
    public String addStrings(String num1, String num2) {
      int n1=num1.length()-1;
       int n2=num2.length()-1;
       StringBuilder res=new StringBuilder();
       int carry=0;
       int base=10;
       while(n1>=0 || n2>=0){
        int sum=0;
        int s1=0;
        int s2=0;
        if(n1>=0) s1=num1.charAt(n1--)-'0';
        if(n2>=0) s2=num2.charAt(n2--)-'0';
        sum=s1+s2+carry;
        if(sum>=base){
            carry=1;
            sum-=base;
        }
        else{
            carry=0;
        }
        res.append(sum);
       }
       if(carry==1){
        res.append(carry);
       }
       return res.reverse().toString();
    }
}