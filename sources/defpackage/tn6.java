package defpackage;

import ai.askquin.model.Scene;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tn6 implements o26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ ii6 c;
    public final /* synthetic */ a26 d;

    public /* synthetic */ tn6(List list, ii6 ii6Var, a26 a26Var, int i) {
        this.a = i;
        this.b = list;
        this.c = ii6Var;
        this.d = a26Var;
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        wef wefVar = wef.a;
        i8c i8cVar = sf2.a;
        g09 g09Var = g09.a;
        List list = this.b;
        a26 a26Var = this.d;
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
                    Scene scene = (Scene) list.get(iIntValue);
                    l46Var.f0(-2053547830);
                    j09 j09VarA = mx7.a(mx7Var, g09Var);
                    boolean zG = l46Var.g(a26Var) | l46Var.i(scene);
                    Object objR = l46Var.R();
                    if (zG || objR == i8cVar) {
                        objR = new sn6(a26Var, scene, 0);
                        l46Var.p0(objR);
                    }
                    no6.r(this.c, scene, (x16) objR, j09VarA, l46Var, 0);
                    l46Var.r(false);
                }
                break;
            default:
                mx7 mx7Var2 = (mx7) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                l46 l46Var2 = (l46) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i3 = (iIntValue4 & 6) == 0 ? iIntValue4 | (l46Var2.g(mx7Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i3 |= l46Var2.e(iIntValue3) ? 32 : 16;
                }
                if (!l46Var2.W(i3 & 1, (i3 & 147) != 146)) {
                    l46Var2.Z();
                } else {
                    Scene scene2 = (Scene) list.get(iIntValue3);
                    l46Var2.f0(-1602779512);
                    j09 j09VarA2 = mx7.a(mx7Var2, g09Var);
                    float f = wn6.a;
                    j09 j09VarD0 = ynb.d0(20.0f, 0.0f, 20.0f, 8.0f, 2, j09VarA2);
                    boolean zG2 = l46Var2.g(a26Var) | l46Var2.i(scene2);
                    Object objR2 = l46Var2.R();
                    if (zG2 || objR2 == i8cVar) {
                        objR2 = new sn6(a26Var, scene2, 1);
                        l46Var2.p0(objR2);
                    }
                    no6.r(this.c, scene2, (x16) objR2, j09VarD0, l46Var2, 0);
                    l46Var2.r(false);
                }
                break;
        }
        return wefVar;
    }
}
