package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class n2h extends omg {
    private static final n2h zze;
    private static volatile tng zzf;
    private zmg zzb = wng.e;

    static {
        n2h n2hVar = new n2h();
        zze = n2hVar;
        omg.m(n2h.class, n2hVar);
    }

    public static b2h s() {
        return (b2h) zze.h();
    }

    public static n2h t() {
        return zze;
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", j2h.class});
        }
        if (i2 == 3) {
            return new n2h();
        }
        if (i2 == 4) {
            return new b2h(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        tng tngVar = zzf;
        if (tngVar != null) {
            return tngVar;
        }
        synchronized (n2h.class) {
            try {
                nmgVar = zzf;
                if (nmgVar == null) {
                    nmgVar = new nmg(zze);
                    zzf = nmgVar;
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

    public final void u(ArrayList arrayList) {
        zmg zmgVarE = this.zzb;
        if (!((rlg) zmgVarE).a) {
            zmgVarE = xkg.e(zmgVarE);
            this.zzb = zmgVarE;
        }
        mmg.b(arrayList, zmgVarE);
    }
}
