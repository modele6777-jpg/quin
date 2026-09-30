package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jyg extends omg {
    private static final jyg zzj;
    private static volatile tng zzk;
    private int zzb;
    private int zze;
    private zmg zzf;
    private zmg zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        jyg jygVar = new jyg();
        zzj = jygVar;
        omg.m(jyg.class, jygVar);
    }

    public jyg() {
        wng wngVar = wng.e;
        this.zzf = wngVar;
        this.zzg = wngVar;
    }

    public final void A(int i, lyg lygVar) {
        zmg zmgVarE = this.zzg;
        if (!((rlg) zmgVarE).a) {
            zmgVarE = xkg.e(zmgVarE);
            this.zzg = zmgVarE;
        }
        zmgVarE.set(i, lygVar);
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zze", "zzf", uyg.class, "zzg", lyg.class, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new jyg();
        }
        if (i2 == 4) {
            return new iyg(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        tng tngVar = zzk;
        if (tngVar != null) {
            return tngVar;
        }
        synchronized (jyg.class) {
            try {
                nmgVar = zzk;
                if (nmgVar == null) {
                    nmgVar = new nmg(zzj);
                    zzk = nmgVar;
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

    public final List t() {
        return this.zzf;
    }

    public final int u() {
        return this.zzf.size();
    }

    public final uyg v(int i) {
        return (uyg) this.zzf.get(i);
    }

    public final zmg w() {
        return this.zzg;
    }

    public final int x() {
        return this.zzg.size();
    }

    public final lyg y(int i) {
        return (lyg) this.zzg.get(i);
    }

    public final void z(int i, uyg uygVar) {
        zmg zmgVarE = this.zzf;
        if (!((rlg) zmgVarE).a) {
            zmgVarE = xkg.e(zmgVarE);
            this.zzf = zmgVarE;
        }
        zmgVarE.set(i, uygVar);
    }
}
