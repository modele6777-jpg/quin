package defpackage;

import java.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tf3 implements l26 {
    public final /* synthetic */ j91 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ z67 c;
    public final /* synthetic */ j09 d;
    public final /* synthetic */ ke3 e;
    public final /* synthetic */ a26 f;
    public final /* synthetic */ euc g;

    public tf3(j91 j91Var, long j, z67 z67Var, j09 j09Var, ke3 ke3Var, a26 a26Var, euc eucVar) {
        this.a = j91Var;
        this.b = j;
        this.c = z67Var;
        this.d = j09Var;
        this.e = ke3Var;
        this.f = a26Var;
        this.g = eucVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        l46 l46Var = (l46) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            j91 j91Var = this.a;
            c91 c91VarB = j91Var.b();
            final int i = ((l91) j91Var).e(LocalDate.of(c91VarB.a, c91VarB.b, 1)).a;
            final int i2 = j91Var.a(this.b).a;
            z67 z67Var = this.c;
            jx7 jx7VarA = lx7.a(Math.max(0, (i2 - z67Var.a) - 3), 2, l46Var);
            ye6 ye6Var = new ye6(3);
            final ke3 ke3Var = this.e;
            j09 j09VarO = tm7.o(this.d, ke3Var.a, g21.f);
            uc0 uc0Var = new uc0(vf3.b, true, new qc0(0));
            boolean zI = l46Var.i(j91Var) | l46Var.i(z67Var) | l46Var.e(i2) | l46Var.e(i) | l46Var.g(this.f) | l46Var.g(this.g) | l46Var.g(ke3Var);
            Object objR = l46Var.R();
            if (zI || objR == sf2.a) {
                final z67 z67Var2 = this.c;
                final j91 j91Var2 = this.a;
                final a26 a26Var = this.f;
                final euc eucVar = this.g;
                a26 a26Var2 = new a26() { // from class: rf3
                    @Override // defpackage.a26
                    public final Object d(Object obj3) {
                        z67 z67Var3 = z67Var2;
                        ((sw7) obj3).W(s72.p0(z67Var3), null, tj7.Y, new dd2(new sf3(z67Var3, j91Var2, i2, i, a26Var, eucVar, ke3Var), true, 674613074));
                        return wef.a;
                    }
                };
                l46Var.p0(a26Var2);
                objR = a26Var2;
            }
            an1.e(ye6Var, j09VarO, jx7VarA, null, uc0Var, xc0.f, null, false, null, (a26) objR, l46Var, 1769472, 920);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}
