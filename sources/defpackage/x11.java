package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x11 implements l26 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;

    public x11(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        l46 l46Var = (l46) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            s21.a(b.m(g09.a, this.a, this.b), l46Var, 0);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}
