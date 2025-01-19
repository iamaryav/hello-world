class Solution:
    def climbStairs(self, n: int) -> int:

        # Draw decision tree for this
        # prev state can be used to calculate the current solution
        # Improved version

        Time - O(n)
        Time = O(1)
        prev, cur = 0, 1
        for i in range(n):
            prev, cur = cur, prev + cur
        return cur

        # Bottom-up approach
        # Iteration with memoization
        # dp = [0] * (n + 1)
        # dp[0] = 1
        # dp[1] = 1
        # for i in range(2, n + 1):
        #     dp[i] = dp[i - 1] + dp[i - 2]
        # return dp[n]

        # Top Down approach is Recursion with memoization
        # # Memoization with list
        # cache = [-1] * n
        # def dfs(i):
        #     if i >= n:
        #         return i == n
        #     if cache[i] != -1:
        #         return cache[i]
        #     cache[i] = dfs(i + 1) + dfs(i + 2)
        #     return cache[i]
            
        # return dfs(0) 
        
        # Top Down approach is Recursion with memoization
        # # Memoization with dict
        # # Time = O(n)
        # # Space = O(n)
        # cache = {0: 1, 1: 1}
        # def fib(n):
        #     if n in cache:
        #         return cache[n]
        #     cache[n] = fib(n - 1) + fib(n - 2)
        #     return cache[n]
        # return fib(n)

        # # Fibonacci series 
        # # T = o(2 ^ n)
        # # s = o(n)
        # if (n <= 1):
        #     return 1
        # return self.climbStairs(n - 1) + self.climbStairs(n - 2)
