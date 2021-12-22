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

                {"И в", true}, // 3 символа
                {"Иванов ИанИванович", true}, // 19 символов
                {"", false}, // Пустая строка
                {" И", false}, // Пробел в начале строки
                {"Иван", false}, // Отсутствующий пробел
                {"И ", false}, // Пробел в конце строки
                {"Иванов Иван Иванови", false}, // Более одного пробела
                {"Се", false}, // 2 символа
                {"Сергей Константинкин", false} // 20 символов

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