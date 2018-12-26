
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
    public static Battle[] createFirstCommand() {
        Battle[] command1 = new Battle[6];
        for (int i = 0; i < command1.length; i++) {
            command1[i] = Battle.createWarrior();
        }
        return command1;
    }

    /**
     * Создаем 2 комманду из 6 бойцов
     */
    public static Battle[] createSecondCommand() {
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
        System.out.println("Lets FIGHT");
        System.out.println();

        while (true) {
            firstFighter = (int) (Math.random() * 6);  //рандомный воин первой команды
            secondFighter = (int) (Math.random() * 6);  //рандомный воин второй команды

            while (true) {     //проверка на то что бы хп бойца из первой команды были больше 0
                if (firstCommand[firstFighter].health <= 0) {
                    firstFighter = (int) (Math.random() * 6);
                } else
                    break;
            }
            while (true) {      //проверка на то что бы хп бойца из второй команды были больше 0
                if (secondCommand[secondFighter].health <= 0) {
                    secondFighter = (int) (Math.random() * 6);
                } else
                    break;
            }
            System.out.println("Хпшки бойцов двух команд");

            for (int i = 0; i < firstCommand.length; i++) {
                if(firstCommand[i].health <= 0){
                    System.out.print(0);
                }else{
                    System.out.print(firstCommand[i].health);
                }
                System.out.print("        ");
                if(secondCommand[i].health <= 0){
                    System.out.println(0);
                }else{
                    System.out.println(secondCommand[i].health);
                }
            }
            int createRandomAtack = (int) (Math.random() * 2); //данная переменная служит для выбора рандомной атаки (обычная или крит)
                                                                //если переменная равна 0 - то крит, если 1 - то обычня атака

            if (createRandomAtack == 0) {
                firstCommand[firstFighter].health = firstCommand[firstFighter].health - secondCommand[secondFighter].attack;
            } else {
                //System.out.println("Ебнем критульку воину из первой команды");
                firstCommand[firstFighter].health = firstCommand[firstFighter].health - secondCommand[secondFighter].criticalAttack;
            }
            createRandomAtack = (int) (Math.random() * 2);

            if (createRandomAtack == 0) {
                secondCommand[secondFighter].health = secondCommand[secondFighter].health - firstCommand[firstFighter].attack;
            } else {
                //System.out.println("Ебнем критульку воину из второй команды");
                secondCommand[secondFighter].health = secondCommand[secondFighter].health - firstCommand[firstFighter].criticalAttack;
            }

            //System.out.println("хп первого бойца" + + firstCommand[firstFighter].health);
            //System.out.println("хп второго бойца" + + secondCommand[secondFighter].health);

            for (int j = 0; j < firstCommand.length; j++) {     //сдесь начинается проверка на то погибла ли вся команда
                if (firstCommand[j].health <= 0) {
                    //System.out.println("Одному бойцу из первой команды каюк");
                    kill01++;
                }
            }
            for (int j = 0; j < secondCommand.length; j++) {
                if (secondCommand[j].health <= 0) {
                    //System.out.println("Одному бойцу из второй команды каюк");
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
            kill01 = 0;
            kill02 = 0;
        }
    }
}
