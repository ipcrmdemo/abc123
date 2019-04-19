package abc123;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Abc123Application {

	public static void main(String[] args) {
		SpringApplication.run(Abc123Application.class, args);
	}
	
	public void test() {

                String[] field = {"a", "b", "c", "s", "e"};
                String s = "";
                for (int i = 0; i < field.length; ++i) {
                   s = s + field[i];
                }

    }
}



