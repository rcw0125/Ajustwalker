package com.xgmes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import org.apache.ibatis.type.Alias;
import com.talent.core.model.BaseModel;

@Alias("interfaceinfo")
@Entity
@Table(name="L_INTERFACEINFO_T",uniqueConstraints={@UniqueConstraint(columnNames={"planid"})})
public class InterfaceInfo extends BaseModel{
	
	private static final long serialVersionUID = -6474821348148140244L;

	private String planid = "";
	
	private String materialcode = "";
	
	private String materialname = "";
	
	private String lotnumber = "";
	
	private String materialsize = "";
	
	private String productline = "";
	
	private String sourcecode = "";
	
	private String sourcename = "";
	
	private String sourceplace = "";
	
	private String sourceoperaname = "";
	
	private String targetcode = "";
	
	private String targetname = "";
	
	private String targetplace = "";
	
	@Column(nullable=false,columnDefinition="number default 0")
	private long planmaterialcount = 0;
	
	@Column(nullable=false,columnDefinition="number(18,3) default 0")
	private double planweight = 0.000;
	
	@Column(nullable=false,columnDefinition="number(18,3) default 0")
	private double price = 0.000;
	
	@Column(nullable=false,columnDefinition="number(18,3) default 0")
	private double ovweitghtmin = 0.000;
	
	@Column(nullable=false,columnDefinition="number(18,3) default 0")
	private double ovweitghtmax = 0.000;
	
	@Column(nullable=false,columnDefinition="number(18,3) default 0")
	private double grossb = 0.000;
	
	@Column(nullable=false,columnDefinition="number(18,3) default 0")
	private double tareb = 0.000;
	
	@Column(nullable=false,columnDefinition="number(18,3) default 0")
	private double suttleb = 0.000;
	
	private String finishoperaname = "";
	
	private String finishdate = null;
	
	private String updatedate = null;
	
	private String validflagoperaname = "";
	
	private String validflagtime = null;
	
	private String ship = "";
	
	@Column(nullable=false,columnDefinition="number default 0")
	private long uploadflag = 0;
	
	private String orderno = "";
	
	private String ordernoid = "";
	
	private String sourceplacecode = "";
	
	private String shipcode = "";
	
	@Column(nullable=false,columnDefinition="number default 0")
	private long snumber = 0;
	
	@Column(nullable=false,columnDefinition="number(18,3) default 0")
	private double suttleapp = 0.000;
	
	private String saleitemid = "";
	
	@Column(nullable=false,columnDefinition="number default 0")
	private long issample = 0;
	
	private String middlemancode = "";
	
	private String middlemanname = "";
	
	private String taskcode = "";
	
	private String updateoperaname = "";
	
	private String prodline = "";
	
	private String prodlinename = "";
	
	private String prodclass = "";
	
	private String prodclassname = "";
	
	private String pickupyn = "";
	
	private String weighyn = "";
	
	private String materialspec = "";
	
	private String ifilepath = "";
	
	@Column(nullable=false,columnDefinition="number default 0")
	private int typeflag = 1;
	
	public String getPlanid() {
		return planid;
	}

	public void setPlanid(String planid) {
		this.planid = planid;
	}

	public String getMaterialcode() {
		return materialcode;
	}

	public void setMaterialcode(String materialcode) {
		this.materialcode = materialcode;
	}

	public String getMaterialname() {
		return materialname;
	}

	public void setMaterialname(String materialname) {
		this.materialname = materialname;
	}

	public String getLotnumber() {
		return lotnumber;
	}

	public void setLotnumber(String lotnumber) {
		this.lotnumber = lotnumber;
	}

	public String getMaterialsize() {
		return materialsize;
	}

	public void setMaterialsize(String materialsize) {
		this.materialsize = materialsize;
	}

	public String getProductline() {
		return productline;
	}

	public void setProductline(String productline) {
		this.productline = productline;
	}

	public String getSourcecode() {
		return sourcecode;
	}

	public void setSourcecode(String sourcecode) {
		this.sourcecode = sourcecode;
	}

	public String getSourcename() {
		return sourcename;
	}

	public void setSourcename(String sourcename) {
		this.sourcename = sourcename;
	}

	public String getSourceplace() {
		return sourceplace;
	}

	public void setSourceplace(String sourceplace) {
		this.sourceplace = sourceplace;
	}

	public String getSourceoperaname() {
		return sourceoperaname;
	}

	public void setSourceoperaname(String sourceoperaname) {
		this.sourceoperaname = sourceoperaname;
	}

	public String getTargetcode() {
		return targetcode;
	}

	public void setTargetcode(String targetcode) {
		this.targetcode = targetcode;
	}

	public String getTargetname() {
		return targetname;
	}

	public void setTargetname(String targetname) {
		this.targetname = targetname;
	}

	public String getTargetplace() {
		return targetplace;
	}

	public void setTargetplace(String targetplace) {
		this.targetplace = targetplace;
	}

	public long getPlanmaterialcount() {
		return planmaterialcount;
	}

