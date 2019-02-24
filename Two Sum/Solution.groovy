def twoSum(nums, target) {
    def indicesMap = [:]
    for(i in 0..nums.length-1) {
        indicesMap << [(nums[i]): i]
    }
    for(i in 0..nums.length-1) {
        def need = target - nums[i]
        def needIndex = indicesMap[need]
        if(needIndex) {
            if(needIndex != i) {
                def answer = [i, needIndex] as int[]
                Arrays.sort(answer)
                return answer
            }
        }
    }
}

def result = twoSum([2, 7, 11, 15] as int[], 9)
assert Arrays.equals(result, [0, 1] as int[]) : "Failed example";
println "Passed example"