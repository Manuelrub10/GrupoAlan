package grupoalan.backendgalan.model.response.makito;

public class DescriptionsMakito {
    private String ref;
    private String lang;
    private String desc;
    private String commercial_desc;
    private String type;
    private String comp;
    private String info;

    public DescriptionsMakito() {
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCommercial_desc() {
        return commercial_desc;
    }

    public void setCommercial_desc(String commercial_desc) {
        this.commercial_desc = commercial_desc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getComp() {
        return comp;
    }

    public void setComp(String comp) {
        this.comp = comp;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "DescriptionsMakito{" +
                "ref='" + ref + '\'' +
                ", lang='" + lang + '\'' +
                ", desc='" + desc + '\'' +
                ", commercial_desc='" + commercial_desc + '\'' +
                ", type='" + type + '\'' +
                ", comp='" + comp + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
