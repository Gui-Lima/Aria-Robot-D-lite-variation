import java.util.ArrayList;
import java.util.Collections;

public class experiments{
    public static final String KNRM = "\u001B[0m";
    public static final String KRED = "\u001B[31m";
    public static final String KGRN = "\u001B[32m";
    public static final String KYEL = "\u001B[33m";
    public static final String KBLU = "\u001B[34m";
    public static final String KMAG = "\u001B[35m";
    public static final String KCYN = "\u001B[36m";
    public static final String KWHT = "\u001B[37m";
    static int mapsize = 20;
    static int[][] dist = new int[mapsize][mapsize];
    static ArrayList<Par> buffer = new ArrayList<Par>();

    public static void fillMap(int x, int y,int xf, int yf){
        boolean isEnd = false;
        if(x == xf && y == yf){
            dist[xf][yf] = 0;
            isEnd = true;
        }
        int up = 99999; int right = 99999; int down = 99999; int left = 99999;
        int self = dist[x][y];
        boolean hasup = true; boolean hasright = true; boolean hasdown = true; boolean hasleft = true;
        if(x==0){hasleft = false;}
        if(x==mapsize-1){hasright = false;}
        if(y==mapsize-1){hasup = false;}
        if(y==0){hasdown = false;}

        if(hasup && dist[x][y+1] != -1){
            up = dist[x][y+1];
        }if(hasright && dist[x+1][y] != -1){
            right = dist[x+1][y];
        }if(hasdown && dist[x][y-1] != -1){
            down = dist[x][y-1];
        }if(hasleft && dist[x-1][y] != -1){
            left = dist[x-1][y];
        }

        if(!isEnd) {
            int min = Math.min(up, Math.min(right, Math.min(down, Math.min(left, self))));
            dist[x][y] = min + 1;
            self = min + 1;
        }

        if(hasup){
            if (dist[x][y+1]>self && dist[x][y+1]!=-1) {
                buffer.add(new Par(x, y+1));
            }
        }if(hasright){
            if (dist[x+1][y]>self && dist[x+1][y]!=-1) {
                int[] toAdd = new int[2];
                buffer.add(new Par(x+1, y));
            }
        }if(hasdown){
            if (dist[x][y-1]>self && dist[x][y-1]!=-1) {
                buffer.add(new Par(x, y-1));
            }
        }if(hasleft){
            if (dist[x-1][y]>self && dist[x-1][y]!=-1) {
                buffer.add(new Par(x-1, y));
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < dist.length; i++) {
            for (int j = 0; j < dist.length; j++) {
                dist[i][j] = 99999;
            }
        }
        dist[3][3] = -1;dist[3][4] = -1;dist[3][5] = -1;dist[2][5] = -1;
        dist[0][1] = -1;dist[1][0] = -1;dist[1][1] = -1;

        Par next;
        buffer.add(new Par(5,5));
        while(!buffer.isEmpty()){
            next = buffer.remove(0);
            buffer.removeAll(Collections.singleton(next));
            fillMap(next.x,next.y,5,5);
        }

        System.out.println("adada");
        for(int i=0;i<mapsize;i++){
            for (int j=0;j<mapsize;j++){
                if(dist[j][i] == -1){
                    System.out.print(KRED + String.format("%05d ", dist[j][i]) + KNRM);
                }else {
                    System.out.print(String.format("%05d ", dist[j][i]));
                }
            }
            System.out.println();
        }
    }
}

class Par{
    public int x;
    public int y;

    public Par(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean pequals (Par p){
        if(this.x == p.x && this.y == p.y){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean equals (Object o){
        if (o instanceof Par){
            return this.pequals((Par) o);
        }else{
            return false;
        }
    }
}