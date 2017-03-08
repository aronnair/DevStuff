package personal.aron.devstuff.general;

import personal.aron.devstuff.dto.Module;

/**
 * Created by a596771 on 28-02-2017.
 */

public interface Constants {

    /**
     * Add new modules
     * params:  "Title", "Description", "Module Tag", "Image url"
     */
    Module moduleMaps = new Module("Maps", "Google map integrations with geofencing & more...", "", "http://3.bp.blogspot.com/_ZaGO7GjCqAI/Rh47v0ZvaoI/AAAAAAAABjA/20hcUi_0XVo/s640/maps-building-layer.png");
    Module moduleVolley = new Module("Volley", "Network calls, caching & queuing...", "personal.aron.devstuff.views.VolleyActivity", "http://4.bp.blogspot.com/-K7j65NVErX4/Vg1fo0yVl5I/AAAAAAAACIM/e9vbLaxqA-U/s1600/image00.png");
    Module moduleDynamicForms = new Module("Dynamic Forms", "Creating forms using json...", "personal.aron.devstuff.views.DynamicFormActivity", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQEXcK-FALJ2WYj0GM015I70-al_Xxe7rkXRqtczHs6bZqRiau1xQ");
    Module modulePermissions = new Module("App Permissions", "Asking permissions and handling it...", "personal.aron.devstuff.views.PermissionsActivity", "https://i.kinja-img.com/gawker-media/image/upload/s--Mjlv9Tan--/c_fill,fl_progressive,g_center,h_450,q_80,w_800/18hvgdkyebym4jpg.jpg");

    public Module[] moduleList = {moduleMaps, moduleVolley, moduleDynamicForms, modulePermissions};

    public int numColumnsGridHome = 2;
    public String homeBackDrop = "http://wallarthd.com/wp-content/uploads/2014/08/Art-Android-Wallpaper-Background.jpg";

}
