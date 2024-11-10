#include <iostream>
#include <unordered_map>

using namespace std;

int main() {
    int n, m;
    cin >> n >> m;
    
    unordered_map<int, int> numarr;  // 숫자의 빈도수를 저장하는 맵
    for (int i = 0; i < n; i++) {
        int val;
        cin >> val;
        numarr[val]++;  // 입력된 값을 카운트
    }
    
    while (m--) {
        int a;
        cin >> a;
        cout << numarr[a] << " ";  // 존재하지 않으면 기본값 0을 출력
    }
    
    return 0;
}