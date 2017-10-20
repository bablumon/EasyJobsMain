package me.toptas.jobseasy;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import me.toptas.jobseasy.main.MainContract;
import me.toptas.jobseasy.main.MainPresenter;

import static org.mockito.Mockito.verify;

/**
 * Unit testing class for {@link MainPresenter}
 */

public class MainPresenterTest {

    @Mock
    private MainContract.View mView;


    private MainPresenter mMainPresenter;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        mMainPresenter = new MainPresenter();
        mMainPresenter.attach(mView);
    }


    @Test
    public void testLoadRssItems() {
        mMainPresenter.loadRssFragments();
        verify(mView).onLoadRssFragments();
    }

}
