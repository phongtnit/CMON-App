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

package vn.dtt.cmon.dao.nsd.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.cmon.dao.nsd.model.TaiKhoanNguoiDung;
import vn.dtt.cmon.dao.nsd.service.TaiKhoanNguoiDungLocalServiceUtil;

/**
 * The extended model base implementation for the TaiKhoanNguoiDung service. Represents a row in the &quot;CMON_TAIKHOANNGUOIDUNG&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TaiKhoanNguoiDungImpl}.
 * </p>
 *
 * @author Liemnn
 * @see TaiKhoanNguoiDungImpl
 * @see vn.dtt.cmon.dao.nsd.model.TaiKhoanNguoiDung
 * @generated
 */
public abstract class TaiKhoanNguoiDungBaseImpl
	extends TaiKhoanNguoiDungModelImpl implements TaiKhoanNguoiDung {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tai khoan nguoi dung model instance should use the {@link TaiKhoanNguoiDung} interface instead.
	 */
	public void persist() throws SystemException {
		if (this.isNew()) {
			TaiKhoanNguoiDungLocalServiceUtil.addTaiKhoanNguoiDung(this);
		}
		else {
			TaiKhoanNguoiDungLocalServiceUtil.updateTaiKhoanNguoiDung(this);
		}
	}
}