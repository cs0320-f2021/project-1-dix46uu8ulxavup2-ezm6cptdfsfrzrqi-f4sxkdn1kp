import java.util.*;  


class valueComparator implements Comparator{  

public int compare(Object o1,Object o2){  
List<INode> s1=(List<INode>)o1;  
List<INode> s2=(List<INode>)o2;  
  
if(s1.==s2.age)  
return 0;  
else if(s1.age>s2.age)  
return 1;  
else  
return -1;  
}  
}