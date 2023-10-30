package pt1;
import java.sql.Timestamp;

public class RefundDTO {

	private int refund_id;
	private String user_id;
	private int product_id;
	private String pname;
	private int price;
	private int quantity;
	private String refundwhy;
	private Timestamp added_at;
	private String status;
	private Timestamp fin_at;
	
	public void setRefund_id(int refund_id) {
		this.refund_id=refund_id;
	}
	public void setUser_id(String user_id) {
		this.user_id=user_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id=product_id;
	}
	public void setPname(String pname) {
		this.pname=pname;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	public void setRefundwhy(String refundwhy) {
		this.refundwhy=refundwhy;
	}
	public void setAdded_at(Timestamp added_at) {
		this.added_at=added_at;
	}
	public void setStatus(String status) {
		this.status=status;
	}
	public void setFin_at(Timestamp fin_at) {
		this.fin_at=fin_at;
	}
	public int getRefund_id() {
		return refund_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public String getPname() {
		return pname;
	}
	public int getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public String getRefundwhy() {
		return refundwhy;
	}
	public Timestamp getAdded_at() {
		return added_at;
	}
	public String getStatus() {
		return status;
	}
	public Timestamp getFin_at() {
		return fin_at;
	}
}