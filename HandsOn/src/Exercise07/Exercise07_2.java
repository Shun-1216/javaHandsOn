package Exercise07;
import java.io.*;

public class Exercise07_2 {
    public static void main(String[] args) {
        boolean writeSuccessFlag = false;
        if(args.length<2){
            System.out.println("２つの文字列を指定してください。");
        }else{
            try (FileWriter fw = new FileWriter("data07_2.txt");
                    BufferedWriter bw = new BufferedWriter(fw)) {
                String str1 = args[0];
                String str2 = args[1];

                bw.write(str1);
                bw.newLine();
                bw.write(str2);
                bw.newLine();

                bw.flush();
                writeSuccessFlag = true;
                System.out.println("wrote : " + str1);
                System.out.println("wrote : " + str2);

            } catch (IOException ex) {
                System.err.println("Opening error or IO error occurred");
                System.out.println(ex.toString());
            } catch (Exception ex) {
                System.err.println("error Occurred");
            }
        }
        if(writeSuccessFlag){
            try (FileReader fr = new FileReader("data07_2.txt");
                 BufferedReader br = new BufferedReader(fr)) {
                    String readStr1 =br.readLine();
                    String readStr2 = br.readLine();

                    System.out.println("read  : " + readStr1);
                    System.out.println("read  : " + readStr2);
            } catch (IOException e) {
                System.err.println("Opening error or IO error occurred.");
            } catch (Exception e){
                System.err.println("error occurred.");
            }
        }
    }
}
