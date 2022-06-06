public class Train {
    public static int showLargest(int[] intArray) {
        int[] productArray=new int[intArray.length-1];
        for (int i=0;i<intArray.length-1;i++){
            productArray[i]=intArray[i]*intArray[i+1];
        }
        int max=productArray[0];
        for (int j=1;j<productArray.length;j++){
            if (productArray[j]>max){
                max=productArray[j];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] array={5, 1, 2, 3, 1, 4};
        System.out.println(showLargest(array));
    }
}
