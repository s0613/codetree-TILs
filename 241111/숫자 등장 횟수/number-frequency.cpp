#include <iostream>
#include <vector>

using namespace std;

int main() {
    
    int n, m;
    cin >> n >> m;
    vector<int> arr(n,0);
    for(int i = 0; i < n; i++){
        cin >> arr[i];
    }
    vector<int> arr2(m,0);
    for(int i = 0; i < m; i++){
        cin >> arr2[i];
    }
    
        
        for(int i = 0; i < m; i++){
            int t = 0;
            for(int k = 0; k < n; k++){
                if(arr2[i] == arr[k]){
                    t++;
                }
            }
            cout << t << " ";
        }
        
    
    return 0;
}