package net.qmdboss.dao;

import net.qmdboss.bean.Pager;
import net.qmdboss.entity.GoodsAttribute;
import net.qmdboss.entity.GoodsType;

import java.util.List;

/**
 * Dao接口 - 商品属性
 * ============================================================================
 * 版权所有 2008-2010 长沙鼎诚软件有限公司,并保留所有权利。
 * ----------------------------------------------------------------------------
 * 提示：在未取得SHOP++商业授权之前,您不能将本软件应用于商业用途,否则SHOP++将保留追究的权力。
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.shopxx.net
 * ----------------------------------------------------------------------------
 * KEY: SHOPXX4D051F4491A9917665E897135777FB7C
 * ============================================================================
 */

public interface GoodsAttributeDao extends BaseDao<GoodsAttribute, Integer> {
	
	/**
	 * 根据商品类型获取未使用的商品属性值对象属性序号,若无可用序号则返回null
	 * 
	 * @return 商品属性值对象属性序号
	 */
	public Integer getUnusedPropertyIndex(GoodsType goodsType);
	
	/**
	 * 根据商品类型获取商品属性集合
	 * 
	 * @return 商品属性集合
	 */
	public List<GoodsAttribute> getGoodsAttributeList(GoodsType goodsType);
	
	/**
	 * 根据商品类型获取商品属性分页对象
	 * 
	 * @return 分页对象
	 */
	public Pager getGoodsAttributePager(GoodsType goodsType, Pager pager);

}