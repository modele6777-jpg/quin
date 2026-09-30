package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ane implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Drawable b;

    public /* synthetic */ ane(Drawable drawable, int i) {
        this.a = i;
        this.b = drawable;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wef wefVar = wef.a;
        Drawable drawable = this.b;
        switch (i) {
            case 0:
                long j = ((y72) obj).a;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                } else {
                    gfa.b.e(drawable, l46Var, 48);
                }
                break;
            default:
                long j2 = ((y72) obj).a;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var2.Z();
                } else {
                    gfa.b.e(drawable, l46Var2, 48);
                }
                break;
        }
        return wefVar;
    }
}
