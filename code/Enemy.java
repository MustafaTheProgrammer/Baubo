import java.util.ArrayList;

public class Enemy{
    public float x;
    public float y;
    public float xv;
    public float yv;
    public int timer;
    public int deathtimer;
    public boolean alive = true;
    public String type;
    public static ArrayList<Enemy> list = new ArrayList<Enemy>();
    public Enemy(float x, float y, float xv, float yv, String type){
        this.x = x;
        this.y = y;
        this.xv = xv;
        this.yv = yv;
        this.type = type;
    }

    //methods for specific enemies
    public void jumpSlimeTick(){
        this.timer++;
        if (this.timer == 20){
            this.yv = 3;
        }
        if (this.timer > 20){
            this.yv -= 0.5;
            this.y += this.yv;
            if (this.yv == -2.5){
                this.timer = 0;
            }
        }
    }

    public void shooterTick(float camx){
        if (this.x - camx >= 0 && this.x + 5 - camx <= 41){
            this.timer++;
        }
        if (this.timer == 20 && this.x + 5 - camx <= 41){
            this.list.add(new Enemy(this.x, this.y + 2, -2, 0, "projectile"));
        }
        if (this.timer == 30){
            this.timer = 0;
        }
    }

    public void chargerTick(float playerx, float camx){
        if ((this.x - camx) - playerx < 20){
            this.timer++;
        }
        if (this.timer > 5){
            this.x -= 2;
        }
    }

    public void touchFireball(){
        //also nothing rn
    }
}