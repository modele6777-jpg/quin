package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hah extends omg {
    private static final hah zzf;
    private static volatile tng zzg;
    private int zzb;
    private boolean zze;

    static {
        hah hahVar = new hah();
        zzf = hahVar;
        omg.m(hah.class, hahVar);
    }

    public static hah s() {
        return zzf;
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzf, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new hah();
        }
        if (i2 == 4) {
            return new oyg(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            throw null;
        }
        tng tngVar = zzg;
        if (tngVar != null) {
            return tngVar;
        }
        synchronized (hah.class) {
            try {
                nmgVar = zzg;
                if (nmgVar == null) {
                    nmgVar = new nmg(zzf);
                    zzg = nmgVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nmgVar;
    }

    public final boolean r() {
        return this.zze;
    }
}
