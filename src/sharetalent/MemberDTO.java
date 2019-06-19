package sharetalent;
import java.security.MessageDigest;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;

public class MemberDTO {
    private String id;
    private String pw;
    private String name;
    private String phone;
    private String email;
    private String birthday;
    private String postcode;
    private String address;
    private String extraAddress;
    private String detailAddress;
    private String account;
    private String accountOwner;
    private String accountBank;
    private Timestamp registerDate;

    public String getId() { return id; }
    public void setId(String id) { this.id=id; }

    public String getPw() { return pw; }
    public void setPw(String pw) { this.pw=pw; }

    public String getName() { return name; }
    public void setName(String name) { this.name=name; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone=phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email=email; }

    public String getBirthday() { return birthday; }
    public void setBirthday(String birthday) { this.birthday=birthday; }

    public String getPostcode() { return postcode; }
    public void setPostcode(String postcode) { this.postcode=postcode; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address=address; }
    
	public String getDetailAddress() { return detailAddress; }
	public void setDetailAddress(String detailAddress) { this.detailAddress = detailAddress; }
	
	public String getExtraAddress() { return extraAddress; }
	public void setExtraAddress(String extraAddress) {	this.extraAddress = extraAddress;	}

    public String getAccount() { return account; }
    public void setAccount(String account) { this.account=account; }
    
    public String getAccountOwner() { return accountOwner; }
    public void setAccountOwner(String accountOwner) { this.accountOwner=accountOwner; }

    public String getAccountBank() { return accountBank; }
    public void setAccountBank(String accountBank) { this.accountBank=accountBank; }

    public Timestamp getRegisterDate() { return registerDate; }
    public void setRegisterDate(Timestamp registerDate) { this.registerDate=registerDate; }
}