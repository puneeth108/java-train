// import java.util.Arrays;

// public class Day6 {
//     public static void main(String[] args) {
//         int a[] = {1,2,3,4,5,6,7,8,9};
//         Arrays.sort(a);
//         int n = a.length;
//         int max = a[a.length -1];
//         int dp[] = new int[(max+1)];
//         for(int i=0;i<n;i++){
//             dp[a[i]]++;
//         }
//         int maxNum = Integer.MIN_VALUE, maxEle = 0;
//         int minNum = Integer.MAX_VALUE, minEle = 0;
//         for (int i=1;i<dp.length;i++){
//             if(dp[i] > maxNum){
//                 maxNum = a[i];
//                 maxEle = i;
//             }
//             if (dp[i] <minNum){
//                 minNum = a[i];
//                 minEle = i;
//             }
//         }
//     System.out.println("highest: "+maxEle);
//     System.out.println("LOwset: "+minEle);

//     }
    
// }
// Searching m