package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nyg extends omg {
    private static final nyg zzi;
    private static volatile tng zzj;
    private int zzb;
    private wyg zze;
    private qyg zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        nyg nygVar = new nyg();
        zzi = nygVar;
        omg.m(nyg.class, nygVar);
    }

    public static nyg z() {
        return zzi;
    }

    public final /* synthetic */ void A(String str) {
        this.zzb |= 8;
        this.zzh = str;
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new nyg();
        }
        if (i2 == 4) {
            return new myg(zzi);
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
        synchronized (nyg.class) {
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

    public final wyg s() {
        wyg wygVar = this.zze;
        return wygVar == null ? wyg.y() : wygVar;
    }

    public final boolean t() {
        return (this.zzb & 2) != 0;
    }

    public final qyg u() {
        qyg qygVar = this.zzf;
        return qygVar == null ? qyg.A() : qygVar;
    }

    public final boolean v() {
        return (this.zzb & 4) != 0;
    }

    public final boolean w() {
        return this.zzg;
    }

    public final boolean x() {
        return (this.zzb & 8) != 0;
    }

    public final String y() {
        return this.zzh;
    }
}
