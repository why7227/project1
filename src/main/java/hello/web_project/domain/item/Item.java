package hello.web_project.domain.item;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
public class Item {
    private Long id;

    @NotBlank(message = "상품명을 입력해 주세요.")
    private String itemName;

    @Range(min = 1000, max = 1000000)
    @NotNull(message = "상품 가격을 입력해 주세요.")
    private Integer price;

    @Max(9999)
    @NotNull(message = "상품 수량을 입력해 주세요.")
    private Integer quantity;

    @DateTimeFormat
    private LocalDateTime createDate;

    private int updateHits;  // 조회수

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
