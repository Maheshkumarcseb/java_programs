public class sort_zeros_ones_twos {
    public static void main(String[] args) {
        sort_zeros_ones_twos obj = new sort_zeros_ones_twos();
        int nums[]={2,1,2,1,1,1,0,1,0,0,1};
        obj.sortColors(nums);
       for(int i=0;i<nums.length;i++)
        System.out.println(nums[i]);
    }
    public void sortColors(int[] nums)
    {
        int low=0;
        int high= nums.length-1;
        int mid = 0;
        int temp;
        while(mid <= high)
        {
            switch(nums[mid])
            {
                case 0:
                {
                    temp=nums[low];
                    nums[low]=nums[mid];
                    nums[mid]=temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2:
                    temp =nums[mid];
                    nums[mid]=nums[high];
                    nums[high]= temp;
                    high--;
                    break;
            }
        }
    }
}
