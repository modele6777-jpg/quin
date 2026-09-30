package defpackage;

import java.util.BitSet;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zq0 implements r37 {
    public static final ssg a;
    public static final Pattern b;
    public static final Pattern c;

    static {
        mjg mjgVarE = ssg.E();
        mjgVarE.E('<');
        mjgVarE.E('>');
        a = new ssg(mjgVarE);
        b = Pattern.compile("^[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*$");
        c = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*+$");
    }

    @Override // defpackage.r37
    public final fz3 a(x37 x37Var) {
        String strConcat;
        xg3 xg3Var = x37Var.y;
        xg3Var.j();
        una unaVarN = xg3Var.n();
        int i = 0;
        while (true) {
            char cM = xg3Var.m();
            if (cM == 0) {
                i = -1;
                break;
            }
            if (((BitSet) a.b).get(cM)) {
                break;
            }
            i++;
            xg3Var.j();
        }
        if (i > 0 && xg3Var.m() == '>') {
            mx mxVarE = xg3Var.e(unaVarN, xg3Var.n());
            String strE = mxVarE.e();
            xg3Var.j();
            if (b.matcher(strE).matches()) {
                strConcat = strE;
            } else {
                strConcat = c.matcher(strE).matches() ? "mailto:".concat(strE) : null;
            }
            if (strConcat != null) {
                i68 i68Var = new i68(strConcat, null);
                ime imeVar = new ime(strE);
                imeVar.g(mxVarE.f());
                i68Var.c(imeVar);
                return new fz3(28, i68Var, xg3Var.n());
            }
        }
        return null;
    }
}
