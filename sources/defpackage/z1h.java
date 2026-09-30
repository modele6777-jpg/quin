package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class z1h extends omg {
    private static final z1h zzi;
    private static volatile tng zzj;
    private int zzb;
    private int zze;
    private e4h zzf;
    private e4h zzg;
    private boolean zzh;

    static {
        z1h z1hVar = new z1h();
        zzi = z1hVar;
        omg.m(z1h.class, z1hVar);
    }

    public static x1h y() {
        return (x1h) zzi.h();
    }

    public final /* synthetic */ void A(e4h e4hVar) {
        this.zzf = e4hVar;
        this.zzb |= 2;
    }

    public final /* synthetic */ void B(e4h e4hVar) {
        this.zzg = e4hVar;
        this.zzb |= 4;
    }

    public final /* synthetic */ void C(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new z1h();
        }
        if (i2 == 4) {
            return new x1h(zzi);
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
        synchronized (z1h.class) {
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

    public final int s() {
        return this.zze;
    }

    public final e4h t() {
        e4h e4hVar = this.zzf;
        return e4hVar == null ? e4h.A() : e4hVar;
    }

    public final boolean u() {
        return (this.zzb & 4) != 0;
    }

    public final e4h v() {
        e4h e4hVar = this.zzg;
        return e4hVar == null ? e4h.A() : e4hVar;
    }

    public final boolean w() {
        return (this.zzb & 8) != 0;
    }

    public final boolean x() {
        return this.zzh;
    }

    public final /* synthetic */ void z(int i) {
        this.zzb |= 1;
        this.zze = i;
    }
}
