/*  1 */ package me.konsolas.aac;public class bx extends bE implements hT, RandomAccess, Serializable, Cloneable { private static final long serialVersionUID = -7046029254386353129L; private static final long b = nc.a(-2355344765401624230L, 574874678760060634L, MethodHandles.lookup().lookupClass()).a(99777155875099L); private Object readResolve() { return cN.a; }
/*  2 */   public int hashCode() { return 1; }
/*  3 */   public void a(Object[] paramArrayOfObject) { throw new UnsupportedOperationException(); }
/*  4 */   public Object set(int paramInt, Object paramObject) { throw new UnsupportedOperationException(); } public i0 a(int paramInt) { 
/*  5 */     try { if (paramInt == 0) return fq.a;  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  throw new IndexOutOfBoundsException(String.valueOf(paramInt)); } public boolean equals(Object paramObject) { 
/*  6 */     try { if (paramObject instanceof List) try { if (((List)paramObject).isEmpty()); } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }   } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  return false; }
/*  7 */   public void a(int paramInt1, Object[] paramArrayOfObject, int paramInt2, int paramInt3) { throw new UnsupportedOperationException(); }
/*  8 */   public void b(int paramInt, Object[] paramArrayOfObject) { throw new UnsupportedOperationException(); }
/*  9 */   public ea b() { return a(); } public hT a(int paramInt1, int paramInt2) { 
/* 10 */     try { if (paramInt1 == 0) try { if (paramInt2 == 0) return this;  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }   } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  throw new IndexOutOfBoundsException(); }
/*    */    public void sort(Comparator paramComparator) {}
/* 12 */   public Object remove(int paramInt) { throw new UnsupportedOperationException(); } public void b(int paramInt1, Object[] paramArrayOfObject, int paramInt2, int paramInt3) {
/* 13 */     throw new UnsupportedOperationException();
/*    */   }
/* 15 */   public Object clone() { return cN.a; }
/* 16 */   public m4 a() { return a(); }
/* 17 */   public Object get(int paramInt) { throw new IndexOutOfBoundsException(); } public void c(int paramInt1, Object[] paramArrayOfObject, int paramInt2, int paramInt3) { 
/* 18 */     try { if (paramInt1 == 0) try { if (paramInt3 == 0) try { if (paramInt2 >= 0) try { if (paramInt2 <= paramArrayOfObject.length) return;  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }   } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }   } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }   } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  throw new IndexOutOfBoundsException(); } public void replaceAll(UnaryOperator paramUnaryOperator) {
/* 19 */     throw new UnsupportedOperationException();
/*    */   } public void b(Comparator paramComparator) {}
/* 21 */   public String toString() { long l = b ^ 0x31CDBFDF81C8L; "ꐟⱛ".toCharArray()[0] = (char)("ꐟⱛ".toCharArray()[0] ^ 0x18E4); return fW$gy.A("ꐟⱛ".toCharArray(), (short)10432, true, 0); } public int a(List paramList) { 
/* 22 */     try { if (paramList == this) return 0;  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     try {  }
/*    */     catch (IndexOutOfBoundsException indexOutOfBoundsException)
/* 32 */     { throw a(null); }  return paramList.isEmpty() ? 0 : -1; }
/* 33 */   public void a(int paramInt, Object[] paramArrayOfObject) { throw new UnsupportedOperationException(); } public ListIterator listIterator(int paramInt) { return a(paramInt); } public int compareTo(Object paramObject) { return a((List)paramObject); } public int lastIndexOf(Object paramObject) { return -1; } public boolean addAll(int paramInt, Collection paramCollection) { throw new UnsupportedOperationException(); }
/* 34 */   public boolean remove(Object paramObject) { throw new UnsupportedOperationException(); } public ListIterator listIterator() { return b(); } public Iterator iterator() { return a(); } public void add(int paramInt, Object paramObject) { throw new UnsupportedOperationException(); } public void c(int paramInt1, int paramInt2) { throw new UnsupportedOperationException(); } public int indexOf(Object paramObject) { return -1; }
/* 35 */   public i0 b() { return fq.a; }
/* 36 */   public void c(int paramInt) { throw new UnsupportedOperationException(); }
/* 37 */   public List subList(int paramInt1, int paramInt2) { return a(paramInt1, paramInt2); } public i0 a() {
/* 38 */     return fq.a;
/*    */   }
/*    */   
/*    */   private static IndexOutOfBoundsException a(IndexOutOfBoundsException paramIndexOutOfBoundsException) {
/*    */     return paramIndexOutOfBoundsException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\bx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */