public class ColorGrid {
  public String[][] grid;
  public int row;
  public int col;

  public ColorGrid(int row, int col, String initColor) {
    this.row = row;
    this.col = col;
    this.grid = new String[row][col];
    int stringIndex = 0;
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        this.grid[i][j] = initColor.substring(stringIndex, stringIndex+1);
        stringIndex++;
      }
    }
  }

  public void showGrid() {
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(this.grid[i][j]);
      }
      System.out.println();
    }
  }

  public void fillColor(int row, int col, String newColor, String oldColor) {
    // to be implemented
    System.out.println("Fill grid[" + row + "][" + col + "] with newColor(" + newColor + "), replacing (" + oldColor + ")");
  }

  public static void main(String[] args) {
    ColorGrid grid = new ColorGrid(5, 6, "rrbgyybrbyrrggrrrbyrryrbygbbrg");
    System.out.println("Before:");
    grid.showGrid();
    grid.fillColor(2, 2, "b", grid.grid[2][2]);
    System.out.println("After:");
    grid.showGrid();
  }
}