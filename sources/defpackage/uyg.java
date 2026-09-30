package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class uyg extends omg {
    private static final uyg zzk;
    private static volatile tng zzl;
    private int zzb;
    private int zze;
    private String zzf = "";
    private nyg zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        uyg uygVar = new uyg();
        zzk = uygVar;
        omg.m(uyg.class, uygVar);
    }

    public static syg z() {
        return (syg) zzk.h();
    }

    public final /* synthetic */ void A(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new uyg();
        }
        if (i2 == 4) {
            return new syg(zzk);
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
        synchronized (uyg.class) {
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

    public final boolean r() {
        return (this.zzb & 1) != 0;
    }

    public final int s() {
        return this.zze;
    }

    public final String t() {
        return this.zzf;
    }

    public final nyg u() {
        nyg nygVar = this.zzg;
        return nygVar == null ? nyg.z() : nygVar;
    }

    public final boolean v() {
        return this.zzh;
    }

    public final boolean w() {
        return this.zzi;
    }

    public final boolean x() {
        return (this.zzb & 32) != 0;
    }

    public final boolean y() {
        return this.zzj;
    }
}
