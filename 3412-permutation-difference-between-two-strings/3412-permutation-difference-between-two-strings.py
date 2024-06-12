class Solution:
    def findPermutationDifference(self, s: str, t: str) -> int:
        # indies_s={char:index for index,char in enumerate(s)}
        # indies_t={char:index for index,char in enumerate(t)}
        # permutation_difference=0
        # for char in s:
        #     permutation_difference+=abs(indies_s[char]-indies_t[char])
        # return permutation_difference
        sum=0
        for i in s:
            sum+=abs(s.index(i)-t.index(i))

        return sum