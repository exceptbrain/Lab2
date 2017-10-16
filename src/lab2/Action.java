package lab2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

public class Action 
{
	
	private Pattern p = Pattern.compile("\\?");
    /*private String sql1="insert into author(authorid,name,age,country) values(?,?,?,?)"; 
      private String sql2="insert into book(isbn,title,authorid,publisher,publishdate,price) values(?,?,?,?,?,?)";
    */
    private List<String> list = new LinkedList<String>();
    private List<String> list0 = new LinkedList<String>();
    private List<String> list5 = new LinkedList<String>();
    ServletRequest request = ServletActionContext.getRequest();
    HttpServletRequest req = (HttpServletRequest) request;
    HttpSession session = req.getSession();
    private String username;
    private String title;
    private String isbn;
    private String name;
    private String publisher;
    private String publishdate;
    private String price;
    private String age;
    private String country;
    private String authorid;
    static int flag;
    
    private String file1;
    private String file2;
    private String kvalue;
    private String filek;
    private int svalue;
    private int tvalue;
    
    private String filew1;
    private String filew2;
    private int wvalue;
    private int t2value;
    private int stepvalue;
    int charsize = 50;
    char[][] point_array = new char[charsize][charsize];
    int w_size;
    int m_size;
    
    public String getFile1()
    {
        return file1;
    }
    public String getFile2()
    {
        return file2;
    }
    public String getKvalue()
    {
        return kvalue;
    }
    public String getFilek()
    {
        return filek;
    }
    public int getSvalue()
    {
        return svalue;
    }
    public int getTvalue()
    {
        return tvalue;
    }
    public String getFilew1()
    {
        return filew1;
    }
    public String getFilew2()
    {
        return filew2;
    }
    public int getWvalue()
    {
        return wvalue;
    }
    public int getT2value()
    {
        return t2value;
    }
    public int getStepvalue()
    {
        return stepvalue;
    }
    
    
    public String getUsername()
    {
        return username;
    }
    public String getIsbn()
    {
        return isbn;
    }
    public String getTitle()
    {
        return title;
    }
    public String getName()
    {
        return name;
    }
    public String getAuthorid()
    {
        return authorid;
    }
    public void setUsername(String username) 
    {
        this.username = username;
    }
    public void setAuthorid(String authorid) 
    {
        this.authorid = authorid;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }
    public void setName(String name) 
    {
        this.name =name;
    }
    public void setPublisher(String publisher) 
    {
        this.publisher = publisher;
    }
    public void setPublishdate(String publishdate) 
    {
        this.publishdate = publishdate;
    }
    public void setPrice(String price) 
    {
        this.price = price;
    }
    public void setIsbn(String isbn) 
    {
        this.isbn = isbn;
    }
    public void setAge(String age) 
    {
        this.age = age;
    }
    public void setCountry(String country) 
    {
        this.country=country;
    }
    
