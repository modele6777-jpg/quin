package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class w1h extends omg {
    private static final w1h zzl;
    private static volatile tng zzm;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        w1h w1hVar = new w1h();
        zzl = w1hVar;
        omg.m(w1h.class, w1hVar);
    }

    public static v1h y() {
        return (v1h) zzl.h();
    }

    public static w1h z() {
        return zzl;
    }

    public final /* synthetic */ void A(boolean z) {
        this.zzb |= 1;
        this.zze = z;
    }

    public final /* synthetic */ void B(boolean z) {
        this.zzb |= 2;
        this.zzf = z;
    }

    public final /* synthetic */ void C(boolean z) {
        this.zzb |= 4;
        this.zzg = z;
    }

    public final /* synthetic */ void D(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
    }

    public final /* synthetic */ void E(boolean z) {
        this.zzb |= 16;
        this.zzi = z;
    }

    public final /* synthetic */ void F(boolean z) {
        this.zzb |= 32;
        this.zzj = z;
    }

    public final /* synthetic */ void G(boolean z) {
        this.zzb |= 64;
        this.zzk = z;
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new w1h();
        }
        if (i2 == 4) {
            return new v1h(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        tng tngVar = zzm;
        if (tngVar != null) {
            return tngVar;
        }
        synchronized (w1h.class) {
            try {
                nmgVar = zzm;
                if (nmgVar == null) {
                    nmgVar = new nmg(zzl);
                    zzm = nmgVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nmgVar;
    }

    public final boolean r() {
        return this.zze;
    }

    public final boolean s() {
        return this.zzf;
    }

    public final boolean t() {
        return this.zzg;
    }

    public final boolean u() {
        return this.zzh;
    }

    public final boolean v() {
        return this.zzi;
    }

    public final boolean w() {
        return this.zzj;
    }

    public final boolean x() {
        return this.zzk;
    }
}
