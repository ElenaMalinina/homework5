public class Main {
    public static void main(String[] args) {
        Staff[] staff = new Staff[5]; {
                staff [0] = new Staff(
                        "Пушкин Александр Сергеевич",
                        37,
                        "младший тестировщик",
                        "alex.pushkin@library.ru",
                        "+79210010099",
                        50000);
                staff [1] = new Staff(
                        "Толстой Лев Николавевич",
                        82,
                        "старший тестировщик",
                        "lev.best@library.ru",
                        "+79115550033",
                        100000);
                staff [2] = new Staff(
                        "Гоголь Николай Васильевич",
                        42,
                        "программист",
                        "gogol@library.ru",
                        "+79646253287",
                        150000);
                staff [3] = new Staff(
                        "Есенин Сергей Александрович",
                        30,
                        "дизайнер",
                        "esenin@library.ru",
                        "+79041112233",
                        90000);
                staff [4] = new Staff(
                        "Ахматова Анна Андреевна",
                        76,
                        "аналитик",
                        "ah.ann@library.ru",
                        "+79216668181",
                        100000);
        }
        for (Staff staff1: staff){
            if (staff1.age > 40) {
                staff1.info();
                System.out.println();
            }
        }
    }
}
