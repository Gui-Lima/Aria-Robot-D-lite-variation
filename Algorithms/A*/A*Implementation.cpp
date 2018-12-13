#include <iostream>
#include <iomanip>
#include <queue>
#include <string>
#include <math.h>
#include <ctime>
#include <fstream>
using namespace std;

const int n = 6;
const int m = 8;
static int = map[n][m]
static int closed_nodes_map[n][m];
static int open_nodes_map[n][m];
static int dir_map[n][m];
const int dir =4;
static int dx[dir] = {1,0,-1,0};
static int dy[dir] = {0,1,0,-1};

class node{
private:
    int xPos;
    int yPos;
    int level.
    int priority;

public:
    node(int xp, int yp, int d,int p){
        xPos = xp; yPos = yp; level=d; priority=p;
    }
    int getxPos() const {return xPos;}
    int getyPos() const {return yPos;}
    int getLevel() const {return level;}
    int getPriority() const {return priority;}
    void updatePriority(const int & xDest, const int & yDest){
        priority = level + estimate(xDest, yDest) * 10;
    }
    void nextLevel(const int & i){
        level += (dir ==8)?(i%2==0?10:14):10)
    }
    const int & estimate(const int & xDest, const int & yDest) const{
        static int xd,yd,d;
        xd = xDest - xPos;
        yd = yDest - yPos;
        d = abs(xd) + abs(yd);
        return d;
    }
};