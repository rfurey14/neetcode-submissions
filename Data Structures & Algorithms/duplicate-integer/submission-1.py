class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        aDict = {}
        for num in nums:
            if num in aDict.keys():
                return True
            else:
                aDict[num] = 1
        return False
       