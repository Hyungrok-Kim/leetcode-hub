import java.util.*;

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] results = new int[k][2];
        Map<Integer, List<int[]>> resultMap = new HashMap<>();
        setupDistances(resultMap, points);
        List<Integer> keys = new ArrayList<>(resultMap.keySet());
        Collections.sort(keys);
        setupResults(resultMap, keys, results, k);
        return results;
    }

    private void setupDistances(Map<Integer, List<int[]>> resultMap, int[][] points) {
        for (int[] point : points) {
            double distanceFromZero = Math.pow(point[0], 2) + Math.pow(point[1], 2);
            List<int[]> values = resultMap.getOrDefault((int) distanceFromZero, new ArrayList<>());
            values.add(point);
            resultMap.put((int) distanceFromZero, values);
        }
    }

    private void setupResults(Map<Integer, List<int[]>> resultMap, List<Integer> keys,  int[][] results, int k) {
        int i = 0;
        for (Integer key: keys) {
            if (i >= k) {
                break;
            }
            List<int[]> values = resultMap.get(key);
            for (int[] value : values) {
                results[i] = value;
                i++;
            }
        }
    }
}