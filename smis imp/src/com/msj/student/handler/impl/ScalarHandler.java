package com.msj.student.handler.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.msj.student.handler.IResultSetHandler;

public class ScalarHandler implements IResultSetHandler<Long> {
	@Override
	public Long handle(ResultSet rs) throws SQLException {
		if (rs.next()) {
			return rs.getLong(1);
		}
		return 0L;
	}
}
