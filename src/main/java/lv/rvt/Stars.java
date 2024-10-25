package lv.rvt;
public class Stars 
{
    public static void printStars(int number) {
    for(int i = 0; i < number; i++){
        System.out.println("*");
      }
    System.out.println();
    }
    public static void pritSquare(int size) {
    for(int i = 0; i < size; i++) {
        printStars(size);
       }
    }
    public static void printRectangle(int width, int height) {
    for(int i = 0; i < height; i++){
        printStars(width);
       }
    }
    public static void printTriangle(int size){
    for(int i = 1; i <=size; i++){
        printStars(i);
        }
    }
    public static void printSpaces(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
    }
    public static void printSTars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("");
        }
    }
}
