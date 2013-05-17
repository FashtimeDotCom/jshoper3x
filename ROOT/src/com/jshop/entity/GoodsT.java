package com.jshop.entity;

// Generated 2013-5-17 21:49:25 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * GoodsT generated by hbm2java
 */
@Entity
@Table(name = "goods_t", catalog = "jshoper3")
public class GoodsT implements java.io.Serializable {

	private String goodsid;
	private String goodsname;
	private String brandname;
	private String model;
	private String nname;
	private String lname;
	private String sname;
	private String fname;
	private String navid;
	private String ltypeid;
	private String stypeid;
	private Double price;
	private Double memberprice;
	private Double points;
	private String pictureurl;
	private int quantity;
	private String salestate;
	private String detail;
	private String unitname;
	private String keywordname;
	private String weight;
	private Integer readcount;
	private String relatedproductid;
	private String recommended;
	private String hotsale;
	private String bargainprice;
	private Integer sort;
	private Date createtime;
	private String creatorid;
	private Integer replycount;
	private String brandid;
	private String placeStore;
	private String metaKeywords;
	private String metaDescription;
	private Double cost;
	private double saleprice;
	private String isNew;
	private String htmlPath;
	private String productSn;
	private String goodsParameterValue;
	private Integer freezeStore;
	private String keywordid;
	private String unitnameid;
	private String goodsTypeId;
	private String goodsTypeName;
	private String goodsAttrVal1;
	private String goodsAttrVal2;
	private String goodsAttrVal3;
	private String goodsAttrVal4;
	private String goodsAttrVal5;
	private String goodsAttrVal6;
	private String goodsAttrVal7;
	private String goodsAttrVal8;
	private String goodsAttrVal9;
	private String goodsAttrVal10;
	private String goodsAttrVal11;
	private String goodsAttrVal12;
	private String goodsAttrVal13;
	private String goodsAttrVal14;
	private String goodsAttrVal15;
	private String goodsAttrVal16;
	private String goodsAttrVal17;
	private String goodsAttrVal18;
	private String goodsAttrVal19;
	private String goodsAttrVal20;
	private String goodsAttrVal21;
	private String goodsAttrVal22;
	private String goodsAttrVal23;
	private String goodsAttrVal24;
	private String goodsAttrVal25;
	private String goodsAttrVal26;
	private String goodsAttrVal27;
	private String goodsAttrVal28;
	private String goodsAttrVal29;
	private String goodsAttrVal0;
	private String usersetnum;
	private String isSpecificationsOpen;
	private Integer star;
	private Integer staruser;
	private Integer totalcomment;
	private Integer virtualsale;
	private String ismobileplatformgoods;
	private Integer sales;
	private Integer realsales;
	private Date updatetime;
	private int versiont;
	private String commoditylist;
	private String isvirtual;
	private String virtualresults;

	public GoodsT() {
	}

	public GoodsT(String goodsid, String goodsname, String brandname,
			String nname, String lname, String navid, String ltypeid,
			String pictureurl, int quantity, String detail, String recommended,
			Date createtime, String creatorid, double saleprice,
			Date updatetime, int versiont, String commoditylist,
			String isvirtual, String virtualresults) {
		this.goodsid = goodsid;
		this.goodsname = goodsname;
		this.brandname = brandname;
		this.nname = nname;
		this.lname = lname;
		this.navid = navid;
		this.ltypeid = ltypeid;
		this.pictureurl = pictureurl;
		this.quantity = quantity;
		this.detail = detail;
		this.recommended = recommended;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.saleprice = saleprice;
		this.updatetime = updatetime;
		this.versiont = versiont;
		this.commoditylist = commoditylist;
		this.isvirtual = isvirtual;
		this.virtualresults = virtualresults;
	}

