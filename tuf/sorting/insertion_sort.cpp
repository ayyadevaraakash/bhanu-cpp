class Solution {
   public:
    vector<int> insertionSort(vector<int>& nums) {
        int N = nums.size();

        for (int i = 0; i < N; i++) {
            int j = i;
            while (j > 0) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums[j], nums[j - 1]);
                    j--;
                } else {
                    break;
                }
            }
        }

        return nums;
    }
};