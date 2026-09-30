package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lyg extends omg {
    private static final lyg zzm;
    private static volatile tng zzn;
    private int zzb;
    private int zze;
    private String zzf = "";
    private zmg zzg = wng.e;
    private boolean zzh;
    private qyg zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        lyg lygVar = new lyg();
        zzm = lygVar;
        omg.m(lyg.class, lygVar);
    }

    public static kyg D() {
        return (kyg) zzm.h();
    }

    public final boolean A() {
        return this.zzk;
    }

    public final boolean B() {
        return (this.zzb & 64) != 0;
    }

    public final boolean C() {
        return this.zzl;
    }

    public final /* synthetic */ void E(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final void F(int i, nyg nygVar) {
        zmg zmgVarE = this.zzg;
        if (!((rlg) zmgVarE).a) {
            zmgVarE = xkg.e(zmgVarE);
            this.zzg = zmgVarE;
        }
        zmgVarE.set(i, nygVar);
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", nyg.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new lyg();
        }
        if (i2 == 4) {
            return new kyg(zzm);
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
        synchronized (lyg.class) {
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

    public final boolean r() {
        return (this.zzb & 1) != 0;
    }

    public final int s() {
        return this.zze;
    }

    public final String t() {
        return this.zzf;
    }

    public final List u() {
        return this.zzg;
    }

    public final int v() {
        return this.zzg.size();
    }

    public final nyg w(int i) {
        return (nyg) this.zzg.get(i);
    }

    public final boolean x() {
        return (this.zzb & 8) != 0;
    }

    public final qyg y() {
        qyg qygVar = this.zzi;
        return qygVar == null ? qyg.A() : qygVar;
    }

    public final boolean z() {
        return this.zzj;
    }
}
