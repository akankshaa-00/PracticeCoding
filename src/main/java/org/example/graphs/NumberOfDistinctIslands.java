package org.example.graphs;

import java.util.*;

public class NumberOfDistinctIslands {

    public static void main(String[] args) {

        String[][] grid = {
                {"1","1","0","1","1"},
                {"1","0","0","0","1"}
        };
            System.out.println(noOfdistinctIslands(grid));
    }

    public static int noOfdistinctIslands(String[][] grid) {

        Set<String> set = new HashSet<>();
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j].equals("1")) {
                    validateDistinctAndSaveInSet(grid, i, j, set);
                }
            }
        }
        return set.size();

    }
        public static void validateDistinctAndSaveInSet(String[][] grid, int i, int j, Set<String> set)
        {
            Queue<int[]> queue=new LinkedList<>();
            int basei=i;
            int basej=j;
            grid[i][j]="$";
            List<String> list = new ArrayList<>();
            queue.add(new int[]{basei,basej});
            list.add("("+0+","+0+")"+",");

            while(!queue.isEmpty()) {

                int[] node=queue.poll();
                int r=node[0];
                int c=node[1];

                if (r + 1 >= 0 && r + 1 < grid.length && grid[r + 1][c].equals("1")) {
                    list.add("(" + ((r + 1) - basei) + "," + (c - basej) + ")" + ",");
                    grid[r + 1][c] = "$";
                    queue.add(new int[]{r+1,c});
                }
                if (r - 1 >= 0 && r - 1 < grid.length && grid[r - 1][c].equals("1")) {
                    list.add("(" + ((r - 1) - basei) + "," + (c - basej) + ")" + ",");
                    grid[r - 1][c] = "$";
                    queue.add(new int[]{r-1,c});
                }
                if (c + 1 >= 0 && c + 1 < grid[0].length && grid[r][c + 1].equals("1")) {
                    list.add("(" + ((r) - basei) + "," + ((c + 1) - basej) + ")" + ",");
                    grid[r][c + 1] = "$";
                    queue.add(new int[]{r,c+1});
                }
                if (c - 1 >= 0 && c - 1 < grid[0].length && grid[r][c - 1].equals("1")) {
                    list.add("(" + ((r) - basei) + "," + ((c - 1) - basej) + ")" + ",");
                    grid[r][c - 1] = "$";
                    queue.add(new int[]{r,c-1});
                }

            }
            Collections.sort(list);
            set.add(list.toString());
        }

}
