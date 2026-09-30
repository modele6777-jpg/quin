package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class r4h extends omg {
    private static final r4h zze;
    private static volatile tng zzf;
    private zmg zzb = wng.e;

    static {
        r4h r4hVar = new r4h();
        zze = r4hVar;
        omg.m(r4h.class, r4hVar);
    }

    public static r4h t() {
        return zze;
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", u4h.class});
        }
        if (i2 == 3) {
            return new r4h();
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
        synchronized (r4h.class) {
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

    public final List r() {
        return this.zzb;
    }

    public final int s() {
        return this.zzb.size();
    }
}
