# All Pairs with Diff k

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/pairs-with-difference-k1713/1)

## Solved On
22 Nov 2026 at 09:21 am

<h2><a href="https://www.geeksforgeeks.org/problems/pairs-with-difference-k1713/1">All Pairs with Diff k</a></h2><h3>Difficulty Level: Easy</h3><hr><p><span style="font-size: 18px;">Given an array <strong>arr[]</strong> of positive integers. Find the number of pairs of integers whose absolute difference equals to a given number <strong>k</strong>.<br><strong>Note:</strong> (a, b) and (b, a) are considered the same. Also, the same numbers at different indices are considered different.</span></p><p><span style="font-size: 18px;">The answer is guaranteed to fit in a 32-bit integer.</span></p><p><span style="font-size: 18px;"><strong>Examples:</strong></span></p><pre><span style="font-size: 18px;"><strong>Input:</strong> arr[] = [1, 4, 1, 4, 5], k = 3
<strong>Output:</strong> 4
<strong>Explanation:</strong> There are 4 pairs with absolute difference 3, the pairs are {1, 4}, {1, 4}, {4, 1} and {1, 4}.</span></pre><pre><span style="font-size: 18px;"><strong>Input:</strong> arr[] = [8, 16, 12, 16, 4, 0], k = 4
<strong>Output:</strong> 5
<strong>Explanation:</strong> There are 5 pairs with absolute difference 4, the pairs are {8, 12}, {8, 4}, {16, 12}, {12, 16}, {4, 0}.</span></pre>