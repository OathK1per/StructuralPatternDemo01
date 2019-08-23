package flyWeight01;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
    Map<String, FlyWeight> map = new HashMap<>();

    public FlyWeight chess(String color) {
        if (map.containsKey(color)) {
            return map.get(color);
        } else {
            FlyWeight chess = new ConcreteFlyWeight(color);
            map.put(color, chess);
            return chess;
        }
    }
}
