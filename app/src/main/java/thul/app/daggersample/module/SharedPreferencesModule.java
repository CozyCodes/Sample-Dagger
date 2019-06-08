package thul.app.daggersample.module;

import android.content.Context;
import android.content.SharedPreferences;

import dagger.Module;
import dagger.Provides;

import static android.content.Context.MODE_PRIVATE;

@Module
public class SharedPreferencesModule {
    private Context context;
    public SharedPreferencesModule(Context context){
        this.context = context;
    }

    @Provides
    SharedPreferences provideSharedPreferences(){
        return context.getSharedPreferences("name",MODE_PRIVATE);
    }

}
