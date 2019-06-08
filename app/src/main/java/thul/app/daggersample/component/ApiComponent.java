package thul.app.daggersample.component;

import javax.inject.Singleton;

import dagger.Component;
import thul.app.daggersample.MainActivity;
import thul.app.daggersample.module.ApiModule;
import thul.app.daggersample.module.AppModule;
import thul.app.daggersample.module.SharedPreferencesModule;

@Singleton
@Component(modules = {AppModule.class, ApiModule.class, SharedPreferencesModule.class})
public interface ApiComponent {
    void inject(MainActivity activity);
}
