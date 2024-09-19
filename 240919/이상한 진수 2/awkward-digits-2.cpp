#include <iostream>
using namespace std;

int main() {
    string str;
    cin >> str;
    bool test = false;
    for(int i = 0; i < str.size(); i++){
        if(str[i] == '0'){
            test = true;
            break;
        }
    }
    if(!test){
        str[str.size()-1] = '0';
    }
    else{
        for(int i = 0; i < str.size(); i++){
        if(str[i] == '0'){
            str[i] = '1';
            break;
        }
    }

    }

    int sum = 0;
    int k = 0;
    for(int i = str.size()-1; i >= 0; i--){
        if(str[i] == '1'){
            int e = 1;
            for(int j = 0; j < k; j++){
                e *= 2;
            }
            sum += e;
        }
        k++;
    }
    cout << sum;
    
    return 0;
}