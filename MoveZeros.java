public class MoveZeros {
     public void moveZeroes(int[] nums) {
        int p=nums.length-1;
        for(int k=0;k<=p;k++){
            for(int i=0;i<p;i++){
                if(nums[i]==0){
                    for(int j=i;j<p;j++){
                        nums[j]=nums[j+1];
                    }
                        nums[p]=0;
                        p--;
                }
            }
        }
    }
}
