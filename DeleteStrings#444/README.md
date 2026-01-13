# Solution for Subtract Strings

## Problem
Given two integers `num1` and `num2` represented as strings, return the **difference** `num1 - num2` as a string.

You must solve the problem **without using any built-in library for handling large integers** (such as `BigInteger`) and **without converting the input strings directly to integers**.

The result **may be negative**.

---

## Examples

**Example 1**  
Result : 52 - 19 = 33

**Example 2**  
Result : 1 - 991 = -990

**Example 3**  
Result : 1000 - 100 = 900

---

## Constraints
- `1 <= num1.length, num2.length <= 10^4`
- `num1` and `num2` consist only of digits
- `num1` and `num2` do not contain leading zeros, except for the number `"0"` itself

---

## Notes
- Perform subtraction digit by digit.
- Handle borrowing correctly.
- Support negative results when `num1 < num2`.
- Remove leading zeros from the result unless the result is `"0"`.

---
