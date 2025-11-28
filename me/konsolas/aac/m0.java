/* 1 */ package me.konsolas.aac;public class m0 implements hq, Serializable { public Comparator reversed() { return a(); } private static final long serialVersionUID = 1L; public hq a() {
/* 2 */     return f0.b; } private Object readResolve() {
/* 3 */     return f0.a;
/*   */   } public final int a(long paramLong1, long paramLong2) {
/* 5 */     return -Long.compare(paramLong1, paramLong2);
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\m0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */