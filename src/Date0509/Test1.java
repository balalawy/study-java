package Date0509;

import java.util.Arrays;

public class Test1 {

    int x, y;

    Test1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Test1 pt1, pt2;
        pt1 = new Test1(3, 3);
        pt2 = new Test1(4, 4);
        System.out.print(pt1.x + pt2.x);
    }
}


