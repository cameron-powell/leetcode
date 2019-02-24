from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        indices_dict = { element: index for index, element in enumerate(nums)}
        for index, element in enumerate(nums):
            need = target - element
            if need in indices_dict:
                if indices_dict[need] != index:
                    answer = [index, indices_dict[need]]
                    answer.sort()
                    return answer

if __name__ == '__main__':
    solution = Solution()
    result = solution.twoSum([2, 7, 11, 15], 9)
    assert result == [0, 1], 'Failed example, got %s' % (str(result))
    print('Passed example')