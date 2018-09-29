class fillTest{
    static int mapsize = 20;
    static int[][] dist = new int[mapsize][mapsize];

    public static void fillMap(int x, int y,int xf, int yf){
        boolean isEnd = false;
        if(x == xf && y == yf){
            dist[xf][yf] = 0;
            isEnd = true;
        }
        int up = 999; int right = 999; int down = 999; int left = 999;
        int self = dist[x][y];
        boolean hasup = true; boolean hasright = true; boolean hasdown = true; boolean hasleft = true;
        if(x==0){hasleft = false;}
        if(x==mapsize-1){hasright = false;}
        if(y==0){hasup = false;}
        if(y==mapsize-1){hasdown = false;}

        if(hasup){
            up = dist[x][y-1];
        }if(hasright){
            right = dist[x+1][y];
        }if(hasdown){
            down = dist[x][y+1];
        }if(hasleft){
            left = dist[x-1][y];
        }

        if(!isEnd) {
            int min = Math.min(up, Math.min(right, Math.min(down, Math.min(left, self))));
            dist[x][y] = min + 1;
            self = min + 1;
        }

        if(hasup){
            if (dist[x][y-1]>self)
                fillMap(x, y-1, xf, yf);
        }if(hasright){
            if (dist[x+1][y]>self)
                fillMap(x+1, y, xf, yf);
        }if(hasdown){
            if (dist[x][y+1]>self)
                fillMap(x, y+1, xf, yf);
        }if(hasleft){
            if (dist[x-1][y]>self)
                fillMap(x-1, y, xf, yf);
        }


    }

    public static void main(String[] args) {
        for (int i = 0; i < dist.length; i++) {
            for (int j = 0; j < dist.length; j++) {
                dist[i][j] = 999;
            }
        }


        fillMap(5,5,5,5);
        System.out.println("adada");
        for(int i=0;i<20;i++){
            for (int j=0;j<20;j++){
                System.out.print(String.format("%03d ", dist[j][i]));
            }
            System.out.println();
        }
    }
}