package tk.mybatis.simple.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import tk.mybatis.simple.model.Country;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class CountryMapperTest {
    private static SqlSessionFactory sqlSessionFactory;

    @BeforeClass
    public static void init(){
        try(Reader reader = Resources.getResourceAsReader("mybatis-config.xml");){
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }catch (IOException ignore){
            ignore.printStackTrace();
        }
    }

    @Test
    public void testSelectAll(){
        try(SqlSession sqlSession = sqlSessionFactory.openSession();){
            List<Country> countryList = sqlSession.selectList("selectAll");
            printCountryList(countryList);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void printCountryList(List<Country> countryList){
        for(Country country: countryList){
            System.out.printf("%-4d%4s%4s\n", country.getId(), country.getCountryname(), country.getCountrycode());
        }
    }
}
