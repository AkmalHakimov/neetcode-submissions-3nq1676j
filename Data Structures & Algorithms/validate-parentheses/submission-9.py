class Solution:
    def isValid(self, s: str) -> bool:



        mp = {}
        mp[")"] = "("
        mp["}"] = "{"
        mp["]"] = "["

        stack = []
        for c in s:
            if c not in mp:
                stack.append(c)
            else:
                if not stack:
                    return False
                if mp[c] != stack[-1]:
                    return False
                else: 
                    stack.pop()
            
        return not stack            


        