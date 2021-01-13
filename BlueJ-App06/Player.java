import java.util.ArrayList;
/**
 * Write a description of class PLayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    private String name;
    private int health;
    private int score;
    private int moves;

    private ArrayList<Items> items;

    public Player(String name)
    {
        this.name = name;
        items = new ArrayList<Items>();
        health = 100;
        moves = 0;
        score = 0;
    }

    public int getScore()
    {
        return score;
    }

    public void increaseScore(int amount)
    {
        score = score + amount;
    }

    public void move()
    {
        moves++;
        if(score > 0)
        {
            score--;
        }
    }

    public String getName()
    {
        return name;
    }

    public int getHealth()
    {
        return score;
    }

    public void setHealth(int addHealth)
    {
        if (health >= 0 && health <= 90) 
        {
            health = health + addHealth;
        }
    }

    public void addItem(Items item)
    {
        items.add(item);
        score+= 10;
    }

    public void inventory()
    {
        System.out.println(items.toString());
    }

    public void print()
    {
        System.out.println("\n Moves: " + moves + " " 
            + name + " Health: " + health 
            + " Score: " + score + "\n");
    }
}