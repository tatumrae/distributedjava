package edu.wctc.dj.week12.namesapp12.beans;

import edu.wctc.dj.week12.namesapp12.model.Name;
import edu.wctc.dj.week12.namesapp12.model.NameService;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author tatum
 */
@Component("nameBean")
@Scope("session")
//@Named(value = "nameBean")
//@SessionScoped
public class NameBean implements Serializable {
    
    @Autowired
    private NameService nameService;
    
    private Name name;
    private List<Name> nameList;

    public NameBean() {
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public List<Name> getNameList() {
        return nameList;
    }

    public void setNameList(List<Name> nameList) {
        this.nameList = nameList;
    }
    
    public void nameDetail(AjaxBehaviorEvent event) {
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("nameDetail.xhtml?id=" + name.getId());
        } catch (IOException ex) {
            FacesMessage msg = new FacesMessage("IOException", name.getId());
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }
    
    public String allNames() throws Exception {
        nameList = nameService.getAllNames();
        return "nameList";

    }
    
}
