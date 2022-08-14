package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {

        int[][] array = new int[rows][columns];

        int minRow = 0, maxRow = rows - 1, minCol = 0, maxCol = columns - 1;
        int count = 1;
        int max = rows * columns;

        while (count <= max) {
            if(minCol>maxCol) break;
            //проходження по верхній границі
            for (int i = minCol; i <= maxCol; i++) {
                array[minRow][i] = count;
                count++;

            }
            minRow = minRow + 1;


            if(minRow>maxRow) break;
            //проходження по правій границі
            for (int i = minRow; i <= maxRow; i++) {
                array[i][maxCol] = count;
                count++;
            }
            maxCol = maxCol - 1;

            if(minCol>maxCol) break;
            //проходження по нижній границі
            for (int i = maxCol; i >= minCol; i--) {
                array[maxRow][i] = count;
                count++;
            }
            maxRow = maxRow - 1;

            if(minRow>maxRow) break;
            //проходження по лівій границі
            for (int i = maxRow; i >= minRow; i--) {
                array[i][minCol] = count;
                count++;
            }
            minCol = minCol + 1;
        }
        // Винятки
        if(max == 1) array[0][0] = 1;

        // Виведення
        for (int row[] : array) {
            for (int col : row) {
                System.out.printf("%3d ", col);
            }
            System.out.println("");
        }

        return array;
    }
}
