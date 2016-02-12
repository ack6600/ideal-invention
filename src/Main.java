import main.GameWrapper;
import main.RenderEngine;
import world.Tickable;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by Adam Urish on 2/11/16.
 */
public class Main
{
    public static void main(String[] args)
    {
        JPanel jPanel = new JPanel();
        JFrame jFrame = new JFrame();
        jPanel.add(jFrame);
        jPanel.setSize(300,300);
        jPanel.setVisible(true);
        RenderEngine renderEngine = null;
        try
        {
            renderEngine = new RenderEngine(jPanel,60,new File("src/output/"));
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        GameWrapper gameWrapper = new GameWrapper(renderEngine);
    }

}
