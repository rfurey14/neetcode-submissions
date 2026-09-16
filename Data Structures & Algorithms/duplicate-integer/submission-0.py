class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        new_dict = {}
        for item in nums:
            if item in new_dict.keys():
                return True
            else:
                new_dict[item] = 0;
        return False
        
