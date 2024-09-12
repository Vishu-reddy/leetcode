class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        count=0
        
        for i in words:
            if all(char in allowed  for char in i ):
                count+=1 
        return count