    public void setFile1(String file1) 
    {
        this.file1=file1;
    }
    public void setFile2(String file2) 
    {
        this.file2=file2;
    }
    public void setKvalue(String kvalue) 
    {
        this.kvalue=kvalue;
    }
    public void setFilek(String filek) 
    {
        this.filek=filek;
    }
    public void setSvalue(int svalue) 
    {
        this.svalue=svalue;
    }
    public void setTvalue(int tvalue) 
    {
        this.tvalue=tvalue;
    }
    public void setFilew1(String filew1) 
    {
        this.filew1=filew1;
    }
    public void setFilew2(String filew2) 
    {
        this.filew2=filew2;
    }
    public void setWvalue(int wvalue) 
    {
        this.wvalue=wvalue;
    }
    public void setT2value(int t2value) 
    {
        this.t2value=t2value;
    }
    public void setStepvalue(int stepvalue) 
    {
        this.stepvalue=stepvalue;
    }
    
    
    // all struts logic here
    public String gofasta() 
    {
    	List<String> list = new LinkedList<String>();
    	
        int maxlength = 500;
        //初始化查找表
    	int[][] findtable = new int[20][maxlength];
        int[] l = new int[20];
        for(int i=0;i<20;i++)
        {
        	for(int j=0;j<maxlength;j++)
        	{
        		findtable[i][j]=0;
        	}
        	l[i]=0;
        }
        
          	File file = new File(file1);
          	//~~~~可化类执行
      		//~~~~或用File对象构造一个Scanner对象
          	//字符串构建器
          	StringBuilder result = new StringBuilder();
          	//~~~~防止文件不存在抛异常
          	try 
          	{
          		//构造一个BufferedReader类来读取文件
      			//~~~~读入缓冲区更为高效
          		BufferedReader br = new BufferedReader(new FileReader(file));
          		String s= null;
          		//使用readLine一次读一行
          		while((s=br.readLine())!=null)
          		{
          			//连接一个字符串到末尾
          			result.append(s);
          		}
          		br.close();
          	} catch (Exception e)
          	{
          		e.printStackTrace();
          	}
          	//~~~~完成创建字符串
          	
          	String s20= result.toString();
          	String s2 = s20.toUpperCase();
          	char s3[] = s2.toCharArray();
          	
          	//System.out.println(s2);
          	
          	file = new File(file2);
          	//~~~~可化类执行
      		//~~~~或用File对象构造一个Scanner对象
          	//字符串构建器
          	result = new StringBuilder();
          	//~~~~防止文件不存在抛异常
          	try 
          	{
          		//构造一个BufferedReader类来读取文件
      			//~~~~读入缓冲区更为高效
          		BufferedReader br = new BufferedReader(new FileReader(file));
          		String t= null;
          		//使用readLine一次读一行
          		while((t=br.readLine())!=null)
          		{
          			//连接一个字符串到末尾
          			result.append(t);
          		}
          		br.close();
          	} catch (Exception e)
          	{
          		e.printStackTrace();
          	}
          	//~~~~完成创建字符串
          	String t20 = result.toString();
          	String t2 = t20.toUpperCase();
          	char[] t3 = t2.toCharArray(); 
          	//System.out.println(t2);
          	
        int[] tran = new int[100];
        int m=0;
        String choice = "other";
        
        //建立字母表
        char[] Alphabet = new char[30];
        if(choice.equals("DNA"))
        {
        	Alphabet[0] = 'A';
        	Alphabet[1] = 'C';
        	Alphabet[2] = 'G';
        	Alphabet[3] = 'T';
        	Alphabet[4] = '*';
        	for(int k=0;k<4;k++)
        	{
        		int ascii = Alphabet[k];
        		tran[ascii] = m;
        		m++;
        	}
        }
        
        else if(choice.equals("RNA"))
        {
        	Alphabet[0] = 'A';
        	Alphabet[1] = 'C';
        	Alphabet[2] = 'G';
        	Alphabet[3] = 'U';
        	Alphabet[4] = '*';
        	for(int k=0;k<4;k++)
        	{
        		int ascii = Alphabet[k];
        		tran[ascii] = m;
        		m++;
        	}
        }
        else if(choice.equals("other"))
        {
        	Alphabet[0] = 'A';
        	Alphabet[1] = 'C';
        	Alphabet[2] = 'D';
        	Alphabet[3] = 'E';
        	Alphabet[4] = 'F';
        	Alphabet[5] = 'G';
        	Alphabet[6] = 'H';
        	Alphabet[7] = 'I';
        	Alphabet[8] = 'K';
        	Alphabet[9] = 'L';
        	Alphabet[10] = 'M';
        	Alphabet[11] = 'N';
        	Alphabet[12] = 'P';
        	Alphabet[13] = 'Q';
        	Alphabet[14] = 'R';
        	Alphabet[15] = 'S';
        	Alphabet[16] = 'T';
        	Alphabet[17] = 'V';
        	Alphabet[18] = 'W';
        	Alphabet[19] = 'Y';
        	Alphabet[20] = '*';
        	
        	for(int k=0;k<Alphabet.length;k++)
        	{
        		int ascii = Alphabet[k];
        		tran[ascii] = m;
        		m++;
        	}
        }
        
        //建立查找表
        for(int i=0;i<s2.length();i++)
        {
        	int ascii1 = s3[i];
        	//System.out.print("//////"+ascii1);
        	int a2 = tran[ascii1];
        	//System.out.print("//////"+a2);
        	int a3 = l[a2];
        	findtable[a2][a3] = i+1;
        	l[a2]=a3+1;
        }
        
        session.setAttribute("Alphabet", Alphabet);
        session.setAttribute("findtable", findtable);
        
      //输出查找表
        
        /*for(int i=0;;i++)
        {
        	if(Alphabet[i]=='*')
        		break;
        	System.out.print(Alphabet[i]);
        	for(int j=0;;j++)
        	{
        		if(findtable[i][j]==0)  
        			break;
        		System.out.print(findtable[i][j]);
        	}
        	System.out.println(' ');
        }*/
        
        //建立位移表和位移向量表
        int flag1 = 0;
        int[][] d = new int[maxlength][maxlength];
        int[] dx = new int[1000];
        int[][] weiyi = new int[maxlength][maxlength];
        int[] flag2 = new int[maxlength];
        int j;
        for(int i=0;i<1000;i++)
        {
        	dx[i]=0;
        }
        for(int i=0;i<maxlength;i++)
        {
        	for(j=0;j<maxlength;j++)
        	{
        		weiyi[i][j]=0;
        	}
        	flag2[i]=0;
        }
        
        for(int i=0;i<t3.length;i++)
        {
        	for(j=0;;j++)
        	{
        		int ascii2 = t3[i];
        		int a2 = tran[ascii2];
        		if(findtable[a2][j]==0)
        			break;
        		d[i][j] = findtable[a2][j]-1-i;
        		dx[d[i][j]+499] = dx[d[i][j]+499] + 1;
        		weiyi[i][j]=d[i][j];
        		flag2[flag1]++;
        	}
        	flag1++;
        }
        
        //输出相对位移表
        /*for(int i=0;i<flag1;i++)
        {
        	System.out.print(t3[i]);
        	for(int j2=0;j2<flag2[i];j2++)
        	{
        		System.out.print(weiyi[i][j2]);
        	}
        	System.out.println(' ');
        }*/
        
        session.setAttribute("t3", t3);
        session.setAttribute("weiyi", weiyi);
        session.setAttribute("flag2", flag2);
        
        
        int max,max_n,temp;
        max = dx[0];
        max_n = 0;
        for(int i=1;i<1000;i++)
        {
            if(max<dx[i])
            {
                max=dx[i];
                max_n=i;
            }
        }
        int re = max_n - 499;
        
        /*System.out.println("最大匹配位移是： "+re);
        System.out.println("匹配数是："+max);*/
        
        session.setAttribute("re", re);
        session.setAttribute("max", max);
        
        return "SUCCESS";
    }
    
