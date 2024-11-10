#include <iostream>
#include <vector>

using namespace std;

int main() {
    
    int n, m;
    cin >> n >> m;
    vector<int> arr(n,0);
    vector<int> numarr(n+1,0);
    for(int i = 0; i < n; i++){
        cin >> arr[i];
        numarr[arr[i]]++;
    }
    
    while(m--){
        int a;
        cin >> a;
        cout << numarr[a] << " ";
    }
    
        
    
    return 0;
}