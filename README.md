1 Rotate Array in Java
You may have been using Java for a while. Do you think a simple Java array question can be a challenge? Let’s use the following problem to test.
Problem: Rotate an array of n elements to the right by k steps. For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. How many different ways do you know to solve this problem?
c1
    arr_rotation
Solution 1. BubbleRotate
    We can do this in O(1) space. This solution is like a bubble sort.
Solution 2. ArrayCopy
    In a straightforward way, we can create a new array and then copy elements to the new array. Then change the original array by using System.arraycopy().
    Space is O(n) and time is O(n). You can check out the difference between Sys- tem.arraycopy() and Arrays.copyOf().
Solution 3. Reversal
    we can do this in O(1) space and in O(n) time too. The following solution does. Assuming we are given 1,2,3,4,5,6 and order 2. The basic idea is:
    1. Divide the array two parts: 1,2,3,4 and 5, 6
    2. Reverse first part: 4,3,2,1,5,6
    3. Reverse second part: 4,3,2,1,6,5
    4. Reverse the whole array: 5,6,1,2,3,4