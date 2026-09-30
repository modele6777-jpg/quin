package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dp9 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ wp9 c;
    public final /* synthetic */ x16 d;
    public final /* synthetic */ x16 e;

    public /* synthetic */ dp9(ArrayList arrayList, wp9 wp9Var, x16 x16Var, x16 x16Var2) {
        this.b = arrayList;
        this.c = wp9Var;
        this.d = x16Var;
        this.e = x16Var2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                k99.l(this.b, this.c, this.d, this.e, (l46) obj, k99.P(1));
                break;
            default:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    x16 x16Var = this.e;
                    boolean zG = l46Var.g(x16Var);
                    Object objR = l46Var.R();
                    if (zG || objR == sf2.a) {
                        objR = new fn6(23, x16Var);
                        l46Var.p0(objR);
                    }
                    k99.l(this.b, this.c, this.d, (x16) objR, l46Var, 0);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ dp9(ArrayList arrayList, wp9 wp9Var, x16 x16Var, x16 x16Var2, int i) {
        this.b = arrayList;
        this.c = wp9Var;
        this.d = x16Var;
        this.e = x16Var2;
    }
}
