package th.co.baiwa.framework.common.persistence.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

/*
 * @Author: Taechapon Himarat (Su)
 * @Create: Sep 7, 2012
 */
public abstract class AbstractCommonJdbcDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	protected JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	//--------------------------------------------------------------------------------
	// Methods dealing with select prepared statements
	//--------------------------------------------------------------------------------
	protected <T> T executeQuery(String sql, Object[] params, ResultSetExtractor<T> extractor) {
		return jdbcTemplate.query(sql, params, extractor);
	}
	
	protected <T> T executeQuery(String sql, ResultSetExtractor<T> extractor) {
		return jdbcTemplate.query(sql, extractor);
	}

	protected <T> List<T> executeQuery(String sql, Object[] params, RowMapper<T> rowMapper) {
		return jdbcTemplate.query(sql, params, rowMapper);
	}
	
	protected <T> List<T> executeQuery(String sql, RowMapper<T> rowMapper) {
		return jdbcTemplate.query(sql, rowMapper);
	}

	protected <T> T executeQueryForObject(String sql, Object[] params, RowMapper<T> rowMapper) {
		return jdbcTemplate.queryForObject(sql, params, rowMapper);
	}
	
	protected <T> T executeQueryForObject(String sql, RowMapper<T> rowMapper) {
		return jdbcTemplate.queryForObject(sql, rowMapper);
	}

	protected <T> T executeQueryForObject(String sql, Object[] params, Class<T> requiredType) {
		return jdbcTemplate.queryForObject(sql, params, requiredType);
	}
	
	protected <T> T executeQueryForObject(String sql, Class<T> requiredType) {
		return jdbcTemplate.queryForObject(sql, requiredType);
	}

	protected Map<String, Object> executeQueryForMap(String sql, Object... params) {
		return jdbcTemplate.queryForMap(sql, params);
	}

	protected List<Map<String, Object>> executeQueryForList(String sql, Object... params) {
		return jdbcTemplate.queryForList(sql, params);
	}

	//--------------------------------------------------------------------------------
	// Methods dealing with insert prepared statements
	//--------------------------------------------------------------------------------
	protected Long executeInsert(final String sql, final Object... params) {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				int i = 1;
				for (Object o : params) {
					if (o instanceof String) {
						ps.setString(i, (String) o);
					} else if (o instanceof Timestamp) {
						ps.setTimestamp(i, (Timestamp) o);
					} else if (o instanceof Date) {
						ps.setDate(i, (Date) o);
					} else if (o instanceof Time) {
						ps.setTime(i, (Time) o);
					} else if (o instanceof Integer) {
						ps.setInt(i, (Integer) o);
					} else if (o instanceof Long) {
						ps.setLong(i, (Long) o);
					} else if (o instanceof Double) {
						ps.setDouble(i, (Double) o);
					} else if (o instanceof BigDecimal) {
						ps.setBigDecimal(i, (BigDecimal) o);
					} else if (o instanceof Object) {
						ps.setObject(i, o);
					} else if (o == null) {
						ps.setNull(i, Types.NULL);
					}
					i++;
				}
				return ps;
			}
		}, keyHolder);
		Long key = keyHolder.getKey().longValue();
		
		return key;
	}

	//--------------------------------------------------------------------------------
	// Methods dealing with update, delete prepared statements
	//--------------------------------------------------------------------------------
	protected int executeUpdate(String sql, Object... params) {
		return jdbcTemplate.update(sql, params);
	}

	//--------------------------------------------------------------------------------
	// Methods dealing with batch prepared statements
	//--------------------------------------------------------------------------------
	protected int[] executeBatchUpdate(String sql, BatchPreparedStatementSetter setter) {
		return jdbcTemplate.batchUpdate(sql, setter);
	}

	//--------------------------------------------------------------------------------
	// Methods dealing with callable statements
	//--------------------------------------------------------------------------------
	
}
