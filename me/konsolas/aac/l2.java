/* 1 */ package me.konsolas.aac;public class l2 implements Comparator, Serializable { private static final long serialVersionUID = 1L; public final int compare(Object paramObject1, Object paramObject2) { return this.a.compare(paramObject2, paramObject1); } final Comparator a; protected l2(Comparator paramComparator) {
/* 2 */     this.a = paramComparator; } public final Comparator reversed() {
/* 3 */     return this.a;
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\l2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */