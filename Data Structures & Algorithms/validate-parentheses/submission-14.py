class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        setSym = {}
        setSym["}"] = "{"
        setSym["]"] = "["
        setSym[")"] = "("

        for i in s:
            if i not in setSym:
                stack.append(i)
            else:
                if len(stack) > 0 and stack[-1] in setSym[i]:
                    stack.pop()
                else: 
                    return False

        if len(stack) ==0:
            return True
        else:
            return False
                
