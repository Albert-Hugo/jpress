package io.jpress.model.base;

import com.jfinal.plugin.activerecord.IBean;
import io.jpress.base.BaseOptionsModel;

/**
 * Generated by JPress, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUserOrder<M extends BaseUserOrder<M>> extends BaseOptionsModel<M> implements IBean {

    private static final long serialVersionUID = 1L;

	public void setId(java.lang.Long id) {
		set("id", id);
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setNs(java.lang.Integer ns) {
		set("ns", ns);
	}
	
	public java.lang.Integer getNs() {
		return getInt("ns");
	}

	public void setTitle(java.lang.String title) {
		set("title", title);
	}
	
	public java.lang.String getTitle() {
		return getStr("title");
	}

	public void setBuyerId(java.lang.Long buyerId) {
		set("buyer_id", buyerId);
	}
	
	public java.lang.Long getBuyerId() {
		return getLong("buyer_id");
	}

	public void setBuyerNickname(java.lang.String buyerNickname) {
		set("buyer_nickname", buyerNickname);
	}
	
	public java.lang.String getBuyerNickname() {
		return getStr("buyer_nickname");
	}

	public void setBuyerMsg(java.lang.String buyerMsg) {
		set("buyer_msg", buyerMsg);
	}
	
	public java.lang.String getBuyerMsg() {
		return getStr("buyer_msg");
	}

	public void setDistUserId(java.lang.Long distUserId) {
		set("dist_user_id", distUserId);
	}
	
	public java.lang.Long getDistUserId() {
		return getLong("dist_user_id");
	}

	public void setDistAmount(java.math.BigDecimal distAmount) {
		set("dist_amount", distAmount);
	}
	
	public java.math.BigDecimal getDistAmount() {
		return get("dist_amount");
	}

	public void setOrderAmount(java.math.BigDecimal orderAmount) {
		set("order_amount", orderAmount);
	}
	
	public java.math.BigDecimal getOrderAmount() {
		return get("order_amount");
	}

	public void setRealAmount(java.lang.Integer realAmount) {
		set("real_amount", realAmount);
	}
	
	public java.lang.Integer getRealAmount() {
		return getInt("real_amount");
	}

	public void setCouponCode(java.lang.String couponCode) {
		set("coupon_code", couponCode);
	}
	
	public java.lang.String getCouponCode() {
		return getStr("coupon_code");
	}

	public void setCouponAmount(java.math.BigDecimal couponAmount) {
		set("coupon_amount", couponAmount);
	}
	
	public java.math.BigDecimal getCouponAmount() {
		return get("coupon_amount");
	}

	public void setPayAmount(java.math.BigDecimal payAmount) {
		set("pay_amount", payAmount);
	}
	
	public java.math.BigDecimal getPayAmount() {
		return get("pay_amount");
	}

	public void setPayTime(java.util.Date payTime) {
		set("pay_time", payTime);
	}
	
	public java.util.Date getPayTime() {
		return get("pay_time");
	}

	public void setPaymentId(java.lang.Long paymentId) {
		set("payment_id", paymentId);
	}
	
	public java.lang.Long getPaymentId() {
		return getLong("payment_id");
	}

	public void setPaymentOuterNo(java.lang.String paymentOuterNo) {
		set("payment_outer_no", paymentOuterNo);
	}
	
	public java.lang.String getPaymentOuterNo() {
		return getStr("payment_outer_no");
	}

	public void setDeliveryType(java.lang.Integer deliveryType) {
		set("delivery_type", deliveryType);
	}
	
	public java.lang.Integer getDeliveryType() {
		return getInt("delivery_type");
	}

	public void setDeliveryCompany(java.lang.String deliveryCompany) {
		set("delivery_company", deliveryCompany);
	}
	
	public java.lang.String getDeliveryCompany() {
		return getStr("delivery_company");
	}

	public void setDeliveryNo(java.lang.String deliveryNo) {
		set("delivery_no", deliveryNo);
	}
	
	public java.lang.String getDeliveryNo() {
		return getStr("delivery_no");
	}

	public void setDeliveryStartTime(java.util.Date deliveryStartTime) {
		set("delivery_start_time", deliveryStartTime);
	}
	
	public java.util.Date getDeliveryStartTime() {
		return get("delivery_start_time");
	}

	public void setDeliveryFinishTime(java.util.Date deliveryFinishTime) {
		set("delivery_finish_time", deliveryFinishTime);
	}
	
	public java.util.Date getDeliveryFinishTime() {
		return get("delivery_finish_time");
	}

	public void setInvoiceType(java.lang.String invoiceType) {
		set("invoice_type", invoiceType);
	}
	
	public java.lang.String getInvoiceType() {
		return getStr("invoice_type");
	}

	public void setInvoiceTitle(java.lang.String invoiceTitle) {
		set("invoice_title", invoiceTitle);
	}
	
	public java.lang.String getInvoiceTitle() {
		return getStr("invoice_title");
	}

	public void setInvoiceContent(java.lang.String invoiceContent) {
		set("invoice_content", invoiceContent);
	}
	
	public java.lang.String getInvoiceContent() {
		return getStr("invoice_content");
	}

	public void setInvoiceIdentity(java.lang.String invoiceIdentity) {
		set("invoice_identity", invoiceIdentity);
	}
	
	public java.lang.String getInvoiceIdentity() {
		return getStr("invoice_identity");
	}

	public void setInvoiceName(java.lang.String invoiceName) {
		set("invoice_name", invoiceName);
	}
	
	public java.lang.String getInvoiceName() {
		return getStr("invoice_name");
	}

	public void setInvoiceMobile(java.lang.String invoiceMobile) {
		set("invoice_mobile", invoiceMobile);
	}
	
	public java.lang.String getInvoiceMobile() {
		return getStr("invoice_mobile");
	}

	public void setInvoiceEmail(java.lang.String invoiceEmail) {
		set("invoice_email", invoiceEmail);
	}
	
	public java.lang.String getInvoiceEmail() {
		return getStr("invoice_email");
	}

	public void setInvoiceStatus(java.lang.Integer invoiceStatus) {
		set("invoice_status", invoiceStatus);
	}
	
	public java.lang.Integer getInvoiceStatus() {
		return getInt("invoice_status");
	}

	public void setRemarks(java.lang.String remarks) {
		set("remarks", remarks);
	}
	
	public java.lang.String getRemarks() {
		return getStr("remarks");
	}

	public void setOptions(java.lang.String options) {
		set("options", options);
	}
	
	public java.lang.String getOptions() {
		return getStr("options");
	}

	public void setTradeStatus(java.lang.Integer tradeStatus) {
		set("trade_status", tradeStatus);
	}
	
	public java.lang.Integer getTradeStatus() {
		return getInt("trade_status");
	}

	public void setPayStatus(java.lang.Integer payStatus) {
		set("pay_status", payStatus);
	}
	
	public java.lang.Integer getPayStatus() {
		return getInt("pay_status");
	}

	public void setDelStatus(java.lang.Integer delStatus) {
		set("del_status", delStatus);
	}
	
	public java.lang.Integer getDelStatus() {
		return getInt("del_status");
	}

	public void setModified(java.util.Date modified) {
		set("modified", modified);
	}
	
	public java.util.Date getModified() {
		return get("modified");
	}

	public void setCreated(java.util.Date created) {
		set("created", created);
	}
	
	public java.util.Date getCreated() {
		return get("created");
	}

}
