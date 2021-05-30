package hust.soict.hedspi.test.trash;

import java.util.LinkedList;
import java.util.Queue;

// QItem for current location and distance
// from source location
class QItem {
    int row;
    int col;
    int direc;
    int dist;
    public QItem(int row, int col, int direc, int dist)
    {
        this.row = row;
        this.col = col;
        this.direc = direc;
        this.dist = dist;
    }
}

public class Rook {
    static final int LEFT = 1;
    static final int RIGHT = 2;
    static final int UP = 3;
    static final int DOWN = 4;

    /*private static int minDistance(char[][] grid) {
        int sourceRow = 0, sourceCol = 0;
        firstLoop:
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 's') {
                    sourceRow = i;
                    sourceCol = j;
                    break firstLoop;
                }
            }
        }

        Queue<QItem> queue = new LinkedList<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        visited[sourceRow][sourceCol] = true;
        queue.add(new QItem(sourceRow, sourceCol + 1, RIGHT, 1));
        visited[sourceRow][sourceCol + 1] = false;
        queue.add(new QItem(sourceRow + 1, sourceCol, DOWN, 1));
        visited[sourceRow + 1][sourceCol] = false;
        if (sourceRow != 0 && sourceCol != 0) {
            queue.add(new QItem(sourceRow, sourceCol - 1, LEFT, 1));
            visited[sourceRow][sourceCol - 1] = false;
            queue.add(new QItem(sourceRow - 1, sourceCol, UP, 1));
            visited[sourceRow - 1][sourceCol] = false;
        }

        while (!queue.isEmpty()) {
            QItem p = queue.remove();

            if (isValid(p.row, p.col, grid, visited)) {
                int temp = 0;
                if (p.direc == LEFT) {
                    temp = p.col;
                    while (temp >= 0) {
                        if (grid[p.row][temp] == 'g') {
                            return p.dist;
                        }
                        if (!isValid(p.row, temp, grid, visited)) {
                            break;
                        }
                        if (temp == 0) {
                            queue.add(new QItem(p.row, temp, UP, p.dist + 1));
                            queue.add(new QItem(p.row, temp, DOWN, p.dist + 1));
                            visited[p.row][temp] = false;
                            break;
                        }
                        if (grid[p.row][temp - 1] == '#') {
                            queue.add(new QItem(p.row, temp, UP, p.dist + 1));
                            queue.add(new QItem(p.row, temp, DOWN, p.dist + 1));
                            visited[p.row][temp] = false;
                            break;
                        }
                        temp--;
                    }
                }
                if (p.direc == RIGHT) {
                    temp = p.col;
                    while (temp <= grid[0].length - 1) {
                        if (grid[p.row][temp] == 'g') {
                            return p.dist;
                        }
                        if (!isValid(p.row, temp, grid, visited)) {
                            break;
                        }
                        if (temp == grid[0].length - 1) {
                            queue.add(new QItem(p.row, temp, UP, p.dist + 1));
                            queue.add(new QItem(p.row, temp, DOWN, p.dist + 1));
                            visited[p.row][temp] = false;
                            break;
                        }
                        if (grid[p.row][temp + 1] == '#') {
                            queue.add(new QItem(p.row, temp, UP, p.dist + 1));
                            queue.add(new QItem(p.row, temp, DOWN, p.dist + 1));
                            visited[p.row][temp] = false;
                            break;
                        }
                        temp++;
                    }
                }
                if (p.direc == UP) {
                    temp = p.row;
                    while (temp >= 0) {
                        if (grid[temp][p.col] == 'g') {
                            return p.dist;
                        }
                        if (!isValid(temp, p.col, grid, visited)) {
                            break;
                        }
                        if (temp == 0) {
                            queue.add(new QItem(temp, p.col, LEFT, p.dist + 1));
                            queue.add(new QItem(temp, p.col, RIGHT, p.dist + 1));
                            visited[temp][p.col] = false;
                            break;
                        }
                        if (grid[temp - 1][p.col] == '#') {
                            queue.add(new QItem(temp, p.col, LEFT, p.dist + 1));
                            queue.add(new QItem(temp, p.col, RIGHT, p.dist + 1));
                            visited[temp][p.col] = false;
                            break;
                        }
                        temp--;
                    }
                }
                if (p.direc == DOWN) {
                    temp = p.row;
                    while (temp <= grid.length - 1) {
                        if (grid[temp][p.col] == 'g') {
                            return p.dist;
                        }
                        if (!isValid(temp, p.col, grid, visited)) {
                            break;
                        }
                        if (temp == grid.length - 1) {
                            queue.add(new QItem(temp, p.col, LEFT, p.dist + 1));
                            queue.add(new QItem(temp, p.col, RIGHT, p.dist + 1));
                            visited[temp][p.col] = false;
                            break;
                        }
                        if (grid[temp + 1][p.col] == '#') {
                            queue.add(new QItem(temp, p.col, LEFT, p.dist + 1));
                            queue.add(new QItem(temp, p.col, RIGHT, p.dist + 1));
                            visited[temp][p.col] = false;
                            break;
                        }
                        temp++;
                    }
                }
            }
        }
        return -1;
    }*/
    /*private static int minDistance(char[][] grid) {
        int sourceRow = 0, sourceCol = 0;
        firstLoop:
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 's') {
                    sourceRow = i;
                    sourceCol = j;
                    break firstLoop;
                }
            }
        }

        Queue<QItem> queue = new LinkedList<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        visited[sourceRow][sourceCol] = true;
        queue.add(new QItem(sourceRow, sourceCol + 1, RIGHT, 1));
        visited[sourceRow][sourceCol + 1] = false;
        queue.add(new QItem(sourceRow + 1, sourceCol, DOWN, 1));
        visited[sourceRow + 1][sourceCol] = false;
        if (sourceRow != 0 && sourceCol != 0) {
            queue.add(new QItem(sourceRow, sourceCol - 1, LEFT, 1));
            visited[sourceRow][sourceCol - 1] = false;
            queue.add(new QItem(sourceRow - 1, sourceCol, UP, 1));
            visited[sourceRow - 1][sourceCol] = false;
        }

        while (!queue.isEmpty()) {
            QItem p = queue.remove();

            if (isValid(p.row, p.col, grid, visited)) {
                int temp = 0;
                if (p.direc == LEFT) {
                    temp = p.col;
                    while (temp >= 0) {
                        if (grid[p.row][temp] == 'g') {
                            return p.dist;
                        }
                        if (!isValid(p.row, temp, grid, visited)) {
                            break;
                        }
                        if (temp == 0) {
                            queue.add(new QItem(p.row - 1, temp, UP, p.dist + 1));
                            queue.add(new QItem(p.row + 1, temp, DOWN, p.dist + 1));
                            visited[p.row][temp] = false;
                            break;
                        }
                        if (grid[p.row][temp - 1] == '#') {
                            queue.add(new QItem(p.row - 1, temp, UP, p.dist + 1));
                            queue.add(new QItem(p.row + 1, temp, DOWN, p.dist + 1));
                            visited[p.row][temp] = false;
                            break;
                        }
                        temp--;
                    }
                }
                if (p.direc == RIGHT) {
                    temp = p.col;
                    while (temp <= grid[0].length - 1) {
                        if (grid[p.row][temp] == 'g') {
                            return p.dist;
                        }
                        if (!isValid(p.row, temp, grid, visited)) {
                            break;
                        }
                        if (temp == grid[0].length - 1) {
                            queue.add(new QItem(p.row - 1, temp, UP, p.dist + 1));
                            queue.add(new QItem(p.row + 1, temp, DOWN, p.dist + 1));
                            visited[p.row][temp] = false;
                            break;
                        }
                        if (grid[p.row][temp + 1] == '#') {
                            queue.add(new QItem(p.row - 1, temp, UP, p.dist + 1));
                            queue.add(new QItem(p.row + 1, temp, DOWN, p.dist + 1));
                            visited[p.row][temp] = false;
                            break;
                        }
                        temp++;
                    }
                }
                if (p.direc == UP) {
                    temp = p.row;
                    while (temp >= 0) {
                        if (grid[temp][p.col] == 'g') {
                            return p.dist;
                        }
                        if (!isValid(temp, p.col, grid, visited)) {
                            break;
                        }
                        if (temp == 0) {
                            queue.add(new QItem(temp, p.col - 1, LEFT, p.dist + 1));
                            queue.add(new QItem(temp, p.col + 1, RIGHT, p.dist + 1));
                            visited[temp][p.col] = false;
                            break;
                        }
                        if (grid[temp - 1][p.col] == '#') {
                            queue.add(new QItem(temp, p.col - 1, LEFT, p.dist + 1));
                            queue.add(new QItem(temp, p.col + 1, RIGHT, p.dist + 1));
                            visited[temp][p.col] = false;
                            break;
                        }
                        temp--;
                    }
                }
                if (p.direc == DOWN) {
                    temp = p.row;
                    while (temp <= grid.length - 1) {
                        if (grid[temp][p.col] == 'g') {
                            return p.dist;
                        }
                        if (!isValid(temp, p.col, grid, visited)) {
                            break;
                        }
                        if (temp == grid.length - 1) {
                            queue.add(new QItem(temp, p.col - 1, LEFT, p.dist + 1));
                            queue.add(new QItem(temp, p.col + 1, RIGHT, p.dist + 1));
                            visited[temp][p.col] = false;
                            break;
                        }
                        if (grid[temp + 1][p.col] == '#') {
                            queue.add(new QItem(temp, p.col - 1, LEFT, p.dist + 1));
                            queue.add(new QItem(temp, p.col + 1, RIGHT, p.dist + 1));
                            visited[temp][p.col] = false;
                            break;
                        }
                        temp++;
                    }
                }
            }
        }
        return -1;
    }*/

