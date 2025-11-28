public class sortTwoColor{

    public static void sortNum(int[] nums){ // TC = O(n), SC = O(1)
        int i = 0;
        int j = nums.length -1;

        while(i <= j){
            if(nums[i] == 0){
                i++;
            }
            else{
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j--;
            }
        }
         
    }
    public static void main(String[] args){
        int[] nums = {0,1,1,1,0,0,1,1};

        System.out.println("Before Sort");
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        sortNum(nums);

        System.out.println("After Sort");
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}