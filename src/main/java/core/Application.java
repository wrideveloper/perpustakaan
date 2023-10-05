package core.domain;tat

import core.interfaces.IPresenter;
import presentation.TuiPresenter;

public class Application {
    private final IPresenter presenter;
    public Application(IPresenter presenter) {
        this.presenter = presenter;
    }

    public void run() {
        presenter.showLoginView();
    }
}
