#include <iostream>
#include <vector>
using namespace std;

int main() {
    int t = 0;
    int n;
    cin >> n;
    int dx[4] = {0,1,0,-1};
    int dy[4] = {1,0,-1,0};
    int dir = 0;
    int x = 0, y =0;
    int cnt = 0;
    bool test = true;

    while(n > 0){
        char cmd;
        int num;
        cin >> cmd >> num;
        if(cmd == 'N'){
            dir = 0;
        }
        else if(cmd == 'E'){
            dir = 1;
        }
        else if(cmd == 'S'){
            dir = 2;
        }
        else if(cmd == 'W') dir = 3;
        
        for(int i = 0; i < num; i++){
            cnt++;
            x += dx[dir];
            y += dy[dir];
            
            if(x == 0 && y == 0){
                cout << cnt;
                test = false;
                n = 0;
                break;
            }
        }
        
        n--;
    }
    if(test){
        cout << "-1";
    }
    return 0;
}