class O{
    public boolean hasPairWithDiff(int[] arr, int k) {
        int left = 0;
        int right = 1;

        while (right < arr.length) {

            int diff = arr[right] - arr[left];

            if (diff == k && left != right) {
                return true;
            } 
            else if (diff < k) {
                right++;
            } 
            else {
                left++;
            }

            if (left == right) {
                right++;
            }
        }

        return false;
    }
}
