package test2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test2.dao.Test2Dao;
import test2.model.Test2;

@Service
public class Test2ServiceImpl implements Test2Service{
	@Autowired
	private Test2Dao td;

	@Override
	public List<Test2> list() {
		return td.list();
	}

}