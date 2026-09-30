package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e4h extends omg {
    private static final e4h zzh;
    private static volatile tng zzi;
    private ymg zzb;
    private ymg zze;
    private zmg zzf;
    private zmg zzg;

    static {
        e4h e4hVar = new e4h();
        zzh = e4hVar;
        omg.m(e4h.class, e4hVar);
    }

    public e4h() {
        fng fngVar = fng.e;
        this.zzb = fngVar;
        this.zze = fngVar;
        wng wngVar = wng.e;
        this.zzf = wngVar;
        this.zzg = wngVar;
    }

    public static e4h A() {
        return zzh;
    }

    public static d4h z() {
        return (d4h) zzh.h();
    }

    public final void B(Iterable iterable) {
        List list = this.zzb;
        boolean z = ((rlg) list).a;
        List list2 = list;
        if (!z) {
            fng fngVar = (fng) list;
            int i = fngVar.c;
            fng fngVarK0 = fngVar.k0(i + i);
            this.zzb = fngVarK0;
            list2 = fngVarK0;
        }
        mmg.b(iterable, list2);
    }

    public final void C() {
        this.zzb = fng.e;
    }

    public final void D(List list) {
        List list2 = this.zze;
        boolean z = ((rlg) list2).a;
        List list3 = list2;
        if (!z) {
            fng fngVar = (fng) list2;
            int i = fngVar.c;
            fng fngVarK0 = fngVar.k0(i + i);
            this.zze = fngVarK0;
            list3 = fngVarK0;
        }
        mmg.b(list, list3);
    }

    public final void E() {
        this.zze = fng.e;
    }

    public final void F(ArrayList arrayList) {
        zmg zmgVarE = this.zzf;
        if (!((rlg) zmgVarE).a) {
            zmgVarE = xkg.e(zmgVarE);
            this.zzf = zmgVarE;
        }
        mmg.b(arrayList, zmgVarE);
    }

    public final void G() {
        this.zzf = wng.e;
    }

    public final void H(Iterable iterable) {
        zmg zmgVarE = this.zzg;
        if (!((rlg) zmgVarE).a) {
            zmgVarE = xkg.e(zmgVarE);
            this.zzg = zmgVarE;
        }
        mmg.b(iterable, zmgVarE);
    }

    public final void I() {
        this.zzg = wng.e;
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzh, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zze", "zzf", s2h.class, "zzg", h4h.class});
        }
        if (i2 == 3) {
            return new e4h();
        }
        if (i2 == 4) {
            return new d4h(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        tng tngVar = zzi;
        if (tngVar != null) {
            return tngVar;
        }
        synchronized (e4h.class) {
            try {
                nmgVar = zzi;
                if (nmgVar == null) {
                    nmgVar = new nmg(zzh);
                    zzi = nmgVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nmgVar;
    }

    public final List r() {
        return this.zzb;
    }

    public final int s() {
        return ((fng) this.zzb).size();
    }

    public final List t() {
        return this.zze;
    }

    public final int u() {
        return ((fng) this.zze).size();
    }

    public final zmg v() {
        return this.zzf;
    }

    public final int w() {
        return this.zzf.size();
    }

    public final zmg x() {
        return this.zzg;
    }

    public final int y() {
        return this.zzg.size();
    }
}
