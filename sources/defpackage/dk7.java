package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dk7 implements nw9 {
    public final ge8 a;
    public final x09 b;
    public tz3 c;
    public final mz0 d;

    public dk7(ge8 ge8Var, g5b g5bVar, x09 x09Var) {
        this.a = ge8Var;
        this.b = x09Var;
        this.d = ge8Var.c(new x(2, this));
    }

    @Override // defpackage.nw9
    public final boolean a(dx5 dx5Var) {
        dx5Var.getClass();
        mz0 mz0Var = this.d;
        Object obj = ((ConcurrentHashMap) mz0Var.c).get(dx5Var);
        return ((obj == null || obj == fe8.b) ? c(dx5Var) : (kw9) mz0Var.d(dx5Var)) == null;
    }

    @Override // defpackage.nw9
    public final void b(dx5 dx5Var, ArrayList arrayList) {
        dx5Var.getClass();
        Object objD = this.d.d(dx5Var);
        if (objD != null) {
            arrayList.add(objD);
        }
    }

    public final k51 c(dx5 dx5Var) {
        InputStream inputStreamA;
        dx5Var.getClass();
        t99 t99Var = tyd.j;
        t99Var.getClass();
        if (dx5Var.a.h(t99Var)) {
            f51.m.getClass();
            inputStreamA = m51.a(f51.a(dx5Var));
        } else {
            inputStreamA = null;
        }
        if (inputStreamA != null) {
            return z7f.A(dx5Var, this.a, this.b, inputStreamA);
        }
        return null;
    }

    @Override // defpackage.nw9
    public final Collection m(dx5 dx5Var, a26 a26Var) {
        dx5Var.getClass();
        return xu4.a;
    }
}
