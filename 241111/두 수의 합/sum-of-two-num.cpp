#include <iostream>
#include <unordered_map>
#include <vector>
using namespace std;

int main() {
    int n, m;
    cin >> n >> m;
    unordered_map<int,int> um;
    for(int i = 0; i < n; i++){
        int temp;
        cin >> temp;
        um[temp]++;
    }
    int count = 0;
    for(auto i = um.begin(); i != um.end(); i++){
        if(um.find(m-(i->first)) != um.end()){
            count += um[m-(i->first)];
        }
    }
    cout << count/2;
    return 0;
}