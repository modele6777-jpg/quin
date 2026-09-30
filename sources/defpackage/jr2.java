package defpackage;

import ai.askquin.ui.router.AppRoute;
import com.adjust.sdk.Constants;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jr2 {
    public final cb9 a;
    public final dc9 b;
    public final qn8 c;

    public jr2(cb9 cb9Var, dc9 dc9Var, qn8 qn8Var) {
        dc9Var.getClass();
        qn8Var.getClass();
        this.a = cb9Var;
        this.b = dc9Var;
        this.c = qn8Var;
    }

    public static void a(jr2 jr2Var) {
        dc9 dc9Var = jr2Var.b;
        dc9Var.c.setValue(null);
        dc9Var.d = Constants.NORMAL;
        dc9Var.h(null);
        jr2Var.b();
    }

    public final void b() {
        qn8 qn8Var = this.c;
        qn8Var.getClass();
        qn2 qn2Var = lw2.a;
        js3 js3Var = ga4.a;
        ynb.V(qn2Var, hr3.c, null, new hn8(qn8Var, null), 2);
        ka9.e(this.a, AppRoute.Conversation.INSTANCE, cn1.I(new cz1(18)), 4);
    }
}
