**[371. 两整数之和](https://leetcode-cn.com/problems/sum-of-two-integers/)**

> **不使用**运算符 `+` 和 `-` ，计算两整数 `a` 、`b` 之和。
>
> 解题思路1：先求非进位的相加：**a ^ b**；再求进位**(a & b) << 1**; 下一步将非进位数字做为a，进位做为b，不断重复以上步骤，直到进位为0为止
>
> [代码](Math01.java)

#### [69. x 的平方根](https://leetcode-cn.com/problems/sqrtx/)

> 实现 int sqrt(int x) 函数。
>
> 计算并返回 x 的平方根，其中 x 是非负整数。
>
> 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
>
> 解题思路1：二分查找
>
> [代码](Math02.java)

#### [171. Excel表列序号](https://leetcode-cn.com/problems/excel-sheet-column-number/)

> 给定一个Excel表格中的列名称，返回其相应的列序号。
>
> A -> 1...AA ->27....
>
> 解题思路1：有点像26进制
>
> [代码](Math03.java)