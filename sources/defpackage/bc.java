package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bc implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ bc(long j) {
        this.a = 1;
        this.b = j;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        long j = this.b;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                lc.c(j, (l46) obj, k99.P(1));
                break;
            case 1:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    oa7.d(b.d(g09.a, 0.5f), 0.5f, this.b, l46Var, 54, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                b53.d(j, (l46) obj, k99.P(55));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ bc(int i, int i2, long j) {
        this.a = i2;
        this.b = j;
    }
}
