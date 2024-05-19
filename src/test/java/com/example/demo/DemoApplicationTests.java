package com.example.demo;

import com.example.demo.entity.Info;
import com.example.demo.mapper.InfoMapper;
import org.apache.ibatis.ognl.Ognl;
import org.apache.ibatis.ognl.OgnlException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private InfoMapper infoMapper;
	@Test
	public void testInsert(){
		Info info = new Info();
		info.setId(1L);
		infoMapper.insert(info);
	}

	@Test
	public void testOgnl() throws OgnlException {
		Object o = Ognl.parseExpression("band!=null");
		System.out.println(o);
	}

}
