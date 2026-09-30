package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e1 implements xn7 {
    @Override // defpackage.xn7
    public Object c(om3 om3Var) {
        return j(om3Var);
    }

    public abstract Object f();

    public abstract int g(Object obj);

    public abstract Iterator h(Object obj);

    public abstract int i(Object obj);

    public final Object j(om3 om3Var) {
        Object objF = f();
        int iG = g(objF);
        zf2 zf2VarC = om3Var.c(e());
        while (true) {
            int iJ = zf2VarC.j(e());
            if (iJ == -1) {
                zf2VarC.b(e());
                return m(objF);
            }
            k(zf2VarC, iJ + iG, objF);
        }
    }

    public abstract void k(zf2 zf2Var, int i, Object obj);

    public abstract Object l(Object obj);

    public abstract Object m(Object obj);
}
