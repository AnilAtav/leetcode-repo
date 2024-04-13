package main.neetCodeIO.DynamicProgrammingOneD;

import java.util.Arrays;

public class CoinChange {

    //Return the fewest number of coins that you need to make up that amount.
    //Input: coins = [1,2,5], amount = 11
    //Output: 3
    //Explanation: 11 = 5 + 5 + 1
    public int coinChange(int[] coins, int amount) {
        // Create an array to store the minimum number of coins needed to make each amount
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1); // Initialize the array with a value greater than the amount

        // Base case: 0 coins needed to make amount 0
        dp[0] = 0;

        // Iterate through each amount from 1 to the target amount
        for (int i = 1; i <= amount; i++) {
            // Try each coin denomination
            for (int coin : coins) {
                // If the current coin denomination can be used to make the current amount
                if (coin <= i) {
                    // Update the minimum number of coins needed
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        // If dp[amount] is still greater than amount, it means it's impossible to make that amount
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
