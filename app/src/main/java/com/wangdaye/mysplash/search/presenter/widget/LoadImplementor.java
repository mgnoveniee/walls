package com.wangdaye.mysplash.search.presenter.widget;

import com.wangdaye.mysplash.common.i.model.LoadModel;
import com.wangdaye.mysplash.common.i.presenter.LoadPresenter;
import com.wangdaye.mysplash.common.i.view.LoadView;
import com.wangdaye.mysplash.search.model.widget.LoadObject;

/**
 * Load implementor.
 *
 * */

public class LoadImplementor
        implements LoadPresenter {

    private LoadModel model;
    private LoadView view;

    public LoadImplementor(LoadModel model, LoadView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void setLoadingState() {
        if (model.getState() != LoadObject.LOADING_STATE) {
            model.setState(LoadObject.LOADING_STATE);
            view.setLoadingState();
        }
    }

    @Override
    public void setFailedState() {
        if (model.getState() != LoadObject.FAILED_STATE) {
            model.setState(LoadObject.FAILED_STATE);
            view.setFailedState();
        }
    }

    @Override
    public void setNormalState() {
        if (model.getState() != LoadObject.NORMAL_STATE) {
            model.setState(LoadObject.NORMAL_STATE);
            view.setNormalState();
        }
    }

    @Override
    public int getLoadState() {
        return model.getState();
    }
}
