package leetCode.tencent;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chj
 * @date 2021/6/7 19:30
 */
public class t2 {

    public int getValue(int[] gifts, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(gifts[i])) {
                map.put(gifts[i], map.get(gifts[i]) + 1);
                if (map.get(gifts[i]) > n / 2) {
                    return gifts[i];
                }
            } else {
                map.put(gifts[i], 1);
            }
        }
        return 0;
    }
}
