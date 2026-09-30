package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wq8 implements x16 {
    public final yq8 a;
    public final boolean b;
    public final kza c;

    public wq8(yq8 yq8Var, boolean z, kza kzaVar) {
        this.a = yq8Var;
        this.b = z;
        this.c = kzaVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        List listJ1;
        yq8 yq8Var = this.a;
        lp0 lp0Var = yq8Var.a;
        m0b m0bVarA = yq8Var.a((bm3) lp0Var.d);
        if (m0bVarA != null) {
            tz3 tz3Var = (tz3) lp0Var.b;
            boolean z = this.b;
            kza kzaVar = this.c;
            listJ1 = z ? s72.j1(tz3Var.e.d(m0bVarA, kzaVar)) : s72.j1(tz3Var.e.k(m0bVarA, kzaVar));
        } else {
            listJ1 = null;
        }
        return listJ1 == null ? pu4.a : listJ1;
    }
}
