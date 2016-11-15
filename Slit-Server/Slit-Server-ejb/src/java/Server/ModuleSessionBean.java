/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import DataModel.ModuleDataModel;
import Database.Module;
import Database.Teacher;
import java.util.Date;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Terje
 */
@Stateless
public class ModuleSessionBean implements ModuleSessionBeanRemote {

    @PersistenceContext(unitName = "Slit-Server-ejbPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }
    
    @Override
    public void addModule(String moduleID, String modulename, String requierments, String teacherID, String description, String goals, Date deadline){
            
        try {
            
            Module module = new Module();
            
            module.setModuleID(moduleID);
            module.setModuleName(modulename);
            module.setRequierments(requierments);
            module.setTeacherID(em.find(Teacher.class, teacherID));
            module.setDescription(description);
            module.setGoals(goals);
            module.setDeadline(deadline);
            
            em.persist(module);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    @Override
    public ModuleDataModel getModel(String id){
    
        ModuleDataModel modulDataModel = new ModuleDataModel();
        
        try{
            
            Module module = em.find(Module.class, id);
            
            if(module != null){
                modulDataModel = this.convertModuleEntityToModuleDataModel(module);
            }
            
        }
        catch(Exception exception){
             
            exception.printStackTrace();
        }
        return modulDataModel;
    }
    
    
    public ModuleDataModel convertModuleEntityToModuleDataModel(Module modul){
    
        ModuleDataModel moduleDataModel = new ModuleDataModel();
        
        moduleDataModel.setDeadline(modul.getDeadline());
        moduleDataModel.setDescription(modul.getDescription());
        moduleDataModel.setGoals(modul.getGoals());
        moduleDataModel.setModuleID(modul.getModuleID());
        moduleDataModel.setModuleName(modul.getModuleName());
        moduleDataModel.setRequierments(modul.getRequierments());
        
        if(modul.getTeacherID() != null) {
            moduleDataModel.setTeacherID(modul.getTeacherID().getTeacherID());
        }
        
        return moduleDataModel;
    }

 

    
    
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
