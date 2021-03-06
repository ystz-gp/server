package com.qmd.util.rongbaoConfig;

import com.qmd.util.ConstantUtil;
import org.apache.struts2.ServletActionContext;



/* *
 *功能：设置帐户有关信息及返回路径（基础配置页面）
 *版本：3.1.3
 *日期：2015-08-14
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究融宝支付接口使用，只是提供一个参考。

 *提示：如何获取安全校验码和合作身份者ID
 *1.访问融宝支付商户后台，然后用您的签约融宝支付账号登陆(注册邮箱号).
 *2.点击导航栏中的“商家服务”，即可查看

 * */

public class ReapalConfig {

	// ↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 商户ID，由纯数字组成的字符串
//	public static String merchant_id = "100000000000147";//测试 
	public static String merchant_id = "100000001300817";//正式 
	
	// 交易安全检验码，由数字和字母组成的64位字符串
//	public static String key = "g0be2385657fa355af68b74e9913a1320af82gb7ae5f580g79bffd04a402ba8f";//测试
	public static String key = "9609fd1ef23f3g71a881c3d54cdbec600f6ab4382g105a96afa14ga21c1a711f";//正式

	// 签约融宝支付账号或卖家收款融宝支付帐户
//	public static String seller_email = "850138237@qq.com";//测试
	public static String seller_email = "jcb@hzjcb.com";//正式
	
	// 通知地址，由商户提供
//	public static String notify_url = "http://160836c5u5.iok.la:9999/payment/rbknotify.do";//测试
	public static String notify_url = ConstantUtil.WEB_SITE+"/payment/rbknotify.do";//正式 
	
	//卡密认证同步通知地址,由商户提供
//	public static String certify_return_url = "http://localhost:8080/userCenter/rbkmreturn.do";//测试
	public static String certify_return_url = ConstantUtil.WEB_SITE+"/userCenter/rbkmreturn.do";//正式(用来调到支付页面)
	
	//卡密认证异步通知地址,由商户提供
//	public static String certify_notify_url = "http://160836c5u5.iok.la:9999/payment/rbkmnotify.do";//测试
	public static String certify_notify_url = ConstantUtil.WEB_SITE+"/payment/rbkmnotify.do";//正式
	
	//卡密认证请求地址   正式地址
//	public static String certify_url = "http://testapi.reapal.com/fast/certificate";//测试（卡密鉴权没测试接口）
	public static String certify_url = "http://api.reapal.com/fast/certificate";//正式
	
	// 商户私钥
	static String path1 = ServletActionContext.getRequest().getSession().getServletContext().getRealPath("/");
//	public static String privateKey =path1+"WEB-INF/RBCER/itrus001.pfx";//测试
	public static String privateKey =path1+"WEB-INF/RBCER/jcb-rsa.pfx";//正式
	
	// 私钥密码
//	public static String password = "123456";//测试
	public static String password = "_jcb6_";//正式
	
	// 支付网关
//	public static String rongpay_api = "http://testapi.reapal.com";//测试
	public static String rongpay_api = "http://api.reapal.com";//正式

	// 融宝公钥 正式环境不用更换
//	public static String pubKeyUrl = path1+"WEB-INF/RBCER/itrus001.cer";//测试
	public static String pubKeyUrl = path1+"WEB-INF/RBCER/rongbao.cer";//正式
	
	
	// ↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
	
	// 访问模式,根据自己的服务器是否支持ssl访问，若支持请选择https；若不支持请选择http
	public static String transport = "http";
	// 接口版本号
	public static String version = "3.1.3";
	// 字符编码格式 目前支持 utf-8
	public static String charset = "utf-8";
	// 签名方式 不需修改
	public static String sign_type = "MD5";

}
