class Solution {
    public int findNthDigit(int n) {
        long digits = 1;     // digits per number in current block
        long count = 9;      // count of numbers in current block
        long start = 1;      // first number in current block

        // Find the block containing the nth digit
        while (n > digits * count) {
            n -= digits * count;
            digits++;
            count *= 10;
            start *= 10;
        }

        // Find the actual number
        long number = start + (n - 1) / digits;

        // Find the digit index within that number
        int index = (int)((n - 1) % digits);

        return String.valueOf(number).charAt(index) - '0';
    }
}