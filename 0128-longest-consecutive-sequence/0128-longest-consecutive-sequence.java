class Solution {
    public int longestConsecutive(int[] nums) {
             // Store all numbers in a HashSet
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Traverse through the set
        for (int num : set) {

            // Check if it is the start of a sequence
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int currentLength = 1;

                // Count consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                longest = Math.max(longest, currentLength);
            }
        }

        return longest;

    }
}