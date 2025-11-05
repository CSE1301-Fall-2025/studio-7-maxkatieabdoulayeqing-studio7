public class Die {
    
    private int sides;

    public Die(int sides){
        this.sides = sides;
    }

    public int Roll(){
        return((int)(Math.random()*(sides)+1));
    }

    public static void main(String[] args){
        Die d1 = new Die(6);
        System.out.println(d1.Roll());
    }
}

