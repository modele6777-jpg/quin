package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ju7 implements l26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ x16 b;
    public final /* synthetic */ Locale c;
    public final /* synthetic */ a26 d;

    public /* synthetic */ ju7(x16 x16Var, Locale locale, a26 a26Var, int i) {
        this.b = x16Var;
        this.c = locale;
        this.d = a26Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        a26 a26Var = this.d;
        Locale locale = this.c;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    Object objR = l46Var.R();
                    i8c i8cVar = sf2.a;
                    if (objR == i8cVar) {
                        objR = q1c.f(locale);
                        l46Var.p0(objR);
                    }
                    e89 e89Var = (e89) objR;
                    c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, 0);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    g09 g09Var = g09.a;
                    j09 j09VarJ = m93.J(l46Var, g09Var);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, c92VarA);
                    dec.l(hj6.y, l46Var, u8aVarM);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ);
                    pa7.a(null, 0L, 0L, null, null, null, false, false, this.b, l46Var, 0, 255);
                    j09 j09VarB0 = ynb.b0(24.0f, 0.0f, b.d(g09Var, 67.0f), 2);
                    Locale locale2 = (Locale) e89Var.getValue();
                    Context context = (Context) l46Var.k(uq.b);
                    Configuration configuration = new Configuration();
                    configuration.setLocale(locale2);
                    String string = context.createConfigurationContext(configuration).getResources().getString(R.string.settings_language);
                    string.getClass();
                    mue mueVar = pue.a;
                    nte.b(string, j09VarB0, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(pue.m(l46Var), 0L, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 0, w6c.l(48), null, null, 16646107), l46Var, 48, 0, 131068);
                    boolean zG = l46Var.g(a26Var);
                    Object objR2 = l46Var.R();
                    if (zG || objR2 == i8cVar) {
                        objR2 = new yx1(a26Var, e89Var, 7);
                        l46Var.p0(objR2);
                    }
                    vfh.f(locale, (a26) objR2, l46Var, 0);
                    l46Var.r(true);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                vfh.g(this.b, locale, a26Var, (l46) obj, k99.P(1));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ ju7(Locale locale, x16 x16Var, a26 a26Var) {
        this.c = locale;
        this.b = x16Var;
        this.d = a26Var;
    }
}
