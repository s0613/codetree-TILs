#include <iostream>
#include <vector>
using namespace std;

int main() {
    int n, t;
    cin >> n >> t;
    int r, c;
    cin >> r >> c;
    int dx[4] = {1,0,-1,0};
    int dy[4] = {0,-1,0,1};
    char d;
    cin >> d;
    int dir = 0;
    if(d == 'U'){
        dir = 0;
    }
    else if(d == 'D'){
        dir = 2;
    }
    else if(d == 'R'){
        dir = 3;
    }
    else dir = 1;

    for(int i = 0; i < t; i++){
    
        if(r+dx[dir] >= 1 && c+dy[dir] >= 1 && r+dx[dir] <= n && c+dy[dir] <= n){
            r += dx[dir];
            c += dy[dir];
        }
        else{
            if(d == 'U'){
        dir = 2;
    }
    else if(d == 'D'){
        dir = 0;
    }
    else if(d == 'R'){
        dir = 1;
    }
    else dir = 3;
        }
    }
    cout << r << " " << c;
    return 0;
}