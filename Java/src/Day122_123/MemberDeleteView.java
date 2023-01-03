package Day122_123;

public class MemberDeleteView implements View {
	@Override
	public void input() {
		OneSelectView view = new OneSelectView();
		view.input();
		MemberDTO dto = view.getDto();
		if (dto == null || dto.getPw() ==null) {
			return;
		}

		MemberDAO dao = new MemberDAO();
		dao.deleteMember(dto.getId());
	}
}





