/*  1 */ package me.konsolas.aac;public class fs extends fx implements hT, Serializable { private static final long serialVersionUID = -7046029254386353129L; protected final hT c; public int indexOf(Object paramObject) { synchronized (this.a) { return this.c.indexOf(paramObject); }
/*  2 */      } public void forEach(Consumer paramConsumer) { super.forEach(paramConsumer); }
/*  3 */   public void replaceAll(UnaryOperator<E> paramUnaryOperator) { synchronized (this.a) { this.c.replaceAll(paramUnaryOperator); }
/*  4 */      } public int hashCode() { synchronized (this.a) { return this.b.hashCode(); }
/*  5 */      } public boolean removeIf(Predicate<? super E> paramPredicate) { synchronized (this.a) { return this.c.removeIf(paramPredicate); }
/*  6 */      } public Object get(int paramInt) { synchronized (this.a) { return this.c.get(paramInt); }
/*  7 */      } public i0 b() { return this.c.b(); }
/*  8 */   public void clear() { super.clear(); }
/*  9 */   public ListIterator listIterator(int paramInt) { return a(paramInt); }
/* 10 */   public i0 a(int paramInt) { return this.c.a(paramInt); }
/* 11 */   public int size() { return super.size(); } public void c(int paramInt) {
/* 12 */     synchronized (this.a) { this.c.c(paramInt); }
/*    */   
/*    */   }
/* 15 */   public Object[] toArray() { return super.toArray(); }
/* 16 */   public boolean remove(Object paramObject) { return super.remove(paramObject); }
/* 17 */   public boolean addAll(Collection paramCollection) { return super.addAll(paramCollection); }
/* 18 */   public Iterator iterator() { return a(); }
/* 19 */   public void b(int paramInt, Object[] paramArrayOfObject) { synchronized (this.a) { this.c.b(paramInt, paramArrayOfObject); }
/* 20 */      } public void c(int paramInt1, Object[] paramArrayOfObject, int paramInt2, int paramInt3) { synchronized (this.a) { this.c.c(paramInt1, paramArrayOfObject, paramInt2, paramInt3); }
/* 21 */      } public void a(Object[] paramArrayOfObject) { synchronized (this.a) { this.c.a(paramArrayOfObject); }
/* 22 */      } public Object[] toArray(Object[] paramArrayOfObject) { return super.toArray(paramArrayOfObject); }
/* 23 */   public boolean removeAll(Collection paramCollection) { return super.removeAll(paramCollection); }
/* 24 */   public Stream stream() { return super.stream(); }
/* 25 */   protected fs(hT paramhT, Object paramObject) { super(paramhT, paramObject);
/* 26 */     this.c = paramhT; } public ea b() { return a(); }
/* 27 */   public hT a(int paramInt1, int paramInt2) { synchronized (this.a) { return new fs(this.c.a(paramInt1, paramInt2), this.a); }
/* 28 */      } public void b(int paramInt1, Object[] paramArrayOfObject, int paramInt2, int paramInt3) { synchronized (this.a) { this.c.b(paramInt1, paramArrayOfObject, paramInt2, paramInt3); }
/*    */      }
/* 30 */   public Object remove(int paramInt) { synchronized (this.a) { return this.c.remove(paramInt); }
/* 31 */      } public boolean isEmpty() { return super.isEmpty(); }
/* 32 */   public ae a() { return super.a(); }
/*    */   public List subList(int paramInt1, int paramInt2) { return a(paramInt1, paramInt2); }
/* 34 */   public int lastIndexOf(Object paramObject) { synchronized (this.a) { return this.c.lastIndexOf(paramObject); }  } public int a(List paramList) { synchronized (this.a) { return this.c.compareTo((T)paramList); }  } public void a(int paramInt1, Object[] paramArrayOfObject, int paramInt2, int paramInt3) { synchronized (this.a) { this.c.a(paramInt1, paramArrayOfObject, paramInt2, paramInt3); }  } public Stream parallelStream() { return super.parallelStream(); } protected fs(hT paramhT) { super(paramhT);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 44 */     this.c = paramhT; }
/* 45 */   public void c(int paramInt1, int paramInt2) { synchronized (this.a) { this.c.c(paramInt1, paramInt2); }  } public ListIterator listIterator() { return b(); } public boolean contains(Object paramObject) { return super.contains(paramObject); } public void add(int paramInt, Object paramObject) { synchronized (this.a) { this.c.add(paramInt, (E)paramObject); }  } public boolean addAll(int paramInt, Collection<? extends E> paramCollection) { synchronized (this.a) { return this.c.addAll(paramInt, paramCollection); }
/* 46 */      } public void b(Comparator paramComparator) { synchronized (this.a) { this.c.b(paramComparator); }
/* 47 */      } public boolean retainAll(Collection paramCollection) { return super.retainAll(paramCollection); } public boolean equals(Object paramObject) { 
/* 48 */     try { if (paramObject == this) return true;  } catch (v v) { throw a(null); }  synchronized (this.a) { return this.b.equals(paramObject); }
/* 49 */      } public void a(int paramInt, Object[] paramArrayOfObject) { synchronized (this.a) { this.c.a(paramInt, paramArrayOfObject); }
/* 50 */      } public i0 a() { return b(); }
/* 51 */   public String toString() { return super.toString(); }
/* 52 */   public void sort(Comparator paramComparator) { synchronized (this.a) { this.c.sort(paramComparator); }
/* 53 */      } public int compareTo(Object paramObject) { return a((List)paramObject); }
/* 54 */   public Object set(int paramInt, Object paramObject) { synchronized (this.a) { return this.c.set(paramInt, (E)paramObject); }
/* 55 */      } public boolean add(Object paramObject) { return super.add(paramObject); }
/* 56 */   private void writeObject(ObjectOutputStream paramObjectOutputStream) { synchronized (this.a) { paramObjectOutputStream.defaultWriteObject(); }
/* 57 */      } public boolean containsAll(Collection paramCollection) { return super.containsAll(paramCollection); }
/*    */ 
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\fs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */