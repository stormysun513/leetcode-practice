public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int a = (A < C) ? A : C;
        int b = (A < C) ? B : D;
        int c = (A < C) ? C : A;
        int d = (A < C) ? D : B;
        int e = (E < G) ? E : G;
        int f = (E < G) ? F : H;
        int g = (E < G) ? G : E;
        int h = (E < G) ? H : F;
        int area = Math.abs(a-c)*Math.abs(b-d) + Math.abs(e-g)*Math.abs(f-h);

        int m = Math.min(c, g);
        int n = Math.max(a, e);
        int o = Math.min(d, h);
        int p = Math.max(b, f);

        if(m > n && o > p){
            area -= Math.abs(m-n)*Math.abs(o-p);
        }
        return area;
    }
}
