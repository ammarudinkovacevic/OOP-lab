package Week5;

public interface NationalService {
    int getDaysLeft();
    void work();
}
class CivilService implements NationalService{
    private int daysLeft;
     public CivilService(){
         this.daysLeft=362;
     }
    @Override
    public int getDaysLeft() {
        return daysLeft;
    }

    @Override
    public void work() {
        if (daysLeft > 0) {
            daysLeft--;
        }
    }
}
class MilitaryService implements NationalService{
    private int daysLeft;
    public MilitaryService(int daysLeft){
        this.daysLeft=daysLeft;
    }
    @Override
    public int getDaysLeft() {
        return daysLeft;
    }

    @Override
    public void work() {
        if (daysLeft > 0) {
            daysLeft--;
        }
    }
}
