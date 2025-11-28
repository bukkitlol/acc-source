/*  1 */ package me.konsolas.aac;public class e1 implements i0, Serializable, Cloneable { public boolean hasPrevious() { return false; } private static final long serialVersionUID = -7046029254386353129L; public Object clone() {
/*  2 */     return fq.a;
/*    */   }
/*  4 */   public int b(int paramInt) { return 0; } public Object next() {
/*  5 */     throw new NoSuchElementException();
/*    */   } public void forEachRemaining(Consumer paramConsumer) {}
/*  7 */   public int a(int paramInt) { return 0; }
/*  8 */   private Object readResolve() { return fq.a; }
/*  9 */   public boolean hasNext() { return false; }
/* 10 */   public int previousIndex() { return -1; }
/* 11 */   public Object previous() { throw new NoSuchElementException(); } public int nextIndex() {
/* 12 */     return 0;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\e1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */