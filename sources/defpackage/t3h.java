package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class t3h extends omg {
    private static final t3h zzi;
    private static volatile tng zzj;
    private int zzb;
    private zmg zze = wng.e;
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        t3h t3hVar = new t3h();
        zzi = t3hVar;
        omg.m(t3h.class, t3hVar);
    }

    public static n3h y() {
        return (n3h) zzi.h();
    }

    public static n3h z(t3h t3hVar) {
        mmg mmgVarH = zzi.h();
        mmgVarH.f(t3hVar);
        return (n3h) mmgVarH;
    }

    public final /* synthetic */ void A(int i, z3h z3hVar) {
        G();
        this.zze.set(i, z3hVar);
    }

    public final /* synthetic */ void B(z3h z3hVar) {
        G();
        this.zze.add(z3hVar);
    }

    public final void C(ArrayList arrayList) {
        G();
        mmg.b(arrayList, this.zze);
    }

    public final void D() {
        this.zze = wng.e;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzg = str;
    }

    public final void G() {
        zmg zmgVar = this.zze;
        if (((rlg) zmgVar).a) {
            return;
        }
        this.zze = xkg.e(zmgVar);
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzi, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zze", z3h.class, "zzf", "zzg", "zzh", llg.k});
        }
        if (i2 == 3) {
            return new t3h();
        }
        if (i2 == 4) {
            return new n3h(zzi);
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
        synchronized (t3h.class) {
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

    public final List r() {
        return this.zze;
    }

    public final int s() {
        return this.zze.size();
    }

    public final z3h t(int i) {
        return (z3h) this.zze.get(i);
    }

    public final boolean u() {
        return (this.zzb & 1) != 0;
    }

    public final String v() {
        return this.zzf;
    }

    public final boolean w() {
        return (this.zzb & 2) != 0;
    }

    public final String x() {
        return this.zzg;
    }
}
