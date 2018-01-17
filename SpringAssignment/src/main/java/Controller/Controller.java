package Controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.servlet.ModelAndView;

import com.assignment.Employee;
import com.assignment.JDBCTemplateDao;

  

@Controller  
public class Controller {  
    @Autowired  
    public JDBCTemplateDao dao;  

    @RequestMapping("/")  
    public ModelAndView initPage(){  
        return new ModelAndView("webUI");  
    }

    @RequestMapping("/empForm")  
    public ModelAndView showform(){  
        return new ModelAndView("empForm","command",new Employee());  
    }  

 
    @RequestMapping("/viewemp")  
    public ModelAndView viewemp(){  
        List<Employee> list=dao.getAllEmployeesRowMapper();  
        return new ModelAndView("viewemp","list",list);  
    }
    @RequestMapping("/view5emp")  
    public ModelAndView view5emp(){  
        ArrayList<Employee> list=new ArrayList();
        list.add(dao.get5thEmployeebyAge());
        System.out.println(list.get(0));
        return new ModelAndView("viewemp","list",list);  
    }

}
