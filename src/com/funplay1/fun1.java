package com.funplay1;

public class fun1 {
    public static void main(String[] args) {
        int sx = 1;
        int sy = 1;
        int ex = 1;
        int ey = 1;
        int cost = 0;
        while (sx != ex && sy != ey) {
            if (sx > ex && sy > ey) {
                sx--;
                sy--;
            }
            if (sx == ex) {
                if (sy > ey) {
                    sy--;
                    cost++;
                } else if (sy < ey) {
                    sy++;
                    cost++;
                }
            }
            if (sy == ey) {
                if (sx > ex) {
                    sx--;
                    cost++;
                } else if (sx < ex) {
                    sx++;
                    cost++;
                }
            }

            if (sx < ex && sy < ey) {
                sx++;
                sy++;
            }
            if (sx > ex && sy < ey) {
                sx--;
                sy++;
            }
            if (sx < ex && sy < ey) {
                sx++;
                sy--;
            }

        }
        System.out.println(cost);
    }
}
