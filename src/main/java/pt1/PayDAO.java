package pt1;

import java.util.ArrayList;
import java.util.List;

public class PayDAO extends OracleServer{
	private static PayDAO instance = new PayDAO();
	public static PayDAO getInstance() {return instance;}
	private PayDAO(){}
	
	// 회원 아이디로 자신의 장바구니를 불러오는 메서드
	public List getCart(String user_id) {
		List mylist = new ArrayList();
		try {
			conn = getConnection();
			sql = "select * from cart where user_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user_id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				CartDTO dto = new CartDTO();
				dto.setCart_id(rs.getInt("cart_id"));
				dto.setUser_id(rs.getString("user_id"));
				dto.setProduct_id(rs.getInt("product_id"));
				dto.setPimg(rs.getString("pimg"));
				dto.setPname(rs.getString("pname"));
				dto.setPrice(rs.getInt("price"));
				dto.setQuantity(rs.getInt("quantity"));
				dto.setCreated_at(rs.getTimestamp("created_at"));
				mylist.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			oracleClose();
		}
		return mylist;
	}
}