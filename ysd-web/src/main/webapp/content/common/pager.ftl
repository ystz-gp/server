<script type="text/javascript">
	function gotoPage(id) {
		$("#pageNumber").val(id);
		$("#listForm").submit();
	}
	
	function gotoPageNum(tc) {
		var nm = $("#inNum").val();
		if (nm > tc) {
			nm = tc;
		}
		gotoPage(nm);
	}
	
</script>
<input type="hidden" id="pageNumber" name="pager.pageNumber" value="${pageNumber}"/>
<input type="hidden" name="pager.pageSize" value="${pageSize}"/>

<#if (pageCount > 1)>

		<div style="text-align:center; margin-top:40px;" class="uesr_fenye">
			<#--共 ${totalCount}条  ${pageSize}条/页--> 
			<!--首页-->
			<#--<#if (pageNumber > 1)><a href="javascript:void(0);" onclick="gotoPage(1)" class="ic pFirst" style="display:inline-block; width:50px; height:30px; line-height:30px;background:#fd7c1a; color:#fff; font-size:12px; margin-left:15px; cursor:pointer;">首页</a>
			<#else><a href="javascript:void(0);" class="ic pFirst">首页</a></#if>
			-->
			<!--上一页-->
			<#if (pageNumber > 1)><a href="javascript:void(0);" onclick="gotoPage(${(pageNumber-1)})" class="ic pPrev" style="display:inline-block; width:50px; height:30px; line-height:30px;background:#fd7c1a; color:#fff; font-size:12px; margin-left:15px; cursor:pointer;">上一页</a>
			<#else><a href="javascript:void(0);" class="ic pPrev" style="display:inline-block; width:50px; height:30px; line-height:30px;background:#fd7c1a; color:#fff; font-size:12px; margin-left:15px; cursor:pointer;">上一页</a></#if>
			
			<!-- 显示页码 -->
			
				
					
						<#if (pageCount >5)>
							<#if (pageNumber > 2)>
									<#if (pageNumber < pageCount)>
										<a href="javascript:void(0);"  onclick="gotoPage(1);">1</a>
										<a href="javascript:void(0);"  onclick="gotoPage(${(pageNumber-1)});">${(pageNumber-1)}</a>
										<a href="javascript:void(0);" class="uesr_fenye_current" >${pageNumber}</a>
										<a href="javascript:void(0);"  onclick="gotoPage(${(pageNumber+1)});">${(pageNumber+1)}</a>
										<a href="javascript:void(0);"  onclick="gotoPage(${(pageCount)});">${(pageCount)}</a>
									</#if>
	
								<#else>
									 <#if pageNumber==2>
										<a href="javascript:void(0);"  onclick="gotoPage(1);">1</a>
										</#if>
										<a href="javascript:void(0);" class="uesr_fenye_current" >${pageNumber}</a>
										<a href="javascript:void(0);"  onclick="gotoPage(${(pageNumber+1)});">${(pageNumber+1)}</a>
										<a href="javascript:void(0);"  onclick="gotoPage(${(pageCount)});">${(pageCount)}</a>
								</#if>
						<#else>
							<#list (pageItem?keys)! as key>
								<#if pageNumber != key?number><a href="javascript:void(0);"  onclick="gotoPage(${key});">${key}</a>
								<#else><a href="javascript:void(0);" class="uesr_fenye_current" >${key}</a>
								</#if>
							</#list>
						</#if>
					
			
			<!--下一页-->
			<#if (pageNumber < pageCount)><a href="javascript:void(0);" onclick="gotoPage(${(pageNumber+1)});" class="ic pNext" style="display:inline-block; width:50px; height:30px; line-height:30px;background:#fd7c1a; color:#fff; font-size:12px; margin-left:15px; cursor:pointer;">下一页</a>
			<#else> <a href="javascript:void(0);" class="ic pNext" style="display:inline-block; width:50px; height:30px; line-height:30px;background:#fd7c1a; color:#fff; font-size:12px; margin-left:15px; cursor:pointer;">下一页</a></#if>
			
			<!--尾页
			<#if (pageNumber < pageCount)><a href="javascript:void(0);" onclick="gotoPage(${(pageCount)});" class="ic pLast">尾页</a>
			<#else> <a href="javascript:void(0);" class="ic pLast">尾页</a></#if>
			-->
			<#--跳转
			<a href="javascript:void(0);" onclick="gotoPageNum(${(pageCount)});">转到</a>  <input type="text" id="inNum" class="txt" value="${pageNumber}" onfocus="this.select();" onkeyup="value=value.replace(/[^0-9]/g,'1')" /> 页 
			-->
		</div>
</#if>

