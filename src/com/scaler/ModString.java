package com.scaler;

public class ModString {
    public int findMod(String A, int B) {
        int len = A.length();
        long  value = 0;
        long  pow = 1;

        for (int i=len-1; i>=0; i--) {
            value += (((A.charAt(i)-48)%B * pow%B)%B);
            pow = (pow * 10)%B;
        }
        return (int)value%B;
    }

    public static void main(String[] args) {
        System.out.println(new ModString().findMod("6562800446546751053033681283622332585949169375825307419010747907087102529693988502714663897293527240363734284937813181135000995192664742291904645171438423695200374401117403", 36173));
    }
}
