package TestTree;

import java.util.ArrayList;
import java.util.List;
//This is about git testchongt
public class Digui {
	public static void main(String[] args) {
		List<SysMenu> sysMenuList = new ArrayList<SysMenu>();
		sysMenuList.add(new SysMenu(1,0));
		sysMenuList.add(new SysMenu(5,1));
		sysMenuList.add(new SysMenu(9,5));
		sysMenuList.add(new SysMenu(2,0));
		sysMenuList.add(new SysMenu(6,2));
		sysMenuList.add(new SysMenu(3,0));
		sysMenuList.add(new SysMenu(7,3));
		sysMenuList.add(new SysMenu(4,0));
		sysMenuList.add(new SysMenu(8,4));
		sysMenuList = digui(sysMenuList);
		System.out.println(sysMenuList.toString());
	}
	public static List digui(List<SysMenu> sysMenuList) {
		List<SysMenu> trueList = new ArrayList<SysMenu>();
		for(SysMenu s: sysMenuList) {
		if(s.getPid()==0) { 
				trueList.add(s);
		}else {
			fuzhu(trueList,s);
		}
		}
		return trueList;
	}
	public static void fuzhu(List<SysMenu> trueList,SysMenu s) {
		for(SysMenu sysMenu: trueList) {
			if(sysMenu.getId()==s.getPid()) {
				sysMenu.getSysMenuList().add(s);
			}else {
				fuzhu(sysMenu.getSysMenuList(),s);
			}
		}
	}
}
