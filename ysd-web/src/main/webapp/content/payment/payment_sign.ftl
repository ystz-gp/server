<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>${Application ["qmd.setting.name"]}—国资控股|专业、安全、透明的互联网金融服务平台  充值结果信息</title>
	<#include "/content/common/meta.ftl">
	
	<link rel="stylesheet" href="${base}/css/common.css">
<style>
body{ margin:0 ; padding:0;font-family:"微软雅黑";}
	ul,li{ list-style:none; margin:0 ; padding:0;}
	#header { background: #fff;}
</style>

</head>
<body>
<!-- 头部 -->
<#include "/content/common/header.ftl">

	<link rel="stylesheet" href="${base}/css/payment.css">
<div class="find qy">
  <div class='qysucc findCont'>
      <!--<div class="top">
          <p><span>系统通知</span></p>
      </div>
      <div style="margin:85px auto 0;font-size:16px;">
         <div style="color:#666;text-align:center;">
            <span style="width:34px;height:34px;display:inline-block;line-height:34px;text-align:center;color:#fff;font-weight:bold;border-radius:50%;background:#fd7c1a;margin-right:8px;font-size:24px;">!</span>恭喜您，签约成功
          </div>
         <div style="text-align:center;margin-top:130px;">
			    <a href="${base}/userCenter/index.do" style="width:108px;height:36px;border-radius:5px;line-height:36px;background-color:#fd7c1a;color:#fff;display:inline-block;text-align:center;cursor:pointer; font-size:14px;">[返回我的账户]</a>
         </div>
      </div>-->
      <p class='title'>恭喜您，签约成功</p>
      <p>如遇问题请拨打乐商贷客服电话:<span>400-057-7820</span>，服务时间：周一至周五<span>09:00-17:30</span></p>
      <div class='qybtn'>
      	<a href="${base}/userCenter/index.do" class='red'>我的账户</a>
      	<a href='${base}/borrow/listNew.do' class='blue'>立即投资</a>
      </div>
  </div>
</div><!-- end -->


<#include "/content/common/footer.ftl">
 <script type="text/javascript" src="${base}/js/jquery-1.11.3.min.js"></script>
<script src="${base}/js/common.js"></script>

</body>
</html>
