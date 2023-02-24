import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//todo Мен тапшырманы мына ушундай тушундум. Консолдон винонун толук маалыматын киргизсениз, аны ким даярдаганында толтур деп чыгарат жана башка винолордуда кошот.
        while (true) {
            System.out.println("""
                    Винонун атын:
                    Брендин:
                    Жасаган өлкөсүн:
                    жасалган жылын жазыңыз""");

            Vino[] vino = new Vino[]{new Vino(new Scanner(System.in).nextLine(), new Scanner(System.in).nextLine(),
                    new Scanner(System.in).nextLine(), new Scanner(System.in).nextInt())};
            System.out.println(Arrays.toString(vino));

            System.out.println("""
                    \nЭми жасаган адамдын атын:
                    Кайсы брендтин виносун жасайт:
                    Стажын:
                    Дарегин жазыныз""");
            Vinodel vinodel = new Vinodel(new Scanner(System.in).nextLine(), new Scanner(System.in).nextLine(),
                    new Scanner(System.in).nextInt(), new Scanner(System.in).nextLine());
            System.out.println(vinodel);

        }
    }
}