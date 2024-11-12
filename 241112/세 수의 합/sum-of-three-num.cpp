#include <iostream>
#include <vector>
#include <unordered_map>
using namespace std;

int main() {
    int n, k;
    cin >> n >> k;
    vector<int> arr(n);
    for(int i = 0; i < n; i++){
        cin >> arr[i];
    }
    int cnt = 0;

    for(int i = 0; i < n-1; i++){
        int target = k - arr[i];
        unordered_map<int, int> um;
        for(int j = i + 1; j < n; j++){
            int temp = target - arr[j];
            if(um.find(temp) != um.end()){
                cnt += um[temp];
            }
            um[arr[j]]++;
        }
    }
    cout << cnt;
    return 0;
}