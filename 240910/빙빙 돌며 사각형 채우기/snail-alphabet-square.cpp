#include <iostream>
#include <vector>
using namespace std;

int main() {
    int n, m;
    cin >> n >> m;
    vector<vector<int>> arr(n,vector<int>(m,0));
    int dx[4] = {1,0,-1,0};
    int dy[4] = {0,-1,0,1};
    int x = 0, y = 0;
    arr[0][0] = 65;
    int dir = 3;
    int cnt = 1;
    for(int i = 1; i < n*m; i++){
        int nx = x + dx[dir];
        int ny = y + dy[dir];
        if(nx < 0 || nx >= n || ny < 0 || ny >= m || arr[nx][ny] != 0){
            dir += 1;
            dir %= 4;
        }
        x += dx[dir];
        y += dy[dir];
        
        arr[x][y] = 65 + cnt;
        cnt++;
        if(cnt > 25){
            cnt = 0;
        }
    }
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            cout << (char)arr[i][j] << " ";
        }
        cout << endl;
    }
    return 0;
}