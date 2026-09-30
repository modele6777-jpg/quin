package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: loaded from: classes3.dex */
public final class yt2 implements l26 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public /* synthetic */ yt2(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) throws Throwable {
        j2 j2VarC0;
        int i = this.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        int i2 = 0;
        switch (i) {
            case 0:
                ClassLoader classLoader = (ClassLoader) obj6;
                g8f g8fVar = (g8f) obj5;
                x16 x16Var = (x16) obj4;
                mmb mmbVar = (mmb) obj3;
                int iIntValue = ((Number) obj).intValue();
                zq7 zq7Var = (zq7) obj2;
                zq7Var.getClass();
                if (zq7Var.equals(zq7.c)) {
                    return do7.c;
                }
                wq7 wq7Var = zq7Var.b;
                if (wq7Var != null) {
                    j2VarC0 = abg.c0(wq7Var, classLoader, g8fVar, true, x16Var == null ? null : new zt2(new j5(7, mmbVar), iIntValue, i2));
                } else {
                    j2VarC0 = null;
                }
                br7 br7Var = zq7Var.a;
                return new do7(j2VarC0, br7Var != null ? abg.e0(br7Var) : null);
            default:
                l46 l46Var = (l46) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (l46Var.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    j09 j09VarE = vfh.E(g09.a, "Container");
                    zf3 zf3Var = new zf3((e89) obj6, e89.class, "value", "getValue()Ljava/lang/Object;", 0);
                    iec.j((rpe) obj5);
                    j09 j09VarU = b21.u(j09VarE, new it3(zf3Var, (xw9) obj4, ndb.Y, 28));
                    dd2 dd2Var = (dd2) obj3;
                    xn8 xn8VarC = s21.c(ndb.b, true);
                    int iW = an1.w(l46Var);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarU);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, xn8VarC);
                    dec.l(hj6.y, l46Var, u8aVarM);
                    he2 he2Var = hj6.X;
                    if (l46Var.S || !pa7.t(l46Var.R(), Integer.valueOf(iW))) {
                        tec.r(iW, l46Var, iW, he2Var);
                    }
                    dec.l(hj6.x, l46Var, j09VarJ);
                    tec.q(0, dd2Var, l46Var, true);
                } else {
                    l46Var.Z();
                }
                return wef.a;
        }
    }
}
