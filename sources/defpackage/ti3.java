package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ti3 implements l26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ x16 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ ti3(cs3 cs3Var, Context context, g6d g6dVar, aw2 aw2Var, String str, t7 t7Var, wt6 wt6Var, fcb fcbVar, x16 x16Var) {
        this.e = cs3Var;
        this.f = context;
        this.g = g6dVar;
        this.v = aw2Var;
        this.d = str;
        this.w = t7Var;
        this.x = wt6Var;
        this.b = fcbVar;
        this.c = x16Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj3 = this.b;
        Object obj4 = this.x;
        Object obj5 = this.w;
        Object obj6 = this.d;
        Object obj7 = this.v;
        Object obj8 = this.g;
        Object obj9 = this.f;
        Object obj10 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                xj3.d((TarotSkinIdentify) obj10, (pl3) obj9, (hmd) obj8, (y72) obj7, this.c, (x16) obj6, (x16) obj5, (x16) obj4, (j09) obj3, (l46) obj, k99.P(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                kn2.q((j09) obj3, (bx9) obj10, (cn6) obj9, this.c, (x16) obj6, (a26) obj8, (a26) obj7, (a26) obj5, (a26) obj4, (l46) obj, k99.P(7));
                break;
            default:
                yx9 yx9Var = (yx9) obj10;
                Context context = (Context) obj9;
                g6d g6dVar = (g6d) obj8;
                aw2 aw2Var = (aw2) obj7;
                String str = (String) obj6;
                t7 t7Var = (t7) obj5;
                wt6 wt6Var = (wt6) obj4;
                fcb fcbVar = (fcb) obj3;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(1 & iIntValue, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    boolean zG = l46Var.g(yx9Var) | l46Var.i(context) | l46Var.i(g6dVar) | l46Var.i(aw2Var) | l46Var.g(str) | l46Var.i(t7Var);
                    Object objR = l46Var.R();
                    i8c i8cVar = sf2.a;
                    if (zG || objR == i8cVar) {
                        xi3 xi3Var = new xi3(context, g6dVar, yx9Var, aw2Var, str, t7Var, 3);
                        yx9Var = yx9Var;
                        aw2Var = aw2Var;
                        l46Var.p0(xi3Var);
                        objR = xi3Var;
                    }
                    x16 x16Var = (x16) objR;
                    boolean zI = l46Var.i(g6dVar) | l46Var.g(yx9Var) | l46Var.i(aw2Var) | l46Var.i(wt6Var) | l46Var.i(context) | l46Var.i(fcbVar);
                    Object objR2 = l46Var.R();
                    if (zI || objR2 == i8cVar) {
                        k11 k11Var = new k11(g6dVar, yx9Var, aw2Var, wt6Var, context, fcbVar, 6);
                        l46Var.p0(k11Var);
                        objR2 = k11Var;
                    }
                    d8c.g(0L, x16Var, (a26) objR2, this.c, l46Var, 0, 1);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ ti3(j09 j09Var, bx9 bx9Var, cn6 cn6Var, x16 x16Var, x16 x16Var2, a26 a26Var, a26 a26Var2, a26 a26Var3, a26 a26Var4, int i) {
        this.b = j09Var;
        this.e = bx9Var;
        this.f = cn6Var;
        this.c = x16Var;
        this.d = x16Var2;
        this.g = a26Var;
        this.v = a26Var2;
        this.w = a26Var3;
        this.x = a26Var4;
    }

    public /* synthetic */ ti3(TarotSkinIdentify tarotSkinIdentify, pl3 pl3Var, hmd hmdVar, y72 y72Var, x16 x16Var, x16 x16Var2, x16 x16Var3, x16 x16Var4, j09 j09Var, int i) {
        this.e = tarotSkinIdentify;
        this.f = pl3Var;
        this.g = hmdVar;
        this.v = y72Var;
        this.c = x16Var;
        this.d = x16Var2;
        this.w = x16Var3;
        this.x = x16Var4;
        this.b = j09Var;
    }
}
