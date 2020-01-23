package fi.vamk.tka.spring2;

import java.io.Serializable;
import javax.persistence.*;

//to enable you to create a compatible datbase table:
//CREATE TABLE IF NOT EXISTS `User` (`id` int(11) NOT NULL,`name` varchar(10) DEFAULT NULL) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
//ALTER TABLE `User` ADD PRIMARY KEY (`id`);
//ALTER TABLE `User` MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
//INSERT INTO `User` (`id`, `name`) VALUES (1, 'VAMK Oy'), (2, 'Timo');
/**
 * The persistent class for the User database table.
 * 
 */
@Entity
@NamedQuery(name="User.findAll", query="SELECT p FROM User p")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String name;

	public User() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}