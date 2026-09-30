package defpackage;

import ai.askquin.ui.conversation.r0;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fs2 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;

    public /* synthetic */ fs2(r0 r0Var, int i) {
        this.a = i;
        this.b = r0Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                List list = (List) obj2;
                String str = (String) obj3;
                list.getClass();
                str.getClass();
                r0 r0Var = this.b;
                r0Var.getClass();
                ynb.V(hwf.a(r0Var), null, null, new lf4(r0Var, iIntValue, list, str, null), 3);
                break;
            default:
                l46 l46Var = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((oz) obj).getClass();
                if (!l46Var.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var.Z();
                } else {
                    FillElement fillElement = b.c;
                    r0 r0Var2 = this.b;
                    boolean zI = l46Var.i(r0Var2);
                    Object objR = l46Var.R();
                    if (zI || objR == sf2.a) {
                        objR = new qj2(r0Var2, 1);
                        l46Var.p0(objR);
                    }
                    an1.d(6, (x16) objR, l46Var, fillElement);
                }
                break;
        }
        return wefVar;
    }
}
