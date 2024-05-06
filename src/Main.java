import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int[] list = {10, 20, 20, 10, 10, 5, 20};
        
        Arrays.sort(list);

        int[] frequency = new int[list.length];
        int index=0;
        while (index < list.length) {
            int count = 1;
            while (index+count < list.length && list[index] == list[index+count]) {
                count++;
            }
            frequency[index] = count;
            index+=count;
        }
        for (int i = 0; i < list.length; i++) {
            if(frequency[i] !=0){
                System.out.println(list[i]+" Elamanı "+"  "+frequency[i]
                + " kez tekrarladı ");
            }
        }

    }
}