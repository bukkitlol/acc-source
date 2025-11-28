/* 1 */ package me.konsolas.aac.timings;public class CheckTask implements Runnable { private final AAC a; public void run() { long l1 = b ^ 0x676106DAAC0DL, l2 = l1 ^ 0x5723CD15C4BFL; this.a.a().a(l2); }
/*   */   
/*   */   private static final long b = nc.a(9098382674349518134L, 119237244135902110L, MethodHandles.lookup().lookupClass()).a(65360776673542L);
/*   */   public CheckTask(AAC paramAAC) {
/* 5 */     this.a = paramAAC;
/*   */     paramAAC.getServer().getScheduler().scheduleSyncRepeatingTask((Plugin)paramAAC, this, 1L, 1L);
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\timings\CheckTask.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */