package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j16 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ fy9 b;

    public /* synthetic */ j16(fy9 fy9Var) {
        this.b = fy9Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                db6.g(this.b, (l46) obj, k99.P(9));
                break;
            default:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    feg.j(this.b, null, b.l(g09.a, 24.0f), null, null, 0.0f, null, l46Var, 440, 120);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ j16(fy9 fy9Var, int i) {
        this.b = fy9Var;
    }
}
