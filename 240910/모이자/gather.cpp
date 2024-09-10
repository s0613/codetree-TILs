#include <iostream>
#include <vector>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> arr(n);
    for(int i = 0; i < n; i++){
        cin >> arr[i];
    }
    
    int min = 10000000001;
    for(int i = 0; i < n; i++){
        int sum = 0;
        for(int j = 0; j < n; j++){
            int idx = j-i;
            if(idx < 0){
                idx *= -1;
            }
            
            sum += idx*arr[j];     
        }
        if(min > sum){
            min = sum;
        }
    }
    cout << min;
    return 0;
}