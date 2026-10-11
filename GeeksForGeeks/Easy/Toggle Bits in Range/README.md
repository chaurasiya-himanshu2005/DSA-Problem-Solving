# Toggle Bits in Range

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/toggle-bits-given-range0952/1)

## Solved On
11 Oct 2026 at 09:53 am

<h2><a href="https://www.geeksforgeeks.org/problems/toggle-bits-given-range0952/1">Toggle Bits in Range</a></h2><h3>Difficulty Level: Easy</h3><hr><p><span style="font-size: large;">Given a non-negative integer <strong>n</strong> and two integers <strong>l</strong> and <strong>r</strong>, toggle all bits in the binary representation of <strong>n</strong> from the lth to the rth least significant bit (inclusive), where the least significant bit is numbered 1.</span></p><p><span style="font-size: 18px;">A toggle operation flips a bit 0<strong> </strong>to 1 and a bit 1 to 0.</span></p><p><span style="font-size: 18px;"><strong>Examples:</strong></span></p><pre><strong style="font-size: 18px;">Input:</strong> <span style="font-size: 18px;">n = 17 , l = 2 , r = 3</span>
<strong><span style="font-size: 18px;">Output:</span> </strong><span style="font-size: 18px;">23</span>
<strong><span style="font-size: 18px;">Explanation:</span> </strong><span style="font-size: 18px;">(17)<sub>10</sub> = (10001)<sub>2</sub>.  After toggling all the bits from 2nd to 3rd position we get (10111)<sub>2</sub> = (23)<sub>10</sub></span></pre><pre><strong style="font-size: 18px;">Input:</strong> <span style="font-size: 18px;">n = 50 , l = 2 , r = 5</span>
<strong><span style="font-size: 18px;">Output:</span> </strong><span style="font-size: 18px;">44</span>
<strong><span style="font-size: 18px;">Explanation:</span> </strong><span style="font-size: 18px;">(50)<sub>10</sub> = (110010)<sub>2</sub>.  After toggling all the bits from 2nd to 5th position we get (101100)<sub>2</sub> = (44)<sub>10</sub></span></pre>