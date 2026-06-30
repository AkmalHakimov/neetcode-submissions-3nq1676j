# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:

        if not root:
            return True
        
        if root.right:
            if root.val >= self.pred(root.right):
                return False

        if root.left:
            if root.val <= self.ances(root.left):
                return False
        
        return self.isValidBST(root.left) and self.isValidBST(root.right)

    def pred(self, root: Optional[TreeNode]) -> int:
        
        dummy = root
        while dummy.left:
            dummy = dummy.left
        
        return dummy.val

    def ances(self, root: Optional[TreeNode]) -> int:
        
        dummy = root
        while dummy.right:
            dummy = dummy.right
        
        return dummy.val


























