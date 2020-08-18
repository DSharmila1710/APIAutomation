
package co.setu.api.automation.POJO;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fields {

    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("parent")
    @Expose
    private Object parent;
    @SerializedName("issuetype")
    @Expose
    private Issuetype issuetype;
    @SerializedName("components")
    @Expose
    private List<Component> components = null;
    @SerializedName("project")
    @Expose
    private Project project;
    @SerializedName("customfield_10011")
    @Expose
    private String customfield10011;
    @SerializedName("description")
    @Expose
    private Description description;
    @SerializedName("reporter")
    @Expose
    private Reporter reporter;
    @SerializedName("fixVersions")
    @Expose
    private Object fixVersions;
    @SerializedName("priority")
    @Expose
    private Priority priority;
    @SerializedName("labels")
    @Expose
    private List<String> labels = null;
    @SerializedName("assignee")
    @Expose
    private Assignee assignee;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Object getParent() {
        return parent;
    }

    public void setParent(Object parent) {
        this.parent = parent;
    }

    public Issuetype getIssuetype() {
        return issuetype;
    }

    public void setIssuetype(Issuetype issuetype) {
        this.issuetype = issuetype;
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getCustomfield10011() {
        return customfield10011;
    }

    public void setCustomfield10011(String customfield10011) {
        this.customfield10011 = customfield10011;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public Reporter getReporter() {
        return reporter;
    }

    public void setReporter(Reporter reporter) {
        this.reporter = reporter;
    }

    public Object getFixVersions() {
        return fixVersions;
    }

    public void setFixVersions(Object fixVersions) {
        this.fixVersions = fixVersions;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

}
