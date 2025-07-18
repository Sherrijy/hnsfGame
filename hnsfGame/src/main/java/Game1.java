import com.tedu.controller.GameListener;
import com.tedu.controller.GameThread;
import com.tedu.show.GameJFrame;
import com.tedu.show.Login;

public class Game1 {
    /**
     *  程序唯一入口
     * @param args
     */
    public static void main(String[] args) {
        GameJFrame frame = new GameJFrame();

        //实例化
        Login jp = new Login(frame);
        GameListener listener = new GameListener();
        GameThread th = new GameThread(frame);

        //注入
        GameJFrame.setGAMEX(820);
        GameJFrame.setGAMEY(623);
        frame.setJPanel(jp);
        frame.setKeyListener(listener);
        frame.setMouseListener(listener);
        frame.setMouseMotionListener(listener);
        frame.setThread(th);
        frame.start();
    }
}