    public String gok() 
    {
    	
    	File file = new File(filek);
      	//~~~~可化类执行
  		//~~~~或用File对象构造一个Scanner对象
      	//字符串构建器
      	StringBuilder result = new StringBuilder();
      	//~~~~防止文件不存在抛异常
      	try 
      	{
      		//构造一个BufferedReader类来读取文件
  			//~~~~读入缓冲区更为高效
      		BufferedReader br = new BufferedReader(new FileReader(file));
      		String s= null;
      		//使用readLine一次读一行
      		while((s=br.readLine())!=null)
      		{
      			//连接一个字符串到末尾
      			result.append(s);
      		}
      		br.close();
      	} catch (Exception e)
      	{
      		e.printStackTrace();
      	}
      	//~~~~完成创建字符串
      	String s2= result.toString();
      	char s3[] = s2.toCharArray();
      	//System.out.println(s2);
    	
      	char[] str1 = new char[svalue+1];
      	char[] str2 = new char[tvalue-svalue-1];
      	char[] str3 = new char[s3.length-tvalue];
      	for(int i=0;i<svalue+1;i++)
      	{
      		str1[i]=s3[i];
      	}
      	for(int i=svalue+1;i<tvalue;i++)
      	{
      		str2[i-svalue-1]=s3[i];
      	}
      	for(int i=tvalue;i<s3.length;i++)
      	{
      		str3[i-tvalue]=s3[i];
      	}
      	
      	System.out.println(str1);
      	System.out.println(str2);
      	System.out.println(str3);
      	
      	session.setAttribute("str1", str1);
      	session.setAttribute("str2", str2);
      	session.setAttribute("str3", str3);
      	
    	return "SUCCESS";
    }
    
    //若匹配则为*，若不匹配则为空格
    public void point(char str_x[],int size_x,char str_y[],int size_y)
    {
    	int x,y,i,n;
    	for(y=0;y<=size_y-w_size;y++)
    	{
    		for(x=0;x<=size_x-w_size;x++)
    		{
    			n=0;
    			for(i=0;i<w_size;i++)
    			{
    				if(str_x[x+i]==str_y[y+i])
    	            n++;
    			}
    			if(n>=m_size)
    		    point_array[x][y]='*';
    		    else
    		    point_array[x][y]=' ';
    		}
    	}
      }
    //打印点阵图
    public void print_array(char str_x[],int size_x,char str_y[],int size_y)
    {
    	int x,y,i;
    	for(y=size_y-1;y>size_y-w_size;y--)
    	{
    		System.out.println(str_y[y]);
    	}
    	
    	for(y=size_y-w_size;y>=0;y--)
    	{
    		for(x=0;x<=size_x-w_size;x++)
    		{
    			if(x==0)
    			{
    				System.out.print(str_y[y]);
    				System.out.print(' ');
    			}
    			System.out.print(point_array[x][y]);
    			System.out.print(' ');
    			if(x==size_x-w_size)
    				System.out.println(' ');
    		}
    	}
    	for(i=0;i<size_x;i++)
    	{
    		if(i==0)
    			System.out.print(' ');
    		System.out.print(str_x[i]);
    		System.out.print(' ');
    	}
    }
    