	public void setPlanmaterialcount(long planmaterialcount) {
		this.planmaterialcount = planmaterialcount;
	}

	public double getPlanweight() {
		return planweight;
	}

	public void setPlanweight(double planweight) {
		this.planweight = planweight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getOvweitghtmin() {
		return ovweitghtmin;
	}

	public void setOvweitghtmin(double ovweitghtmin) {
		this.ovweitghtmin = ovweitghtmin;
	}

	public double getOvweitghtmax() {
		return ovweitghtmax;
	}

	public void setOvweitghtmax(double ovweitghtmax) {
		this.ovweitghtmax = ovweitghtmax;
	}

	public double getGrossb() {
		return grossb;
	}

	public void setGrossb(double grossb) {
		this.grossb = grossb;
	}

	public double getTareb() {
		return tareb;
	}

	public void setTareb(double tareb) {
		this.tareb = tareb;
	}

	public double getSuttleb() {
		return suttleb;
	}

	public void setSuttleb(double suttleb) {
		this.suttleb = suttleb;
	}

	public String getFinishoperaname() {
		return finishoperaname;
	}

	public void setFinishoperaname(String finishoperaname) {
		this.finishoperaname = finishoperaname;
	}
	
	public String getValidflagoperaname() {
		return validflagoperaname;
	}

	public void setValidflagoperaname(String validflagoperaname) {
		this.validflagoperaname = validflagoperaname;
	}

	public String getFinishdate() {
		return finishdate;
	}

	public void setFinishdate(String finishdate) {
		this.finishdate = finishdate;
	}

	public String getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}

	public String getValidflagtime() {
		return validflagtime;
	}

	public void setValidflagtime(String validflagtime) {
		this.validflagtime = validflagtime;
	}

	public String getShip() {
		return ship;
	}

	public void setShip(String ship) {
		this.ship = ship;
	}

	public long getUploadflag() {
		return uploadflag;
	}

	public void setUploadflag(long uploadflag) {
		this.uploadflag = uploadflag;
	}

	public String getOrderno() {
		return orderno;
	}

	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}

	public String getOrdernoid() {
		return ordernoid;
	}

	public void setOrdernoid(String ordernoid) {
		this.ordernoid = ordernoid;
	}

	public String getSourceplacecode() {
		return sourceplacecode;
	}

	public void setSourceplacecode(String sourceplacecode) {
		this.sourceplacecode = sourceplacecode;
	}

	public String getShipcode() {
		return shipcode;
	}

	public void setShipcode(String shipcode) {
		this.shipcode = shipcode;
	}

	public long getSnumber() {
		return snumber;
	}

	public void setSnumber(long snumber) {
		this.snumber = snumber;
	}

	public double getSuttleapp() {
		return suttleapp;
	}

	public void setSuttleapp(double suttleapp) {
		this.suttleapp = suttleapp;
	}

	public String getSaleitemid() {
		return saleitemid;
	}

	public void setSaleitemid(String saleitemid) {
		this.saleitemid = saleitemid;
	}

	public long getIssample() {
		return issample;
	}

	public void setIssample(long issample) {
		this.issample = issample;
	}

	public String getMiddlemancode() {
		return middlemancode;
	}

	public void setMiddlemancode(String middlemancode) {
		this.middlemancode = middlemancode;
	}

	public String getMiddlemanname() {
		return middlemanname;
	}

	public void setMiddlemanname(String middlemanname) {
		this.middlemanname = middlemanname;
	}

	public String getTaskcode() {
		return taskcode;
	}

	public void setTaskcode(String taskcode) {
		this.taskcode = taskcode;
	}

	public String getUpdateoperaname() {
		return updateoperaname;
	}

	public void setUpdateoperaname(String updateoperaname) {
		this.updateoperaname = updateoperaname;
	}

	public String getProdline() {
		return prodline;
	}

	public void setProdline(String prodline) {
		this.prodline = prodline;
	}

	public String getProdlinename() {
		return prodlinename;
	}

	public void setProdlinename(String prodlinename) {
		this.prodlinename = prodlinename;
	}

	public String getProdclass() {
		return prodclass;
	}

	public void setProdclass(String prodclass) {
		this.prodclass = prodclass;
	}

	public String getProdclassname() {
		return prodclassname;
	}

	public void setProdclassname(String prodclassname) {
		this.prodclassname = prodclassname;
	}

	public String getPickupyn() {
		return pickupyn;
	}

	public void setPickupyn(String pickupyn) {
		this.pickupyn = pickupyn;
	}

	public String getWeighyn() {
		return weighyn;
	}

	public void setWeighyn(String weighyn) {
		this.weighyn = weighyn;
	}

	public String getMaterialspec() {
		return materialspec;
	}

	public void setMaterialspec(String materialspec) {
		this.materialspec = materialspec;
	}

	public String getIfilepath() {
		return ifilepath;
	}

	public void setIfilepath(String ifilepath) {
		this.ifilepath = ifilepath;
	}

	public int getTypeflag() {
		return typeflag;
	}

	public void setTypeflag(int typeflag) {
		this.typeflag = typeflag;
	}
}
