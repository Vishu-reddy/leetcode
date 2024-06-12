class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dic={}
        for i in strs:
            sortedstr=''.join(sorted(i))
            if sortedstr not in dic:
                dic[sortedstr]=[i]
            else:
                if sortedstr in dic:
                    dic[sortedstr].append(i)
        return list(dic.values())
        