    public String gowindow() 
    {
    	File file = new File(filew1);
      	//~~~~可化类执行
  		//~~~~或用File对象构造一个Scanner对象
      	//字符串构建器
      	StringBuilder result = new StringBuilder();
      	//~~~~防止文件不存在抛异常
      	try 
      	{
      		//构造一个BufferedReader类来读取文件
  			//~~~~读入缓冲区更为高效
      		BufferedReader br = new BufferedReader(new FileReader(file));
      		String s= null;
      		//使用readLine一次读一行
      		while((s=br.readLine())!=null)
      		{
      			//连接一个字符串到末尾
      			result.append(s);
      		}
      		br.close();
      	} catch (Exception e)
      	{
      		e.printStackTrace();
      	}
      	//~~~~完成创建字符串
      	String s2= result.toString();
      	char s3[] = s2.toCharArray();
      	//System.out.println(s2);
      	
      	file = new File(filew2);
      	//~~~~可化类执行
  		//~~~~或用File对象构造一个Scanner对象
      	//字符串构建器
      	result = new StringBuilder();
      	//~~~~防止文件不存在抛异常
      	try 
      	{
      		//构造一个BufferedReader类来读取文件
  			//~~~~读入缓冲区更为高效
      		BufferedReader br = new BufferedReader(new FileReader(file));
      		String s= null;
      		//使用readLine一次读一行
      		while((s=br.readLine())!=null)
      		{
      			//连接一个字符串到末尾
      			result.append(s);
      		}
      		br.close();
      	} catch (Exception e)
      	{
      		e.printStackTrace();
      	}
      	//~~~~完成创建字符串
      	String s4= result.toString();
      	char s5[] = s4.toCharArray();
      	//System.out.println(s4);
      	
      	int len,len1;
      	len=s3.length;
      	len1=s5.length;
      	w_size = wvalue;
      	m_size = t2value;
      	point(s3,len,s5,len1);
      	print_array(s3,len,s5,len1);
      	
    	return "SUCCESS";
    }
    
    
    public String execute() 
    {
        String sql0 ="select AuthorID from Author where Name=?";
        Matcher m1 = p.matcher(sql0);
        String sql1 = m1.replaceFirst('"'+username+'"');
        DBConnection connect = new DBConnection();
        list0=connect.select(sql1);
        if(list0.size() == 0)
            return "FAILED";
        
        String sql2 ="select Title from Book where AuthorID=?";
        Matcher m2 = p.matcher(sql2);
        String sql = m2.replaceFirst('"'+list0.get(0)+'"');
        list=connect.select(sql);
        session.setAttribute("list", list);
        session.setAttribute("username",username);
        session.setAttribute("authorid",list0.get(0));
        if(list.size() == 0)
            return "FAILED";
        
        String sql20 ="select ISBN from Book where AuthorID=?";
        Matcher m5 = p.matcher(sql20);
        String sql5 = m5.replaceFirst('"'+list0.get(0)+'"');
        list5=connect.select(sql5);
        session.setAttribute("list5", list5);
        if(list5.size() == 0)
            return "FAILED";
        else
            return "SUCCESS";
    }
    
    public String detail()
    {
        String sql0 ="select * from Author where AuthorID=?";
        Matcher m1 = p.matcher(sql0);
        //System.out.println(m1);
        //替换字符串
        String sql1 = m1.replaceFirst('"'+authorid+'"');
        DBConnection connect = new DBConnection();
        list0=connect.select(sql1);
        session.setAttribute("list0", list0);
        
        String sql2 ="select * from Book where ISBN=?";
        Matcher m2 = p.matcher(sql2);
        String sql3 = m2.replaceFirst('"'+isbn+'"');
        list=connect.select(sql3);
        session.setAttribute("list", list);
        
        //System.out.println(list.get(0));
        //System.out.println(list.get(1));
        //System.out.println(list.get(2));
        
        //System.out.println(list);
        //if(list.size()==0)
        if(list.equals(null))
            return "FAILED";
        else
            return "SUCCESS";
    }
    
