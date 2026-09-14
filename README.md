# week4
# Array Practice Problems

A collection of 5 beginner-to-intermediate Java problems focused on array traversal, indexing, and two-pointer techniques.

## Problems

### 1. Two Sum
Given an array of integers and a target value, find the indices of the two numbers that add up to the target. Solved using a brute-force nested loop approach, checking every pair of positions until a match is found.

### 2. Best Time to Buy and Sell Stock
Given an array of daily stock prices, determine the maximum profit achievable from a single buy-sell transaction. Solved in one pass by tracking the lowest price seen so far and the best profit possible at each step.

### 3. Contains Duplicate
Given an array of integers, determine whether any value appears more than once. Solved using nested loops that compare every pair of distinct positions for equal values.

### 4. Merge Two Sorted Arrays
Given two arrays already sorted in ascending order, combine them into a single sorted array without full re-sorting. Solved using the two-pointer technique — comparing the current elements of both arrays and copying the smaller one into the result, then appending any leftover elements.

### 5. Rotate Array
Given an array and an integer `k`, rotate the array to the right by `k` positions. Solved by computing each element's new index directly (using modulo arithmetic to wrap around) and building a new array in a single pass.

## Concepts Covered
- Array creation, indexing, and traversal
- Nested `for` loops for pairwise comparisons
- Single-pass (greedy) tracking of min/max values
- Two-pointer technique for merging sorted data
- Modulo arithmetic for circular/wraparound indexing

## How to Run
Each problem is implemented as a standalone `Solution` class with a `main` method demonstrating sample inputs and expected outputs. Compile and run individually:

```bash
javac Solution.java
java Solution
```

## Requirements
- Java JDK 8 or higher

