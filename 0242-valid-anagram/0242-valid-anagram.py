class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # l1=list(s)
        # l2=list(t)
        # l1.sort()
        # l2.sort()
        # if(l1==l2):
        #     return True
        # return False
        if(len(s)!=len(t)):
            return False
        dic={}
        for i in s:
            dic[i]=dic.get(i,0)+1
        for i in t:
            if i not in dic or dic[i]==0:
                return False
            dic[i]-=1
        return True