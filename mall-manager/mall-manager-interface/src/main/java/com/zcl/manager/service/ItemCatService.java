package com.zcl.manager.service;


import com.zcl.utils.TreeNode;

import java.util.List;

public interface ItemCatService {
	
	/**
	 * 需求:根据父id查询此节点下面的子节点
	 * 参数:Long parentId
	 * 返回值:List<TreeNode>
	 * [{    
    	"id": 1,    
    	"text": "Node 1",    
    	"state": "closed"
    	}]
	 */
	public List<TreeNode> findItemCatTreeNodeList(Long parentId);

}
