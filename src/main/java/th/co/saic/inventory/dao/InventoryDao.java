package th.co.saic.inventory.dao;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import th.co.baiwa.framework.common.persistence.dao.AbstractCommonJdbcDao;

@Repository("InventoryDao")
public class InventoryDao extends AbstractCommonJdbcDao{
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private static final Map<Integer, String> MONTH_THAI;
    private static final Map<Integer, String> MONTH_ENG;
    
    static {
        Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "มกราคม");
		map.put(2, "กุมภาพันธ์");
		map.put(3, "มีนาคม");
		map.put(4, "เมษายน");
		map.put(5, "พฤษภาคม");
		map.put(6, "มิถุนายน");
		map.put(7, "กรกฎาคม");
		map.put(8, "สิงหาคม");
		map.put(9, "กันยายน");
		map.put(10, "ตุลาคม");
		map.put(11, "พฤศจิกายน");
		map.put(12, "ธันวาคม");
        MONTH_THAI = Collections.unmodifiableMap(map);
        
        map = new HashMap<Integer, String>();
        map.put(1, "January");
        map.put(2, "February");
        map.put(3, "March");
        map.put(4, "April");
        map.put(5, "May");
        map.put(6, "June");
        map.put(7, "July");
        map.put(8, "August");
        map.put(9, "September");
        map.put(10, "October");
        map.put(11, "November");
        map.put(12, "December");
		MONTH_ENG = Collections.unmodifiableMap(map);
    }
    
	/*@Override
	public Integer countDataTable(SearchINCTRRequest request) {
		
		List<Object> params = new ArrayList<Object>();
		
		StringBuilder sql = new StringBuilder();
		sql.append(
				" SELECT COUNT(1) " +
				" FROM inctr inc " +
				" INNER JOIN customer cus " +
				" ON cus.cus_id = inc.cus_id " +
				" WHERE 1=1 ");
		
			if (!StringUtils.isEmpty(request.getRegId())) {
				sql.append(" AND inc.reg_id LIKE ? ");
				params.add("%"+request.getRegId()+"%");
			}
			
			if (!StringUtils.isEmpty(request.getReceiptDateFrom())) {
				sql.append(" AND inc.receipt_date >= STR_TO_DATE(?, '%d/%m/%Y') ");
				params.add(request.getReceiptDateFrom());
			}
			
			if (!StringUtils.isEmpty(request.getReceiptDateTo())) {
				sql.append(" AND inc.receipt_date <= STR_TO_DATE(?, '%d/%m/%Y') ");
				params.add(request.getReceiptDateTo());
			}
		
		Integer count = super.executeQueryForObject(sql.toString(), 
				params.toArray(),
			Integer.class
		);
		
		return count;
	}
	
	@Override
	public List<INCTRTableInfo> getDataTable(SearchINCTRRequest request) {
		
		List<Object> params = new ArrayList<Object>();

		StringBuilder sql = new StringBuilder();
		sql.append(
				" SELECT " +
					" IFNULL(inc.cus_id,'') AS \"customerId\" " +
					" , IFNULL(cus.name,'') AS \"customerName\" " + // -ชื่อผู้ประกอบการ
					" , DATE_FORMAT(inc.receipt_date, '%d/%m/%Y') AS \"receiptDate\" " + // -วัน/เดือน/ปีที่ชำระภาษี
					" , IFNULL(inc.receipt_no,'') \"receiptNo\" " + // -เลขที่ใบเสร็จ
//					" , IFNULL(inc.tax_amt,'') AS \"taxAmount\" " +
					" , IFNULL(inc.reg_id,'') AS \"regId\" " +
					" , IFNULL(inc.product_name,'') AS \"brandName\" " + // rename column
					" , IFNULL(inc.nettax_amt,'') AS \"nettaxAmount\" " + // -จำนวนเงินที่รับชำระภาษี 
					" , IFNULL(inc.amt_balance,'') AS \"amountBalance\" " +
					" , IFNULL(inc.incctl_no,'') AS \"incctlNo\" " +
				" FROM inctr inc " +
				" INNER JOIN customer cus " +
				" ON cus.cus_id = inc.cus_id " +
				" WHERE 1=1 ");
		
				if (!StringUtils.isEmpty(request.getRegId())) {
					sql.append(" AND inc.reg_id LIKE ? ");
					params.add("%"+request.getRegId()+"%");
				}
				
				if (!StringUtils.isEmpty(request.getReceiptDateFrom())) {
					sql.append(" AND inc.receipt_date >= STR_TO_DATE(?, '%d/%m/%Y') ");
					params.add(request.getReceiptDateFrom());
				}
				
				if (!StringUtils.isEmpty(request.getReceiptDateTo())) {
					sql.append(" AND inc.receipt_date <= STR_TO_DATE(?, '%d/%m/%Y') ");
					params.add(request.getReceiptDateTo());
				}
				sql.append("  ORDER BY inc.incctl_no ");
				sql.append("  LIMIT ?, ? ");
				
		final Integer start = request.getStart() == null ? 0 : request.getStart();
		final Integer length = request.getLength() == null ? 10 : request.getLength();
		
		params.add(start);
		params.add(length);
		
		List<INCTRTableInfo> resultList = super.executeQuery(sql.toString(), 
			params.toArray(),

			new ResultSetExtractor<List<INCTRTableInfo>>() {

				@Override
				public List<INCTRTableInfo> extractData(ResultSet rs)
						throws SQLException, DataAccessException {
					
					List<INCTRTableInfo> list = new ArrayList<INCTRTableInfo>();
					INCTRTableInfo obj = null;
					
					int i = 1;
					while (rs.next()) {
						obj = new INCTRTableInfo();
						obj.setNo((start + i) + "");
						obj.setCustomerId(rs.getString("customerId"));
						obj.setCustomerName(rs.getString("customerName"));
						obj.setReceiptNo(rs.getString("receiptNo"));
						obj.setReceiptDate(rs.getString("receiptDate"));
//						obj.setTaxAmount(rs.getDouble("taxAmount"));
						obj.setRegId(rs.getString("regId"));
						obj.setBrandName(rs.getString("brandName"));
						obj.setNettaxAmount(rs.getString("nettaxAmount"));
						obj.setAmountBalance(rs.getString("amountBalance"));
						obj.setIncctlNo(rs.getString("incctlNo"));
						list.add(obj);
						
						i++;
					}
					return list;
				}
			}
		);
		
		return resultList;
	}
	

	@Override
	public INCTRGraphInfo getDataGraph(SearchINCTRRequest request) {
		
		List<Object> params = new ArrayList<Object>();
		
		StringBuilder sql = new StringBuilder();
		
		sql.append(" SELECT ");
		sql.append(" 	MONTH(inc.receipt_date) AS \"month\" ");
		sql.append(" 	, MONTHNAME(inc.receipt_date) AS \"monthEN\" ");
		sql.append(" 	, (CASE MONTH(inc.receipt_date) ");
		sql.append(" 			WHEN 1 THEN 'มกราคม' ");
		sql.append(" 			WHEN 2 THEN 'กุมภาพันธ์' ");
		sql.append(" 			WHEN 3 THEN 'มีนาคม' ");
		sql.append(" 			WHEN 4 THEN 'เมษายน' ");
		sql.append(" 			WHEN 5 THEN 'พฤษภาคม' ");
		sql.append(" 			WHEN 6 THEN 'มิถุนายน' ");
		sql.append("            WHEN 7 THEN 'กรกฎาคม' ");
		sql.append("            WHEN 8 THEN 'สิงหาคม' ");
		sql.append("            WHEN 9 THEN 'กันยายน' ");
		sql.append("            WHEN 10 THEN 'ตุลาคม' ");
		sql.append("            WHEN 11 THEN 'พฤศจิกายน' ");
		sql.append("            WHEN 12 THEN 'ธันวาคม' ");
		sql.append("	END) AS \"monthTH\" ");
		sql.append("	, SUM(inc.nettax_amt) AS \"sumAmount\" ");
		sql.append("	FROM inctr inc ");
		sql.append("	WHERE 1=1 ");
		
		if (!StringUtils.isEmpty(request.getRegId())) {
			sql.append(" AND inc.reg_id LIKE ? ");
			params.add("%"+request.getRegId()+"%");
		}
		
		if (!StringUtils.isEmpty(request.getReceiptDateFrom())) {
			sql.append(" AND inc.receipt_date >= STR_TO_DATE(?, '%d/%m/%Y') ");
			params.add(request.getReceiptDateFrom());
		}
		
		if (!StringUtils.isEmpty(request.getReceiptDateTo())) {
			sql.append(" AND inc.receipt_date <= STR_TO_DATE(?, '%d/%m/%Y') ");
			params.add(request.getReceiptDateTo());
		}
		
		sql.append("	GROUP BY MONTH(inc.receipt_date), MONTHNAME(inc.receipt_date) ");
		
		logger.info(" sql: " + sql.toString());
		
		INCTRGraphInfo result = super.executeQuery(sql.toString(), 
			params.toArray(),

			new ResultSetExtractor<INCTRGraphInfo>() {

				@Override
				public INCTRGraphInfo extractData(ResultSet rs)
						throws SQLException, DataAccessException {
					
					INCTRGraphInfo r = new INCTRGraphInfo();
					
					List<String> monthEN = new ArrayList<String>();
					List<String> monthTH = new ArrayList<String>();
					List<Double> sumAmount = new ArrayList<Double>();
					
//					while (rs.next()) {
//						rs.getInt("month");
//						monthEN.add(rs.getString("monthEN"));
//						monthTH.add(rs.getString("monthTH"));
//						sumAmount.add(rs.getInt("sumAmount"));
//					}
					
					if (rs.next()) {
						for (int month = 1; month <= 12; month++) {
							if (rs.getInt("month") == month) {
								monthEN.add(rs.getString("monthEN"));
								monthTH.add(rs.getString("monthTH"));
								sumAmount.add(rs.getDouble("sumAmount"));
								
								rs.next();
							} else {
								monthEN.add(MONTH_ENG.get(month));
								monthTH.add(MONTH_THAI.get(month));
								sumAmount.add(0.0d);
							}
						}
					}
					
					r.setMonthEN(monthEN);
					r.setMonthTH(monthTH);
					r.setSumAmount(sumAmount);
					return r;
				}
			}
		);
		
		return result;
	}

	@Override
	public void updateData(UpdateINCTRRequest request) {
		
		StringBuilder sql = new StringBuilder();

		sql.append(" UPDATE inctr SET ");
		sql.append(" incctl_no=?, receipt_date=STR_TO_DATE(?,'%d/%m/%Y') ");
		sql.append(" , receipt_no=?, reg_id=?, product_name=? ");
		sql.append(" , nettax_amt=?, amt_balance=?, cus_id=? ");
		sql.append(" WHERE incctl_no=? ");
		
		List<Object> params = new ArrayList<Object>();
		params.add(request.getIncctlNo());//not null, pk
		params.add(request.getReceiptDate());//dd/mm/yyyy
		params.add(request.getReceiptNo());
		params.add(request.getRegId());
		params.add(request.getBrandName());
		params.add(request.getNettaxAmt());
		params.add(request.getAmountBalance());
		params.add(request.getCustomerId());
		params.add(request.getIncctlNo());//not null, pk
		
		super.executeUpdate(sql.toString(), params.toArray());
	}

	@Override
	public void updateAmountBalanceBatch(final UpdateAmountBalanceBatchRequest request) {

		String sql = " UPDATE inctr SET amt_balance=amt_balance-? WHERE incctl_no=? ";
		
		super.executeBatchUpdate(sql, new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				UpdateAmountBalanceRequest r = request.getList().get(i);
				ps.setDouble(1, r.getAmount());
				ps.setString(2, r.getIncctlNo());
			}
			
			@Override
			public int getBatchSize() {
				return request.getList().size();
			}
		});
	}*/
	
}
