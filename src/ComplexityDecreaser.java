import java.io.BufferedReader;
import java.io.FileReader;

class ComplexityDecreaser {
    
    public static void main(String[] args) {
        String path = "C:\\OSPanel\\domains\\complexity\\src\\code.java";
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String s;

            while ((s = br.readLine()) != null){
                System.out.println(s);
            };

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }    
    }     
}
