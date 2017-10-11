

import java.util.*;

public class MySet <E>  {

    List<E> multiSet = new ArrayList<E>();
    Set<E> set = new HashSet<E>();

  public void add(Object object)
  {
      multiSet.add((E) object);
  }

  Set<E> toSet()
  {
      set.addAll(multiSet);
      return set;
  }

  public void remuve(Object object)
  {
      for (int i = 0; i < multiSet.size(); i++) {
          if(object.equals(multiSet.get(i))) {multiSet.remove(i);}
      }
  }

  public boolean contain(Object object)
  {
      return multiSet.contains(object);
  }

  public void union (Set<E> set)
  {
        multiSet.addAll(set);
  }
  
  Set<E> interSet(Set<E> set)
  {
      Iterator<E> it = set.iterator();
      while(it.hasNext()) {
          if(multiSet.contains(it.next())) {this.set.add((E) it);}
      }

      return this.set;
  }


  public boolean isSubSet(Set<E> set)
  {
      return multiSet.containsAll(set);
  }

  public int size()
  {
      return multiSet.size();
  }

}
