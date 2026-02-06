package com.giaolang.mathutil.core;

//Đây là thư viện toán học, mô phỏng giống thư viện chuẩn Math. của JDK
//Các thư viện mang tính chất tiện ích, đồ dùng xài chung cho các nơi, cung cấp các tool nho nhỏ, thì ta sẽ thiết kế các hàm là static!!!!!!!!!!!!!!!!!!!
public class MathUtility {

    //hàm tính n! = 1.2.3...n
    //ko có giai thừa số âm
    //20! vừa đủ kiểu long - 18 con số 0, 21! kiểu long chứa ko nổi
    //0! = 1 quy ước
    public static long getFactorial(int ngoctrinh) {

        long result;

        if (ngoctrinh < 0 || ngoctrinh > 20) {
            throw new IllegalArgumentException("n must be between 0 and 20");
        }

        if (ngoctrinh == 0)
            return 1;

        result = 1;
        for (int i = 1; i <= ngoctrinh; i++)
            result = result * i;
        return result;
    }
}
