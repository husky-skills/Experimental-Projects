package models;
import play.data.validation.Constraints;
import java.util.ArrayList;
import java.util.List;
import play.data.*;
import java.util.*;
import play.mvc.With;
public class User {
	
private static List<User> users;


static {
users = new ArrayList<User>();
users.add(new User("1111111111111", "Paperclips 1",
"Paperclips description 1"));
users.add(new User("2222222222222", "Paperclips 2",
"Paperclips description "));
users.add(new User("3333333333333", "Paperclips 3",
"Paperclips description 3"));
users.add(new User("4444444444444", "Paperclips 4",
"Paperclips description 4"));
users.add(new User("5555555555555", "Paperclips 5",
"Paperclips description 5"));
}
//public List<Tag>tags=new LinkedList<Tag>();

@Constraints.Required
public String ean;
@Constraints.Required
public String name;
public String email;


public User() {
}
public User(String ean, String name, String email) {
this.ean = ean;
this.name = name;
this.email = email;
}
public String toString() {
return String.format("%s - %s", ean, name);
}
public static List<User> findAll() {
return new ArrayList<User>(users);
}
public static User findByEan(String ean) {
for (User candidate : users) {
if (candidate.ean.equals(ean)) {
return candidate;
}
}
return null;
}
public static List<User> findByName(String term) {
final List<User> results = new ArrayList<User>();
for (User candidate : users) {
if (candidate.name.toLowerCase().contains(term.toLowerCase())) {
results.add(candidate);
}
}
return results;
}
public static boolean remove(User user) {
return users.remove(user);
}
public  void save() {
users.remove(findByEan(this.ean));
users.add(this);
}
}