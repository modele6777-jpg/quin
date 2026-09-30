package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sf3 implements o26 {
    public final /* synthetic */ z67 a;
    public final /* synthetic */ j91 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ a26 e;
    public final /* synthetic */ euc f;
    public final /* synthetic */ ke3 g;

    public sf3(z67 z67Var, j91 j91Var, int i, int i2, a26 a26Var, euc eucVar, ke3 ke3Var) {
        this.a = z67Var;
        this.b = j91Var;
        this.c = i;
        this.d = i2;
        this.e = a26Var;
        this.f = eucVar;
        this.g = ke3Var;
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        l46 l46Var = (l46) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= l46Var.e(iIntValue) ? 32 : 16;
        }
        if (l46Var.W(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
            int i = iIntValue + this.a.a;
            String strA = i91.a(i, this.b.a);
            j09 j09VarI = b.i(g09.a, i7h.C, i7h.B);
            boolean z = i == this.c;
            boolean z2 = i == this.d;
            a26 a26Var = this.e;
            boolean zG = l46Var.g(a26Var) | l46Var.e(i);
            Object objR = l46Var.R();
            if (zG || objR == sf2.a) {
                objR = new rr1(i, 1, a26Var);
                l46Var.p0(objR);
            }
            this.f.getClass();
            vf3.m(strA, j09VarI, z, z2, (x16) objR, String.format(tgc.h(R.string.m3c_date_picker_navigate_to_year_description, l46Var), Arrays.copyOf(new Object[]{strA}, 1)), this.g, l46Var, 48);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}
