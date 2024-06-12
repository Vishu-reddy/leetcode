class Solution:
    def findPermutationDifference(self, s: str, t: str) -> int:
        # indies_s={char:index for index,char in enumerate(s)}
        # indies_t={char:index for index,char in enumerate(t)}
        # permutation_difference=0
        # for char in s:
        #     permutation_difference+=abs(indies_s[char]-indies_t[char])
        # return permutation_difference
        sum=0
        i=0
        while(i<len(s)):
            sum+=abs(s.index(s[i])-t.index(s[i]))
            i+=1

        return sum