# Count Sorted Subsequences of Size 3

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/magic-triplets4003/1)

## Solved On
02 Sept 2026 at 06:41 pm

<h2><a href="https://www.geeksforgeeks.org/problems/magic-triplets4003/1">Count Sorted Subsequences of Size 3</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18px;">Given an array <strong>arr[]</strong> of size n, count the number of <strong>triplets </strong>(arr[i], arr[j], arr[k]) such that:</span></p>
<ul>
<li><span style="font-size: 18px;">arr[i] &lt; arr[j] &lt; arr[k]</span></li>
<li><span style="font-size: 18px;">i &lt; j &lt; k</span></li>
</ul>
<p><span style="font-size: 18px;">These triplets are called <strong>Magic Triplets</strong>.</span></p>
<p><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input: </strong><span style="font-size: 18px;">arr[] = [1, 2, 3, 4]
</span><strong style="font-size: 18px;">Output: </strong><span style="font-size: 18px;">4
</span><strong style="font-size: 18px;">Explanation: </strong><span style="font-size: 18px;">Fours magic triplets are (1, 2, 3), (1, 2, 4), (1, 3, 4) and (2, 3, 4).</span></span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong><span style="font-size: 14pt;">arr[] = [3, 2, 1]</span>
<strong>Output: </strong>0
<strong>Explanation: </strong></span><span style="font-size: 18px;">There is no magic triplet.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ length of array ≤ 10<sup>3</sup><br>1 ≤ arr[i] ≤ 10<sup>5</sup></span></p>