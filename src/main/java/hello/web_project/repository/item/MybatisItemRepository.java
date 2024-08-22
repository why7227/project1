package hello.web_project.repository.item;

import hello.web_project.domain.item.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
//repository 는 단순히 mapper 에게 위임하는 기능
public class MybatisItemRepository implements ItemRepository {
    private final ItemMapper itemMapper;

    @Override
    public Item save(Item item) {
        itemMapper.save(item);
        return item;
    }

    @Override
    public void update(Long itemId, ItemUpdateDto updateParam) {
        itemMapper.update(itemId, updateParam);
    }

    @Override
    public Optional<Item> findById(Long itemId) {
        return itemMapper.findById(itemId);
    }

    @Override
    public List<Item> findAll(ItemSearchCond cond) {
        return itemMapper.findAll(cond);
    }

    @Override
    public void countHits(Long id) {
        itemMapper.countHits(id);
    }

    @Override
    public void delete(Long id) {
        itemMapper.delete(id);
    }
}

