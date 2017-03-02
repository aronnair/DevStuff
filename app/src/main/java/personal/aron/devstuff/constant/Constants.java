package personal.aron.devstuff.constant;

import personal.aron.devstuff.dto.Module;

/**
 * Created by a596771 on 28-02-2017.
 */

public interface Constants {

    Module moduleMaps = new Module("Maps", "Google map integrations with geofencing & more...", "", "http://3.bp.blogspot.com/_ZaGO7GjCqAI/Rh47v0ZvaoI/AAAAAAAABjA/20hcUi_0XVo/s640/maps-building-layer.png");
    Module moduleAnimations = new Module("Animations", "Animation is fun...", "", "http://nubiz.in/images/services/animation/2d.png");
    Module moduleDynamicForms = new Module("Dynamic Forms", "Creating forms using json...", "personal.aron.devstuff.views.DynamicFormActivity", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQEXcK-FALJ2WYj0GM015I70-al_Xxe7rkXRqtczHs6bZqRiau1xQ");

    public Module[] moduleList = {moduleMaps,moduleAnimations, moduleDynamicForms};

    public int numColumnsGridHome = 2;
    public String homeBackDrop = "http://wallarthd.com/wp-content/uploads/2014/08/Art-Android-Wallpaper-Background.jpg";

}
