import city.cs.engine.*;

public class MyWorld extends World {
    public MyWorld() {
        super();
        // No background here—it's set on the view

        // Static Bodies (e.g., platforms)
        Platform platform1 = new Platform(this, new BoxShape(5, 1), "platform.png");
        platform1.setPosition(new Vec2(0, -5));

        // Dynamic Body (e.g., player)
        Player player = new Player(this, new BoxShape(1, 2), "player.png");
        player.setPosition(new Vec2(0, 0));
    }
}