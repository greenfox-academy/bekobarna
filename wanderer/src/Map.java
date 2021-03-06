public class Map {

    int[][] wallsArray = {
        {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},     //1st row
        {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},     //2nd row
        {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},     //3rd row
        {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},     //4th row
        {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},     //5th row
        {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},     //6th row
        {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},     //7th row
        {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},     //8th row
        {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},     //9th row
        {0, 0, 0, 1, 0, 1, 1, 0, 0, 0},     //10th row
    };

    public int[][] mapOfWalls () {
        return wallsArray;
    }

    public boolean isItaAWall (int row, int column) {
        return (wallsArray[row][column] == 1);
    }
}