package hello.web_project.domain.member;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.context.annotation.Primary;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class Member {
    private Long mId;

    @NotBlank(message = "이름을 입력해 주세요.")
    private String userName;

    @NotBlank(message = "아이디를 입력해 주세요.")
    private String loginId;

    @NotBlank(message = "비밀번호를 입력해 주세요.")
    @Pattern(regexp = "(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,16}", message = "비밀번호는 숫자와 영어 대/소문자, 특수문자가 1개 이상씩 포함한 8~16자여야 합니다. ")
    private String password;
    private String checkPassword;

    @NotBlank(message = "핸드폰번호를 입력해 주세요.")
    @Pattern(regexp = "^[0-9]+$", message="숫자만 입력할 수 있습니다")
    private String phone;

    @NotBlank(message = "이메일을 입력해 주세요.")
    private String email;

    @NotBlank(message = "우편번호를 입력해 주세요.")
    private String zipCode;

    @NotEmpty(message = "주소를 입력해 주세요.")
    private String address;

    @NotEmpty(message = "상세주소를 입력해 주세요.")
    private String detailAddress;

    @DateTimeFormat(pattern = "yyyy-MM-dd", iso = DateTimeFormat.ISO.DATE)
    private String birth;

    public Member() {
    }

    public Member(String userName, String loginId, String password, String checkPassword, String phone, String email, String zipCode, String address, String detailAddress, String birth) {
        this.userName = userName;
        this.loginId = loginId;
        this.password = password;
        this.checkPassword = checkPassword;
        this.phone = phone;
        this.email = email;
        this.zipCode = zipCode;
        this.address = address;
        this.detailAddress = detailAddress;
        this.birth = birth;
    }
}
