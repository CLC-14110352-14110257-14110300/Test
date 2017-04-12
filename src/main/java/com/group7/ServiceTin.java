package com.group7;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ServiceTin {

	@Autowired
	DaoTin service;
	
	public List<ModelTin> lietKe(){
		return service.findAll();
	}
	
	// Them Tin
		public void them(ModelTin t){
			service.save(t);
		}
		//Xoa Tin
		public void xoa(Integer maTin){
			service.delete(maTin);
		}
		
		//tim 1 Tin
		public ModelTin findOne(Integer maTin){
			return service.findOne(maTin);
		}
		// Sua Tin
		public void sua(ModelTin t){
			ModelTin t1 = findOne(t.getMaTin());
			t1.setTieuDe(t.getTieuDe());
			t1.setNoiDung(t.getNoiDung());
			service.save(t);
		}
}
