package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class p4h extends omg {
    private static final p4h zzk;
    private static volatile tng zzl;
    private int zzb;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        p4h p4hVar = new p4h();
        zzk = p4hVar;
        omg.m(p4h.class, p4hVar);
    }

    public static n4h C() {
        return (n4h) zzk.h();
    }

    public final boolean A() {
        return (this.zzb & 32) != 0;
    }

    public final double B() {
        return this.zzj;
    }

    public final /* synthetic */ void D(long j) {
        this.zzb |= 1;
        this.zze = j;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void F(String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void G() {
        this.zzb &= -5;
        this.zzg = zzk.zzg;
    }

    public final /* synthetic */ void H(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final /* synthetic */ void I() {
        this.zzb &= -9;
        this.zzh = 0L;
    }

    public final /* synthetic */ void J(double d) {
        this.zzb |= 32;
        this.zzj = d;
    }

    public final /* synthetic */ void K() {
        this.zzb &= -33;
        this.zzj = 0.0d;
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new p4h();
        }
        if (i2 == 4) {
            return new n4h(zzk);
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
        synchronized (p4h.class) {
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

    public final long s() {
        return this.zze;
    }

    public final String t() {
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

    public final long x() {
        return this.zzh;
    }

    public final boolean y() {
        return (this.zzb & 16) != 0;
    }

    public final float z() {
        return this.zzi;
    }
}
