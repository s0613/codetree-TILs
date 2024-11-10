#include <iostream>
#include <unordered_map>
using namespace std;
unordered_map<int,int> um;

void add(int a, int b){
    um[a] = b;
}

void remove(int b){
    um.erase(b);
}

int find(int k){
    if(um.find(k) != um.end()){
        return (*um.find(k)).second;
    }
    else return -1;
}

int main() {
    int t;
    cin >> t;
    while(t--){
        string a;
        cin >> a;
        if(a == "add"){
            int c, b;
            cin >> c >> b;
            add(c,b);
        }
        else if(a == "find"){
            int c;
            cin >> c;
            if(find(c) == -1){
                cout << "None\n";
                continue;
            }
            cout << find(c) << "\n";
        }
        else{
            int c;
            cin >> c;
            remove(c);
        }

    }
    return 0;
}