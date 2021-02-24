package springexform;

import org.springframework.jdbc.core.JdbcTemplate;

public class Sampledao {
private JdbcTemplate jt;

public void setJt(JdbcTemplate jt) {
	this.jt = jt;
}
public int save(Sample s) {
	String sql="insert into register values('"+s.getName()+"','"+s.getEmail()+"','"+s.getPwd()+"','"+s.getGen()+"')";
	return jt.update(sql);
}
}