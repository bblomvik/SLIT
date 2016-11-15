package Database;

import Database.Teacher;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-15T14:26:10")
@StaticMetamodel(Module.class)
public class Module_ { 

    public static volatile SingularAttribute<Module, Teacher> teacherID;
    public static volatile SingularAttribute<Module, String> requierments;
    public static volatile SingularAttribute<Module, String> moduleName;
    public static volatile SingularAttribute<Module, String> description;
    public static volatile SingularAttribute<Module, String> moduleID;
    public static volatile SingularAttribute<Module, Date> deadline;
    public static volatile SingularAttribute<Module, String> goals;

}