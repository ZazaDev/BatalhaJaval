public class Player {
    private String name;
    private int score;
    public boolean isDead = false;

    // Constructor
    public Player(String name){
        this.name = name;
    }

    // Methods
    public void killPlayer(){
        isDead = true;
    }

    // Getters
    public int getScore(){
        return this.score;
    }
    public String getName(){
        return this.name;
    }

    // Setters
    public void setScore(int score){
        this.score = score;
    }
    public void setName(String name){
        this.name = name;
    }
}
