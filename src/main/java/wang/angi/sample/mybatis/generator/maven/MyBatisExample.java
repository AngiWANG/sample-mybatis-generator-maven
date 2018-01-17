package wang.angi.sample.mybatis.generator.maven;

import static wang.angi.sample.mybatis.generator.maven.mapper.CityDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import org.apache.ibatis.session.SqlSession;

import com.github.pagehelper.PageHelper;

import wang.angi.sample.mybatis.generator.maven.mapper.CityMapper;
import wang.angi.sample.mybatis.generator.maven.model.City;

public class MyBatisExample {
	public static void main(String[] args) {
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();

			CityMapper cityMapper = sqlSession.getMapper(CityMapper.class);
			City city = new City();
			city.setName("WuHan");
			city.setState("HuBei");
			city.setCountry("China");
			city.setCreatedBy("Angi");
			cityMapper.insert(city);
			
			City city2 = new City();
			city2.setId(6);
			city2.setName("ShangHai");
			cityMapper.updateByPrimaryKey(city2);

			City city1 = new City();
			city1.setName("EZhou");
			city1.setCreatedBy("水晶");
			cityMapper.insertSelective(city1);
			
			City city3 = new City();
			city3.setId(8);
			city3.setName("ShangHai");
			cityMapper.updateByPrimaryKeySelective(city3);

			cityMapper.selectByExample().where(createdBy, isEqualTo("水晶")).and(name, isLike("Wu%")).build().execute();

			System.out.println(cityMapper.selectByPrimaryKey(1));
			PageHelper.startPage(2, 3);
			System.out.println(cityMapper.selectByExample().build().execute().size());

			sqlSession.commit();
		} catch (Throwable e) {
			System.out.println(e);
			sqlSession.rollback();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
	}
}
