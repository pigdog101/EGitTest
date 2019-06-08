package TestTree;

import java.util.ArrayList;
import java.util.List;

public class SysMenu extends Digui{
	private int id;
	private int pid;
	private List<SysMenu> sysMenuList = new ArrayList<SysMenu>();
	

	public List<SysMenu> getSysMenuList() {
		return sysMenuList;
	}
	public void setSysMenuList(List<SysMenu> sysMenuList) {
		this.sysMenuList = sysMenuList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public SysMenu(int id, int pid) {
		super();
		this.id = id;
		this.pid = pid;
	}
	public SysMenu() {
		super();
	}
	
}
