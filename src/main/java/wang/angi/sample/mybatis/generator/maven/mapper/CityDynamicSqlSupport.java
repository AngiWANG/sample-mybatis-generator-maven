package wang.angi.sample.mybatis.generator.maven.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CityDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: city")
    public static final City city = new City();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: city.id")
    public static final SqlColumn<Integer> id = city.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: city.name")
    public static final SqlColumn<String> name = city.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: city.state")
    public static final SqlColumn<String> state = city.state;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: city.country")
    public static final SqlColumn<String> country = city.country;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: city.created_by")
    public static final SqlColumn<String> createdBy = city.createdBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: city")
    public static final class City extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> state = column("state", JDBCType.VARCHAR);

        public final SqlColumn<String> country = column("country", JDBCType.VARCHAR);

        public final SqlColumn<String> createdBy = column("created_by", JDBCType.VARCHAR);

        public City() {
            super("city");
        }
    }
}