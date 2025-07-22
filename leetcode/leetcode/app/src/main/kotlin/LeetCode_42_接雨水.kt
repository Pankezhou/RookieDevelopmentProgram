package org.example.app

/*
42. 接雨水
困难

给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
示例 1：
输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
输出：6
解释：上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。
示例 2：
输入：height = [4,2,0,3,2,5]
输出：9
提示：
n == height.length
1 <= n <= 2 * 10^4
0 <= height[i] <= 10^5
 */
class Solution {
    fun trap(height: IntArray): Int {
        var result = 0
        var leftIndex = 0
        var rightIndex = height.size - 1
        var leftMax = 0
        var rightMax = 0

        //相遇时退出
        while (leftIndex < rightIndex) {
            //分别取左右的最大值
            leftMax = Math.max(height[leftIndex], leftMax)
            rightMax = Math.max(height[rightIndex], rightMax)
            //当左边小于右边高度时计算 最左侧和当前位置的差值
            if (height[leftIndex] < height[rightIndex]) {
                result = leftMax - height[leftIndex] + result
                ++leftIndex
            } else {
                //否则计算 右侧最大值和当前位置的差值
                result = rightMax - height[rightIndex] + result
                --rightIndex
            }
        }
        return result
    }
}

