package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zyg extends omg {
    private static final zyg zzg;
    private static volatile tng zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        zyg zygVar = new zyg();
        zzg = zygVar;
        omg.m(zyg.class, zygVar);
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            llg llgVar = llg.f;
            return new xng(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", llgVar, "zzf", llgVar});
        }
        if (i2 == 3) {
            return new zyg();
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
        synchronized (zyg.class) {
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

    public final int r() {
        int iN = fbc.n(this.zze);
        if (iN == 0) {
            return 1;
        }
        return iN;
    }

    public final int s() {
        int iN = fbc.n(this.zzf);
        if (iN == 0) {
            return 1;
        }
        return iN;
    }
}
