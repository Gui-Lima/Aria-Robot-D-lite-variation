class fillTest{
    static int mapsize = 1000;
    static int[][] dist = new int[mapsize][mapsize];

    public static int fillMap(int x, int y,int xf, int yf){
        if(x == xf && y == yf){
            dist[xf][yf] = 0;
            return 0+1;
        }
        int up = 999; int right = 999; int down = 999; int left = 999;
        int self = dist[x][y];
        boolean hasup = true; boolean hasright = true; boolean hasdown = true; boolean hasleft = true;
        if(x==0){hasleft = false;}
        if(x==mapsize-1){hasright = false;}
        if(y==0){hasup = false;}
        if(y==mapsize-1){hasdown = false;}

        if(hasup){
            up = fillMap(x, y-1, xf, yf);
        }if(hasright){
            right = fillMap(x+1, y, xf, yf);
        }if(hasdown){
            down = fillMap(x, y+1, xf, yf);
        }if(hasleft){
            left = fillMap(x-1, y, xf, yf);
        }

        int min = Math.min(up, Math.min(right, Math.min(down, Math.min(left, self))));
        dist[x][y] = min;
        return min + 1;
    }

    public static void main(String[] args) {
        for (int i = 0; i < dist.length; i++) {
            for (int j = 0; j < dist.length; j++) {
                dist[i][j] = 999;
            }
        }


        fillMap(20,20,150,150);
        System.out.println("adada");
        for(int i=0;i<1000;i++){
            for (int j=0;j<1000;j++){
                System.out.print(String.format("%04d ", dist[j][i]));
            }
            System.out.println();
        }
    }
}