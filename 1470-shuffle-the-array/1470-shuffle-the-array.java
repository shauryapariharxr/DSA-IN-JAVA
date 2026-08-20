class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] shuffle = new int[nums.length];

        int index = 0;

        for(int i = 0; i < n; i++) {

            shuffle[index] = nums[i];
            index++;

            shuffle[index] = nums[n + i];
            index++;
        }

        return shuffle;
    }
}