package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ h0(i0 i0Var, int i) {
        this.a = i;
        this.b = i0Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        i0 i0Var = this.b;
        switch (i) {
            case 0:
                dr8 dr8VarK0 = i0Var.k0();
                x xVar = new x(1, this);
                oy4 oy4Var = w8f.a;
                if (sy4.f(i0Var)) {
                    return sy4.c(qy4.w, i0Var.toString());
                }
                j7f j7fVarH = i0Var.h();
                if (j7fVarH == null) {
                    w8f.a(12);
                    throw null;
                }
                if (dr8VarK0 == null) {
                    w8f.a(13);
                    throw null;
                }
                List listD = w8f.d(j7fVarH.getParameters());
                e7f.b.getClass();
                return rxg.V(e7f.c, j7fVarH, listD, false, dr8VarK0, xVar);
            case 1:
                return new a47(i0Var.k0());
            default:
                return new nw7(i0Var);
        }
    }
}
