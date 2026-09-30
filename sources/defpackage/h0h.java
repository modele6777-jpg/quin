package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h0h extends omg {
    private static final h0h zze;
    private static volatile tng zzf;
    private zmg zzb = wng.e;

    static {
        h0h h0hVar = new h0h();
        zze = h0hVar;
        omg.m(h0h.class, h0hVar);
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new h0h();
        }
        if (i2 == 4) {
            return new oyg(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        tng tngVar = zzf;
        if (tngVar != null) {
            return tngVar;
        }
        synchronized (h0h.class) {
            try {
                nmgVar = zzf;
                if (nmgVar == null) {
                    nmgVar = new nmg(zze);
                    zzf = nmgVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nmgVar;
    }
}
