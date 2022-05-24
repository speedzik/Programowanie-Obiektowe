import javax.annotation.processing.Filer;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
            Lista list = new Lista();
            list.prepend(4);
            list.prepend(9);
            list.prepend(41);
            list.prepend(17);
            list.prepend(5);
            list.prepend(75);
            list.prepend(1);
            list.prepend(56);
            list.prepend(2);

            list.reset();
            for (int i = 0; i < list.getSize(); i++) {
                System.out.println(list.next());
            }
            FileWriter fileWriter = null;
            list.reset();
            try{
                    fileWriter = new FileWriter("lista.txt");
                    for (int i = 0; i < list.getSize(); i++){
                            fileWriter.write(list.next() + ",");
                    }
            }finally {
                    if (fileWriter != null){
                            fileWriter.close();
                    }
            }
    }
}
