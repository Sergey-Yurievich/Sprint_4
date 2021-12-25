import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {

    // Переменные для параметризации
    private final String checkName;
    private final boolean expected;

    // Метод для парметризации
    public AccountTest (String checkName, boolean expected){
        this.checkName = checkName;
        this.expected = expected;
    }

    // Параметризация
    @Parameterized.Parameters
    public static Object [][] animalKindType() {
        return new Object[][]{

                {"И в", true}, // 0. 3 символа
                {"Иван Иванововичички", true}, //1. 19 символов
                {"", false}, // 2. Пустая строка
                {" И", false}, // 3. Пробел в начале строки
                {"Иван", false}, // 4. Отсутствующий пробел
                {"И ", false}, // 5. Пробел в конце строки
                {"Иванов Иван Иванови", false}, // 6. Более одного пробела
                {"Се", false}, // 7. 2 символа
                {"Сергей Константинкин", false} //8. 20 символов

        };
    }

    @Test
    @DisplayName ("checkNameToEmbossTest")

    public void checkNameToEmbossTest () {

        Account account = new Account(checkName);
        boolean actual = account.checkNameToEmboss();
        assertEquals(expected,actual);

    }
}