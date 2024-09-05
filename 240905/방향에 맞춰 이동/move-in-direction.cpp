#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;
    int dx[4] = {1,-1,0,0};
    int dy[4] = {0,0,1,-1};
    int x = 0, y = 0;
    for(int i = 0; i < n; i++){
        char cmd;
        int num;
        cin >> cmd >> num;
    
        if(cmd == 'E'){
            x += num*dx[0];
        }
        else if(cmd == 'W'){
            x += num*dx[1];
        }
        else if(cmd == 'S'){
            y += num*dy[3];
        }
        else y += num*dy[2];
    }
    cout << x << " " << y;
    return 0;
}