package main.com.JavaHomework.Chapter11;

public class Largest_RC {
        public static void main(String[] args){
            int[][] nums = new int[4][4];
            for(int i = 0; i < 4; ++i){
                for(int j = 0; j < 4; ++j){
                    nums[i][j] = Math.abs((((int)System.currentTimeMillis()) / (i + j + 1)) % 2);
                }
            }

            int rowIndex = 0;
            int columnIndex =0 ;
            int rcount = 0;
            int rmaxCount = 0;
            int ccount = 0, cmaxCount = 0;
            for(int i = 0; i < 4; ++i){
                rcount = 0;
                ccount = 0;
                for(int j = 0; j < 4; ++j){
                    if(nums[i][j] == 1)
                        ++rcount;
                }
                if(rcount > rmaxCount){
                    rmaxCount = rcount;
                    rowIndex = i;
                }

                for(int j = 0; j < 4; ++j){
                    if(nums[j][i] == 1)
                        ++ccount;
                }
                if(ccount  > cmaxCount){
                    cmaxCount = ccount;
                    columnIndex = i;
                }
            }
            for(int i = 0; i < 4; ++i){
                for(int j = 0; j < 4; ++j){
                    System.out.print(nums[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("The largest row index:" + rowIndex);
            System.out.println("The largest column index:" + columnIndex);
        }
    }



