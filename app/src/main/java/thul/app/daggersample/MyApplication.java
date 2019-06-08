package thul.app.daggersample;

import android.app.Application;

import thul.app.daggersample.component.ApiComponent;
import thul.app.daggersample.component.DaggerApiComponent;
import thul.app.daggersample.module.ApiModule;
import thul.app.daggersample.module.AppModule;
import thul.app.daggersample.module.SharedPreferencesModule;

public class MyApplication extends Application {
    private ApiComponent mApiComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mApiComponent = DaggerApiComponent.builder()
                .appModule(new AppModule(this))
                .apiModule(new ApiModule("https://simplifiedcoding.net/demos/"))
                .sharedPreferencesModule(new SharedPreferencesModule(getApplicationContext()))
                .build();
    }

    public ApiComponent getmApiComponent(){
        return mApiComponent;
    }
}
