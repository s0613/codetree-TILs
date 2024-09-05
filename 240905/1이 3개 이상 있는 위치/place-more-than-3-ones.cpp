#include <iostream>
#include <vector>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<vector<int>> arr(n,vector<int>(n,0));

    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            cin >> arr[i][j];
        }
    }

    int num = 0;
    
    int dx[4] = {0,1,0,-1};
    int dy[4] = {1,0,-1,0};
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            int cnt = 0;
            for(int k = 0; k < 4; k++){
                if((i+dx[k]) >= 0 && (i+dx[k]) < n && (j+dy[k]) >= 0 && (j+dy[k]) < n){
                    if(arr[i+dx[k]][j+dy[k]] == 1){

                        cnt++;
                        
                    }
                    
                }
            }
            if(cnt >= 3){
                num++;  
            }
        }
    }
    cout << num;
    return 0;
}