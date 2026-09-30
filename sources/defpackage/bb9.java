package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@ec9("navigation")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lbb9;", "Lfc9;", "Lya9;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = z7c.f)
public class bb9 extends fc9 {
    public final gc9 c;

    public bb9(gc9 gc9Var) {
        gc9Var.getClass();
        this.c = gc9Var;
    }

    @Override // defpackage.fc9
    public final void d(List list, pb9 pb9Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            da9 da9Var = (da9) it.next();
            ua9 ua9Var = da9Var.b;
            ua9Var.getClass();
            ya9 ya9Var = (ya9) ua9Var;
            a80 a80Var = ya9Var.b;
            mmb mmbVar = new mmb();
            mmbVar.element = da9Var.v.a();
            r1f r1fVar = ya9Var.f;
            int i = r1fVar.a;
            String str = (String) r1fVar.e;
            if (i == 0 && str == null) {
                a80Var.getClass();
                String strValueOf = String.valueOf(a80Var.b);
                strValueOf.getClass();
                if (((ya9) r1fVar.b).b.b == 0) {
                    strValueOf = "the root navigation";
                }
                ho7.j("no start destination defined via app:startDestination for ".concat(strValueOf));
                return;
            }
            ua9 ua9VarL = str != null ? r1fVar.l(str, false) : (ua9) abg.q((fud) r1fVar.c, i);
            if (ua9VarL == null) {
                String strValueOf2 = (String) r1fVar.d;
                if (strValueOf2 == null) {
                    strValueOf2 = (String) r1fVar.e;
                    if (strValueOf2 == null) {
                        strValueOf2 = String.valueOf(r1fVar.a);
                    }
                    r1fVar.d = strValueOf2;
                }
                strValueOf2.getClass();
                qc0.j(ib8.j("navigation destination ", strValueOf2, " is not a direct child of this NavGraph"));
                return;
            }
            a80 a80Var2 = ua9VarL.b;
            if (str != null) {
                if (!str.equals((String) a80Var2.f)) {
                    ta9 ta9VarT = a80Var2.t(str);
                    Bundle bundle = ta9VarT != null ? ta9VarT.b : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle bundleR = feg.r((iy9[]) Arrays.copyOf(new iy9[0], 0));
                        bundleR.putAll(bundle);
                        Bundle bundle2 = (Bundle) mmbVar.element;
                        if (bundle2 != null) {
                            bundleR.putAll(bundle2);
                        }
                        mmbVar.element = bundleR;
                    }
                }
                if (ua9VarL.d().isEmpty()) {
                    continue;
                } else {
                    ArrayList arrayListA = y7h.A(ua9VarL.d(), new up(mmbVar, 4));
                    if (!arrayListA.isEmpty()) {
                        ho7.p("Cannot navigate to startDestination ", ua9VarL, ". Missing required arguments [", arrayListA, 93);
                        return;
                    }
                }
            }
            this.c.b(ua9VarL.a).d(t72.H(b().b(ua9VarL, ua9VarL.c((Bundle) mmbVar.element))), pb9Var);
        }
    }

    @Override // defpackage.fc9
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public ya9 a() {
        return new ya9(this);
    }
}
