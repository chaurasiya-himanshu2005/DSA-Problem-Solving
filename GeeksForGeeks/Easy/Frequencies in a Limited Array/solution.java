class Solution {
    public ArrayList<Integer> frequencyCount(int[] arr) {
        int n = arr.length;

        // Convert to 0-based
        for (int i = 0; i < n; i++) {
            arr[i]--;
        }

        // Store frequency
        for (int i = 0; i < n; i++) {
            arr[arr[i] % n] += n;
        }

        // Extract frequency
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / n;
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int x : arr) {
            ans.add(x);
        }

        return ans;
    }
}