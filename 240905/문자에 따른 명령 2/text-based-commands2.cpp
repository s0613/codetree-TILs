#include <iostream>
#include <string>
using namespace std;

int main() {
    string n;
    cin >> n;
    int x = 0, y = 0;
    int dir = 3;
    int dx[4] = {1,0,-1,0};
    int dy[4] = {0,-1,0,1};
    for(int i = 0; i < n.length(); i++){
        char cmd = n[i];
        if(cmd == 'L'){
            dir -= 1;
            if(dir == -1){
                dir = 3;
            }
        }
        else if(cmd == 'R'){
            dir += 1;
            dir %= 4;
        }
        else if(cmd == 'F'){
            x += dx[dir]; 
            y += dy[dir];
        }
    }
    cout << x << " " << y;
    return 0;
}