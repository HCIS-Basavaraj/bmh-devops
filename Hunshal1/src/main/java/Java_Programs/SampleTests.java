package Java_Programs;

import java.util.Arrays;

public class SampleTests {
    public static void main(String[] args) {
        String[] str1 = {"Hunshal", "Basavaraj", "Shreyas"};
        //System.out.println(Arrays.compare(str1.toCharArray(), str2.toCharArray()));
        /*char[] ch=str1.toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);

        str2 = Arrays.copyOfRange(ch, 2, ch.length);
        System.out.println(str2);*/
        StringBuilder sb=new StringBuilder();
        Arrays.sort(str1);
        for(int i=0; i<=2;i++){
            char[] ch=str1[i].toCharArray();
            Arrays.sort(ch);
            sb.append(ch).append(" ");
            System.out.println(str1[i]);
        }
        System.out.println(sb);
    }
}
