package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class f5h extends omg {
    private static final f5h zzk;
    private static volatile tng zzl;
    private int zzb;
    private int zze;
    private zmg zzf = wng.e;
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        f5h f5hVar = new f5h();
        zzk = f5hVar;
        omg.m(f5h.class, f5hVar);
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zze", llg.p, "zzf", f5h.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new f5h();
        }
        if (i2 == 4) {
            return new oyg(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        tng tngVar = zzl;
        if (tngVar != null) {
            return tngVar;
        }
        synchronized (f5h.class) {
            try {
                nmgVar = zzl;
                if (nmgVar == null) {
                    nmgVar = new nmg(zzk);
                    zzl = nmgVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nmgVar;
    }

    public final List r() {
        return this.zzf;
    }

    public final String s() {
        return this.zzg;
    }

    public final boolean t() {
        return (this.zzb & 4) != 0;
    }

    public final String u() {
        return this.zzh;
    }

    public final boolean v() {
        return (this.zzb & 8) != 0;
    }

    public final boolean w() {
        return this.zzi;
    }

    public final boolean x() {
        return (this.zzb & 16) != 0;
    }

    public final double y() {
        return this.zzj;
    }

    public final int z() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
