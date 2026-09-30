package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wyg extends omg {
    private static final wyg zzi;
    private static volatile tng zzj;
    private int zzb;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private zmg zzh = wng.e;

    static {
        wyg wygVar = new wyg();
        zzi = wygVar;
        omg.m(wyg.class, wygVar);
    }

    public static wyg y() {
        return zzi;
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zze", llg.d, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new wyg();
        }
        if (i2 == 4) {
            return new oyg(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        tng tngVar = zzj;
        if (tngVar != null) {
            return tngVar;
        }
        synchronized (wyg.class) {
            try {
                nmgVar = zzj;
                if (nmgVar == null) {
                    nmgVar = new nmg(zzi);
                    zzj = nmgVar;
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

    public final String t() {
        return this.zzf;
    }

    public final boolean u() {
        return (this.zzb & 4) != 0;
    }

    public final boolean v() {
        return this.zzg;
    }

    public final zmg w() {
        return this.zzh;
    }

    public final int x() {
        return this.zzh.size();
    }

    public final int z() {
        int i;
        switch (this.zze) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
