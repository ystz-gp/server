package net.qmdboss.dao.impl;

import net.qmdboss.dao.PaymentConfigDao;
import net.qmdboss.entity.Order;
import net.qmdboss.entity.Payment;
import net.qmdboss.entity.PaymentConfig;
import net.qmdboss.entity.PaymentConfig.PaymentConfigType;
import net.qmdboss.entity.Refund;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

/**
 * Dao实现类 - 支付配置
 * ============================================================================
 * 版权所有 2008-2010 长沙鼎诚软件有限公司,并保留所有权利。
 * ----------------------------------------------------------------------------
 * 提示：在未取得SHOP++商业授权之前,您不能将本软件应用于商业用途,否则SHOP++将保留追究的权力。
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.shopxx.net
 * ----------------------------------------------------------------------------
 * KEY: SHOPXXE1842B16170CAE78F2D0E2F7E18EEE4B
 * ============================================================================
 */

@Repository("paymentConfigDaoImpl")
public class PaymentConfigDaoImpl extends BaseDaoImpl<PaymentConfig, Integer> implements PaymentConfigDao {

	@SuppressWarnings("unchecked")
	public List<PaymentConfig> getNonDepositPaymentConfigList() {
		String hql = "from PaymentConfig as paymentConfig where paymentConfig.paymentConfigType != :paymentConfigType order by paymentConfig.orderList asc";
		return getSession().createQuery(hql).setParameter("paymentConfigType", PaymentConfigType.deposit).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<PaymentConfig> getNonDepositOfflinePaymentConfigList() {
		String hql = "from PaymentConfig as paymentConfig where paymentConfig.paymentConfigType != :paymentConfigTypeDeposit and paymentConfig.paymentConfigType != :paymentConfigTypeOffline order by paymentConfig.orderList asc";
		return getSession().createQuery(hql).setParameter("paymentConfigTypeDeposit", PaymentConfigType.deposit).setParameter("paymentConfigTypeOffline", PaymentConfigType.offline).list();
	}
	
	// 关联处理
	@Override
	public void delete(PaymentConfig paymentConfig) {
		Set<Order> orderSet = paymentConfig.getOrderSet();
		if (orderSet != null) {
			for (Order order : orderSet) {
				order.setPaymentConfig(null);
			}
		}
		
		Set<Payment> paymentSet = paymentConfig.getPaymentSet();
		if (paymentSet != null) {
			for (Payment payment : paymentSet) {
				payment.setPaymentConfig(null);
			}
		}
		
		Set<Refund> refundSet = paymentConfig.getRefundSet();
		if (refundSet != null) {
			for (Refund refund : refundSet) {
				refund.setPaymentConfig(null);
			}
		}
		
		super.delete(paymentConfig);
	}

	// 关联处理
	@Override
	public void delete(Integer id) {
		PaymentConfig paymentConfig = load(id);
		this.delete(paymentConfig);
	}

	// 关联处理
	@Override
	public void delete(Integer[] ids) {
		for (Integer id : ids) {
			PaymentConfig paymentConfig = load(id);
			this.delete(paymentConfig);
		}
	}

}