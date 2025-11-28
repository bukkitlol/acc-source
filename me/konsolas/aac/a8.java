/*  1 */ package me.konsolas.aac;public class a8 extends aw implements Serializable, Cloneable { private static final long serialVersionUID = -7046029254386353129L; public boolean b(n paramn) { throw new UnsupportedOperationException(); }
/*    */    protected final int b; public de a() {
/*  3 */     return mW.a(this.b); } @Deprecated
/*  4 */   public void forEach(Consumer<Integer> paramConsumer) { paramConsumer.accept(Integer.valueOf(this.b)); }
/*  5 */   public Spliterator spliterator() { return b(); } @Deprecated
/*  6 */   public boolean removeIf(Predicate paramPredicate) { throw new UnsupportedOperationException(); }
/*  7 */   public boolean a(n paramn) { throw new UnsupportedOperationException(); }
/*  8 */   public boolean addAll(Collection paramCollection) { throw new UnsupportedOperationException(); }
/*  9 */   public fK b() { return hl.a(this.b); }
/* 10 */   public boolean d(int paramInt) { throw new UnsupportedOperationException(); }
/* 11 */   public cA b() { return a(); }
/* 12 */   public boolean retainAll(Collection paramCollection) { throw new UnsupportedOperationException(); }
/* 13 */   public Object clone() { return this; }
/* 14 */   public void a(IntConsumer paramIntConsumer) { paramIntConsumer.accept(this.b); } @Deprecated
/* 15 */   public Object[] toArray() { return new Object[] { Integer.valueOf(this.b) }; }
/*    */ 
/*    */   
/*    */   protected a8(int paramInt) {
/* 19 */     this.b = paramInt;
/* 20 */   } public Iterator iterator() { return a(); } public boolean c(n paramn) { throw new UnsupportedOperationException(); } public int[] a() { return new int[] { this.b }; } public boolean c(int paramInt) { try {  }
/* 21 */     catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return (paramInt == this.b); }
/* 22 */   public boolean a(IntPredicate paramIntPredicate) { throw new UnsupportedOperationException(); }
/* 23 */   public boolean removeAll(Collection paramCollection) { throw new UnsupportedOperationException(); } public int size() {
/* 24 */     return 1;
/*    */   }
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\a8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */