package math;

/**
 * @Author xiaobai
 * @Date 2021/2/13 18:49
 * @Version 1.0
 */
public class Math06 {
    public static void main(String[] args) {
        System.out.println(change(6, 6));
    }

    public static int divide(int dividend, int divisor) {
        long did = dividend;
        long dis = divisor;
        boolean flag = false;
        // 负数情况
        if (dis < 0 && did > 0){
            flag = true;
            dis = - dis;
        }
        if (did < 0 && dis > 0){
            flag = true;
            did = - did;
        }
        if (did <0 && dis < 0){
            did = - did;
            dis = - dis;
        }
        long now = 0;
        long nex = dis;
        long i = 0;
        long left = 0;
        boolean item = false;
        for (; i < did; ) {
            if (now < did && nex > did){
                item = true;
                break;
            }
            else if (now == did){
                break;
            }
            // 指数查找
            nex += dis;
            if (i == 0){
                now += dis;
                i ++;
                dis = now;
            }
            else{
                left += dis;
                i = i + i;
                dis = left;
            }
        }
        if (item){
        }
        if (i >= Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }else{
            return (int) (flag ? -i : i);
        }
    }

    private static long change(long i, long dis){
        if (i == 0){
            return dis;
        }
        long center = i >> 1;
        long result = change(center, dis);
        return result + result;
    }
}