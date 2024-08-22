package hello.web_project.repository.item;

import hello.web_project.domain.item.Item;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;


//구현체가 없어도 자동으로 객체 만들어줌
//프록시 구현체 덕분에 xml 데이터를 찾아 호출할 수 있고, DataAccessException 에 맞게 변환해서 반환해줌
@Mapper
public interface ItemMapper {
    void save(Item item);
    void update(@Param("id") Long id, @Param("updateParam") ItemUpdateDto updateParam);
    Optional<Item> findById(Long id);
    List<Item> findAll(ItemSearchCond ItemSearch);
    void countHits(Long id);
    void delete(Long id);
}

