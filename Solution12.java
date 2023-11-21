// monster code
class Solution12 {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {

        int x = Math.abs(sx - fx);
        int y = Math.abs(sy - fy);

        if (x == 0 && y == 0 && t == 1)

            return false;

        return t >= Math.max(x, y);

    }
    public static void main(String[] args) {
        Solution12 s=new Solution12();
        System.out.println(s.isReachableAtTime(3,1,7,3,3));
    }
}