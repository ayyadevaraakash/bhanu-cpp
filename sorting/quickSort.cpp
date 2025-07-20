class Solution {
   public:
    int f(int low, int high, vector<int>& nums) {
        int pivot = nums[high];
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (nums[j] <= pivot) {
                i++;
                swap(nums[i], nums[j]);
            }
        }
        i++;
        swap(nums[i], nums[high]);
        return i;
    }

    void quick_sort(int low, int high, vector<int>& nums) {
        if (low < high) {
            int idx = f(low, high, nums);
            quick_sort(low, idx - 1, nums);
            quick_sort(idx + 1, high, nums);
        }
    }

    vector<int> quickSort(vector<int>& nums) {
        quick_sort(0, nums.size() - 1, nums);
        return nums;
    }
};