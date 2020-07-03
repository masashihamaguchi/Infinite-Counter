package com.masashi.hamaguchi.infinitecounter;

/**
 * Created by Masashi Hamaguchi on 2020/06/27.
 */

class Counter {

    private String name;
    private int number = 0;

    // num = 0でinit
    public Counter() {
        this.name = "new counter";
        this.number = 0;
    }

    // 数字のカウント
    // TODO ① plusメソッド・minusメソッドを追加しよう
    public void plus() {
        number++;
    }

    public void minus() {
        number--;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
