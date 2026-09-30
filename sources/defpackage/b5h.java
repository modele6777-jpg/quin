package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b5h extends omg {
    private static final b5h zzg;
    private static volatile tng zzh;
    private int zzb;
    private zmg zze = wng.e;
    private r4h zzf;

    static {
        b5h b5hVar = new b5h();
        zzg = b5hVar;
        omg.m(b5h.class, b5hVar);
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zze", f5h.class, "zzf"});
        }
        if (i2 == 3) {
            return new b5h();
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
        synchronized (b5h.class) {
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

    public final List r() {
        return this.zze;
    }

    public final r4h s() {
        r4h r4hVar = this.zzf;
        return r4hVar == null ? r4h.t() : r4hVar;
    }
}
