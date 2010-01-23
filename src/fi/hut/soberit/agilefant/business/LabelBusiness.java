package fi.hut.soberit.agilefant.business;

import fi.hut.soberit.agilefant.model.Label;
import fi.hut.soberit.agilefant.model.Story;

public interface LabelBusiness extends GenericBusiness<Label> {
   
    public Integer createStoryLabel(Label label, Story story);

}