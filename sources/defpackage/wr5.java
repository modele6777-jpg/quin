package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wr5 implements l26 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ m26 v;

    public /* synthetic */ wr5(int i, int i2, t2f t2fVar, wy6 wy6Var, j09 j09Var, a26 a26Var, int i3) {
        this.b = i;
        this.c = i2;
        this.e = t2fVar;
        this.f = wy6Var;
        this.g = j09Var;
        this.v = a26Var;
        this.d = i3;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        m26 m26Var = this.v;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                zr5.a((c4c) obj5, (j88) obj4, (List) obj3, this.b, (dd2) m26Var, (l46) obj, k99.P(this.c | 1), this.d);
                break;
            case 1:
                g06 g06Var = (g06) obj5;
                x16 x16Var = (x16) obj4;
                x16 x16Var2 = (x16) obj3;
                x16 x16Var3 = (x16) m26Var;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(1 & iIntValue, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    od4.d(this.b, g06Var, this.c, this.d, x16Var, x16Var2, x16Var3, l46Var, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                eec.g(this.b, this.c, (t2f) obj5, (wy6) obj4, (j09) obj3, (a26) m26Var, (l46) obj, k99.P(this.d | 1));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ wr5(int i, g06 g06Var, int i2, int i3, x16 x16Var, x16 x16Var2, x16 x16Var3) {
        this.b = i;
        this.e = g06Var;
        this.c = i2;
        this.d = i3;
        this.f = x16Var;
        this.g = x16Var2;
        this.v = x16Var3;
    }

    public /* synthetic */ wr5(c4c c4cVar, j88 j88Var, List list, int i, dd2 dd2Var, int i2, int i3) {
        this.e = c4cVar;
        this.f = j88Var;
        this.g = list;
        this.b = i;
        this.v = dd2Var;
        this.c = i2;
        this.d = i3;
    }
}
