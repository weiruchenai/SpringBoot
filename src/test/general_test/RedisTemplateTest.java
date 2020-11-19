package general_test;

import com.zjut.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class RedisTemplateTest {
	@Autowired
	private RedisTemplate redisTemplate;
	
	@Test
	public void redisTest(){
		//string类型
		redisTemplate.boundValueOps("name").set("小高");
		System.out.println("name = " + redisTemplate.opsForValue().get("name"));
		
		//hash类型
		redisTemplate.boundHashOps("hash_key").put("name", "小高");
		redisTemplate.boundHashOps("hash_key").put("age", "20");
		//获取所有域
		Set<String> set1 = redisTemplate.boundHashOps("hash_key").keys();
		System.out.println(" hash散列的所有域：" + set1);
		//获取所有值
		List<String> list1 = redisTemplate.boundHashOps("hash_key").values();
		System.out.println(" hash散列的所有域的值：" + list1);
		
		//list类型
		redisTemplate.boundListOps("list_key").leftPush("a");
		redisTemplate.boundListOps("list_key").leftPush("b");
		redisTemplate.boundListOps("list_key").leftPush("c");
		List<String> list2 = redisTemplate.boundListOps("list_key").range(0, -1);
		System.out.println("list中的全部元素：" + list2);
		
		//set类型
		redisTemplate.boundSetOps("set_key").add("a", "b", "c", "c");
		Set<String> set2 = redisTemplate.boundSetOps("set_key").members();
		System.out.println("set中的全部元素:" + set2);
		
		//有序集合
		redisTemplate.boundZSetOps("zset_key").add("yasuo", 10);
		redisTemplate.boundZSetOps("zset_key").add("yasuo", 50);
		redisTemplate.boundZSetOps("zset_key").add("yongen", 30);
		redisTemplate.boundZSetOps("zset_key").add("mangseng", 40);
		Set<String> set3 = redisTemplate.boundZSetOps("zset_key").range(0, -1);
		System.out.println("sortedset中的所有元素:" + set3);
	}
}
