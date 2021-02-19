#### [75. 颜色分类](https://leetcode-cn.com/problems/sort-colors/)

> 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
>
> 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
>
> 解题思路1：第一次遍历到最后：将0交换到前面，第二次倒转遍历：将2交换到后面
>
> [代码](SortSearch01.java)

#### [33. 搜索旋转排序数组](https://leetcode-cn.com/problems/search-in-rotated-sorted-array/)

> 升序排列的整数数组 nums 在预先未知的某个点上进行了旋转（例如， [0,1,2,4,5,6,7] 经旋转后可能变为 [4,5,6,7,0,1,2] ）。
>
> 请你在数组中搜索 target ，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
>
>  提示：
>
> - 1 <= nums.length <= 5000
> - -10^4 <= nums[i] <= 10^4
> - nums 中的每个值都 独一无二
> - nums 肯定会在某个点上旋转
> - -10^4 <= target <= 10^4
>
> 解题思路1：暴力求解O(N)
>
> [代码](SortSearch02.java)
>
> 解题思路2：二分查找O(logN)：nums[0] <= 中值：左侧为升序，否则右侧为升序
>
> > - 先判断mid是否等于target
> > - 左侧升序：如果target在区间内：right = mid - 1，否则left = mid + 1
> > - 右侧升序：如果target在区间内：left = mid + 1，否则right = mid - 1
>
> [代码](SortSearch.java)

#### [347. 前 K 个高频元素](https://leetcode-cn.com/problems/top-k-frequent-elements/)

> 给定一个非空的整数数组，返回其中出现频率前 ***k\*** 高的元素。
>
> 解题思路1：先用HashMap统计出频率，再将PrioityQueue改为大顶堆(比较内容为频率)，最后遍历重组数组
>
> [代码](SortSearch03.java)
>
> 解题思路2：官方的快速排序的修改的

#### [162. 寻找峰值](https://leetcode-cn.com/problems/find-peak-element/)

> 峰值元素是指其值大于左右相邻值的元素。
>
> 给你一个输入数组 nums，找到峰值元素并返回其索引。数组可能包含多个峰值，在这种情况下，返回 任何一个峰值 所在位置即可。
>
> 你可以假设 nums[-1] = nums[n] = -∞ 。
>
> 解题思路1：遍历，再逐个检查左右侧元素是否小于中间元素，注意端点
>
> [代码](SortSearch04.java)

#### [56. 合并区间](https://leetcode-cn.com/problems/merge-intervals/)

> 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。请你合并所有重叠的区间，并返回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间。
>
> 提示：
>
> 1 <= intervals.length <= 104
> intervals[i].length == 2
> 0 <= starti <= endi <= 104
>
> 解题思路：先对数组排序(按第一个元素的标准)，再逐个叠加
>
> [代码](SortSearch05.java)