#include <iostream>
#include <vector>
using namespace std;

int main() {
    int n, m;
    cin >> n >> m;
    vector<vector<int>> arr(n,vector<int>(m,0));
    int dx[4] = {1,0,-1,0};
    int dy[4] = {0,1,0,-1};
    int x = 0, y = 0;
    int dir = 0;
    arr[0][0] = 1;
    for(int i = 2; i <= n*m; i++){
        int nx = x + dx[dir];
        int ny = y + dy[dir];
        if(nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == 0){
            arr[nx][ny] = i;
        }
        else {
            dir += 1;
            dir %= 4;
            nx = x + dx[dir];
            ny = y + dy[dir];
            arr[nx][ny] = i;
        }
        x = nx;
        y = ny;

    }
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            cout << arr[i][j] << " ";
        }
        cout << endl;
    }
    return 0;
}