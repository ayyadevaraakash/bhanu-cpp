class Solution {
   public:
    vector<int> selectionSort(vector<int>& nums) {
        int N = nums.size();

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (nums[j] < nums[i]) {
                    swap(nums[i], nums[j]);
                }
            }
        }

        return nums;
    }
};
