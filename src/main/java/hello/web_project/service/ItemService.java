package hello.web_project.service;

import hello.web_project.domain.item.Item;
import hello.web_project.repository.item.ItemRepository;
import hello.web_project.repository.item.ItemSearchCond;
import hello.web_project.repository.item.ItemUpdateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;

    public Item save(Item item) {
        return itemRepository.save(item);
    }
    public void update(Long itemId, ItemUpdateDto updateParam) {
        itemRepository.update(itemId, updateParam);
    }

    public Optional<Item> findById(Long mId) {
        return itemRepository.findById(mId);
    }
    public List<Item> findItems(ItemSearchCond cond) {
        return itemRepository.findAll(cond);
    }
    public void countHits(Long id) {
       itemRepository.countHits(id);
    }
    public void delete(Long id) { itemRepository.delete(id); }
}
