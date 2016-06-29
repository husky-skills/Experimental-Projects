This is working example for playframework with Hibernate 

This project uses -

Playframework "2.5.4" 
Hibernate 
	hibernate-entitymanager "4.3.5.Final"
Postgress JDBC Driver 
	postgresql "9.3-1102-jdbc41"
Postgress DB settings -
	            <property name="hibernate.dialect" value="org.hibernate.dialect.PostgreSQLDialect"/>
            <property name="hibernate.hbm2ddl.auto" value="create" />

db.default.driver=org.postgresql.Driver
db.default.url="jdbc:postgresql://localhost:5432/postgres"
db.default.username=postgres
db.default.password="postgres"
db.default.jndiName=DefaultDS
jpa.default=defaultPersistenceUnit
