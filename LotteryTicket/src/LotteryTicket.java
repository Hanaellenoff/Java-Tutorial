
public class LotteryTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[][] lotteryCard = { {20, 15, 7},
    		                 {8, 7, 19},
    		                 { 7, 13, 47}
	};
     int [][] lotteryCard2 = new int [3][3];
     lotteryCard[0][0] = 20; 
     lotteryCard[0][1] = 15; 
     lotteryCard[0][2] = 7; 
     System.out.println(lotteryCard[0][0]);
     
     for(int i = 0; i < 3; i++) {
    	 for (int j = 0; j < 3; j++) {
     System.out.println(lotteryCard[i][j]);
    	 }
    }
  }
}
