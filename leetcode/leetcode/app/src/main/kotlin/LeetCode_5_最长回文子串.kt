package org.example.app

/*
给你一个字符串 s，找到 s 中最长的 回文 子串。

示例 1：
输入：s = "babad"
输出："bab"
解释："aba" 同样是符合题意的答案。

示例 2：
输入：s = "cbbd"
输出："bb"
提示：

1 <= s.length <= 1000
s 仅由数字和英文字母组成
 */

class Solution {
    fun longestPalindrome(s: String): String {
        if (s.isEmpty()) {
            return "";
        }
        var start = 0
        var end = 0
        for (i in s.indices) {
            val length1 = getLength(s, i, i)
            val length2 = getLength(s, i, i+1)
            val len = Math.max(length2,length1)
            if (len > end -start) {
                start = i- (len-1)/2
                end = i+ len/2
            }
        }
        return s.substring(start, end + 1)
    }

    fun getLength(s: String, left : Int, right: Int ):Int {
        var tempLeft = left
        var rempRight = right
        while (tempLeft >= 0 && rempRight < s.length && s.get(tempLeft) == s.get(rempRight)) {
            --tempLeft
            ++rempRight
        }
        return rempRight-1 - (tempLeft+1) + 1
    }
}