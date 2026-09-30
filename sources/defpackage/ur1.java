package defpackage;

import ai.askquin.R;
import ai.askquin.ui.draw.photo.homepage.CardLayoutConfig;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import coil3.compose.AsyncImagePainter$State$Error;
import coil3.compose.AsyncImagePainter$State$Success;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ur1 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e89 b;
    public final /* synthetic */ e89 c;

    public /* synthetic */ ur1(e89 e89Var, e89 e89Var2, int i) {
        this.a = i;
        this.b = e89Var;
        this.c = e89Var2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        e89 e89Var = this.c;
        e89 e89Var2 = this.b;
        switch (i) {
            case 0:
                e89Var2.setValue(CardLayoutConfig.copy$default((CardLayoutConfig) e89Var2.getValue(), 0, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null, 9, null));
                xh7 xh7Var = gs1.a;
                CardLayoutConfig cardLayoutConfig = (CardLayoutConfig) e89Var2.getValue();
                xh7Var.getClass();
                e89Var.setValue(xh7Var.d(CardLayoutConfig.Companion.serializer(), cardLayoutConfig));
                break;
            case 1:
                Integer num = (Integer) obj;
                num.getClass();
                yg0 yg0Var = (yg0) obj2;
                yg0Var.getClass();
                if (yg0Var instanceof AsyncImagePainter$State$Success) {
                    e89Var2.setValue(n3d.n((Set) e89Var2.getValue(), num));
                } else if (yg0Var instanceof AsyncImagePainter$State$Error) {
                    e89Var.setValue(Boolean.TRUE);
                }
                break;
            default:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else if (!((Boolean) e89Var2.getValue()).booleanValue()) {
                    l46Var.f0(1794534291);
                    FillElement fillElement = b.c;
                    xn8 xn8VarC = s21.c(ndb.f, false);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, fillElement);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, xn8VarC);
                    dec.l(hj6.y, l46Var, u8aVarM);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ);
                    axa.a(0.0f, 0.0f, 0, 0, 63, 0L, 0L, l46Var, null);
                    l46Var.r(true);
                    l46Var.r(false);
                } else {
                    l46Var.f0(-204308650);
                    dd2 dd2Var = dj6.b;
                    String strQ = afc.q(R.string.button_retry, l46Var);
                    Object objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = new x08(e89Var, 13);
                        l46Var.p0(objR);
                    }
                    kj0.F(null, dd2Var, strQ, null, false, false, null, null, null, (x16) objR, l46Var, 905969718, 248);
                    l46Var.r(false);
                }
                break;
        }
        return wefVar;
    }
}
