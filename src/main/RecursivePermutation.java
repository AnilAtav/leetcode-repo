package main;

public class RecursivePermutation {

    /**
     * permutation function
     * abc-> abc-acb>swap-acb
     * bac-> bac-bca>swap-bca...
     *
     * @param str string to calculate permutation for
     * @param si  starting index
     * @param ei  end index
     */
    public void permute(String str, int si, int ei) {
        if (si == ei)
            System.out.println(str);
        else {
            for (int i = si; i <= ei; i++) {
                str = swap(str, si, i);
                permute(str, si + 1, ei);
                str = swap(str, si, i);
            }
        }
    }

    /**
     * Swap Characters at position
     *
     * @param val string value
     * @param i   position 1
     * @param j   position 2
     * @return swapped string
     */
    private String swap(String val, int i, int j) {
        char temp;
        char[] charArray = val.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;

        return String.valueOf(charArray);
    }

}
