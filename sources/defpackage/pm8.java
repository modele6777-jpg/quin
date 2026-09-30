package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pm8 extends gye {
    public final op8 b;

    public pm8(op8 op8Var) {
        this.b = op8Var;
    }

    @Override // defpackage.gye
    public final int b(Object obj) {
        return obj == om8.e ? 0 : -1;
    }

    @Override // defpackage.gye
    public final eye f(int i, eye eyeVar, boolean z) {
        Integer num = z ? 0 : null;
        Object obj = z ? om8.e : null;
        qf qfVar = qf.c;
        eyeVar.h(num, obj, 0, -9223372036854775807L, 0L, true);
        return eyeVar;
    }

    @Override // defpackage.gye
    public final int h() {
        return 1;
    }

    @Override // defpackage.gye
    public final Object l(int i) {
        return om8.e;
    }

    @Override // defpackage.gye
    public final fye m(int i, fye fyeVar, long j) {
        Object obj = fye.o;
        fyeVar.b(this.b, false, true, null, 0L, -9223372036854775807L);
        fyeVar.i = true;
        return fyeVar;
    }

    @Override // defpackage.gye
    public final int o() {
        return 1;
    }
}
