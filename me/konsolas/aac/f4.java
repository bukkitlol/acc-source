/*  1 */ package me.konsolas.aac;public class f4 implements de, Serializable, Cloneable { public int b(int paramInt) { return 0; } private static final long serialVersionUID = -7046029254386353129L; public boolean hasNext() {
/*  2 */     return false; }
/*  3 */   public boolean hasPrevious() { return false; }
/*  4 */   public Object clone() { return mW.c; } public int previousIndex() {
/*  5 */     return -1;
/*    */   } private Object readResolve() {
/*  7 */     return mW.c;
/*    */   } @Deprecated
/*    */   public void forEachRemaining(Consumer paramConsumer) {} public void forEachRemaining(IntConsumer paramIntConsumer) {}
/* 10 */   public int a(int paramInt) { return 0; }
/* 11 */   public int nextIndex() { return 0; }
/* 12 */   public void forEachRemaining(Object paramObject) { forEachRemaining((IntConsumer)paramObject); }
/* 13 */   public int a() { throw new NoSuchElementException(); } public int nextInt() {
/* 14 */     throw new NoSuchElementException();
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\f4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */