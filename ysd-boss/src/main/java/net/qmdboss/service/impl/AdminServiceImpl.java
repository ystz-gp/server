package net.qmdboss.service.impl;

import net.qmdboss.dao.AdminDao;
import net.qmdboss.entity.Admin;
import net.qmdboss.service.AdminService;
import org.springframework.security.Authentication;
import org.springframework.security.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Service实现类 - 管理员
 * ============================================================================
 * 版权所有 2008-2010 长沙鼎诚软件有限公司,并保留所有权利。
 * ----------------------------------------------------------------------------
 * 提示：在未取得SHOP++商业授权之前,您不能将本软件应用于商业用途,否则SHOP++将保留追究的权力。
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.shopxx.net
 * ----------------------------------------------------------------------------
 * KEY: SHOPXXEEB47174264A6259B9A1BA5D141B72C0
 * ============================================================================
 */

@Service("adminServiceImpl")
public class AdminServiceImpl extends BaseServiceImpl<Admin, Integer> implements AdminService {

	@Resource(name = "adminDaoImpl")
	private AdminDao adminDao;
	
	@Resource(name = "adminDaoImpl")
	public void setBaseDao(AdminDao adminDao) {
		super.setBaseDao(adminDao);
	}
	
	public Admin getLoginAdmin() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication == null) {
			return null;
		}
		Object principal = authentication.getPrincipal();
		if (principal == null || !(principal instanceof Admin)) {
			return null;
		} else {
			return (Admin) principal;
		}
	}
	
	@Transactional(readOnly = true)
	public Admin loadLoginAdmin() {
		Admin admin = getLoginAdmin();
		if (admin == null) {
			return null;
		} else {
			return adminDao.load(admin.getId());
		}
	}
	
	@Transactional(readOnly = true)
	public boolean isExistByUsername(String username) {
		return adminDao.isExistByUsername(username);
	}
	
	@Transactional(readOnly = true)
	public Admin getAdminByUsername(String username) {
		return adminDao.getAdminByUsername(username);
	}

}