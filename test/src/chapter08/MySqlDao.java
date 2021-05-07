package chapter08;

public class MySqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Mysql DB에서 검색");
		// TODO Auto-generated method stub

	}

	@Override
	public void insert() {
		System.out.println("Mysql DB에 삽입");
		// TODO Auto-generated method stub

	}

	@Override
	public void update() {
		System.out.println("Mysql DB를 수정");

		// TODO Auto-generated method stub

	}

	@Override
	public void delete() {
		System.out.println("Mysql DB에서 삭제");

		// TODO Auto-generated method stub

	}

}
