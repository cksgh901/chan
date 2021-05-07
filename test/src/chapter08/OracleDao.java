package chapter08;

public class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");

	}

	@Override
	public void insert() {
		System.out.println("Oracle DB에 삽입");
		// TODO Auto-generated method stub

	}

	@Override
	public void update() {
		System.out.println("Oracle DB를 수정");
		// TODO Auto-generated method stub

	}

	@Override
	public void delete() {
		System.out.println("Oracle DB에서 삭제");
		// TODO Auto-generated method stub

	}

}
