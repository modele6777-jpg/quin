package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dia extends ms5 {
    public final fye c;

    public dia(gye gyeVar) {
        super(gyeVar);
        this.c = new fye();
    }

    @Override // defpackage.ms5, defpackage.gye
    public final eye f(int i, eye eyeVar, boolean z) {
        gye gyeVar = this.b;
        eye eyeVarF = gyeVar.f(i, eyeVar, z);
        if (!gyeVar.m(eyeVarF.c, this.c, 0L).a()) {
            eyeVarF.f = true;
            return eyeVarF;
        }
        Object obj = eyeVar.a;
        Object obj2 = eyeVar.b;
        int i2 = eyeVar.c;
        long j = eyeVar.d;
        long j2 = eyeVar.e;
        qf qfVar = qf.c;
        eyeVarF.h(obj, obj2, i2, j, j2, true);
        return eyeVarF;
    }
}
