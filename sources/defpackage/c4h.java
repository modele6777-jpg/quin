package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c4h extends omg {
    private static final c4h zzg;
    private static volatile tng zzh;
    private int zzb;
    private int zze = 1;
    private zmg zzf = wng.e;

    static {
        c4h c4hVar = new c4h();
        zzg = c4hVar;
        omg.m(c4h.class, c4hVar);
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzb", "zze", llg.l, "zzf", z2h.class});
        }
        if (i2 == 3) {
            return new c4h();
        }
        if (i2 == 4) {
            return new oyg(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        tng tngVar = zzh;
        if (tngVar != null) {
            return tngVar;
        }
        synchronized (c4h.class) {
            try {
                nmgVar = zzh;
                if (nmgVar == null) {
                    nmgVar = new nmg(zzg);
                    zzh = nmgVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nmgVar;
    }
}
