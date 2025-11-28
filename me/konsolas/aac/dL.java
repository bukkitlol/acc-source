/* 1 */ package me.konsolas.aac;public class dl implements g9, Serializable { public g9 a() { return dT.a; } private static final long serialVersionUID = 1L; public Comparator reversed() {
/* 2 */     return a(); } private Object readResolve() {
/* 3 */     return dT.b;
/*   */   } public final int a(byte paramByte1, byte paramByte2) {
/* 5 */     return -Byte.compare(paramByte1, paramByte2);
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\dl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */