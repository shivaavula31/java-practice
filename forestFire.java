import java.util.Scanner;

class ForestFire {
    public static void burnTime(char[][] forestLayout, int cr, int cc, int r, int c, int[][] forestTime, int time) {
        if (cr < 0 || cr >= r || cc < 0 || cc >= c || forestLayout[cr][cc] == 'W') {
            return;
        }
        
        if (forestTime[cr][cc] != -1 && time >= forestTime[cr][cc]) {
            return;
        }
        
        forestTime[cr][cc] = time;

        burnTime(forestLayout, cr + 1, cc, r, c, forestTime, time + 1);
        burnTime(forestLayout, cr - 1, cc, r, c, forestTime, time + 1);
        burnTime(forestLayout, cr, cc + 1, r, c, forestTime, time + 1);
        burnTime(forestLayout, cr, cc - 1, r, c, forestTime, time + 1);
        burnTime(forestLayout, cr + 1, cc + 1, r, c, forestTime, time + 1);
        burnTime(forestLayout, cr - 1, cc - 1, r, c, forestTime, time + 1);
        burnTime(forestLayout, cr + 1, cc - 1, r, c, forestTime, time + 1);
        burnTime(forestLayout, cr - 1, cc + 1, r, c, forestTime, time + 1);
    }

    public static void findMax(int forestTime[][],int r,int c){
         int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (forestTime[i][j] > maxElement) {
                    maxElement = forestTime[i][j];
                }
            }
        }
 
        System.out.print(maxElement);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int cr = sc.nextInt() - 1;
        int cc = sc.nextInt() - 1;

        char[][] forestLayout = new char[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                forestLayout[i][j] = sc.next().charAt(0);
            }
        }

        int[][] forestTime = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                forestTime[i][j] = -1;
            }
        }

        burnTime(forestLayout, cr, cc, r, c, forestTime, 1);
        findMax(forestTime, r, c);
    }
}
