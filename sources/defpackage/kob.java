package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class kob {
    public em7 b(Class cls) {
        return new p22(cls);
    }

    public vm7 c(Class cls) {
        return new qw9(cls);
    }

    public yn7 d(yn7 yn7Var) {
        l8f l8fVar = (l8f) yn7Var;
        um7 um7VarB = yn7Var.B();
        List listA = yn7Var.A();
        l8fVar.getClass();
        return new l8f(um7VarB, listA, l8fVar.c | 2);
    }

    public String j(w26 w26Var) {
        String string = w26Var.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String k(gu7 gu7Var) {
        return j(gu7Var);
    }

    public yn7 l(em7 em7Var, List list, boolean z) {
        em7Var.getClass();
        list.getClass();
        return new l8f(em7Var, list, z ? 1 : 0);
    }

    public ym7 a(g36 g36Var) {
        return g36Var;
    }

    public fn7 e(zf3 zf3Var) {
        return zf3Var;
    }

    public hn7 f(q79 q79Var) {
        return q79Var;
    }

    public sn7 g(uw7 uw7Var) {
        return uw7Var;
    }

    public un7 h(aya ayaVar) {
        return ayaVar;
    }

    public vn7 i(bya byaVar) {
        return byaVar;
    }
}
