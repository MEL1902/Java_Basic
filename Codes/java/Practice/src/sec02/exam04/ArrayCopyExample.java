package sec02.exam04;

public class ArrayCopyExample {
    public static void main(String[] args) {
      String[] oldSrtArray = {"java", "array", "copy"};
      String[] newSrtArray = new String[5];

        System.arraycopy( oldSrtArray, 0, newSrtArray, 0, oldSrtArray.length);

        for(int i=0; i<newSrtArray.length; i++) {
            System.out.println(newSrtArray[i] + ", ");
        }
    }
}
