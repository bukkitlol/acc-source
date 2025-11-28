/*   */ package me.konsolas.aac;
/*   */ public final class iu {
/* 3 */   public static final bI a = new fZ(); public static bI a(bI parambI) { 
/* 4 */     try { if (parambI instanceof dP) return ((dP)parambI).a;  } catch (v v) { throw a(null); }
/* 5 */      return new dP(parambI); } public static final bI b = new ix(); public static bI a(Comparator paramComparator) { try {
/* 6 */       if (paramComparator != null) try { if (!(paramComparator instanceof bI))
/* 7 */             return new v(paramComparator); 
/*   */           return (bI)paramComparator; }
/*   */         catch (v v)
/*   */         { throw a(null); }
/*   */          
/*   */     } catch (v v) {
/*   */       throw a(null);
/*   */     } 
/*   */     return (bI)paramComparator; }
/*   */ 
/*   */   
/*   */   private static v a(v paramv) {
/*   */     return paramv;
/*   */   }
/*   */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\iu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */