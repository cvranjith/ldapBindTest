import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
public class ldapBindTest {
    public static void main(String[] args) {
        Hashtable<String, String> env = new Hashtable<String,String>();
        env.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.ldap.LdapCtxFactory");
        env.put(Context.PROVIDER_URL, args[0]); //"ldap://localhost:103899 ldap://localhost:10389");
        env.put(Context.SECURITY_PRINCIPAL, args[1]); //"cn=Ranjith Vijayan,ou=people,o=ranjithldap";
        env.put(Context.SECURITY_CREDENTIALS, args[2]); //"Oracle1232";
        DirContext context = null;
        try {
            context = new InitialDirContext(env);
            System.out.println("Success!!");
        } catch (Exception ex) {
            System.out.println("Failed " + ex);
        }
    }
}
