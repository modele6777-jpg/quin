package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ek3 implements l26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ x16 c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ ek3(x16 x16Var, boolean z, boolean z2) {
        this.c = x16Var;
        this.b = z;
        this.d = z2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        boolean z = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    tq.c(b.c(g09.a, 1.0f), null, false, false, this.c, af1.b0(-1225918949, new le0(z, this.d, i2), l46Var), l46Var, 196614, 14);
                }
                break;
            default:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else if (!z) {
                    l46Var2.f0(-1342341145);
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(-1342540072);
                    bm8.h(this.c, null, this.d, null, null, k99.d, l46Var2, 1572864, 58);
                    l46Var2.r(false);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ ek3(boolean z, x16 x16Var, boolean z2) {
        this.b = z;
        this.c = x16Var;
        this.d = z2;
    }
}
