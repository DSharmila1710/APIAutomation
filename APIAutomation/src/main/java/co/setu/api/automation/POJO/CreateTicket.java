
package co.setu.api.automation.POJO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CreateTicket {

    @SerializedName("update")
    @Expose
    private Update update;
    @SerializedName("fields")
    @Expose
    private Fields fields;

    public Update getUpdate() {
        return update;
    }

    public void setUpdate(Update update) {
        this.update = update;
    }

    public Fields getFields() {
        return fields;
    }

    public void setFields(Fields fields) {
        this.fields = fields;
    }

}
