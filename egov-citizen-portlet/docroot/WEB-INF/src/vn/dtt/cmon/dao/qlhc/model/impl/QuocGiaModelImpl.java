/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package vn.dtt.cmon.dao.qlhc.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import vn.dtt.cmon.dao.qlhc.model.QuocGia;
import vn.dtt.cmon.dao.qlhc.model.QuocGiaModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the QuocGia service. Represents a row in the &quot;CMON_QUOCGIA&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.cmon.dao.qlhc.model.QuocGiaModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QuocGiaImpl}.
 * </p>
 *
 * @author LIEMNN
 * @see QuocGiaImpl
 * @see vn.dtt.cmon.dao.qlhc.model.QuocGia
 * @see vn.dtt.cmon.dao.qlhc.model.QuocGiaModel
 * @generated
 */
public class QuocGiaModelImpl extends BaseModelImpl<QuocGia>
	implements QuocGiaModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a quoc gia model instance should use the {@link vn.dtt.cmon.dao.qlhc.model.QuocGia} interface instead.
	 */
	public static final String TABLE_NAME = "CMON_QUOCGIA";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "MA", Types.VARCHAR },
			{ "TEN", Types.VARCHAR },
			{ "NGAYTAO", Types.TIMESTAMP },
			{ "NGAYSUA", Types.TIMESTAMP },
			{ "DAXOA", Types.INTEGER },
			{ "NGUOITAO", Types.VARCHAR },
			{ "NGUOISUA", Types.VARCHAR },
			{ "PHIENBAN", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table CMON_QUOCGIA (ID LONG not null primary key,MA VARCHAR(75) null,TEN VARCHAR(75) null,NGAYTAO DATE null,NGAYSUA DATE null,DAXOA INTEGER,NGUOITAO VARCHAR(75) null,NGUOISUA VARCHAR(75) null,PHIENBAN INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table CMON_QUOCGIA";
	public static final String ORDER_BY_JPQL = " ORDER BY quocGia.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY CMON_QUOCGIA.ID ASC";
	public static final String DATA_SOURCE = "egovDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.cmon.dao.qlhc.model.QuocGia"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.cmon.dao.qlhc.model.QuocGia"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.cmon.dao.qlhc.model.QuocGia"),
			true);
	public static long DAXOA_COLUMN_BITMASK = 1L;
	public static long MA_COLUMN_BITMASK = 2L;
	public static long TEN_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.cmon.dao.qlhc.model.QuocGia"));

	public QuocGiaModelImpl() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return QuocGia.class;
	}

	public String getModelClassName() {
		return QuocGia.class.getName();
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_columnBitmask = -1L;

		_id = id;
	}

	public String getMa() {
		if (_ma == null) {
			return StringPool.BLANK;
		}
		else {
			return _ma;
		}
	}

	public void setMa(String ma) {
		_columnBitmask |= MA_COLUMN_BITMASK;

		if (_originalMa == null) {
			_originalMa = _ma;
		}

		_ma = ma;
	}

	public String getOriginalMa() {
		return GetterUtil.getString(_originalMa);
	}

	public String getTen() {
		if (_ten == null) {
			return StringPool.BLANK;
		}
		else {
			return _ten;
		}
	}

	public void setTen(String ten) {
		_columnBitmask |= TEN_COLUMN_BITMASK;

		if (_originalTen == null) {
			_originalTen = _ten;
		}

		_ten = ten;
	}

	public String getOriginalTen() {
		return GetterUtil.getString(_originalTen);
	}

	public Date getNgayTao() {
		return _ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		_ngayTao = ngayTao;
	}

	public Date getNgaySua() {
		return _ngaySua;
	}

	public void setNgaySua(Date ngaySua) {
		_ngaySua = ngaySua;
	}

	public int getDaXoa() {
		return _daXoa;
	}

	public void setDaXoa(int daXoa) {
		_columnBitmask |= DAXOA_COLUMN_BITMASK;

		if (!_setOriginalDaXoa) {
			_setOriginalDaXoa = true;

			_originalDaXoa = _daXoa;
		}

		_daXoa = daXoa;
	}

	public int getOriginalDaXoa() {
		return _originalDaXoa;
	}

	public String getNguoiTao() {
		if (_nguoiTao == null) {
			return StringPool.BLANK;
		}
		else {
			return _nguoiTao;
		}
	}

	public void setNguoiTao(String nguoiTao) {
		_nguoiTao = nguoiTao;
	}

	public String getNguoiSua() {
		if (_nguoiSua == null) {
			return StringPool.BLANK;
		}
		else {
			return _nguoiSua;
		}
	}

	public void setNguoiSua(String nguoiSua) {
		_nguoiSua = nguoiSua;
	}

	public int getPhienBan() {
		return _phienBan;
	}

	public void setPhienBan(int phienBan) {
		_phienBan = phienBan;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public QuocGia toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (QuocGia)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					QuocGia.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		QuocGiaImpl quocGiaImpl = new QuocGiaImpl();

		quocGiaImpl.setId(getId());
		quocGiaImpl.setMa(getMa());
		quocGiaImpl.setTen(getTen());
		quocGiaImpl.setNgayTao(getNgayTao());
		quocGiaImpl.setNgaySua(getNgaySua());
		quocGiaImpl.setDaXoa(getDaXoa());
		quocGiaImpl.setNguoiTao(getNguoiTao());
		quocGiaImpl.setNguoiSua(getNguoiSua());
		quocGiaImpl.setPhienBan(getPhienBan());

		quocGiaImpl.resetOriginalValues();

		return quocGiaImpl;
	}

	public int compareTo(QuocGia quocGia) {
		int value = 0;

		if (getId() < quocGia.getId()) {
			value = -1;
		}
		else if (getId() > quocGia.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		QuocGia quocGia = null;

		try {
			quocGia = (QuocGia)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = quocGia.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		QuocGiaModelImpl quocGiaModelImpl = this;

		quocGiaModelImpl._originalMa = quocGiaModelImpl._ma;

		quocGiaModelImpl._originalTen = quocGiaModelImpl._ten;

		quocGiaModelImpl._originalDaXoa = quocGiaModelImpl._daXoa;

		quocGiaModelImpl._setOriginalDaXoa = false;

		quocGiaModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<QuocGia> toCacheModel() {
		QuocGiaCacheModel quocGiaCacheModel = new QuocGiaCacheModel();

		quocGiaCacheModel.id = getId();

		quocGiaCacheModel.ma = getMa();

		String ma = quocGiaCacheModel.ma;

		if ((ma != null) && (ma.length() == 0)) {
			quocGiaCacheModel.ma = null;
		}

		quocGiaCacheModel.ten = getTen();

		String ten = quocGiaCacheModel.ten;

		if ((ten != null) && (ten.length() == 0)) {
			quocGiaCacheModel.ten = null;
		}

		Date ngayTao = getNgayTao();

		if (ngayTao != null) {
			quocGiaCacheModel.ngayTao = ngayTao.getTime();
		}
		else {
			quocGiaCacheModel.ngayTao = Long.MIN_VALUE;
		}

		Date ngaySua = getNgaySua();

		if (ngaySua != null) {
			quocGiaCacheModel.ngaySua = ngaySua.getTime();
		}
		else {
			quocGiaCacheModel.ngaySua = Long.MIN_VALUE;
		}

		quocGiaCacheModel.daXoa = getDaXoa();

		quocGiaCacheModel.nguoiTao = getNguoiTao();

		String nguoiTao = quocGiaCacheModel.nguoiTao;

		if ((nguoiTao != null) && (nguoiTao.length() == 0)) {
			quocGiaCacheModel.nguoiTao = null;
		}

		quocGiaCacheModel.nguoiSua = getNguoiSua();

		String nguoiSua = quocGiaCacheModel.nguoiSua;

		if ((nguoiSua != null) && (nguoiSua.length() == 0)) {
			quocGiaCacheModel.nguoiSua = null;
		}

		quocGiaCacheModel.phienBan = getPhienBan();

		return quocGiaCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", ma=");
		sb.append(getMa());
		sb.append(", ten=");
		sb.append(getTen());
		sb.append(", ngayTao=");
		sb.append(getNgayTao());
		sb.append(", ngaySua=");
		sb.append(getNgaySua());
		sb.append(", daXoa=");
		sb.append(getDaXoa());
		sb.append(", nguoiTao=");
		sb.append(getNguoiTao());
		sb.append(", nguoiSua=");
		sb.append(getNguoiSua());
		sb.append(", phienBan=");
		sb.append(getPhienBan());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.cmon.dao.qlhc.model.QuocGia");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ma</column-name><column-value><![CDATA[");
		sb.append(getMa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ten</column-name><column-value><![CDATA[");
		sb.append(getTen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayTao</column-name><column-value><![CDATA[");
		sb.append(getNgayTao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngaySua</column-name><column-value><![CDATA[");
		sb.append(getNgaySua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>daXoa</column-name><column-value><![CDATA[");
		sb.append(getDaXoa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiTao</column-name><column-value><![CDATA[");
		sb.append(getNguoiTao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiSua</column-name><column-value><![CDATA[");
		sb.append(getNguoiSua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phienBan</column-name><column-value><![CDATA[");
		sb.append(getPhienBan());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = QuocGia.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			QuocGia.class
		};
	private long _id;
	private String _ma;
	private String _originalMa;
	private String _ten;
	private String _originalTen;
	private Date _ngayTao;
	private Date _ngaySua;
	private int _daXoa;
	private int _originalDaXoa;
	private boolean _setOriginalDaXoa;
	private String _nguoiTao;
	private String _nguoiSua;
	private int _phienBan;
	private transient ExpandoBridge _expandoBridge;
	private long _columnBitmask;
	private QuocGia _escapedModelProxy;
}