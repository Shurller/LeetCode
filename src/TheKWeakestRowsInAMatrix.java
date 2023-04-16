public class TheKWeakestRowsInAMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,1,0,0,0},  {1,1,0,0,0}, {1,1,1,1,1},{1,1,1,1,0},{1,0,0,0,0}, };
        int[] rows = new int[mat.length];
        int[] weakest = new int[mat.length];

        for (int i = 0; i < mat.length; i++) {
            int tmp = 0;
            for (int j = 0; j < mat[i].length; j++){
                tmp += mat[i][j];
            }
            if(tmp <= mat[0].length/2){
                rows[i] = tmp;
            }


            System.out.println(rows[i]);
        }





        System.out.println(6/2);
    }
}
