public class Player extends FootballEmployee {

    private String position;
    private int goalsScored;
    private double shootingAccuracy;

    public Player(String name, int age, int wage, String position, int goalsScored, int shootingAccuracy) {
        super(name, age, wage);
        this.position = position;
        this.goalsScored = goalsScored;
        this.shootingAccuracy = shootingAccuracy;
    }

    public void shoot() {
        if(Math.random() < shootingAccuracy) {
            this.goalsScored++;
        }
    }

}
