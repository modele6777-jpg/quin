package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class szg extends omg {
    private static final szg zzj;
    private static volatile tng zzk;
    private int zzb;
    private zmg zze;
    private zmg zzf;
    private zmg zzg;
    private boolean zzh;
    private zmg zzi;

    static {
        szg szgVar = new szg();
        zzj = szgVar;
        omg.m(szg.class, szgVar);
    }

    public szg() {
        wng wngVar = wng.e;
        this.zze = wngVar;
        this.zzf = wngVar;
        this.zzg = wngVar;
        this.zzi = wngVar;
    }

    public static szg x() {
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
            return new xng(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zze", xyg.class, "zzf", zyg.class, "zzg", jzg.class, "zzh", "zzi", xyg.class});
        }
        if (i2 == 3) {
            return new szg();
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
        synchronized (szg.class) {
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

    public final List r() {
        return this.zze;
    }

    public final List s() {
        return this.zzf;
    }

    public final List t() {
        return this.zzg;
    }

    public final boolean u() {
        return (this.zzb & 1) != 0;
    }

    public final boolean v() {
        return this.zzh;
    }

    public final zmg w() {
        return this.zzi;
    }
}
