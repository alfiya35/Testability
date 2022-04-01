public class Main {

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticket = 10_000;
        int bonus = service.calculate(ticket);



    }

}