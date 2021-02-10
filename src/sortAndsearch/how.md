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