    private static int minDistance(char[][] grid) {
        int sourceRow = 0, sourceCol = 0;
        firstLoop:
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 's') {
                    sourceRow = i;
                    sourceCol = j;
                    break firstLoop;
                }
            }
        }

        Queue<QItem> queue = new LinkedList<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        visited[sourceRow][sourceCol] = true;

        if (sourceRow == 0 && sourceCol == 0) {
            queue.add(new QItem(sourceRow, sourceCol + 1, RIGHT, 1));
            visited[sourceRow][sourceCol + 1] = false;
            queue.add(new QItem(sourceRow + 1, sourceCol, DOWN, 1));
            visited[sourceRow + 1][sourceCol] = false;
        } else if (sourceRow == 0 && sourceCol == grid[0].length - 1) {
            queue.add(new QItem(sourceRow, sourceCol - 1, LEFT, 1));
            visited[sourceRow][sourceCol - 1] = false;
            queue.add(new QItem(sourceRow + 1, sourceCol, DOWN, 1));
            visited[sourceRow + 1][sourceCol] = false;
        } else if (sourceCol == 0 && sourceRow == grid.length - 1) {
            queue.add(new QItem(sourceRow - 1, sourceCol, UP, 1));
            visited[sourceRow - 1][sourceCol] = false;
            queue.add(new QItem(sourceRow, sourceCol + 1, RIGHT, 1));
            visited[sourceRow][sourceCol + 1] = false;
        } else if (sourceRow == grid.length - 1 && sourceCol == grid[0].length - 1) {
            queue.add(new QItem(sourceRow - 1, sourceCol, UP, 1));
            visited[sourceRow - 1][sourceCol] = false;
            queue.add(new QItem(sourceRow, sourceCol - 1, LEFT, 1));
            visited[sourceRow][sourceCol - 1] = false;
        } else if (sourceRow == 0 && sourceCol > 0 && sourceCol < grid[0].length - 1) {
            queue.add(new QItem(sourceRow, sourceCol + 1, RIGHT, 1));
            visited[sourceRow][sourceCol + 1] = false;
            queue.add(new QItem(sourceRow, sourceCol - 1, LEFT, 1));
            visited[sourceRow][sourceCol - 1] = false;
            queue.add(new QItem(sourceRow + 1, sourceCol, DOWN, 1));
            visited[sourceRow + 1][sourceCol] = false;
        } else if (sourceRow == grid.length - 1 && sourceCol > 0 && sourceCol < grid[0].length - 1) {
            queue.add(new QItem(sourceRow, sourceCol + 1, RIGHT, 1));
            visited[sourceRow][sourceCol + 1] = false;
            queue.add(new QItem(sourceRow, sourceCol - 1, LEFT, 1));
            visited[sourceRow][sourceCol - 1] = false;
            queue.add(new QItem(sourceRow - 1, sourceCol, UP, 1));
            visited[sourceRow - 1][sourceCol] = false;
        } else if (sourceCol == 0 && sourceRow > 0 && sourceRow < grid.length - 1) {
            queue.add(new QItem(sourceRow - 1, sourceCol, UP, 1));
            visited[sourceRow - 1][sourceCol] = false;
            queue.add(new QItem(sourceRow + 1, sourceCol, DOWN, 1));
            visited[sourceRow + 1][sourceCol] = false;
            queue.add(new QItem(sourceRow, sourceCol + 1, RIGHT, 1));
            visited[sourceRow][sourceCol + 1] = false;
        } else if (sourceCol == grid[0].length - 1 && sourceRow > 0 && sourceRow < grid.length - 1) {
            queue.add(new QItem(sourceRow - 1, sourceCol, UP, 1));
            visited[sourceRow - 1][sourceCol] = false;
            queue.add(new QItem(sourceRow + 1, sourceCol, DOWN, 1));
            visited[sourceRow + 1][sourceCol] = false;
            queue.add(new QItem(sourceRow, sourceCol - 1, LEFT, 1));
            visited[sourceRow][sourceCol - 1] = false;
        } else {
            queue.add(new QItem(sourceRow, sourceCol + 1, RIGHT, 1));
            visited[sourceRow][sourceCol + 1] = false;
            queue.add(new QItem(sourceRow + 1, sourceCol, DOWN, 1));
            visited[sourceRow + 1][sourceCol] = false;
            queue.add(new QItem(sourceRow, sourceCol - 1, LEFT, 1));
            visited[sourceRow][sourceCol - 1] = false;
            queue.add(new QItem(sourceRow - 1, sourceCol, UP, 1));
            visited[sourceRow - 1][sourceCol] = false;
        }

        while (!queue.isEmpty()) {
            QItem p = queue.remove();

            if (isValid(p.row, p.col, grid, visited)) {
                int temp = 0;
                if (p.direc == LEFT) {
                    temp = p.col;
                        if (grid[p.row][temp] == 'g') {
                            return p.dist;
                        }
                        if (!isValid(p.row, temp, grid, visited)) {
                            continue;
                        }
                        if (temp == 0) {
                            queue.add(new QItem(p.row - 1, temp, UP, p.dist + 1));
                            queue.add(new QItem(p.row + 1, temp, DOWN, p.dist + 1));
                            visited[p.row][temp] = false;
                            continue;
                        }
                        if (grid[p.row][temp - 1] == '#') {
                            queue.add(new QItem(p.row - 1, temp, UP, p.dist + 1));
                            queue.add(new QItem(p.row + 1, temp, DOWN, p.dist + 1));
                            visited[p.row][temp] = false;
                            continue;
                        }
                        visited[p.row][temp] = true;

                    queue.add(new QItem(p.row, temp - 1, LEFT, p.dist));
                    visited[p.row][temp-1] = false;
                    queue.add(new QItem(p.row - 1, temp, UP, p.dist + 1));
                    visited[p.row-1][temp] = false;
                    queue.add(new QItem(p.row + 1, temp, DOWN, p.dist + 1));
                    visited[p.row+1][temp] = false;

                }
                if (p.direc == RIGHT) {
                    temp = p.col;
                        if (grid[p.row][temp] == 'g') {
                            return p.dist;
                        }
                        if (!isValid(p.row, temp, grid, visited)) {
                            continue;
                        }
                        if (temp == grid[0].length - 1) {
                            queue.add(new QItem(p.row - 1, temp, UP, p.dist + 1));
                            queue.add(new QItem(p.row + 1, temp, DOWN, p.dist + 1));
                            visited[p.row][temp] = false;
                            continue;
                        }
                        if (grid[p.row][temp + 1] == '#') {
                            queue.add(new QItem(p.row - 1, temp, UP, p.dist + 1));
                            queue.add(new QItem(p.row + 1, temp, DOWN, p.dist + 1));
                            visited[p.row][temp] = false;
                            continue;
                        }
                        visited[p.row][temp] = true;

                    queue.add(new QItem(p.row, temp+1, RIGHT, p.dist));
                    visited[p.row][temp+1] = false;
                    queue.add(new QItem(p.row - 1, temp, UP, p.dist + 1));
                    visited[p.row-1][temp] = false;

                    queue.add(new QItem(p.row + 1, temp, DOWN, p.dist + 1));
                    visited[p.row+1][temp] = false;

                }
                if (p.direc == UP) {
                    temp = p.row;
                        if (grid[temp][p.col] == 'g') {
                            return p.dist;
                        }
                        if (!isValid(temp, p.col, grid, visited)) {
                            continue;
                        }
                        if (temp == 0) {
                            queue.add(new QItem(temp, p.col - 1, LEFT, p.dist + 1));
                            queue.add(new QItem(temp, p.col + 1, RIGHT, p.dist + 1));
                            visited[temp][p.col] = false;
                            continue;
                        }
                        if (grid[temp - 1][p.col] == '#') {
                            queue.add(new QItem(temp, p.col - 1, LEFT, p.dist + 1));
                            queue.add(new QItem(temp, p.col + 1, RIGHT, p.dist + 1));
                            visited[temp][p.col] = false;
                            continue;
                        }
                        visited[temp][p.col] = true;

                    queue.add(new QItem(temp-1, p.col, UP, p.dist));
                    visited[temp-1][p.col] = false;

                    queue.add(new QItem(temp, p.col - 1, LEFT, p.dist + 1));
                    visited[temp][p.col-1] = false;

                    queue.add(new QItem(temp, p.col + 1, RIGHT, p.dist + 1));
                    visited[temp][p.col+1] = false;

                }
                if (p.direc == DOWN) {
                    temp = p.row;
                        if (grid[temp][p.col] == 'g') {
                            return p.dist;
                        }
                        if (!isValid(temp, p.col, grid, visited)) {
                            continue;
                        }
                        if (temp == grid.length - 1) {
                            queue.add(new QItem(temp, p.col - 1, LEFT, p.dist + 1));
                            queue.add(new QItem(temp, p.col + 1, RIGHT, p.dist + 1));
                            visited[temp][p.col] = false;
                            continue;
                        }
                        if (grid[temp + 1][p.col] == '#') {
                            queue.add(new QItem(temp, p.col - 1, LEFT, p.dist + 1));
                            queue.add(new QItem(temp, p.col + 1, RIGHT, p.dist + 1));
                            visited[temp][p.col] = false;
                            continue;
                        }
                        visited[temp][p.col] = true;

                    queue.add(new QItem(temp+1, p.col, DOWN, p.dist));
                    visited[temp+1][p.col] = false;

                    queue.add(new QItem(temp, p.col - 1, LEFT, p.dist + 1));
                    visited[temp][p.col-1] = false;

                    queue.add(new QItem(temp, p.col + 1, RIGHT, p.dist + 1));
                    visited[temp][p.col+1] = false;

                }
            }
        }
        return -1;
    }

    // checking where it's valid or not
    private static boolean isValid(int x, int y, char[][] grid, boolean[][] visited) {
        return (x >= 0 && y >= 0 && x < grid.length && y < grid[0].length && grid[x][y] != '#' && !visited[x][y]);
    }

    // Driver code
    public static void main(String[] args)
    {
        /*String[] inputString = {"s..##...................##........#####........###",
                                ".#.......#####......##.....##....##.##.....#..###.",
                                "....#.......##....####....###.....##....##..##.g..",
                                "..#...#..##....##.......##..##......#.#.#.#.#.....",
                                ".#...#....#.#.#.#.....##########......#####......#",
                                "....#..........####...#####.....###...###.##....#.",
                                "......###....#..##...##.........................#.",
                                "#............................######...............",
                                "...#.#............####...####.....................",
                                ".#####............................................",
                                ".###.###########..####...........######...........",
                                "...#.#.................#####.........#####........",
                                "...#.#.....#####.............##...................",
                                "...#.#.............##................#######......",
                                "...#.#.........####...............................",
                                "...#.#......................###...................",
                                "...#.#................#######.........#######.....",
                                "...#.#...########.................................",
                                "...#.#....................#####...................",
                                "...#.#...................#########................",
                                "...#.#.........###.....................##########.",
                                "...#.#...................####.........####........",
                                "...#.#.........##....######..........##...........",
                                "...#.#............................................",
                                "...#.#............................................",
                                "...#.#.......######............##########.........",
                                "...#.#............................................",
                                "...#.#............................................",
                                "...#.#.............#######...........########.....",
                                "...#.#........................########............",
                                "...#.#............................................",
                                "...#.#.........#######........#########...........",
                                "...#.#............................................",
                                "...#.#..........#########.........................",
                                "...#.#............................................",
                                "...#.#......................########..............",
                                "...#.#............................................",
                                "...#.#............................................",
                                "...#.#.......##########...........................",
                                "...#.#............................................",
                                "...#.#............................................",
                                "...#.#.........############.......................",
                                "...#.#............................................",
                                "...#.#........................############........",
                                "...#.#............................................",
                                "...#.#............................................",
                                "...#.#......................########..............",
                                "...#.#........#######.............................",
                                "...#.#............................................",
                                "...#.#..........###############..................."};*/
        String[] inputString = {"9 8",
                "g.......",
"........",
"..##..#.",
"..#...#.",
".......#",
".#..#...",
"..#.###.",
"..#.....",
"....##.s"};
        /*String[] inputString = {"5 5",
                                "s..##",
                                "##...",
                                ".....",
                                "..###",
                                "#.g.."};*/
        char[][] input = new char[inputString.length - 1][inputString[1].length()];
        for (int i = 0; i < inputString.length - 1; i++) {
            String[] temp = inputString[i+1].split("");
            for (int j = 0; j < inputString[1].length(); j++) {
                input[i][j] = temp[j].charAt(0);
            }
        }
        for (int i = 0; i < inputString.length - 1; i++) {
            for (int j = 0; j < inputString[1].length(); j++) {
                System.out.print(input[i][j]);
            }
            System.out.println();
        }

//        long startTime = System.nanoTime();
        System.out.println(minDistance(input));
//        long endTime = System.nanoTime();
//        System.out.println(endTime - startTime);
    }
}


