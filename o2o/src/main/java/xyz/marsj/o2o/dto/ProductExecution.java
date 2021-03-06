package xyz.marsj.o2o.dto;

import java.util.List;

import xyz.marsj.o2o.entity.Product;
import xyz.marsj.o2o.enums.ProductStateEnum;

public class ProductExecution {
	private int state;
	private String stateInfo;
	private int count;
	private Product product;
	private List<Product> productList;
	public ProductExecution() {
		
	}
	//操作店铺失败时使用的构造器
	public ProductExecution(ProductStateEnum stateEnum) {
		this.state=stateEnum.getState();
		this.stateInfo=stateEnum.getStateInfo();
	}
	//操作店铺成功时使用的构造器
	public ProductExecution(ProductStateEnum stateEnum,Product product) {
		this.state=stateEnum.getState();
		this.stateInfo=stateEnum.getStateInfo();
		this.product=product;
	}	
	//操作店铺成功时使用的构造器
	public ProductExecution(ProductStateEnum stateEnum,List<Product> productList) {
		this.state=stateEnum.getState();
		this.stateInfo=stateEnum.getStateInfo();
		this.productList=productList;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getStateInfo() {
		return stateInfo;
	}
	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	
}
