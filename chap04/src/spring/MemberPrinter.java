package spring;

import java.time.format.DateTimeFormatter;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

public class MemberPrinter {

	public MemberPrinter() {
		System.out.println("생성자 실행");
		dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
	}
	
	private DateTimeFormatter dateTimeFormatter;
	
	@Autowired
	public void setDateFormatter(@Nullable DateTimeFormatter dateTimeFormatter) {
		System.out.println("세터 실행");
		this.dateTimeFormatter = dateTimeFormatter;
	}
	
	
//	@Autowired
//	public void setDateFormatter(Optional<DateTimeFormatter> formatterOpt) {
//		if (formatterOpt.isPresent()) {
//			this.dateTimeFormatter = formatterOpt.get();
//		} else {
//			this.dateTimeFormatter = null;
//		}
//	}
	
	
//	@Autowired(required = false)
//	public void setDateFormatter(DateTimeFormatter dateTimeFormatter) {
//		this.dateTimeFormatter = dateTimeFormatter;
//	}
	
	public void print(Member member) {
		if (dateTimeFormatter == null) {
			System.out.printf(
					"회원 정보: 아이디=%d, 이메일=%s, 이름=%s, 등록일=%tF\n", 
					member.getId(), member.getEmail(),
					member.getName(), member.getRegisterDateTime());
		} else {
			System.out.printf(
					"회원 정보: 아이디=%d, 이메일=%s, 이름=%s, 등록일=%s\n", 
					member.getId(), member.getEmail(),
					member.getName(), 
					dateTimeFormatter.format(member.getRegisterDateTime()));
		}
	}

}
