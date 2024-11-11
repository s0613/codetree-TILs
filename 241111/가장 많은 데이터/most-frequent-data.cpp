#include <iostream>
#include <unordered_map>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int n;
    cin >> n;
    unordered_map<string, int> um;

    for (int i = 0; i < n; i++) {
        string str;
        cin >> str;
        um[str]++;
    }

    // `um`의 내용을 벡터로 옮기기
    vector<pair<string, int>> vec(um.begin(), um.end());

    // 벡터를 값 기준으로 정렬
    sort(vec.begin(), vec.end(), [](const pair<string, int>& a, const pair<string, int>& b) {
        return a.second > b.second;  // 내림차순으로 정렬 (높은 값부터)
    });

    cout << vec[0].second;

    return 0;
}