#include <iostream>
#include <unordered_map>
#include <vector>
using namespace std;

int main() {
    int n,k;
    cin >> n >> k;
    vector<int> arr(n);
    for(int i =0 ;i < n; i++){
        cin >> arr[i];
    }

    unordered_map<int,int> um;
    int count = 0;
    for(int i = 0; i < n; i++){
        int target = arr[i];
        int temp = k - arr[i];
        if(um.find(temp) != um.end()){
            count += um[temp];
        }
        um[target]++;
    }
    cout << count;

    return 0;
}