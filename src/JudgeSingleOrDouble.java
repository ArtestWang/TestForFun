public class JudgeSingleOrDouble {

//    public static void main(String[] args){
//        System.out.println(result(9));
//        System.err.println(binaryToResult(9));
//        System.out.println(modToResult(9));
//    }


    public static Boolean result(int i){
        return i%2==0;
    }

    public static Boolean binaryToResult(int i){
        return i >> 1 << 1 == i;
    }

    public static Boolean modToResult(int i){
        return (i&1)!=1;
    }

    public int binarySearch(int[] A, int B, int E, int t) {
        int L = B, U = E;
        while (L <= U) {
            /*
             * 在名著《编程珠玑》中的实现是
             * M = (U+L)/2
             * 这种做法会导致数值计算溢出，假设代码运行在32位机器上，如果U 和 L 的值足够大，两者相加之后的值超过32位的话，
             * U+L 会导致计算溢出，超出32位以上的比特位可能会被丢弃，于是U+L会得到比预期结果要小的多的值
             * 虽然 M = L + (U - L) / 2 在某些情况下也有问题，但由于使其出错的情况很罕见，所以我们暂时使用这个办法
             */
            int M = L + (U - L) / 2;

            if (A[M] < t) {
                L = M + 1;
            } else if (A[M] == t) {
                return M;
            } else {
                U = M - 1;
            }

        }

        return -1;
    }

    public   void main (String args[]) {
        int[] A = new int[]{-14, -10, 2, 108, 108, 243, 285, 285, 285, 401};
        int t = 285;
        int k = this.binarySearch(A, 0, A.length - 1, t);
        while (true) {
            int temp = this.binarySearch(A, 0, k - 1, t);
            if (temp != -1 && temp < k) {
                k = temp;
            } else {
                break;
            }
        }

        System.out.println("The first apperance of " + t + " is at index " + k);
    }

}
