package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ah7 implements xn7 {
    public static final ah7 a = new ah7();
    public static final zg7 b = zg7.b;

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        yg7 yg7Var = (yg7) obj;
        yg7Var.getClass();
        vd0.K(ev4Var);
        qh7 qh7Var = qh7.a;
        nyc nycVarE = qh7Var.e();
        nycVarE.getClass();
        zc0 zc0Var = new zc0(nycVarE, 1);
        int size = yg7Var.size();
        ag2 ag2VarC = ev4Var.c(zc0Var);
        Iterator<nh7> it = yg7Var.iterator();
        for (int i = 0; i < size; i++) {
            ag2VarC.p(zc0Var, i, qh7Var, it.next());
        }
        ag2VarC.b(zc0Var);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        vd0.J(om3Var);
        return new yg7((List) new dd0(qh7.a, 0).j(om3Var));
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return b;
    }
}
