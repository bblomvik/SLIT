/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slit.base;

/**
 *
 * @author Mathias
 */
public class Module {
    
    private String moduleName;
    private String requirements;
    private String registeredBy;
    private String description;
    private String goals;

    public Module(String moduleName, String requirements, String registeredBy, String description, String goals) {
        this.moduleName = moduleName;
        this.requirements = requirements;
        this.registeredBy = registeredBy;
        this.description = description;
        this.goals = goals;
    }

    public String getModuleName() {
        return moduleName;
    }

    public String getRequirements() {
        return requirements;
    }

    public String getRegisteredBy() {
        return registeredBy;
    }

    public String getDescription() {
        return description;
    }

    public String getGoals() {
        return goals;
    }
    
    
    
    
    
    
}
