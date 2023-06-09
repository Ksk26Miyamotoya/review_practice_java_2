package com.example;

/*******************
 * エントリーポイント
 * @author A
 * @author B
 *******************/
public class Main {

    /**
     * メインメソッド
     * @param args
     */
    public static void main(String[] args) {
        int[] value = {5, 1, 7, 2, 4};
        exec(value);
    }

    /**
     * 実行メソッド
     */
    public static void exec(int[] atai) {
        int min = findMinimumValue(atai);
        System.out.println(min);

        int max = atai[0];
        for (int i = 1; i < atai.length; i++) {
            if (atai[i] > max) {
                max = atai[i];
            }
        }
        System.out.println(max);
    }

    /**
     * 最小値を見つける
     * @param array int配列
     * @return 値
     */
    public static int findMinimumValue(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
