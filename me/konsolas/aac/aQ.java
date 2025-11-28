/*  1 */ package me.konsolas.aac;public abstract class aq extends U { public boolean a(n paramn) { throw new UnsupportedOperationException(); }
/*  2 */   public Object[] toArray() { return mK.d; } public boolean equals(Object paramObject) { 
/*  3 */     try { if (paramObject == this) return true;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 15 */     try { if (!(paramObject instanceof Collection)) return false;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return ((Collection)paramObject).isEmpty(); }
/* 16 */   public int size() { return 0; } @Deprecated public boolean removeIf(Predicate paramPredicate) { Objects.requireNonNull(paramPredicate); return false; } public void a(IntConsumer paramIntConsumer) {} @Deprecated public void forEach(Consumer paramConsumer) {} public boolean c(int paramInt) { return false; }
/*    */   public void clear() {}
/* 18 */   public boolean retainAll(Collection paramCollection) { throw new UnsupportedOperationException(); } public boolean b(n paramn) { throw new UnsupportedOperationException(); } public cA b() { return a(); } public int[] a() { return fG.a; } public int hashCode() {
/* 19 */     return 0;
/*    */   }
/* 21 */   public fK b() { return hl.f; }
/* 22 */   public boolean a(IntPredicate paramIntPredicate) { Objects.requireNonNull(paramIntPredicate);
/* 23 */     return false; } public boolean containsAll(Collection paramCollection) { return paramCollection.isEmpty(); }
/* 24 */   public boolean removeAll(Collection paramCollection) { throw new UnsupportedOperationException(); }
/* 25 */   public Iterator iterator() { return a(); }
/* 26 */   public boolean addAll(Collection paramCollection) { throw new UnsupportedOperationException(); }
/* 27 */   public boolean d(n paramn) { return paramn.isEmpty(); } @Deprecated
/* 28 */   public int[] a(int[] paramArrayOfint) { return paramArrayOfint; }
/* 29 */   public Spliterator spliterator() { return b(); } public Object[] toArray(Object[] paramArrayOfObject) { 
/* 30 */     try { if (paramArrayOfObject.length > 0) paramArrayOfObject[0] = null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 31 */      return paramArrayOfObject; } public ik a() { return mW.c; } public boolean c(n paramn) {
/* 32 */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\aq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */