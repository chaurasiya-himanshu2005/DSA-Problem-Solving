# All Bitwise Subsets of a Number

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/print-all-bitwise-subsets-of-a-number-n3301/1)

## Solved On
21 Oct 2026 at 05:25 pm

<h2><a href="https://www.geeksforgeeks.org/problems/print-all-bitwise-subsets-of-a-number-n3301/1">All Bitwise Subsets of a Number</a></h2><h3>Difficulty Level: Easy</h3><hr><p><span style="font-size: 18px;">Given an integer <strong>n</strong>, return all the numbers that are bitwise subsets of n. </span><span style="font-size: 18px;">A number <strong>i</strong> is considered a bitwise subset of n if all the set bits (1s) in the binary representation of i are also set in the binary representation of n i.e. (n &amp; i == i). </span><span style="font-size: 18px;">Return all such numbers i in descending order.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input</strong>: n = 5
<strong>Output:</strong> [5, 4, 1, 0]
<strong>Explanation</strong>: For all i from 0 ≤ i ≤ n.
   0 &amp; 5 = 0
&nbsp; &nbsp;1 &amp; 5 = 1
&nbsp; &nbsp;2 &amp; 5 != 2
&nbsp; &nbsp;3 &amp; 5 != 3
&nbsp; &nbsp;4 &amp; 5 = 4
&nbsp; &nbsp;5 &amp; 5 = 5<br>Hence the output in descending order is: [5, 4, 1, 0]</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 1
<strong>Output: </strong>[1, 0]<br><strong>Explanation: </strong></span><span style="font-size: 18px;"><span style="font-size: 18px;">For all i from 0 ≤ i ≤ n.
   0 &amp; 1 = 0
   1 &amp; 1 = 1<br>Hence the output in descending order is: [1, 0]</span></span></pre>