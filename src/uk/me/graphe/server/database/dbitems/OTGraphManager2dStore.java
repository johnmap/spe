package uk.me.graphe.server.database.dbitems;

import java.util.List;

import uk.me.graphe.shared.graphmanagers.OTGraphManager2d;

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Entity;


@Entity
public class OTGraphManager2dStore {
    private int id;
    private int stateid;
    private List<String> mOps;
    private String name;
    
    
    public void setName(String n) {
    	name = n;
    }
    
    public String getName() {
    	return name;
    }
    
    public OTGraphManager2dStore (OTGraphManager2d graph) {
        id = graph.getGraphId();
        stateid = graph.getStateId();
        name = graph.getName();
        if (name == null || name.isEmpty())
            System.out.println("NO NAME SUPPLIED");
    }
    
    public OTGraphManager2dStore() {
        
    }

    public int getStateid() {
        return stateid;
    }

    public void setStateid(int stateid) {
        this.stateid = stateid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getmOps() {
        return mOps;
    }

    public void setmOps(List<String> mOps) {
        this.mOps = mOps;
    }

}
