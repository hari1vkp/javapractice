class SwapNumbers {
    public static void main(String[] args) {
        int num = 10; // 1010 in binary
        int bitPos = 0;
        if ((num & (1 << bitPos)) != 0) {
            System.out.println("Bit at position " + bitPos + " is set.");
        } else {
            System.out.println("Bit at position " + bitPos + " is not set.");
        }
    }
}