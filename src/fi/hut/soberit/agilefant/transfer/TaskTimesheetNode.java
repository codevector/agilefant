package fi.hut.soberit.agilefant.transfer;

import java.util.Collections;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import fi.hut.soberit.agilefant.model.Task;
import fi.hut.soberit.agilefant.util.TimesheetNode;

@XmlRootElement
public class TaskTimesheetNode extends TimesheetNode {
    Task task;


    public TaskTimesheetNode() { }
    
    public TaskTimesheetNode(Task task) {
        super();
        this.task = task;
    }
    @Override
    public List<? extends TimesheetNode> getChildren() {
        return Collections.emptyList();
    }

    @Override
    @XmlAttribute(name="taskName")
    public String getName() {
        return this.task.getName();
    }

    @Override
    public boolean getHasChildren() {
        return false;
    }
    @Override
    @XmlAttribute(name = "taskId")
    public int getId() {
        return task.getId();
    }
    
    @XmlTransient
    public Task getTask() {
        return this.task;
    }

}
