class Solution {
    public int solution(int n, int k) {
        int sum = n*12000+k*2000;
        int service = n/10;
        int answer = sum-service*2000;
        return answer;
    }
}