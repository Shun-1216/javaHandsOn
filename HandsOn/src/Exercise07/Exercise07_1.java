package Exercise07;
import java.io.*;

public class Exercise07_1 {
    public static void main(String[] args) {
        try(FileOutputStream outFile = new FileOutputStream("data07_1.dat");
            DataOutputStream outData = new DataOutputStream(outFile)) {            
            
            String str1 = args[0];
            int len1 = args[0].length();
        
            //データの書き込み
            outData.writeUTF(str1);
            outData.writeInt(len1);
            
            //出力したデータの表示
            System.out.println("wrote："+ str1 +",　length：" + len1 );

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("文字列を指定してください。");
            System.out.println("使用方法：java Exercise07_1 文字列");
        }catch(IOException ex){
            System.out.println(ex.toString());
        }           
        
        try (FileInputStream inFile = new FileInputStream("data07_1.dat");
            DataInputStream inData = new DataInputStream(inFile)) {
            String str = inData.readUTF();
            int len = inData.readInt();
            System.out.println("read ："+ str + ",　length：" + len);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } 

    }
}
