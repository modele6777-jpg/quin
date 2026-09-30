package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a1h extends omg {
    private static final a1h zzj;
    private static volatile tng zzk;
    private int zzb;
    private int zzh;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzi = "";

    static {
        a1h a1hVar = new a1h();
        zzj = a1hVar;
        omg.m(a1h.class, a1hVar);
    }

    public static a1h t() {
        return zzj;
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new a1h();
        }
        if (i2 == 4) {
            return new oyg(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        tng tngVar = zzk;
        if (tngVar != null) {
            return tngVar;
        }
        synchronized (a1h.class) {
            try {
                nmgVar = zzk;
                if (nmgVar == null) {
                    nmgVar = new nmg(zzj);
                    zzk = nmgVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nmgVar;
    }

    public final int r() {
        return this.zzh;
    }

    public final String s() {
        return this.zzi;
    }
}
