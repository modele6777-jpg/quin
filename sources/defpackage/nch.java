package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nch extends omg {
    private static final nch zze;
    private static volatile tng zzf;
    private zmg zzb = wng.e;

    static {
        nch nchVar = new nch();
        zze = nchVar;
        omg.m(nch.class, nchVar);
    }

    public static nch s(byte[] bArr, hmg hmgVar) {
        return (nch) omg.c(zze, bArr, hmgVar);
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
            return new nch();
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
        synchronized (nch.class) {
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
}
