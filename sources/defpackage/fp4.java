package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fp4 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ fp4(int i, float f) {
        this.a = i;
        this.b = f;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((oz) obj).getClass();
                if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    s21.a(tm7.o(b.c, y72.b(((e8b) l46Var.k(l8b.a)).c, this.b), g21.f), l46Var, 0);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 1:
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    z7c.f(null, afc.q(R.string.spread_ai_recommended_group, l46Var2), this.b, l46Var2, 0, 1);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            default:
                j09 j09Var = (j09) obj;
                l46 l46Var3 = (l46) obj2;
                ((Integer) obj3).getClass();
                j09Var.getClass();
                l46Var3.f0(-544109546);
                j09 j09VarD0 = ynb.d0(0.0f, this.b, 0.0f, 0.0f, 13, j09Var);
                l46Var3.r(false);
                return j09VarD0;
        }
    }
}
