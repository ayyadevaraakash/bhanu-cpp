class Solution {
   public:
    vector<int> bubbleSort(vector<int>& nums) {
        int N = nums.size();
        bool present = true;

        while (present == true) {
            // nagur will work

            int swaps = 0;
            for (int j = 1; j < N; j++) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums[j], nums[j - 1]);
                    swaps++;
                }
            }

            // work completed
            if (swaps == 0) {
                present = false;
            }
        }

        return nums;
    }
};
