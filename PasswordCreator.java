import java.util.ArrayList;
import java.util.Random;

public class PasswordCreator{
    ArrayList<Character> arr;
    public String generate(int len) {
        arr = new ArrayList<>();
        for(int i=33;i<127;i++)
            arr.add((char)i);
    
        StringBuilder password = new StringBuilder();
        Random ran = new Random();
        for(int i=0;i<len;i++)
            password.append(arr.get(ran.nextInt(arr.size())));
        System.out.println(password);
        return password.toString();
    }
}