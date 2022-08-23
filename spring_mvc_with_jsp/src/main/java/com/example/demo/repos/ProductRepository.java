package com.example.demo.repos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;
import com.example.demo.iface.CrudRepository;
@Repository
public class ProductRepository implements CrudRepository<Product> {

	private JdbcTemplate template;
	
	
	@Autowired
	public ProductRepository(JdbcTemplate template) {
		super();
		this.template = template;
		
	}

	@Override
	public int add(Product t) {
		String sql = "insert into loki_product values(?,?,?)";
		return template.update(sql, t.getProductId(),t.getProductName(),t.getPrice());
	}

	@Override
	public List<Product> findAll() {
		String sql = "select * from loki_product";
		return template.query(sql, BeanPropertyRowMapper.newInstance(Product.class));
	}

	@Override
	public int deleteById(int id) {
		String sql="DELETE LOKI_PRODUCT WHERE PRODUCT_ID=?";
		return template.update(sql, id);
	}

	@Override
	public Product findById(int id) {
		String sql="SELECT*FROM LOKI_PRODUCT WHERE PRODUCT_ID=?";
		try {
			return template.queryForObject(sql,BeanPropertyRowMapper.newInstance(Product.class),id);
			
		}catch(IncorrectResultSizeDataAccessException e)
		{
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int update(Product t) {
		try {
			String sql="UPDATE LOKI_PRODUCT SET PRICE=? WHERE PRODUCT_ID=?";
			return template.update(sql, t.getPrice(), t.getProductId());
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

}
