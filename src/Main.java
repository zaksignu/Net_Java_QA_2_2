public class Main {
    public static void main(String[] args) {
        int account;                //Счет для пополнения
        int rublesStep = 100;           //Количество рублей, за которые клиент получает бонусный рубль
        int bonusAmount = 1;            //Размер бонусного пополнения за каждые rublesStep рубле
        int currentAdding = 1902;       //Количество рублей, на которое пополнили счет
        int tempAdding;             //Промежуточный расчет количества бонусов от текущего пополнения счета
        int finalBonus = 0;             //Окончательный расчет количества бонусов с
        int bonusThreshold = 1000;      //Порог срабатывания скидки

        if (currentAdding > bonusThreshold) {               //Определяем, попадаем ли под событие с бонусными рублями при пополнении
            tempAdding = currentAdding / rublesStep;        //Определяем сколько полных раз будем начислять бонусы
            finalBonus = tempAdding * bonusAmount;          //Определяем окончательный размер бонусного начисления
        }
        account = currentAdding + finalBonus;               //Определеляем окончательную цифру пополнения счета ( насколько пополнили счет + бонусы)

        System.out.println("Начислено рублейи значально: " + currentAdding);
        System.out.println("Начислено бонусов: " + finalBonus);
        System.out.println("Всего начислено: " + account);

    }
}
