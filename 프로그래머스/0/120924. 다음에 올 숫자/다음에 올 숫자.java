class Solution {
    public int solution(int[] common) {
        int num = common[1]-common[0];
        int num2 = common[2]-common[1];
        if (num  == num2) return common[common.length-1] + num;
        num = common[1] / common[0];
        return common[common.length-1] * num;
    }
}