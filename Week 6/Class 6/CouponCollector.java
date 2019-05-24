/* *****************************************************************************
 *  Name:    
 *
 *  Description:  Models the Coupon Collector problem.
 *
 **************************************************************************** */


public class CouponCollector {
   public static void main(String[] args) {
       
      // Generate random values in [0..n) until finding each one.
      int n = Integer.parseInt(args[0]);
      
      boolean[] isCollected = new boolean[n];
      
      // count keeps track of how many purchases you make
      int count = 0;
      
      // distinct keeps track of how many different coupons you find
      int distinct = 0;

      // you stay in the loop until the number of distinct coupons
      // equals the desired number of distinct coupons n
      while (distinct < n)
      {
         // Generate another coupon.
         int r = (int) (Math.random() * n);
         
         // increase count each time
         count++;
         
         if (!isCollected[r])
         {
            distinct++;
            isCollected[r] = true;
         }
      }  

      System.out.println(count);
      
   }
}