import java.util.ArrayList;

public class Tiles{
    public float x;
    public float y;
    public float xv;
    public float yv;
    public int timer;
    public String type;
    public static ArrayList<Tiles> list = new ArrayList<Tiles>();
    public Tiles(float x, float y, float xv, float yv, String type){
        this.x = x;
        this.y = y;
        this.xv = xv;
        this.yv = yv;
        this.type = type;
    }
}