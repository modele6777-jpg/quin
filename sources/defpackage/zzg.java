package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzg extends omg {
    private static final zzg zzi;
    private static volatile tng zzj;
    private int zzb;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        zzg zzgVar = new zzg();
        zzi = zzgVar;
        omg.m(zzg.class, zzgVar);
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzg();
        }
        if (i2 == 4) {
            return new yzg(zzi);
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
        synchronized (zzg.class) {
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

    public final String r() {
        return this.zze;
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

    public final boolean v() {
        return this.zzg;
    }

    public final boolean w() {
        return (this.zzb & 8) != 0;
    }

    public final int x() {
        return this.zzh;
    }

    public final /* synthetic */ void y(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }
}