	public GoodsT(String goodsid, String goodsname, String brandname,
			String model, String nname, String lname, String sname,
			String fname, String navid, String ltypeid, String stypeid,
			Double price, Double memberprice, Double points, String pictureurl,
			int quantity, String salestate, String detail, String unitname,
			String keywordname, String weight, Integer readcount,
			String relatedproductid, String recommended, String hotsale,
			String bargainprice, Integer sort, Date createtime,
			String creatorid, Integer replycount, String brandid,
			String placeStore, String metaKeywords, String metaDescription,
			Double cost, double saleprice, String isNew, String htmlPath,
			String productSn, String goodsParameterValue, Integer freezeStore,
			String keywordid, String unitnameid, String goodsTypeId,
			String goodsTypeName, String goodsAttrVal1, String goodsAttrVal2,
			String goodsAttrVal3, String goodsAttrVal4, String goodsAttrVal5,
			String goodsAttrVal6, String goodsAttrVal7, String goodsAttrVal8,
			String goodsAttrVal9, String goodsAttrVal10, String goodsAttrVal11,
			String goodsAttrVal12, String goodsAttrVal13,
			String goodsAttrVal14, String goodsAttrVal15,
			String goodsAttrVal16, String goodsAttrVal17,
			String goodsAttrVal18, String goodsAttrVal19,
			String goodsAttrVal20, String goodsAttrVal21,
			String goodsAttrVal22, String goodsAttrVal23,
			String goodsAttrVal24, String goodsAttrVal25,
			String goodsAttrVal26, String goodsAttrVal27,
			String goodsAttrVal28, String goodsAttrVal29, String goodsAttrVal0,
			String usersetnum, String isSpecificationsOpen, Integer star,
			Integer staruser, Integer totalcomment, Integer virtualsale,
			String ismobileplatformgoods, Integer sales, Integer realsales,
			Date updatetime, int versiont, String commoditylist,
			String isvirtual, String virtualresults) {
		this.goodsid = goodsid;
		this.goodsname = goodsname;
		this.brandname = brandname;
		this.model = model;
		this.nname = nname;
		this.lname = lname;
		this.sname = sname;
		this.fname = fname;
		this.navid = navid;
		this.ltypeid = ltypeid;
		this.stypeid = stypeid;
		this.price = price;
		this.memberprice = memberprice;
		this.points = points;
		this.pictureurl = pictureurl;
		this.quantity = quantity;
		this.salestate = salestate;
		this.detail = detail;
		this.unitname = unitname;
		this.keywordname = keywordname;
		this.weight = weight;
		this.readcount = readcount;
		this.relatedproductid = relatedproductid;
		this.recommended = recommended;
		this.hotsale = hotsale;
		this.bargainprice = bargainprice;
		this.sort = sort;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.replycount = replycount;
		this.brandid = brandid;
		this.placeStore = placeStore;
		this.metaKeywords = metaKeywords;
		this.metaDescription = metaDescription;
		this.cost = cost;
		this.saleprice = saleprice;
		this.isNew = isNew;
		this.htmlPath = htmlPath;
		this.productSn = productSn;
		this.goodsParameterValue = goodsParameterValue;
		this.freezeStore = freezeStore;
		this.keywordid = keywordid;
		this.unitnameid = unitnameid;
		this.goodsTypeId = goodsTypeId;
		this.goodsTypeName = goodsTypeName;
		this.goodsAttrVal1 = goodsAttrVal1;
		this.goodsAttrVal2 = goodsAttrVal2;
		this.goodsAttrVal3 = goodsAttrVal3;
		this.goodsAttrVal4 = goodsAttrVal4;
		this.goodsAttrVal5 = goodsAttrVal5;
		this.goodsAttrVal6 = goodsAttrVal6;
		this.goodsAttrVal7 = goodsAttrVal7;
		this.goodsAttrVal8 = goodsAttrVal8;
		this.goodsAttrVal9 = goodsAttrVal9;
		this.goodsAttrVal10 = goodsAttrVal10;
		this.goodsAttrVal11 = goodsAttrVal11;
		this.goodsAttrVal12 = goodsAttrVal12;
		this.goodsAttrVal13 = goodsAttrVal13;
		this.goodsAttrVal14 = goodsAttrVal14;
		this.goodsAttrVal15 = goodsAttrVal15;
		this.goodsAttrVal16 = goodsAttrVal16;
		this.goodsAttrVal17 = goodsAttrVal17;
		this.goodsAttrVal18 = goodsAttrVal18;
		this.goodsAttrVal19 = goodsAttrVal19;
		this.goodsAttrVal20 = goodsAttrVal20;
		this.goodsAttrVal21 = goodsAttrVal21;
		this.goodsAttrVal22 = goodsAttrVal22;
		this.goodsAttrVal23 = goodsAttrVal23;
		this.goodsAttrVal24 = goodsAttrVal24;
		this.goodsAttrVal25 = goodsAttrVal25;
		this.goodsAttrVal26 = goodsAttrVal26;
		this.goodsAttrVal27 = goodsAttrVal27;
		this.goodsAttrVal28 = goodsAttrVal28;
		this.goodsAttrVal29 = goodsAttrVal29;
		this.goodsAttrVal0 = goodsAttrVal0;
		this.usersetnum = usersetnum;
		this.isSpecificationsOpen = isSpecificationsOpen;
		this.star = star;
		this.staruser = staruser;
		this.totalcomment = totalcomment;
		this.virtualsale = virtualsale;
		this.ismobileplatformgoods = ismobileplatformgoods;
		this.sales = sales;
		this.realsales = realsales;
		this.updatetime = updatetime;
		this.versiont = versiont;
		this.commoditylist = commoditylist;
		this.isvirtual = isvirtual;
		this.virtualresults = virtualresults;
	}

