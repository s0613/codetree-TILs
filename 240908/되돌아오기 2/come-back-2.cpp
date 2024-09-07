#include <iostream>
#include <string>
using namespace std;

int main() {
    int dx[4] = {0,1,0,-1};
    int dy[4] = {1,0,-1,0};
    int dir = 0;
    int x = 0, y = 0;
    string cmd;
    cin >> cmd;
    int cnt = 0;
    bool test = true;
    for(int i = 0; i < cmd.length(); i++){
        if(cmd[i] == 'F'){
            x += dx[dir];
            y += dy[dir];
        }
        else if(cmd[i] == 'R'){
            dir += 1;
            dir %= 4;
        }
        else {
            dir -= 1;
            if(dir < 0){
                dir = 3;
            }
        }

        cnt++;
        if(x == 0 && y == 0){
            cout << cnt;
            test = false;
            break;
        }
    }
    if(test){
        cout << "-1";
    }
    return 0;
}