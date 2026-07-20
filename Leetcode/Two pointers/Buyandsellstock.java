
public class Buyandsellstock {

    public static int Makeprofit(int Dayprices[]) {

        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i < Dayprices.length; i++) {

            if (buyprice < Dayprices[i]) {

                buyprice = Math.min(Dayprices[i], buyprice); // take a minimum buy price

                int profit = Dayprices[i] - buyprice; // Calculate a profit

                maxprofit = Math.max(maxprofit, profit); // Calculate a max profit
            } else {
                buyprice = Dayprices[i]; // if buyprice is bigger than day price so make it with small price
            }
        }
        return maxprofit;
    }

    public static void main(String args[]) {

        int Dayprices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(Makeprofit(Dayprices));
    }
}
