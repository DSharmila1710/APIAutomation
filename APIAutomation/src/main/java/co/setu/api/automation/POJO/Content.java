
package co.setu.api.automation.POJO;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Content {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("content")
    @Expose
    private List<Content_1> content = null;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Content_1> getContent() {
        return content;
    }

    public void setContent(List<Content_1> content) {
        this.content = content;
    }

}
