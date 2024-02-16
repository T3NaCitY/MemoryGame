package com.MemoryGame.MemoryGame.Services;

import org.springframework.stereotype.Service;

@Service
public class GameStateService {

    public String getMatrixToString(String[][] matrix){

        StringBuilder stringBuilder = new StringBuilder();

        for (String[] row : matrix) {
            for (String element : row) {
                stringBuilder.append(element).append(" ");
            }
            stringBuilder.append("\n");
        }
        //System.out.println(stringBuilder.toString().trim());
        return stringBuilder.toString().trim();
    }

    public String[][] getByteArrayToMatrix(byte[] matrix){
        String[][] element = new String[10][10];
        String rawString = new String(matrix);

        String[] SplittedRawString = rawString.split(" ");

        for(int i=0;i<SplittedRawString.length;i++) {
            SplittedRawString[i] = SplittedRawString[i].trim();

        }

        for(int i=0;i<10;i++)
            for(int j=0;j<10;j++)
                element[i][j] = SplittedRawString[j+(i*j)];

        System.out.println(getMatrixToString(element));

        return element;
    }
}
