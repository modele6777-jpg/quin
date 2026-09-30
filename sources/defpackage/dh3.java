package defpackage;

import java.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dh3 implements l26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ dh3(LocalDate localDate, boolean z, boolean z2, boolean z3, boolean z4, a26 a26Var, int i) {
        this.f = localDate;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.g = a26Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                abg.m((LocalDate) obj4, this.b, this.c, this.d, this.e, (a26) obj3, (l46) obj, k99.P(1));
                break;
            default:
                rcf rcfVar = (rcf) obj4;
                egd egdVar = (egd) obj3;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 2;
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else if (this.b) {
                    l46Var.f0(-193158512);
                    tn4 tn4VarG = rcfVar.g();
                    hgd hgdVarA = egdVar.a();
                    tn4VarG.getClass();
                    hgdVarA.getClass();
                    if (tn4VarG != tn4.a) {
                        i2 = 4;
                    } else if (hgdVarA == hgd.e || hgdVarA == hgd.d) {
                        i2 = 3;
                    }
                    lmg.I(null, i2, 4, 0.0f, 0.0f, 0L, l46Var, 384, 57);
                    l46Var.r(false);
                } else if (this.c || this.d) {
                    l46Var.f0(-192646795);
                    l46Var.r(false);
                } else {
                    l46Var.f0(-192780374);
                    lmg.I(null, this.e ? 5 : 4, 5, 0.0f, 0.0f, 0L, l46Var, 384, 57);
                    l46Var.r(false);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ dh3(boolean z, rcf rcfVar, egd egdVar, boolean z2, boolean z3, boolean z4) {
        this.b = z;
        this.f = rcfVar;
        this.g = egdVar;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }
}