    public String gotoedit()
    {
        return "SUCCESS";
    }
    
    public String edit()
    {
        flag = 0;
        String[] sql=new String[6];
        sql[0]="update Book set AuthorID=?,Publisher=?,PublishDate=?,Price=? where ISBN=?";
        String sql0="select * from Author where Name=?";
        Matcher m1 = p.matcher(sql0);
        String sql1 = m1.replaceFirst('"'+name+'"');
        DBConnection connect = new DBConnection();
        list=connect.select(sql1);
        list0=connect.select("select AuthorID from Author");
        m1=p.matcher(sql[0]);
        if(list.size()==0){
            if(list0.size()==0)
                authorid="1";
            else
                authorid=String.valueOf(Integer.parseInt(Collections.max(list0))+1);
        }
        else
            authorid=list.get(0);
        if(list.size()==0)
            return "ADD";
        sql[1] = m1.replaceFirst('"'+authorid+'"');
        m1=p.matcher(sql[1]);
        sql[2] = m1.replaceFirst('"'+publisher+'"');
        m1=p.matcher(sql[2]);
        sql[3] = m1.replaceFirst('"'+publishdate+'"');
        m1=p.matcher(sql[3]);
        sql[4] = m1.replaceFirst('"'+price+'"');
        m1=p.matcher(sql[4]);
        sql[5] = m1.replaceFirst('"'+isbn+'"');
        int signal=connect.update(sql[5]);
        if(signal==1)
            return "SUCCESS";
        else
            return "FAILED";
    }
    
    public String addauthor()
    {
        String[] sql=new String[5];
        sql[0]="insert into Author(AuthorID,Name,Age,Country) values(?,?,?,?)";
        Matcher m1 = p.matcher(sql[0]);
        sql[1] = m1.replaceFirst('"'+authorid+'"');
        m1 = p.matcher(sql[1]);
        sql[2] = m1.replaceFirst('"'+name+'"');
        m1 = p.matcher(sql[2]);
        sql[3] = m1.replaceFirst('"'+age+'"');
        m1 = p.matcher(sql[3]);
        sql[4] = m1.replaceFirst('"'+country+'"');
        DBConnection connect = new DBConnection();
        int signal=connect.insert(sql[4]);
        if(signal==1){
            if(flag==0)
                return "SUCCESS0";
            else
                return "SUCCESS1";
        }
        else
            return "FAILED";
    }
    
    public String delete()
    {
        String sql0 ="delete from Book where ISBN=?";
        Matcher m1 = p.matcher(sql0);
        String sql1 = m1.replaceFirst('"'+isbn+'"');
        DBConnection connect = new DBConnection();
        int signal=connect.delete(sql1);
        if(signal==1)
            return "SUCCESS";
        else
            return "FAILED";
    }
    
    public String addbook()
    {
        flag=1;
        String sql0="select * from Author where Name=?";
        Matcher m1 = p.matcher(sql0);
        String sql1 = m1.replaceFirst('"'+name+'"');
        DBConnection connect = new DBConnection();
        list=connect.select(sql1);
        list0=connect.select("select AuthorID from Author");
        if(list.size()==0){
            if(list0.size()==0)
                authorid="1";
            else
                authorid=String.valueOf(Integer.parseInt(Collections.max(list0))+1);
        }
        else
            authorid=list.get(0);
        if(list.size()==0)
            return "ADD";
        String sql="insert into Book(ISBN,Title,AuthorID,Publisher,PublishDate,Price) values(?,?,?,?,?,?)";
        m1 = p.matcher(sql);
        sql = m1.replaceFirst('"'+isbn+'"');
        m1 = p.matcher(sql);
        sql = m1.replaceFirst('"'+title+'"');
        m1 = p.matcher(sql);
        sql = m1.replaceFirst('"'+authorid+'"');
        m1 = p.matcher(sql);
        sql = m1.replaceFirst('"'+publisher+'"');
        m1 = p.matcher(sql);
        sql = m1.replaceFirst('"'+publishdate+'"');
        m1 = p.matcher(sql);
        sql = m1.replaceFirst('"'+price+'"');
        int signal=connect.insert(sql);
        if(signal==1)
            return "SUCCESS";
        else
            return "FAILED";
    }
    
    
}