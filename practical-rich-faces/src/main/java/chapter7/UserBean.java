package chapter7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.faces.event.ActionEvent;



public class UserBean implements Serializable {
	private List<User> userList;
	private User selectedUser;
	private Integer rowsToUpdate;

	public User getSelectedUser() {
		return selectedUser;
	}

	public void setSelectedUser(User selectedUser) {
		this.selectedUser = selectedUser;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void updateUser(ActionEvent event) {
		int index = userList.indexOf(selectedUser);
//		rowsToUpdate.add(index);
		rowsToUpdate = index;
	}

	@PostConstruct
	public void init() {
		userList = new ArrayList<User>();
		for (int i = 0; i < 20; i++) {
			userList.add(new User("user"+i, "user"+i+"@email.com"));
		}
//		rowsToUpdate = new HashSet<Integer>();
		
	}

	public Set<Integer> getRowsToUpdate() {
		Set<Integer> rows = new HashSet<Integer>();
		rows.add(rowsToUpdate);
		return rows;
	}
}
