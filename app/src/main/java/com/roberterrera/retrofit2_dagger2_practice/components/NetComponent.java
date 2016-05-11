package com.roberterrera.retrofit2_dagger2_practice.components;

import com.roberterrera.retrofit2_dagger2_practice.modules.AppModule;
import com.roberterrera.retrofit2_dagger2_practice.MainActivity;
import com.roberterrera.retrofit2_dagger2_practice.modules.NetModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Rob on 5/11/16.
 */
@Singleton
@Component(modules={AppModule.class, NetModule.class})
public interface NetComponent {
    void inject(MainActivity activity);

}
