package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qyg extends omg {
    private static final qyg zzj;
    private static volatile tng zzk;
    private int zzb;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        qyg qygVar = new qyg();
        zzj = qygVar;
        omg.m(qyg.class, qygVar);
    }

    public static qyg A() {
        return zzj;
    }

    public final int B() {
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

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zze", llg.c, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new qyg();
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
        synchronized (qyg.class) {
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

    public final boolean r() {
        return (this.zzb & 1) != 0;
    }

    public final boolean s() {
        return (this.zzb & 2) != 0;
    }

    public final boolean t() {
        return this.zzf;
    }

    public final boolean u() {
        return (this.zzb & 4) != 0;
    }

    public final String v() {
        return this.zzg;
    }

    public final boolean w() {
        return (this.zzb & 8) != 0;
    }

    public final String x() {
        return this.zzh;
    }

    public final boolean y() {
        return (this.zzb & 16) != 0;
    }

    public final String z() {
        return this.zzi;
    }
}
