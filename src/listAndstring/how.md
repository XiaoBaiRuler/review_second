#### [73. 矩阵置零](https://leetcode-cn.com/problems/set-matrix-zeroes/)

> 给定一个 *m* x *n* 的矩阵，如果一个元素为 0，则将其所在行和列的所有元素都设为 0。请使用**[原地](http://baike.baidu.com/item/原地算法)**算法
>
> 解题思路1：遍历矩阵，查看到0时，将所在索引的前面部分置为0并且用栈记录下索引，遍历栈，将索引的下半部分置为0
>
> [代码](ListString02.java)
>
> 解题思路2：暴力法：先遍历一次矩阵，标记0的位置；再遍历一次，将索引的行列置为0
>
> [代码](ListString02.java)

#### [15. 三数之和](https://leetcode-cn.com/problems/3sum/)

> 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
>
> 注意：答案中不可以包含重复的三元组。
>
> 解题思路1：
>
> > 1. 排序 
> > 2. HashSet过滤重复0(留一个)-过滤重复其他元素(留两个) - 根据0的个数是否添加(>3: 000)
> > 3. 找出中间元素
> > 4. 双指针遍历(item = 左小 + 右小)，进行分区 :
> >    1. item < 0 左右右(三者相加<0剩下不可能存在，根据小 + 小 + 大) 
> >    2. item >=0 左右左(三者相加>0剩下不可能存在，根据小 + 小 + 大)
> >
> > 5. 再用HashSet过滤可能重复的情况
>
> [代码](ListString01.java)

#### [3. 无重复字符的最长子串](https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/)

> 给定一个字符串，请你找出其中不含有重复字符的 **最长子串** 的长度。
>
> **提示：**
>
> - `0 <= s.length <= 5 * 104`
> - `s` 由英文字母、数字、符号和空格组成
>
> 解题思路1：
>
> > 遍历字符串 - HashSet判断是否重复字符(并且将字符添加到StringBuffer中) - 当第一次出现重复时(更新max并且根据StringBuffer回退遍历字符串的索引；充值计数器；更新StringBuffer) - 再更新一次max - 返回
>
> [代码](ListString03.java)

#### [334. 递增的三元子序列](https://leetcode-cn.com/problems/increasing-triplet-subsequence/)

> 给你一个整数数组 nums ，判断这个数组中是否存在长度为 3 的递增子序列。
>
> 如果存在这样的三元组下标 (i, j, k) 且满足 i < j < k ，使得 nums[i] < nums[j] < nums[k] ，返回 true ；否则，返回 false 。
>
> 解题思路1：枚举所有i,j,k(i < j < k)：先判断nums[i] < nums[j]，再判断nums[j] < nums[k]，时间复杂度很高，空间复杂度较好，但是题目进阶需要时间复杂度O(N)，空间复杂度O(1)
>
> [代码](ListString05.java)
>
> 解题思路2：
>
> [代码]()