# Bleak Numbers

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/bleak-numbers1552/1)

## Solved On
18 Oct 2026 at 09:29 am

<h2><a href="https://www.geeksforgeeks.org/problems/bleak-numbers1552/1">Bleak Numbers</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18px;">Given an integer <strong>n </strong>, check whether it is Bleak or not.&nbsp;</span><span style="font-size: 18px;">A number n is called Bleak if it cannot be represented as sum of a positive number x and set bit count in x, i.e., x + <a href="https://www.geeksforgeeks.org/dsa/check-if-a-number-is-bleak/">countSetBits(x) </a>is not equal to n for any non-negative number x.</span></p><p><span style="font-size: 18px;"><strong>Examples:</strong></span></p><pre><span style="font-size: 18px;"><strong>Input: </strong>n = 4
<strong>Output: </strong>true
<strong>Explanation: </strong>There is no x such that x + countSetbit(x) = 4.</span>
</pre><pre><span style="font-size: 18px;"><strong>Input:</strong> n = 3
<strong>Output: </strong>false
<strong>Explanation: </strong>3 is not a Bleak number as 2 + countSetBit(2) = 3.</span>
</pre>