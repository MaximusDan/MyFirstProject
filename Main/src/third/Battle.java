
package third;

public class Battle {
    int health;
    int attack;
    int criticalAttack;

    public static Battle createWarrior() {     //метод создает бойца с 3 параметрами
        Battle warrior = new Battle();
        warrior.health = (int) (Math.random() * 51) + 100;
        warrior.attack = (int) (Math.random() * 11) + 10;
        warrior.criticalAttack = warrior.attack * 2;
        return warrior;
    }

    /**
     * Создаем 1 комманду из 6 бойцов
     */
    public static Battle [] createFirstCommand() {
        Battle[] command1 = new Battle[6];
        for (int i = 0; i < command1.length; i++) {
            command1[i] = Battle.createWarrior();
        }
        return command1;
    }

    /**
     * Создаем 2 комманду из 6 бойцов
     */
    public static Battle [] createSecondCommand() {
        Battle[] command2 = new Battle[6];
        for (int i = 0; i < command2.length; i++) {
            command2[i] = Battle.createWarrior();
        }
        return command2;
    }

    public static void fight(Battle[] firstCommand, Battle[] secondCommand) {     //метод имитация битвы
        int kill01 = 0; //счетчик если он равен 6 значит команда проиграла
        int kill02 = 0;
        int firstFighter;
        int secondFighter;

        /**for(int p=0; p<firstCommand.length;p++){
            System.out.println(firstCommand[p].health);
        }*/
        while (true) {
                firstFighter = (int) (Math.random() * 7);  //рандомный воин первой команды
                secondFighter = (int) (Math.random() * 7);  //рандомный воин второй команды

                while (true) {
                    if (firstCommand[firstFighter].health <= 0){
                        firstFighter = (int) (Math.random() * 7);
                    }else
                        break;
                }
                while (true) {
                    if (secondCommand[secondFighter].health <= 0){
                        secondFighter = (int) (Math.random() * 7);
                    }else
                        break;
                }

            firstCommand[firstFighter].health = firstCommand[firstFighter].health - secondCommand[secondFighter].attack;
            secondCommand[secondFighter].health = secondCommand[secondFighter].health - firstCommand[firstFighter].attack;

            System.out.println("хп первого бойца" + firstCommand[firstFighter].health);
            System.out.println("хп второго бойца" + secondCommand[secondFighter].health);

            for (int j = 0; j < firstCommand.length; j++) {     //сдесь начинается проверка на то погибла ли вся команда
                if (firstCommand[j].health <= 0) {
                    kill01++;
                }
            }
            for (int j = 0; j < secondCommand.length; j++) {
                if (secondCommand[j].health <= 0) {
                    kill02++;
                }
            }
            if (kill01 == 6) {
                System.out.println("Первая команда проиграла");
                break;
            }
            if (kill02 == 6) {
                System.out.println("Вторая команда проиграла");
                break;
            }
            if (kill01 == 6 && kill02 == 6) {
                System.out.println("Ничья");
                break;
            }
            System.out.println(kill01);
            System.out.println(kill02);
            kill01 = 0;
            kill02 = 0;
        }
    }
}
