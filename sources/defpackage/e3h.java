package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e3h extends omg {
    private static final e3h zzk;
    private static volatile tng zzl;
    private int zzb;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = "";
    private String zzf = "";
    private zmg zzj = wng.e;

    static {
        e3h e3hVar = new e3h();
        zzk = e3hVar;
        omg.m(e3h.class, e3hVar);
    }

    public static d3h D() {
        return (d3h) zzk.h();
    }

    public final double A() {
        return this.zzi;
    }

    public final zmg B() {
        return this.zzj;
    }

    public final int C() {
        return this.zzj.size();
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void G() {
        this.zzb &= -3;
        this.zzf = zzk.zzf;
    }

    public final /* synthetic */ void H(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }

    public final /* synthetic */ void I() {
        this.zzb &= -5;
        this.zzg = 0L;
    }

    public final /* synthetic */ void J(double d) {
        this.zzb |= 16;
        this.zzi = d;
    }

    public final /* synthetic */ void K() {
        this.zzb &= -17;
        this.zzi = 0.0d;
    }

    public final void L(e3h e3hVar) {
        zmg zmgVarE = this.zzj;
        if (!((rlg) zmgVarE).a) {
            zmgVarE = xkg.e(zmgVarE);
            this.zzj = zmgVarE;
        }
        zmgVarE.add(e3hVar);
    }

    public final void M(ArrayList arrayList) {
        zmg zmgVarE = this.zzj;
        if (!((rlg) zmgVarE).a) {
            zmgVarE = xkg.e(zmgVarE);
            this.zzj = zmgVarE;
        }
        mmg.b(arrayList, zmgVarE);
    }

    public final void N() {
        this.zzj = wng.e;
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", e3h.class});
        }
        if (i2 == 3) {
            return new e3h();
        }
        if (i2 == 4) {
            return new d3h(zzk);
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
        synchronized (e3h.class) {
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

    public final String s() {
        return this.zze;
    }

    public final boolean t() {
        return (this.zzb & 2) != 0;
    }

    public final String u() {
        return this.zzf;
    }

    public final boolean v() {
        return (this.zzb & 4) != 0;
    }

    public final long w() {
        return this.zzg;
    }

    public final boolean x() {
        return (this.zzb & 8) != 0;
    }

    public final float y() {
        return this.zzh;
    }

    public final boolean z() {
        return (this.zzb & 16) != 0;
    }
}
