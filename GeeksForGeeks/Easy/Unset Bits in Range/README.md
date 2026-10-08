# Unset Bits in Range

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/count-unset-bits-in-a-given-range1216/1)

## Solved On
08 Oct 2026 at 03:07 pm

<h2><a href="https://www.geeksforgeeks.org/problems/count-unset-bits-in-a-given-range1216/1">Unset Bits in Range</a></h2><h3>Difficulty Level: Easy</h3><hr><p><span style="font-size: 18px;">Given a non-negative integer <strong>n </strong>and two integers <strong>l </strong>and <strong>r</strong>, c</span><span style="font-size: 18px;">ount the number of unset bits (<strong>0s</strong>) in the binary representation of <strong>n</strong> from the<strong> lth</strong> bit to the <strong>rth</strong> bit (inclusive), </span><span style="font-size: 18px;">where the least significant bit is considered as the 1st bit.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input: </strong><span style="font-size: 18px;">n = 42, l = 2, r = 5
</span><strong style="font-size: 18px;">Output: </strong><span style="font-size: 18px;">2
</span><span style="font-size: 18px;"><strong>Explanation:</strong> </span><span style="font-size: 18px;">The binary representation of 42 is 101010. The bits from positions 2 to 5 are 1010, which contain 2 unset bits. </span></span></pre>
<pre><strong style="font-size: 18px;">Input: </strong><span style="font-size: 18px;">n = 80, l = 1, r = 4
</span><strong style="font-size: 18px;">Output: </strong><span style="font-size: 18px;">4
</span><span style="font-size: 18px;"><strong>Explanation:</strong> </span><span style="font-size: 18px;">The binary representation of 80 is 1010000. The bits from positions 1 to 4 are 0000, which contain 4 unset bits.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong></span><br><span style="font-size: 18px;">0 ≤ n ≤ 10<sup>9</sup></span><br><span style="font-size: 18px;">1 ≤ l ≤ r ≤ 31</span></p>