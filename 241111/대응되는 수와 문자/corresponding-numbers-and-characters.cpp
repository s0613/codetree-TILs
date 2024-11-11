#include <iostream>
#include <unordered_map>
#include <string>

using namespace std;

int main() {
    int n, m;
    cin >> n >> m;
    
    unordered_map<int, string> num_to_str;   // 번호 -> 문자열
    unordered_map<string, int> str_to_num;   // 문자열 -> 번호
    
    // 번호와 문자열을 각각의 맵에 저장
    for (int i = 1; i <= n; i++) {
        string str;
        cin >> str;
        num_to_str[i] = str;
        str_to_num[str] = i;
    }
    
    // 조사할 값에 대해 대응되는 값 출력
    for (int i = 0; i < m; i++) {
        string query;
        cin >> query;
        
        if(isdigit(query[0])){
            int num = stoi(query);
            cout << num_to_str[num] << "\n";
        }
        else{
            cout << str_to_num[query] << "\n";
        }
    }
    
    return 0;
}