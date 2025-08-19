/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var cur = head
        var result: ListNode? = null

        while (cur != null) {
            val tmp = cur.next
            cur.next = result
            result = cur
            cur = tmp
        }
        return result
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}