	@Id
	@Column(name = "GOODSID", unique = true, nullable = false, length = 20)
	public String getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}

	@Column(name = "GOODSNAME", nullable = false, length = 100)
	public String getGoodsname() {
		return this.goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	@Column(name = "BRANDNAME", nullable = false, length = 50)
	public String getBrandname() {
		return this.brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	@Column(name = "MODEL", length = 50)
	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Column(name = "NNAME", nullable = false, length = 50)
	public String getNname() {
		return this.nname;
	}

	public void setNname(String nname) {
		this.nname = nname;
	}

	@Column(name = "LNAME", nullable = false, length = 50)
	public String getLname() {
		return this.lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Column(name = "SNAME", length = 50)
	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Column(name = "FNAME", length = 50)
	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	@Column(name = "NAVID", nullable = false, length = 20)
	public String getNavid() {
		return this.navid;
	}

	public void setNavid(String navid) {
		this.navid = navid;
	}

	@Column(name = "LTYPEID", nullable = false, length = 20)
	public String getLtypeid() {
		return this.ltypeid;
	}

	public void setLtypeid(String ltypeid) {
		this.ltypeid = ltypeid;
	}

	@Column(name = "STYPEID", length = 20)
	public String getStypeid() {
		return this.stypeid;
	}

	public void setStypeid(String stypeid) {
		this.stypeid = stypeid;
	}

	@Column(name = "PRICE", precision = 22, scale = 0)
	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Column(name = "MEMBERPRICE", precision = 22, scale = 0)
	public Double getMemberprice() {
		return this.memberprice;
	}

	public void setMemberprice(Double memberprice) {
		this.memberprice = memberprice;
	}

	@Column(name = "POINTS", precision = 22, scale = 0)
	public Double getPoints() {
		return this.points;
	}

	public void setPoints(Double points) {
		this.points = points;
	}

	@Column(name = "PICTUREURL", nullable = false, length = 2000)
	public String getPictureurl() {
		return this.pictureurl;
	}

	public void setPictureurl(String pictureurl) {
		this.pictureurl = pictureurl;
	}

	@Column(name = "QUANTITY", nullable = false)
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Column(name = "SALESTATE", length = 1)
	public String getSalestate() {
		return this.salestate;
	}

	public void setSalestate(String salestate) {
		this.salestate = salestate;
	}

	@Column(name = "DETAIL", nullable = false)
	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Column(name = "UNITNAME", length = 45)
	public String getUnitname() {
		return this.unitname;
	}

	public void setUnitname(String unitname) {
		this.unitname = unitname;
	}

	@Column(name = "KEYWORDNAME", length = 45)
	public String getKeywordname() {
		return this.keywordname;
	}

	public void setKeywordname(String keywordname) {
		this.keywordname = keywordname;
	}

	@Column(name = "WEIGHT", length = 20)
	public String getWeight() {
		return this.weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	@Column(name = "READCOUNT")
	public Integer getReadcount() {
		return this.readcount;
	}

	public void setReadcount(Integer readcount) {
		this.readcount = readcount;
	}

	@Column(name = "RELATEDPRODUCTID", length = 500)
	public String getRelatedproductid() {
		return this.relatedproductid;
	}

	public void setRelatedproductid(String relatedproductid) {
		this.relatedproductid = relatedproductid;
	}

	@Column(name = "RECOMMENDED", nullable = false, length = 1)
	public String getRecommended() {
		return this.recommended;
	}

	public void setRecommended(String recommended) {
		this.recommended = recommended;
	}

	@Column(name = "HOTSALE", length = 1)
	public String getHotsale() {
		return this.hotsale;
	}

	public void setHotsale(String hotsale) {
		this.hotsale = hotsale;
	}

	@Column(name = "BARGAINPRICE", length = 1)
	public String getBargainprice() {
		return this.bargainprice;
	}

	public void setBargainprice(String bargainprice) {
		this.bargainprice = bargainprice;
	}

	@Column(name = "SORT")
	public Integer getSort() {
		return this.sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "CREATORID", nullable = false, length = 20)
	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	@Column(name = "REPLYCOUNT")
	public Integer getReplycount() {
		return this.replycount;
	}

	public void setReplycount(Integer replycount) {
		this.replycount = replycount;
	}

	@Column(name = "BRANDID", length = 20)
	public String getBrandid() {
		return this.brandid;
	}

	public void setBrandid(String brandid) {
		this.brandid = brandid;
	}

	@Column(name = "PLACE_STORE", length = 100)
	public String getPlaceStore() {
		return this.placeStore;
	}

	public void setPlaceStore(String placeStore) {
		this.placeStore = placeStore;
	}

	@Column(name = "META_KEYWORDS")
	public String getMetaKeywords() {
		return this.metaKeywords;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	@Column(name = "META_DESCRIPTION")
	public String getMetaDescription() {
		return this.metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	@Column(name = "COST", precision = 22, scale = 0)
	public Double getCost() {
		return this.cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	@Column(name = "SALEPRICE", nullable = false, precision = 22, scale = 0)
	public double getSaleprice() {
		return this.saleprice;
	}

	public void setSaleprice(double saleprice) {
		this.saleprice = saleprice;
	}

	@Column(name = "IS_NEW", length = 1)
	public String getIsNew() {
		return this.isNew;
	}

	public void setIsNew(String isNew) {
		this.isNew = isNew;
	}

	@Column(name = "HTML_PATH")
	public String getHtmlPath() {
		return this.htmlPath;
	}

	public void setHtmlPath(String htmlPath) {
		this.htmlPath = htmlPath;
	}

	@Column(name = "PRODUCT_SN", length = 45)
	public String getProductSn() {
		return this.productSn;
	}

	public void setProductSn(String productSn) {
		this.productSn = productSn;
	}

	@Column(name = "GOODS_PARAMETER_VALUE", length = 5000)
	public String getGoodsParameterValue() {
		return this.goodsParameterValue;
	}

	public void setGoodsParameterValue(String goodsParameterValue) {
		this.goodsParameterValue = goodsParameterValue;
	}

	@Column(name = "FREEZE_STORE")
	public Integer getFreezeStore() {
		return this.freezeStore;
	}

	public void setFreezeStore(Integer freezeStore) {
		this.freezeStore = freezeStore;
	}

	@Column(name = "KEYWORDID", length = 20)
	public String getKeywordid() {
		return this.keywordid;
	}

	public void setKeywordid(String keywordid) {
		this.keywordid = keywordid;
	}

	@Column(name = "UNITNAMEID", length = 20)
	public String getUnitnameid() {
		return this.unitnameid;
	}

	public void setUnitnameid(String unitnameid) {
		this.unitnameid = unitnameid;
	}

	@Column(name = "GOODS_TYPE_ID", length = 20)
	public String getGoodsTypeId() {
		return this.goodsTypeId;
	}

	public void setGoodsTypeId(String goodsTypeId) {
		this.goodsTypeId = goodsTypeId;
	}

	@Column(name = "GOODS_TYPE_NAME", length = 45)
	public String getGoodsTypeName() {
		return this.goodsTypeName;
	}

	public void setGoodsTypeName(String goodsTypeName) {
		this.goodsTypeName = goodsTypeName;
	}

	@Column(name = "GOODS_ATTR_VAL1", length = 45)
	public String getGoodsAttrVal1() {
		return this.goodsAttrVal1;
	}

	public void setGoodsAttrVal1(String goodsAttrVal1) {
		this.goodsAttrVal1 = goodsAttrVal1;
	}

	@Column(name = "GOODS_ATTR_VAL2", length = 45)
	public String getGoodsAttrVal2() {
		return this.goodsAttrVal2;
	}

	public void setGoodsAttrVal2(String goodsAttrVal2) {
		this.goodsAttrVal2 = goodsAttrVal2;
	}

	@Column(name = "GOODS_ATTR_VAL3", length = 45)
	public String getGoodsAttrVal3() {
		return this.goodsAttrVal3;
	}

	public void setGoodsAttrVal3(String goodsAttrVal3) {
		this.goodsAttrVal3 = goodsAttrVal3;
	}

	@Column(name = "GOODS_ATTR_VAL4", length = 45)
	public String getGoodsAttrVal4() {
		return this.goodsAttrVal4;
	}

	public void setGoodsAttrVal4(String goodsAttrVal4) {
		this.goodsAttrVal4 = goodsAttrVal4;
	}

	@Column(name = "GOODS_ATTR_VAL5", length = 45)
	public String getGoodsAttrVal5() {
		return this.goodsAttrVal5;
	}

	public void setGoodsAttrVal5(String goodsAttrVal5) {
		this.goodsAttrVal5 = goodsAttrVal5;
	}

	@Column(name = "GOODS_ATTR_VAL6", length = 45)
	public String getGoodsAttrVal6() {
		return this.goodsAttrVal6;
	}

	public void setGoodsAttrVal6(String goodsAttrVal6) {
		this.goodsAttrVal6 = goodsAttrVal6;
	}

	@Column(name = "GOODS_ATTR_VAL7", length = 45)
	public String getGoodsAttrVal7() {
		return this.goodsAttrVal7;
	}

	public void setGoodsAttrVal7(String goodsAttrVal7) {
		this.goodsAttrVal7 = goodsAttrVal7;
	}

	@Column(name = "GOODS_ATTR_VAL8", length = 45)
	public String getGoodsAttrVal8() {
		return this.goodsAttrVal8;
	}

	public void setGoodsAttrVal8(String goodsAttrVal8) {
		this.goodsAttrVal8 = goodsAttrVal8;
	}

	@Column(name = "GOODS_ATTR_VAL9", length = 45)
	public String getGoodsAttrVal9() {
		return this.goodsAttrVal9;
	}

	public void setGoodsAttrVal9(String goodsAttrVal9) {
		this.goodsAttrVal9 = goodsAttrVal9;
	}

	@Column(name = "GOODS_ATTR_VAL10", length = 45)
	public String getGoodsAttrVal10() {
		return this.goodsAttrVal10;
	}

	public void setGoodsAttrVal10(String goodsAttrVal10) {
		this.goodsAttrVal10 = goodsAttrVal10;
	}

	@Column(name = "GOODS_ATTR_VAL11", length = 45)
	public String getGoodsAttrVal11() {
		return this.goodsAttrVal11;
	}

	public void setGoodsAttrVal11(String goodsAttrVal11) {
		this.goodsAttrVal11 = goodsAttrVal11;
	}

	@Column(name = "GOODS_ATTR_VAL12", length = 45)
	public String getGoodsAttrVal12() {
		return this.goodsAttrVal12;
	}

	public void setGoodsAttrVal12(String goodsAttrVal12) {
		this.goodsAttrVal12 = goodsAttrVal12;
	}

	@Column(name = "GOODS_ATTR_VAL13", length = 45)
	public String getGoodsAttrVal13() {
		return this.goodsAttrVal13;
	}

	public void setGoodsAttrVal13(String goodsAttrVal13) {
		this.goodsAttrVal13 = goodsAttrVal13;
	}

	@Column(name = "GOODS_ATTR_VAL14", length = 45)
	public String getGoodsAttrVal14() {
		return this.goodsAttrVal14;
	}

	public void setGoodsAttrVal14(String goodsAttrVal14) {
		this.goodsAttrVal14 = goodsAttrVal14;
	}

	@Column(name = "GOODS_ATTR_VAL15", length = 45)
	public String getGoodsAttrVal15() {
		return this.goodsAttrVal15;
	}

	public void setGoodsAttrVal15(String goodsAttrVal15) {
		this.goodsAttrVal15 = goodsAttrVal15;
	}

	@Column(name = "GOODS_ATTR_VAL16", length = 45)
	public String getGoodsAttrVal16() {
		return this.goodsAttrVal16;
	}

	public void setGoodsAttrVal16(String goodsAttrVal16) {
		this.goodsAttrVal16 = goodsAttrVal16;
	}

	@Column(name = "GOODS_ATTR_VAL17", length = 45)
	public String getGoodsAttrVal17() {
		return this.goodsAttrVal17;
	}

	public void setGoodsAttrVal17(String goodsAttrVal17) {
		this.goodsAttrVal17 = goodsAttrVal17;
	}

	@Column(name = "GOODS_ATTR_VAL18", length = 45)
	public String getGoodsAttrVal18() {
		return this.goodsAttrVal18;
	}

	public void setGoodsAttrVal18(String goodsAttrVal18) {
		this.goodsAttrVal18 = goodsAttrVal18;
	}

	@Column(name = "GOODS_ATTR_VAL19", length = 45)
	public String getGoodsAttrVal19() {
		return this.goodsAttrVal19;
	}

	public void setGoodsAttrVal19(String goodsAttrVal19) {
		this.goodsAttrVal19 = goodsAttrVal19;
	}

	@Column(name = "GOODS_ATTR_VAL20", length = 45)
	public String getGoodsAttrVal20() {
		return this.goodsAttrVal20;
	}

	public void setGoodsAttrVal20(String goodsAttrVal20) {
		this.goodsAttrVal20 = goodsAttrVal20;
	}

	@Column(name = "GOODS_ATTR_VAL21", length = 45)
	public String getGoodsAttrVal21() {
		return this.goodsAttrVal21;
	}

	public void setGoodsAttrVal21(String goodsAttrVal21) {
		this.goodsAttrVal21 = goodsAttrVal21;
	}

	@Column(name = "GOODS_ATTR_VAL22", length = 45)
	public String getGoodsAttrVal22() {
		return this.goodsAttrVal22;
	}

	public void setGoodsAttrVal22(String goodsAttrVal22) {
		this.goodsAttrVal22 = goodsAttrVal22;
	}

	@Column(name = "GOODS_ATTR_VAL23", length = 45)
	public String getGoodsAttrVal23() {
		return this.goodsAttrVal23;
	}

	public void setGoodsAttrVal23(String goodsAttrVal23) {
		this.goodsAttrVal23 = goodsAttrVal23;
	}

	@Column(name = "GOODS_ATTR_VAL24", length = 45)
	public String getGoodsAttrVal24() {
		return this.goodsAttrVal24;
	}

	public void setGoodsAttrVal24(String goodsAttrVal24) {
		this.goodsAttrVal24 = goodsAttrVal24;
	}

	@Column(name = "GOODS_ATTR_VAL25", length = 45)
	public String getGoodsAttrVal25() {
		return this.goodsAttrVal25;
	}

	public void setGoodsAttrVal25(String goodsAttrVal25) {
		this.goodsAttrVal25 = goodsAttrVal25;
	}

	@Column(name = "GOODS_ATTR_VAL26", length = 45)
	public String getGoodsAttrVal26() {
		return this.goodsAttrVal26;
	}

	public void setGoodsAttrVal26(String goodsAttrVal26) {
		this.goodsAttrVal26 = goodsAttrVal26;
	}

	@Column(name = "GOODS_ATTR_VAL27", length = 45)
	public String getGoodsAttrVal27() {
		return this.goodsAttrVal27;
	}

	public void setGoodsAttrVal27(String goodsAttrVal27) {
		this.goodsAttrVal27 = goodsAttrVal27;
	}

	@Column(name = "GOODS_ATTR_VAL28", length = 45)
	public String getGoodsAttrVal28() {
		return this.goodsAttrVal28;
	}

	public void setGoodsAttrVal28(String goodsAttrVal28) {
		this.goodsAttrVal28 = goodsAttrVal28;
	}

	@Column(name = "GOODS_ATTR_VAL29", length = 45)
	public String getGoodsAttrVal29() {
		return this.goodsAttrVal29;
	}

	public void setGoodsAttrVal29(String goodsAttrVal29) {
		this.goodsAttrVal29 = goodsAttrVal29;
	}

	@Column(name = "GOODS_ATTR_VAL0", length = 45)
	public String getGoodsAttrVal0() {
		return this.goodsAttrVal0;
	}

	public void setGoodsAttrVal0(String goodsAttrVal0) {
		this.goodsAttrVal0 = goodsAttrVal0;
	}

	@Column(name = "USERSETNUM", length = 45)
	public String getUsersetnum() {
		return this.usersetnum;
	}

	public void setUsersetnum(String usersetnum) {
		this.usersetnum = usersetnum;
	}

	@Column(name = "IS_SPECIFICATIONS_OPEN", length = 1)
	public String getIsSpecificationsOpen() {
		return this.isSpecificationsOpen;
	}

	public void setIsSpecificationsOpen(String isSpecificationsOpen) {
		this.isSpecificationsOpen = isSpecificationsOpen;
	}

	@Column(name = "STAR")
	public Integer getStar() {
		return this.star;
	}

	public void setStar(Integer star) {
		this.star = star;
	}

	@Column(name = "STARUSER")
	public Integer getStaruser() {
		return this.staruser;
	}

	public void setStaruser(Integer staruser) {
		this.staruser = staruser;
	}

	@Column(name = "TOTALCOMMENT")
	public Integer getTotalcomment() {
		return this.totalcomment;
	}

	public void setTotalcomment(Integer totalcomment) {
		this.totalcomment = totalcomment;
	}

	@Column(name = "VIRTUALSALE")
	public Integer getVirtualsale() {
		return this.virtualsale;
	}

	public void setVirtualsale(Integer virtualsale) {
		this.virtualsale = virtualsale;
	}

	@Column(name = "ISMOBILEPLATFORMGOODS", length = 1)
	public String getIsmobileplatformgoods() {
		return this.ismobileplatformgoods;
	}

	public void setIsmobileplatformgoods(String ismobileplatformgoods) {
		this.ismobileplatformgoods = ismobileplatformgoods;
	}

	@Column(name = "SALES")
	public Integer getSales() {
		return this.sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}

	@Column(name = "REALSALES")
	public Integer getRealsales() {
		return this.realsales;
	}

	public void setRealsales(Integer realsales) {
		this.realsales = realsales;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", nullable = false, length = 0)
	public Date getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	@Column(name = "VERSIONT", nullable = false)
	public int getVersiont() {
		return this.versiont;
	}

	public void setVersiont(int versiont) {
		this.versiont = versiont;
	}

	@Column(name = "COMMODITYLIST", nullable = false, length = 1000)
	public String getCommoditylist() {
		return this.commoditylist;
	}

	public void setCommoditylist(String commoditylist) {
		this.commoditylist = commoditylist;
	}

	@Column(name = "ISVIRTUAL", nullable = false, length = 1)
	public String getIsvirtual() {
		return this.isvirtual;
	}

	public void setIsvirtual(String isvirtual) {
		this.isvirtual = isvirtual;
	}

	@Column(name = "VIRTUALRESULTS", nullable = false, length = 1000)
	public String getVirtualresults() {
		return this.virtualresults;
	}

	public void setVirtualresults(String virtualresults) {
		this.virtualresults = virtualresults;
	}

}