package application.model;
import javafx.beans.property.SimpleStringProperty;

public class Patient {
	private SimpleStringProperty Name;
	private SimpleStringProperty Phonenum;
	private SimpleStringProperty Ready;
	private SimpleStringProperty Address;
	private SimpleStringProperty DoctorName;
	private SimpleStringProperty Appttime;
	
	public Patient() {
	}
	public Patient(String Name, String Phonenum, String Ready, String DoctorName, String Address, String Appttime) {
		this.Name= new SimpleStringProperty(Name);
		this.Phonenum= new SimpleStringProperty(Phonenum);
		this.Ready=new SimpleStringProperty(Ready);
		this.Address=new SimpleStringProperty(Address);
		this.DoctorName=new SimpleStringProperty(DoctorName);
		this.Appttime=new SimpleStringProperty(Appttime);
	}
	
	public String getName() {
		return Name.get();
	}
	public void setName(String Name) {
		this.Name=new SimpleStringProperty(Name);
	}
	public String getPhonenum() {
		return Phonenum.get();
	}
	public void setPhonenum(String Phonenum) {
		this.Phonenum=new SimpleStringProperty(Phonenum);
	}
	public String getReady() {
		return Ready.get();
	}
	public void setReady(String Ready) {
		this.Ready=new SimpleStringProperty(Ready);
	}
	public String getAddress() {
		return Address.get();
	}
	public void setAddress(String Address) {
		this.Address=new SimpleStringProperty(Address);
	}
	public String getDoctorName() {
		return DoctorName.get();
	}
	public void setDoctorName(String DoctorName) {
		this.DoctorName=new SimpleStringProperty(DoctorName);
	}
	public String getAppttime() {
		return Appttime.get();
	}
	public void setAppttime(String Appttime) {
		this.Appttime=new SimpleStringProperty(Appttime);
	}
	
	
}
