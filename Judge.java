public class Judge {
    public int findJudge (int N, int [][] trust) {
        //initialize array that stores each person's "trust value"
        int [] counter = new int[N + 1];
        for (int[] i : trust) {
            //if person trusts someone else, decrement counter
            counter[i[0]]--;
            //if person is being trusted by another, increment counter
            counter[i[1]]++;
        }
        for (int i = 1; i <= N; i++) {
            //check if any person has "trust value" of everyone but himself (N-1)
            if (counter[i] == N - 1) {
                //if true, return that person (town judge)
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
//        System.out.println("Enter number of people in the town: ");
//        Scanner scan = new Scanner(System.in);
//        int N = scan.nextInt();
//        System.out.println("Enter people:\n");
//        int[][] trust = new int[N][N];
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                trust[i][j] = scan.nextInt();
//            }
//        }
//        Judge j = new Judge();
//        System.out.println("Output: "+j.findJudge(N, trust));
        int N = 4;
        int[][] trust = {{1,3},{1,4},{2,3},{2,4},{4,3}};
        Judge j = new Judge();
        System.out.println("Output: "+j.findJudge(N, trust));
    }
}
