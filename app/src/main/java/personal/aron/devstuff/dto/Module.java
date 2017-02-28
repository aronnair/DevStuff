package personal.aron.devstuff.dto;

/**
 * Created by a596771 on 28-02-2017.
 */

public class Module {
    private String name;
    private String desc;
    private String moduleTag;
    private int thumbnail;

    public Module() {
    }

    public Module(String name, String desc, String moduleTag, int thumbnail) {
        this.name = name;
        this.desc = desc;
        this.moduleTag = moduleTag;
        this.thumbnail = thumbnail;
    }

    public String getModuleTag() {
        return moduleTag;
    }

    public void setModuleTag(String moduleTag) {
        this.moduleTag = moduleTag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
