class Solution {
    public int firstUniqChar(String s) {
        int ind,flag,temp;
        for(int i=0;i<s.length();i++){
            temp=0;
            for(int k=0;k<i;k++){
                if(s.charAt(k)==s.charAt(i))
                    temp=1;
            }
            if(temp==1)
                continue;
            flag=0;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    flag=1;
                }
            }
            if(flag==0)
                return i;
        }
        return -1;
    }
}
