package test.neet;

import main.neetCodeIO.IsPalindrome;
import main.neetCodeIO.JumpGame123;
import org.junit.Before;
import org.junit.Test;

public class JumpGame123Test {
    JumpGame123 jumpgame;

    @Before
    public void setUp() {
        jumpgame = new JumpGame123();
    }

    @Test
    public void testJumpGame() {
        int[] nums1 = {1, 1, 2, 5, 2, 1, 0, 0, 1, 3};
        int[] nums2 = {2, 3, 1, 1, 4};
        System.out.println(jumpgame.canJump(nums2));

        int[] nums3 = {2, 4, 1, 2, 3, 1, 1, 2};
        int[] nums4 = {2, 3, 1, 1, 4};
        System.out.println(jumpgame.jump(nums3));

        int[] nums5 = {4,2,3,0,3,1,2};
        System.out.println(jumpgame.jump(nums5));

    }
}
