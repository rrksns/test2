package test2.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import test2.model.Test2;

@Repository
public class Test2DaoImpl implements Test2Dao{
	@Autowired
	private SqlSessionTemplate st;

	@Override
	public List<Test2> list() {		
			return st.selectList("test2ns.list");		
	}

}
