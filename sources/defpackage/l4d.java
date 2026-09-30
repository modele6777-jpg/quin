package defpackage;

import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l4d extends b41 {
    public vrb a;
    public long b = 9205357640488583168L;

    @Override // defpackage.b41
    public final void a(float f, long j, dy9 dy9Var) {
        vrb vrbVar = this.a;
        if (vrbVar == null || !ald.a(this.b, j)) {
            if (ald.e(j)) {
                this.a = null;
                this.b = 9205357640488583168L;
                vrbVar = null;
            } else {
                vrbVar = this.a;
                if (vrbVar == null) {
                    vrbVar = new vrb(8);
                    this.a = vrbVar;
                }
                vrbVar.b = c(j);
                this.a = vrbVar;
                this.b = j;
            }
        }
        rt rtVar = (rt) dy9Var;
        long jA = rtVar.a();
        long j2 = y72.b;
        if (!faf.a(jA, j2)) {
            rtVar.f(j2);
        }
        if (!pa7.t(rtVar.c, vrbVar != null ? (Shader) vrbVar.b : null)) {
            rtVar.j(vrbVar != null ? (Shader) vrbVar.b : null);
        }
        if (rtVar.a.getAlpha() / 255.0f == f) {
            return;
        }
        rtVar.d(f);
    }

    public abstract Shader c(long j);
}
