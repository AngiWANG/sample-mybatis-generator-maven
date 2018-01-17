package wang.angi.sample.mybatis.generator.maven.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static wang.angi.sample.mybatis.generator.maven.mapper.CityDynamicSqlSupport.*;

import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.delete.DeleteDSL;
import org.mybatis.dynamic.sql.delete.MyBatis3DeleteModelAdapter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.MyBatis3SelectModelAdapter;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectDSL;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.MyBatis3UpdateModelAdapter;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import wang.angi.sample.mybatis.generator.maven.model.City;

@Mapper
public interface CityMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: city")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: city")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: city")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<City> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: city")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CityResult")
    City selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: city")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CityResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="state", property="state", jdbcType=JdbcType.VARCHAR),
        @Result(column="country", property="country", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_by", property="createdBy", jdbcType=JdbcType.VARCHAR)
    })
    List<City> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: city")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: city")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(city);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: city")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, city);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: city")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, city)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: city")
    default int insert(City record) {
        return insert(SqlBuilder.insert(record)
                .into(city)
                .map(name).toProperty("name")
                .map(state).toProperty("state")
                .map(country).toProperty("country")
                .map(createdBy).toProperty("createdBy")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: city")
    default int insertSelective(City record) {
        return insert(SqlBuilder.insert(record)
                .into(city)
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(state).toPropertyWhenPresent("state", record::getState)
                .map(country).toPropertyWhenPresent("country", record::getCountry)
                .map(createdBy).toPropertyWhenPresent("createdBy", record::getCreatedBy)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: city")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<City>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, name, state, country, createdBy)
                .from(city);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: city")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<City>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, name, state, country, createdBy)
                .from(city);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: city")
    default City selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, name, state, country, createdBy)
                .from(city)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: city")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(City record) {
        return UpdateDSL.updateWithMapper(this::update, city)
                .set(name).equalTo(record::getName)
                .set(state).equalTo(record::getState)
                .set(country).equalTo(record::getCountry)
                .set(createdBy).equalTo(record::getCreatedBy);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: city")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(City record) {
        return UpdateDSL.updateWithMapper(this::update, city)
                .set(name).equalToWhenPresent(record::getName)
                .set(state).equalToWhenPresent(record::getState)
                .set(country).equalToWhenPresent(record::getCountry)
                .set(createdBy).equalToWhenPresent(record::getCreatedBy);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: city")
    default int updateByPrimaryKey(City record) {
        return UpdateDSL.updateWithMapper(this::update, city)
                .set(name).equalTo(record::getName)
                .set(state).equalTo(record::getState)
                .set(country).equalTo(record::getCountry)
                .set(createdBy).equalTo(record::getCreatedBy)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: city")
    default int updateByPrimaryKeySelective(City record) {
        return UpdateDSL.updateWithMapper(this::update, city)
                .set(name).equalToWhenPresent(record::getName)
                .set(state).equalToWhenPresent(record::getState)
                .set(country).equalToWhenPresent(record::getCountry)
                .set(createdBy).equalToWhenPresent(record::getCreatedBy)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}