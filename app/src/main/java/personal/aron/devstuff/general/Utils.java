package personal.aron.devstuff.general;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by aRON on 04-03-2017.
 */

public class Utils {

    public static void openModuleByTag(Context context, String moduleTag, Bundle bundle) {
        try {
            Class<?> myClass = Class.forName(moduleTag);
            Object obj = myClass.newInstance();
            context.startActivity(new Intent(context, obj.getClass()), bundle);
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(context, "Module not available...", Toast.LENGTH_SHORT).show();
        }
    }

}
