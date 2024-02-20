package LP1.Array;

public class Array {

  public int[] array(){

    int[] x = new int[10];
    for(int i = 0;i<10;i++){
        x[i] = i*2;
    }
    for(int i = 0; i<10;i++){
        System.out.println(x[i]);
    }
    return x;
  }
}
