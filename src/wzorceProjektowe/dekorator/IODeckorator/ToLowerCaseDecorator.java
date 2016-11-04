package wzorceProjektowe.dekorator.IODeckorator;

import java.io.*;

/**
 * Created by kkramarz on 06.10.16.
 */
public class ToLowerCaseDecorator extends FilterInputStream {
    protected ToLowerCaseDecorator(InputStream inputStream) {
        super(inputStream);
    }

    public int read() throws IOException{
        int c = super.read();
        return c == -1 ? c : Character.toLowerCase((char)c);
    }
    public int read(byte[] b, int offset, int len) throws IOException{
        int result = super.read(b, offset,len);
        for(int i = offset; i<offset+ result; i++){
            b[i]  = (byte)Character.toLowerCase(((char)b[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        int c;
        try {


         InputStream in = new ToLowerCaseDecorator(new BufferedInputStream(new FileInputStream("/home/kkramarz/Pulpit/szkolenia_devesoft/wzorce_projektowe/src/wzorceProjektowe/dekorator/IODeckorator/plik.txt")));

            while((c=in.read())>=0){
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
