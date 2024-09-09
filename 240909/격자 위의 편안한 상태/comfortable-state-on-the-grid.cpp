#include <iostream>
using namespace std;
int arr[101][101] = {0,};
int main() {
    int n, m;
    cin >> n >> m;
    int dx[4] = {-1,0,1,0};
    int dy[4] = {0,1,0,-1};
    
    for(int i = 0; i < m; i++){
        int r,c;
        int cnt = 0;
        cin >> r >> c;
        arr[r-1][c-1] = 1;
        for(int j = 0; j < 4; j++){
            if(r+dx[j] > 0 && c+dy[j] <= n && arr[r-1+dx[j]][c-1+dy[j]] == 1){
                cnt++;
            }
        }
        if(cnt == 3){
            cout << 1 << endl;
        }else cout << 0 << endl;
    }
    return 0;
}