class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for (String ba : babbling) {
        	int num = 0;
            if (ba.contains("aya")) num+=3; 
            if (ba.contains("ye")) num+=2; 
            if (ba.contains("woo")) num+=3; 
            if (ba.contains("ma")) num+=2; 
            if (ba.length() == num) answer++;
        }
        return answer;
    }
}