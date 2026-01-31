package forlooprelated;

public class FLR4 {
    int[] intArr = {1,2,6,4,3,9,4,8,22,21,2,5,9};
    int max=0;
    int maxN=0;
    int min=18;
    int minN=18;

    public void init() {
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i]>max){
                max=intArr[i];
            }
        }
        System.out.println("using for loop:"+max);

        for (int n: intArr) {
            if (n>maxN){
                maxN=n;
            }
        }
        System.out.println("using forEnhance loop:"+maxN);

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i]<min){
                min=intArr[i];
            }
        }
        System.out.println("using for loop:"+min);

        for (int n: intArr) {
            if (n<minN){
                minN=n;
            }
        }
        System.out.println("using forEnhance loop:"+minN);
    }

    public static void main(String[] args){
        new FLR4().init();
    }

}
