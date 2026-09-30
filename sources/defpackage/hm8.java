package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hm8 implements o26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z5c b;

    public /* synthetic */ hm8(z5c z5cVar, int i) {
        this.a = i;
        this.b = z5cVar;
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        wef wefVar = wef.a;
        g09 g09Var = g09.a;
        z5c z5cVar = this.b;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((sw3) obj).getClass();
                ((String) obj2).getClass();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 129) != 128)) {
                    l46Var.Z();
                } else {
                    lf0 lf0Var = (lf0) z5cVar;
                    ynb.n(3456, l46Var, b.c(g09Var, 1.0f), lf0Var.m, lf0Var.l);
                }
                break;
            default:
                l46 l46Var2 = (l46) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((sw3) obj).getClass();
                ((String) obj2).getClass();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 129) != 128)) {
                    l46Var2.Z();
                } else {
                    lf0 lf0Var2 = (lf0) z5cVar;
                    gdc.a(lf0Var2.m, lf0Var2.l, b.c(g09Var, 1.0f), an2.e, null, l46Var2, 1573248, 1976);
                }
                break;
        }
        return wefVar;
    }
}
