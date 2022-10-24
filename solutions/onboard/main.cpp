#include <iostream>
#include <bits/stdc++.h>
#include <chrono>
using namespace std;
using namespace std::chrono;

int cut_rod(int pInt[10], int n);

int main() {

    int n= 10;
    int p[10] = {1,5,8,9,10,17,17,20,24,30};

    // Get starting timepoint
    auto start = high_resolution_clock::now();
    int solution = cut_rod(p, n);
    // Get ending timepoint
    auto stop = high_resolution_clock::now();
    auto duration = duration_cast<microseconds>(stop - start);

    cout << "Time taken by function: "
         << duration.count() << " microseconds" << endl;

    cout << "Max Value :" <<  solution << endl;

    return 0;
}

int cut_rod(int pInt[10], int n) {

    if(n==0)
        return 0;
    if(n==1)
        return pInt[0];
    int q = INT32_MIN;

    for (int i=1;i<n;i++){
        q = std::max(q, pInt[i] + cut_rod(pInt, n-i));
    }

    return q;
}


