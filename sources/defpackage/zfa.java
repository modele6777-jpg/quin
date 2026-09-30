package defpackage;

import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zfa {
    public static final pr4 a = new pr4(1, new bca(10));
    public static final ed2 b = new ed2(16);

    public static final void a(rme rmeVar, Context context, boolean z, CharSequence charSequence, eue eueVar, rfa rfaVar, a26 a26Var) {
        if (Build.VERSION.SDK_INT >= 28 && charSequence != null && eueVar != null && rfaVar != null && (rfaVar instanceof yfa)) {
            ((yfa) rfaVar).a(rmeVar, charSequence, eueVar.a, a26Var);
            z5c.i(rmeVar, context, z, charSequence, eueVar.a);
            return;
        }
        a26Var.d(rmeVar);
        if (charSequence == null || eueVar == null) {
            return;
        }
        z5c.i(rmeVar, context, z, charSequence, eueVar.a);
    }

    public static final rfa b(tuc tucVar, sd8 sd8Var, l46 l46Var, int i) {
        l46Var.f0(430530635);
        if (Build.VERSION.SDK_INT < 28) {
            l46Var.r(false);
            return null;
        }
        Context context = (Context) l46Var.k(uq.b);
        pv2 pv2Var = (pv2) l46Var.k(a);
        boolean zG = ((((i & 112) ^ 48) > 32 && l46Var.g(sd8Var)) || (i & 48) == 32) | l46Var.g(pv2Var) | l46Var.g(context);
        Object objR = l46Var.R();
        if (zG || objR == sf2.a) {
            b.getClass();
            objR = new yfa(pv2Var, context, tucVar, sd8Var);
            l46Var.p0(objR);
        }
        rfa rfaVar = (rfa) objR;
        l46Var.r(false);
        return rfaVar;
    }
}
