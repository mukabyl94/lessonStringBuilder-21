import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

//        int[] nums = {1,2,3,4,5};
//        StringBuilder builder = new StringBuilder();
//
//        for (int i = 0; i < nums.length; i++) {
//            builder.append(nums[i]);
//        } // birinchi variant
//        for(int n: nums){
//            builder.append(n);
//        }
//        System.out.println(builder);

        FileWriter writer = new FileWriter("Song.txt");
        writer.write("Nothing else matters\n");
        writer.write("Metallica\n");
        writer.write("So close, no matter how far\n" +
                "Couldn't be much more from the heart\n" +
                "Forever trusting who we are\n" +
                "And nothing else matters\n" +
                "Never opened myself this way\n" +
                "Life is ours, we live it our way\n" +
                "All these words I do\n" +
                "n't just say\n" +
                "And nothing else matters");
        writer.close();
        Song song = new Song();
        FileReader reader = new FileReader("Song.txt");
        Scanner scan = new Scanner(reader);
        song.setTitle(scan.nextLine());
        song.setAuthor(scan.nextLine());
        StringBuilder stringBuilder = new StringBuilder();
        while(scan.hasNext()){
            stringBuilder.append(scan.nextLine()+"\n");
        }
        song.setText(String.valueOf(stringBuilder));
        reader.close();

        System.out.println(song);

    }
}