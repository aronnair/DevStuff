package personal.aron.devstuff.constant;

import java.util.ArrayList;

import personal.aron.devstuff.R;
import personal.aron.devstuff.dto.Module;

/**
 * Created by a596771 on 28-02-2017.
 */

public interface Constants {

    Module moduleMaps = new Module("Maps", "Google map integrations with geofencing & more...", "", R.drawable.demo_bg);
    Module moduleAnimations = new Module("Animations", "Animation is fun...", "", R.drawable.demo_bg);

    public Module[] moduleList = {moduleMaps,moduleAnimations};

    public int numColumnsGridHome = 2;

}
