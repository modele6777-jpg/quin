package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a3g implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ a3g(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    nte.b(this.b, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 0, 0, 262142);
                    o5c.f(l46Var, b.p(g09.a, 2.0f));
                    gu6.a(iec.k(), null, null, 0L, l46Var, 48, 12);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            default:
                String str = this.b;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    String strQ = afc.q(R.string.template_title_prefix, l46Var2);
                    l46Var2.f0(90059231);
                    i00 i00Var = new i00();
                    pr4 pr4Var = o82.a;
                    int iK = i00Var.k(new xtd(((m82) l46Var2.k(pr4Var)).q, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    try {
                        i00Var.f(strQ);
                        i00Var.f(" ");
                        i00Var.h(iK);
                        int iK2 = i00Var.k(new xtd(((m82) l46Var2.k(pr4Var)).a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                        try {
                            i00Var.f(str);
                            i00Var.h(iK2);
                            k00 k00VarL = i00Var.l();
                            l46Var2.r(false);
                            nte.c(k00VarL, b.c(ynb.d0(0.0f, 0.0f, 0.0f, 8.0f, 7, g09.a), 1.0f), 0L, w6c.l(27), ar5.d, cr5.h, 0L, null, 0L, 0, false, 0, 0, null, null, null, l46Var2, 1597488, 0, 524076);
                        } catch (Throwable th) {
                            i00Var.h(iK2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        i00Var.h(iK);
                        throw th2;
                    }
                } else {
                    l46Var2.Z();
                }
                return wefVar;
        }
    }
}
