package defpackage;

import androidx.compose.foundation.layout.b;
import java.util.List;
import java.util.Set;
import tech.chatmind.api.WhereDidYouHear;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zi6 implements o26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ gj6 c;
    public final /* synthetic */ e89 d;

    public /* synthetic */ zi6(List list, gj6 gj6Var, e89 e89Var, int i) {
        this.a = i;
        this.b = list;
        this.c = gj6Var;
        this.d = e89Var;
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        wef wefVar = wef.a;
        i8c i8cVar = sf2.a;
        e89 e89Var = this.d;
        List list = this.b;
        fy9 fy9VarA = null;
        gj6 gj6Var = this.c;
        switch (i) {
            case 0:
                mx7 mx7Var = (mx7) obj;
                int iIntValue = ((Number) obj2).intValue();
                l46 l46Var = (l46) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i2 = (iIntValue2 & 6) == 0 ? iIntValue2 | (l46Var.g(mx7Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= l46Var.e(iIntValue) ? 32 : 16;
                }
                if (!l46Var.W(i2 & 1, (i2 & 147) != 146)) {
                    l46Var.Z();
                } else {
                    WhereDidYouHear whereDidYouHear = (WhereDidYouHear) list.get(iIntValue);
                    l46Var.f0(-1026980545);
                    boolean zContains = ((Set) e89Var.getValue()).contains(whereDidYouHear);
                    Integer neoDrawableId = whereDidYouHear.getNeoDrawableId();
                    if (neoDrawableId == null) {
                        l46Var.f0(-1026863274);
                    } else {
                        l46Var.f0(-1026863273);
                        fy9VarA = od4.A(neoDrawableId.intValue(), 0, l46Var);
                    }
                    l46Var.r(false);
                    fy9 fy9Var = fy9VarA;
                    String strQ = afc.q(whereDidYouHear.getStringId(), l46Var);
                    List list2 = ppf.a;
                    ca2.a.getClass();
                    boolean z = iIntValue < t72.E(ca2.c ? ppf.b : ppf.a);
                    boolean zI = l46Var.i(gj6Var) | l46Var.e(whereDidYouHear.ordinal());
                    Object objR = l46Var.R();
                    if (zI || objR == i8cVar) {
                        objR = new yi6(gj6Var, whereDidYouHear, 0);
                        l46Var.p0(objR);
                    }
                    af1.f(null, zContains, strQ, fy9Var, z, (a26) objR, l46Var, 4096);
                    l46Var.r(false);
                }
                break;
            default:
                vw7 vw7Var = (vw7) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                l46 l46Var2 = (l46) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i3 = (iIntValue4 & 6) == 0 ? iIntValue4 | (l46Var2.g(vw7Var) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i3 |= l46Var2.e(iIntValue3) ? 32 : 16;
                }
                if (!l46Var2.W(i3 & 1, (i3 & 147) != 146)) {
                    l46Var2.Z();
                } else {
                    WhereDidYouHear whereDidYouHear2 = (WhereDidYouHear) list.get(iIntValue3);
                    l46Var2.f0(-260230515);
                    j09 j09VarW = dj6.w(b.c(g09.a, 1.0f), 1.4f);
                    boolean zContains2 = ((Set) e89Var.getValue()).contains(whereDidYouHear2);
                    Integer drawableId = whereDidYouHear2.getDrawableId();
                    if (drawableId == null) {
                        l46Var2.f0(-260011998);
                    } else {
                        l46Var2.f0(-260011997);
                        fy9VarA = od4.A(drawableId.intValue(), 0, l46Var2);
                    }
                    l46Var2.r(false);
                    fy9 fy9Var2 = fy9VarA;
                    String strQ2 = afc.q(whereDidYouHear2.getStringId(), l46Var2);
                    boolean zI2 = l46Var2.i(gj6Var) | l46Var2.e(whereDidYouHear2.ordinal());
                    Object objR2 = l46Var2.R();
                    if (zI2 || objR2 == i8cVar) {
                        objR2 = new yi6(gj6Var, whereDidYouHear2, 1);
                        l46Var2.p0(objR2);
                    }
                    af1.e(j09VarW, zContains2, strQ2, fy9Var2, (a26) objR2, l46Var2, 4102);
                    l46Var2.r(false);
                }
                break;
        }
        return wefVar;
    }
}
