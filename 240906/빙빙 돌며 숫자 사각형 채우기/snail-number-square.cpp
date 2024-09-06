#include <iostream>
#include <vector>
using namespace std;

int main() {
    int n, m;
    cin >> n >> m;
    vector<vector<int>> arr(n,vector<int>(m,0));
    int x = 0, y = 0;
    int dx[4] = {0,1,0,-1};
    int dy[4] = {1,0,-1,0};
    int dir = 0;
    int num = 1;
    arr[x][y] = 1;
    for(int i = 1; i < n*m; i++){
        
        int nx = dx[dir] + x, ny = dy[dir] + y;
        if(!(nx >= 0 && ny >= 0 && nx < n && ny < m) || arr[nx][ny] != 0){
            dir += 1;
            dir %= 4;
        }
        num++;
        x += dx[dir];
        y += dy[dir];
        arr[x][y] = num;
        
    }
    // 출력:
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++)
            cout << arr[i][j] << " ";
        cout << endl;
    }
    return 0;
}