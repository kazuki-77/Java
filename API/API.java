package API;

public class API {
  public static void main(String[] args) {
    int[] heights = { 178, 158, 163, 173, 152 };
    java.util.Arrays.sort(heights);
    for (int h : heights) {
      System.out.println(h);
    }
  }
}
