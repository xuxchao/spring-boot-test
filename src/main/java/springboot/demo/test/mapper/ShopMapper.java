package springboot.demo.test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;
import springboot.demo.test.entity.Shop;

import java.util.List;

@Component
public interface ShopMapper extends BaseMapper<Shop> { }

