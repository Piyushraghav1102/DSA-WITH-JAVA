public class Lc_1423maxpointyoutakecards {
    
    
    
    public static int maxScore(int[] cardPoints, int k) {
        
        int leftsum = 0, rightsum = 0, maxsum = 0;
        int n=cardPoints.length;

        for (int i = 0; i < k;i++){
            leftsum+=cardPoints[i];
        }

        maxsum = leftsum;

        for (int low = k - 1, high = n - 1; low >= 0 && high >= n - k; low--, high--) {

            leftsum -= cardPoints[low];
            rightsum += cardPoints[high];
            maxsum = Math.max(maxsum, leftsum + rightsum);

        }
        return maxsum;
    }

    public static void main(String[] args) {

        int cardPoints[] = { 1, 2, 3, 4, 5, 6, 1 };

        System.out.println("Maximum sum what we pick :- "+maxScore(cardPoints, 3));


    }
}
