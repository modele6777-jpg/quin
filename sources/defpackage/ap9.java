package defpackage;

import ai.askquin.ui.conversation.ConversationActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ap9 {
    public static final x6f a = new x6f(500, 300, gs4.c);

    public static final void a(Object obj, l46 l46Var, int i) {
        l46Var.h0(300818260);
        int i2 = (l46Var.i(obj) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            cb9 cb9VarD0 = g21.d0(new fc9[0], l46Var);
            eec.b(cb9VarD0, l46Var, 0);
            Object objR = l46Var.R();
            Object obj2 = sf2.a;
            if (objR == obj2) {
                objR = q1c.f(Boolean.FALSE);
                l46Var.p0(objR);
            }
            e89 e89Var = (e89) objR;
            boolean zI = l46Var.i(cb9VarD0);
            Object objR2 = l46Var.R();
            if (zI || objR2 == obj2) {
                objR2 = new kz8(12, cb9VarD0, e89Var);
                l46Var.p0(objR2);
            }
            an1.g(cb9VarD0, obj, null, null, null, null, null, null, null, (a26) objR2, l46Var, (i2 << 3) & 112, 2044);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new eo9(i, obj);
        }
    }

    public static final void b(Context context, boolean z, boolean z2) {
        context.getClass();
        if (z2) {
            hs3 hs3Var = xqa.a;
            Boolean bool = Boolean.TRUE;
            ynb.V(lw2.a, null, null, new zo9(hs3Var.a, bool, null), 3);
        }
        Intent intent = new Intent(context, (Class<?>) ConversationActivity.class);
        intent.setFlags(268468224);
        intent.putExtra("isNewUser", z);
        intent.putExtra("paywallSource", "onboarding_finish");
        new Handler(Looper.getMainLooper()).post(new go9(context, intent, 0));
    }

    public static final boolean d(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        if (z4 || z5) {
            return true;
        }
        return z && z2 && z3;
    }
}
