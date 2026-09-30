package defpackage;

import ai.askquin.R;
import android.os.Build;
import android.view.SoundEffectConstants;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zp implements l26 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ zp(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        ov7 ov7Var = LayoutNode.h1;
        g09 g09Var = g09.a;
        wef wefVar = wef.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                int i2 = ((mn5) obj).a;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                Integer numC = un5.c(i2);
                if (numC != null) {
                    int iIntValue = numC.intValue();
                    ((AndroidComposeView) obj3).playSoundEffect(Build.VERSION.SDK_INT >= 31 ? q60.a.a(iIntValue, zBooleanValue) : SoundEffectConstants.getContantForFocusDirection(iIntValue));
                }
                break;
            case 1:
                l46 l46Var = (l46) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                ta0 ta0Var = (ta0) obj3;
                if (!l46Var.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var.Z();
                } else {
                    String strH = tgc.h(R.string.m3c_dialog, l46Var);
                    pr4 pr4Var = wi.a;
                    j09 j09VarO = b.o(g09Var, 280.0f, 0.0f, 560.0f, 10);
                    boolean zG = l46Var.g(strH);
                    Object objR = l46Var.R();
                    if (zG || objR == sf2.a) {
                        objR = new ia(strH, 11);
                        l46Var.p0(objR);
                    }
                    j09 j09VarD = j09VarO.D(vwc.b(g09Var, false, (a26) objR));
                    xn8 xn8VarC = s21.c(ndb.b, true);
                    int iW = an1.w(l46Var);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarD);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
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
                    tec.q(0, (dd2) ta0Var.b, l46Var, true);
                }
                break;
            default:
                l46 l46Var2 = (l46) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!l46Var2.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    kx0 kx0Var = ndb.z;
                    n26 n26Var = ((jkd) obj3).g;
                    t7c t7cVarA = s7c.a(xc0.b, kx0Var, l46Var2, 54);
                    int iW2 = an1.w(l46Var2);
                    u8a u8aVarM2 = l46Var2.m();
                    j09 j09VarJ2 = m93.J(l46Var2, g09Var);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(hj6.z, l46Var2, t7cVarA);
                    dec.l(hj6.y, l46Var2, u8aVarM2);
                    he2 he2Var2 = hj6.X;
                    if (l46Var2.S || !pa7.t(l46Var2.R(), Integer.valueOf(iW2))) {
                        tec.r(iW2, l46Var2, iW2, he2Var2);
                    }
                    dec.l(hj6.x, l46Var2, j09VarJ2);
                    n26Var.m(v7c.a, l46Var2, 6);
                    l46Var2.r(true);
                }
                break;
        }
        return wefVar;
    }
}
