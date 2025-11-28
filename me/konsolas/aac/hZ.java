/* 1 */ package me.konsolas.aac;public class hz implements kx, Serializable { public Comparator reversed() { return a(); } private static final long serialVersionUID = 1L; public kx a() {
/* 2 */     return iO.a; }
/* 3 */   private Object readResolve() { return iO.b; } public final int a(int paramInt1, int paramInt2) {
/* 4 */     return Integer.compare(paramInt1, paramInt2);
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\hz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */