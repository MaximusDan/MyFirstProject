
package third;

public class Battle {
    public int health;
    public int attack;
    public int criticalAttack;


    public static Battle createWarrior() {     //метод создает бойца с 3 параметрами
        Battle warrior = new Battle();
        warrior.health = (int) (Math.random() * 51) + 100;
        warrior.attack = (int) (Math.random() * 11) + 10;
        warrior.criticalAttack = warrior.attack * 2;
        return warrior;
    }

    /**
     * Создаем комманду из 6 бойцов
     */
    public static Battle[] createCommand() {
        Battle[] command = new Battle[6];
        for (int i = 0; i < command.length; i++) {
            command[i] = Battle.createWarrior();
        }
        return command;
    }


    public static void fight(Battle[] firstCommand, Battle[] secondCommand) {     //метод имитация битвы
        int kill01 = 0; //счетчик если он равен 6 значит команда проиграла
        int kill02 = 0;
        int firstFighter;
        int secondFighter;
        System.out.println("Lets FIGHT");
        System.out.println();

        while (true) {

            firstFighter = Battle.checkNull(firstCommand);  //рандомный воин первой команды
            secondFighter = Battle.checkNull(secondCommand);  //рандомный воин второй команды


            Battle.showFighters(firstCommand,secondCommand);

            int createRandomAtack = (int) (Math.random() * 2); //данная переменная служит для выбора рандомной атаки (обычная или крит)
                                                                //если переменная равна 0 - то крит, если 1 - то обычня атака

            if (createRandomAtack == 0) {
                firstCommand[firstFighter].health = Battle.createAtack(firstCommand[firstFighter].health,secondCommand[secondFighter].attack);
            } else {
                firstCommand[firstFighter].health = Battle.createAtack(firstCommand[firstFighter].health,secondCommand[secondFighter].criticalAttack);
            }
            createRandomAtack = (int) (Math.random() * 2);

            if (createRandomAtack == 0) {
                secondCommand[secondFighter].health = Battle.createAtack(secondCommand[secondFighter].health,firstCommand[firstFighter].attack);
            } else {
                secondCommand[secondFighter].health = Battle.createAtack(secondCommand[secondFighter].health,firstCommand[firstFighter].criticalAttack);
            }


            kill01 = Battle.checkKillCommand(firstCommand);
            kill02 = Battle.checkKillCommand(secondCommand);


            Boolean exit = Battle.checkKillCommand1(kill01,kill02);
                    if(exit){
                        break;
                    }

            kill01 = 0;
            kill02 = 0;
        }
    }

    /**
     * проверяем мертв ли боец
     * @param command
     * @return
     */
    public static int checkNull(Battle[] command) {
        int fighter;
        while (true) {     //проверка на то что бы хп бойца из первой команды были больше 0
            fighter = Battle.createNumber();
            if (command[fighter].health <= 0) {
                fighter = Battle.createNumber();
            } else
                return fighter;
        }
    }

    /**
     * Выводим на экран хп бойцов двух команд
     * @param command1
     * @param command2
     */
    public static void showFighters(Battle[] command1, Battle[] command2){

        System.out.println("Хпшки бойцов двух команд");

        for (int i = 0; i < command1.length; i++) {
            if(command1[i].health <= 0){
                System.out.print(0);
            }else{
                System.out.print(command1[i].health);
            }
            System.out.print("        ");

            if(command2[i].health <= 0){
                System.out.println(0);
            }else{
                System.out.println(command2[i].health);
            }
        }
    }

    public static int createNumber(){
        int number = (int) (Math.random() * 6);
        return number;
    }

    public static int createAtack(int fighter, int atack) {
        fighter = fighter - atack;
        return fighter;
    }

    public static int checkKillCommand(Battle [] checkCommand){
        int kill =0;

        for (int j = 0; j < checkCommand.length; j++) {     //сдесь начинается проверка на то погибла ли вся команда
            if (checkCommand[j].health <= 0) {
                kill++;
            }
        }
        return kill;
    }

    public static boolean checkKillCommand1(int first, int second){  //проверяем погибли ли все 6 человек в команде
        if (first == 6) {
            System.out.println("Первая команда проиграла");
            return true;
        }
        if (second == 6) {
            System.out.println("Вторая команда проиграла");
            return true;
        }
        if (first == 6 && second == 6) {
            System.out.println("Ничья");
            return true;
        }
        return false;
    }
}
