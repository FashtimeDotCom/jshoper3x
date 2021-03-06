package com.jshop.entity;

// Generated 2014-1-20 20:32:27 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * GoodsTypeTN generated by hbm2java
 */
@Entity
@Table(name = "goods_type_t_n", catalog = "jshoper3")
public class GoodsTypeTN implements java.io.Serializable {

	private String goodsTypeId;
	private String name;
	private Date createtime;
	private String creatorid;
	private String goodsParameter;

	public GoodsTypeTN() {
	}

	public GoodsTypeTN(String goodsTypeId, String name, Date createtime,
			String creatorid) {
		this.goodsTypeId = goodsTypeId;
		this.name = name;
		this.createtime = createtime;
		this.creatorid = creatorid;
	}

	public GoodsTypeTN(String goodsTypeId, String name, Date createtime,
			String creatorid, String goodsParameter) {
		this.goodsTypeId = goodsTypeId;
		this.name = name;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.goodsParameter = goodsParameter;
	}

	@Id
	@Column(name = "GOODS_TYPE_ID", unique = true, nullable = false, length = 20)
	public String getGoodsTypeId() {
		return this.goodsTypeId;
	}

	public void setGoodsTypeId(String goodsTypeId) {
		this.goodsTypeId = goodsTypeId;
	}

	@Column(name = "NAME", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Column(name = "GOODS_PARAMETER", length = 65535)
	public String getGoodsParameter() {
		return this.goodsParameter;
	}

	public void setGoodsParameter(String goodsParameter) {
		this.goodsParameter = goodsParameter;
	}

}
