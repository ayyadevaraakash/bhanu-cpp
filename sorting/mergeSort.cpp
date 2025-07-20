class Solution {
   public:
    void merge(int s1, int e1, int s2, int e2, vector<int>& nums) {
        vector<int> res;
        int i = s1, j = s2;

        while (i <= e1 and j <= e2) {
            if (nums[i] <= nums[j]) {
                res.push_back(nums[i]);
                i++;
            } else {
                res.push_back(nums[j]);
                j++;
            }
        }

        while (i <= e1) {
            res.push_back(nums[i]);
            i++;
        }

        while (j <= e2) {
            res.push_back(nums[j]);
            j++;
        }

        for (int i = 0; i < res.size(); i++) {
            nums[s1] = res[i];
            s1++;
        }
    }

    void merge_sort(int low, int high, vector<int>& nums) {
        if (low < high) {
            int mid = (low + high) / 2;
            merge_sort(low, mid, nums);
            merge_sort(mid + 1, high, nums);
            merge(low, mid, mid + 1, high, nums);
        }
    }

    vector<int> mergeSort(vector<int>& nums) {
        int N = nums.size();
        merge_sort(0, N - 1, nums);
        return nums;
    }
};
