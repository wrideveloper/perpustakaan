import core.domain.Application;
import presentation.GuiPresenter;
import presentation.TuiPresenter;

// 1. bikin entity
// 2. bikin interface
// 3. repository
public class Main {
    public static void main(String[] args) {
        // PR
        TuiPresenter presenter = new TuiPresenter();
        Application application = new Application(presenter);
        application.run();
    }
}
