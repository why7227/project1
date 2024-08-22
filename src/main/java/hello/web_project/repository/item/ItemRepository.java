package hello.web_project.repository.item;

import hello.web_project.domain.item.Item;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ItemRepository {
    Item save(Item item);
    void update(Long itemId, ItemUpdateDto updateParam);
    Optional<Item> findById(Long id);
    List<Item> findAll(ItemSearchCond cond);
    void countHits(Long id);
    void delete(Long id);
}
