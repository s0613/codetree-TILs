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
    int max = -1;
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n-2; j++){
            int cnt = 0;
            for(int k = j; k < j+3; k++){
                if(arr[i][k] == 1){
                    cnt++;
                }
            }
            if(max < cnt){
                max = cnt;
            }
        }
    }
    cout << max;
    return 0;
}