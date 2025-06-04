// import java.util.Scanner;
// public class Day3 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i = 0;i<n;i++){
//             for(int j = i;j<n;j++){

//                 System.out.print("*");

//             }
//             System.out.println();
//         }
//     }
// }
// import java.util.Scanner;
// public class Day3 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i = 1;i<n*2;i++){
//             int t =i>n ? 2*n-i :i;
//             for(int j = 0;j<=t;j++){

//                 System.out.print("*");

//             }
//             System.out.println();
//         }
//     }
// }
// import java.util.Scanner;
// public class Day3 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System);
//         int n = sc.nextInt();
//         for(int i = 0;i<n;i++){
//             for(int j = 0;j<i;j++){
//                 System.out.println("*");
//             }
//             System.out.println("");
//         }
//     }
// }
public class Day3 {

    public static void main(String[] args) {
        int a[] = {3,5,4,1,2};
        System.out.println(check(a));
    }
    public static boolean check (int a[]) {
        int n = a.length;
        int cnt=0;
        for(int i=0;i<n;i++){

            if(a[i]>a[(i+1)%n]){
                cnt++;
            }
        }
    
    }
}

