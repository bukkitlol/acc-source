/*    */ package me.konsolas.aac;public class ej implements Iterable { private final int b;
/*    */   private final int c;
/*    */   private final int d;
/*    */   private final Object[] a;
/*    */   
/*  6 */   public void a(int paramInt1, int paramInt2, int paramInt3, Object paramObject) { this.a[this.c * this.d * paramInt1 + this.d * paramInt2 + paramInt3] = paramObject; }
/*    */ 
/*    */   
/*  9 */   public Iterator iterator() { return Arrays.<Object>asList(this.a).iterator(); }
/* 10 */   public ej(int paramInt1, int paramInt2, int paramInt3) { this.b = paramInt1; this.c = paramInt2; this.d = paramInt3; this.a = new Object[paramInt1 * paramInt2 * paramInt3]; } public Object a(int paramInt1, int paramInt2, int paramInt3) { return this.a[this.c * this.d * paramInt1 + this.d * paramInt2 + paramInt3]; }
/*    */    }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ej.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */