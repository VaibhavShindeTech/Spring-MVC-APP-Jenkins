package com.ashokit.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class GenderGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String prefix="G";
		String suffix="";
		String sql="select gender_seq.nextval from dual";
		Connection connection = session.connection();
		try {
			Statement createStatement = connection.createStatement();
			ResultSet resultSet = createStatement.executeQuery(sql);
			if(resultSet.next()) {
				suffix=String.valueOf(resultSet.getInt(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prefix+suffix;
	}
	
}
