public class Main {
    public static void main(String[] args) {
        var allWork=640;
        var timeEveryone=8;
        var emp=allWork/timeEveryone;
        System.out.println("Всего работников в компании-"+emp+" человек");
        emp=emp+94;
        allWork=timeEveryone*emp;
        System.out.println("Если в компании работает "+emp+" человека,то всего "+allWork+" часа работы может быть поделено между сотрудниками");
    }
}