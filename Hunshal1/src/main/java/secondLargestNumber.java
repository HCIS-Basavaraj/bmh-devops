import java.util.Arrays;

public class secondLargestNumber {
        public static void main(String[] args) {
            int a[]={1,5,2,4,6,10,-1};

            Arrays.sort(a);

            /*for(int i=0; i<a.length; i++){
                for(j=1;j<a.length;j++) {
                    if (a[i] > a[j]) {
                        int temp = a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = temp;
                    }
                }
            }*/
            System.out.println(a[a.length-2]);
        }
    }
