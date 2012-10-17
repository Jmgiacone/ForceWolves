package main;

import org.powerbot.core.script.ActiveScript;
import org.powerbot.game.api.util.Random;

public class ForceWolvesMain extends ActiveScript
{

    @Override
    public int loop()
    {
        return Random.nextInt(0, 100);
    }
}
