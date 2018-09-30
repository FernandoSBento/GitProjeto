package util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import dao.DAOGenerico;
import entidades.Empregado;



@FacesConverter("conveterEmpregado")
public class ConverterEmpregado implements Converter{

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String id) {
		// TODO Auto-generated method stub
		if(id != null && id.trim().length()>0) {
			DAOGenerico<Empregado> dao = new DAOGenerico<Empregado>(Empregado.class);
			Empregado func = dao.buscarPorId(Long.parseLong(id));
			return func;
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object object) {
		// TODO Auto-generated method stub
		if(object != null) {
			Empregado Empregado = (Empregado) object;
			return String.valueOf(Empregado.getId());
		}
		return null;
	}
}
