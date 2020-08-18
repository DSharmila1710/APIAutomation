package co.setu.api.automation.resources;

import java.util.ArrayList;
import java.util.List;

import co.setu.api.automation.POJO.Assignee;
import co.setu.api.automation.POJO.Component;
import co.setu.api.automation.POJO.Content;
import co.setu.api.automation.POJO.Content_1;
import co.setu.api.automation.POJO.CreateTicket;
import co.setu.api.automation.POJO.Description;
import co.setu.api.automation.POJO.Fields;
import co.setu.api.automation.POJO.Issuetype;
import co.setu.api.automation.POJO.Priority;
import co.setu.api.automation.POJO.Project;
import co.setu.api.automation.POJO.Reporter;
import co.setu.api.automation.POJO.Update;

public class ResourcesToCreateJiraTicket {

	public static CreateTicket setInputDataToCreateJiraAPI(String input_Summary, String input_Description,
			String input_Reporter, String input_Priority) {
		if (input_Description.equals(null) || input_Reporter.equals(null)) {

		}
		CreateTicket createTicket = new CreateTicket();
		Issuetype issuetype = new Issuetype();
		Component component = new Component();
		Content_1 content_1 = new Content_1();
		Content content = new Content();
		Project project = new Project();
		Assignee assignee = new Assignee();
		Description description = new Description();
		Priority priority = new Priority();
		Reporter reporter = new Reporter();
		Fields fields = new Fields();
		Update update = new Update();

		issuetype.setId("10000");
		component.setId("10000");
		project.setId("10002");
		content_1.setType("text");
		List<Content_1> list_1 = new ArrayList<Content_1>();
		list_1.add(content_1);
		content.setContent(list_1);
		content.setType("paragraph");
		List<Content> list = new ArrayList<Content>();
		list.add(content);
		description.setContent(list);
		description.setType("doc");
		description.setVersion(Integer.parseInt("1"));
		fields.setAssignee(assignee);
		List<Component> list_Component = new ArrayList<Component>();
		list_Component.add(component);
		fields.setComponents(list_Component);
		fields.setCustomfield10011("ST-1");
		fields.setDescription(description);
		fields.setIssuetype(issuetype);
		List<String> Label_Arr = new ArrayList<String>();
		Label_Arr.add("bugfix");
		Label_Arr.add("blitz_test");
		fields.setLabels(Label_Arr);
		fields.setPriority(priority);
		fields.setProject(project);
		fields.setReporter(reporter);
		createTicket.setFields(fields);
		createTicket.setUpdate(update);

		content_1.setText(input_Description);
		fields.setSummary(input_Summary);
		reporter.setId(input_Reporter);
		priority.setId(input_Priority);

		return createTicket;
	}
};