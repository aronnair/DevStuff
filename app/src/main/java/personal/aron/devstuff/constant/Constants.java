package personal.aron.devstuff.constant;

import java.util.ArrayList;

import personal.aron.devstuff.R;
import personal.aron.devstuff.dto.Module;

/**
 * Created by a596771 on 28-02-2017.
 */

public interface Constants {

    Module moduleMaps = new Module("Maps", "Google map integrations with geofencing & more...", "", "http://3.bp.blogspot.com/_ZaGO7GjCqAI/Rh47v0ZvaoI/AAAAAAAABjA/20hcUi_0XVo/s640/maps-building-layer.png");
    Module moduleAnimations = new Module("Animations", "Animation is fun...", "", "http://nubiz.in/images/services/animation/2d.png");
    Module moduleSocial = new Module("Facebook", "Facebook, friends & feeds...", "", "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRskHQWUFMAPUBkpgda3yqil5ANVLFDOCfALh484lS2E44wzGQMuA");

    public Module[] moduleList = {moduleMaps,moduleAnimations,moduleSocial};

    public int numColumnsGridHome = 2;

}
