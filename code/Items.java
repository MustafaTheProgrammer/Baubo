import java.util.ArrayList;

public class Items{
    public float x;
    public float y;
    public boolean alive = true;
    public static ArrayList<Items> list = new ArrayList<Items>();
    public Items(float x, float y){
        this.x = x;
        this.y = y;
    }
}