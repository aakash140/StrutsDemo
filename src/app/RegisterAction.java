package app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class RegisterAction extends Action {
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		RegisterForm registerForm=(RegisterForm)form;
		
		if(registerForm.getUserName().equalsIgnoreCase("Aakash"))
			if(registerForm.getPass1().equals(registerForm.getPass2()) && !registerForm.pass1.equals(""))
				return mapping.findForward("Success");
			else
				return mapping.findForward("Failure");
		
		else
			return mapping.findForward("Failure");
	}

}