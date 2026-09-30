package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class v2h extends omg {
    private static final v2h zzm;
    private static volatile tng zzn;
    private int zzb;
    private zmg zze = wng.e;
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    static {
        v2h v2hVar = new v2h();
        zzm = v2hVar;
        omg.m(v2h.class, v2hVar);
    }

    public static t2h H() {
        return (t2h) zzm.h();
    }

    public final long A() {
        return this.zzh;
    }

    public final boolean B() {
        return (this.zzb & 8) != 0;
    }

    public final int C() {
        return this.zzi;
    }

    public final boolean D() {
        return (this.zzb & 32) != 0;
    }

    public final long E() {
        return this.zzk;
    }

    public final boolean F() {
        return (this.zzb & 64) != 0;
    }

    public final long G() {
        return this.zzl;
    }

    public final /* synthetic */ void I(int i, e3h e3hVar) {
        s();
        this.zze.set(i, e3hVar);
    }

    public final /* synthetic */ void J(e3h e3hVar) {
        e3hVar.getClass();
        s();
        this.zze.add(e3hVar);
    }

    public final void K(Iterable iterable) {
        s();
        mmg.b(iterable, this.zze);
    }

    public final void L() {
        this.zze = wng.e;
    }

    public final /* synthetic */ void M(int i) {
        s();
        this.zze.remove(i);
    }

    public final /* synthetic */ void N(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void O(long j) {
        this.zzb |= 2;
        this.zzg = j;
    }

    public final /* synthetic */ void P(long j) {
        this.zzb |= 4;
        this.zzh = j;
    }

    public final /* synthetic */ void Q(long j) {
        this.zzb |= 16;
        this.zzj = j;
    }

    public final /* synthetic */ void R(long j) {
        this.zzb |= 32;
        this.zzk = j;
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004\u0007ဂ\u0005\bဂ\u0006", new Object[]{"zzb", "zze", e3h.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new v2h();
        }
        if (i2 == 4) {
            return new t2h(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        if (i2 != 6) {
            throw null;
        }
        tng tngVar = zzn;
        if (tngVar != null) {
            return tngVar;
        }
        synchronized (v2h.class) {
            try {
                nmgVar = zzn;
                if (nmgVar == null) {
                    nmgVar = new nmg(zzm);
                    zzn = nmgVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nmgVar;
    }

    public final /* synthetic */ void r(long j) {
        this.zzb |= 64;
        this.zzl = j;
    }

    public final void s() {
        zmg zmgVar = this.zze;
        if (((rlg) zmgVar).a) {
            return;
        }
        this.zze = xkg.e(zmgVar);
    }

    public final List t() {
        return this.zze;
    }

    public final int u() {
        return this.zze.size();
    }

    public final e3h v(int i) {
        return (e3h) this.zze.get(i);
    }

    public final String w() {
        return this.zzf;
    }

    public final boolean x() {
        return (this.zzb & 2) != 0;
    }

    public final long y() {
        return this.zzg;
    }

    public final boolean z() {
        return (this.zzb & 4) != 0;
    }
}
