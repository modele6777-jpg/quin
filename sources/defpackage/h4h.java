package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h4h extends omg {
    private static final h4h zzg;
    private static volatile tng zzh;
    private int zzb;
    private int zze;
    private ymg zzf = fng.e;

    static {
        h4h h4hVar = new h4h();
        zzg = h4hVar;
        omg.m(h4h.class, h4hVar);
    }

    public static g4h w() {
        return (g4h) zzg.h();
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new h4h();
        }
        if (i2 == 4) {
            return new g4h(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        tng tngVar = zzh;
        if (tngVar != null) {
            return tngVar;
        }
        synchronized (h4h.class) {
            try {
                nmgVar = zzh;
                if (nmgVar == null) {
                    nmgVar = new nmg(zzg);
                    zzh = nmgVar;
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
        return ((fng) this.zzf).size();
    }

    public final long v(int i) {
        return ((fng) this.zzf).c(i);
    }

    public final /* synthetic */ void x(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    public final void y(List list) {
        List list2 = this.zzf;
        boolean z = ((rlg) list2).a;
        List list3 = list2;
        if (!z) {
            fng fngVar = (fng) list2;
            int i = fngVar.c;
            fng fngVarK0 = fngVar.k0(i + i);
            this.zzf = fngVarK0;
            list3 = fngVarK0;
        }
        mmg.b(list, list3);
    }
}
