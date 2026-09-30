package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class k3h extends omg {
    private static final k3h zzh;
    private static volatile tng zzi;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private r1h zzg;

    static {
        k3h k3hVar = new k3h();
        zzh = k3hVar;
        omg.m(k3h.class, k3hVar);
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new k3h();
        }
        if (i2 == 4) {
            return new oyg(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        tng tngVar = zzi;
        if (tngVar != null) {
            return tngVar;
        }
        synchronized (k3h.class) {
            try {
                nmgVar = zzi;
                if (nmgVar == null) {
                    nmgVar = new nmg(zzh);
                    zzi = nmgVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nmgVar;
    }
}
