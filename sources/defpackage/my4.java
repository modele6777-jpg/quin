package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class my4 implements dr8 {
    public final String b;

    public my4(ny4 ny4Var, String... strArr) {
        String strA = ny4Var.a();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.b = String.format(strA, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // defpackage.dr8
    public Collection a(ez3 ez3Var, a26 a26Var) {
        ez3Var.getClass();
        return pu4.a;
    }

    @Override // defpackage.dr8
    public Set c() {
        return xu4.a;
    }

    @Override // defpackage.dr8
    public Set d() {
        return xu4.a;
    }

    @Override // defpackage.dr8
    public y22 e(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        lf9Var.getClass();
        return new xx4(t99.g(String.format(ey4.ERROR_CLASS.a(), Arrays.copyOf(new Object[]{t99Var}, 1))));
    }

    @Override // defpackage.dr8
    public Set g() {
        return xu4.a;
    }

    @Override // defpackage.dr8
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set b(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        xx4 xx4Var = sy4.c;
        xx4Var.getClass();
        fy4 fy4Var = new fy4(xx4Var, null, hj6.c, t99.g(ey4.ERROR_FUNCTION.a()), 1, ntd.T);
        oy4 oy4VarC = sy4.c(qy4.c, new String[0]);
        e09 e09Var = e09.d;
        rz3 rz3Var = sz3.e;
        pu4 pu4Var = pu4.a;
        fy4Var.I0(null, null, pu4Var, pu4Var, pu4Var, oy4VarC, e09Var, rz3Var);
        return n3d.p(fy4Var);
    }

    @Override // defpackage.dr8
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set f(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        return sy4.f;
    }

    public String toString() {
        return ub3.l(new StringBuilder("ErrorScope{"), this.b, '}');
    }
}
