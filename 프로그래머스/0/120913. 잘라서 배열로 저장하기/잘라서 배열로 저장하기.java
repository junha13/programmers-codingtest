class Solution {
    public String[] solution(String my_str, int n) {
        int num = my_str.length() / n;
        if (my_str.length() % n !=0) num++;
        String[] answer = new String[num];
        for (int i=0; i<num; i++) {
            if (my_str.length()<(i+1)*n) answer[i] = my_str.substring(i*n, my_str.length());
        	if (my_str.length()>=(i+1)*n) answer[i] = my_str.substring(i*n, (i+1)*n);
        }
        return answer;
    }
}