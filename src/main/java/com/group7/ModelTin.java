package com.group7;

import java.util.Set;
import javax.persistence.*;
@Entity
public class ModelTin {

		private Integer maTin;
		private String tieuDe;
		private String noiDung;
		
		
		public ModelTin() {
			super();
		}
		public ModelTin(String tieuDe, String noiDung) {
			super();
			this.tieuDe = tieuDe;
			this.noiDung = noiDung;
		}
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		public Integer getMaTin() {
			return maTin;
		}
		public void setMaTin(Integer maTin) {
			this.maTin = maTin;
		}
		public String getTieuDe() {
			return tieuDe;
		}
		public void setTieuDe(String tieuDe) {
			this.tieuDe = tieuDe;
		}
		public String getNoiDung() {
			return noiDung;
		}
		public void setNoiDung(String noiDung) {
			this.noiDung = noiDung;
		}
		
		
}
