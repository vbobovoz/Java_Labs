package org.example;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>(WorkWithTXT.ReadFromFileTXT("C:\\Users\\whatislove\\Desktop\\Java_Labs\\task\\input.txt"));
        int n = Integer.parseInt(array.get(0)); int m = Integer.parseInt(array.get(1));
        int cx = Integer.parseInt(array.get(2)); int cy = Integer.parseInt(array.get(3));
        int r = Integer.parseInt(array.get(4));

        TreeMap<Integer, Cell> map = new TreeMap<>();
        Matrix mtr = new Matrix(n, m);
        int ind = 0;
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                double dist1 = sqrt(Math.pow((mtr.matrix[i][j].lu_x - cx), 2) + Math.pow((mtr.matrix[i][j].lu_y - cy), 2));
                double dist2 = sqrt(Math.pow((mtr.matrix[i][j].ru_x - cx), 2) + Math.pow((mtr.matrix[i][j].ru_y - cy), 2));
                double dist3 = sqrt(Math.pow((mtr.matrix[i][j].lb_x - cx), 2) + Math.pow((mtr.matrix[i][j].lb_y - cy), 2));
                double dist4 = sqrt(Math.pow((mtr.matrix[i][j].rb_x - cx), 2) + Math.pow((mtr.matrix[i][j].rb_y - cy), 2));
                double m_dist = Math.min(Math.min(dist1, dist2), Math.min(dist3, dist4));
                if(dist1 < r && dist2 < r && dist3 < r && dist4 < r) {
                    mtr.matrix[i][j].dist = m_dist;
                    map.put(ind, mtr.matrix[i][j]);
                    ind++;
                }
            }
        }

        Comparator<Cell> byDist = (Cell o1, Cell o2) -> Double.toString(o1.dist).compareTo(Double.toString(o2.dist));
        LinkedHashMap<Integer, Cell> sortedMap = map.entrySet().stream()
                        .sorted(Map.Entry.<Integer, Cell>comparingByValue(byDist))
                                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        Set set = sortedMap.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()) {
            Map.Entry me = (Map.Entry) it.next();
            map.get(me.getKey()).Print();
        }
    }
}