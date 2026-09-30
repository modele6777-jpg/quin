package defpackage;

import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.model.DrawCardSaves;
import ai.askquin.ui.draw.navhost.DeckSelectionRoute;
import ai.askquin.ui.draw.navhost.UnifiedDrawingRoute;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tr2 {
    public final ka9 a;
    public final cb9 b;
    public final r0 c;
    public final fme d;
    public final p3c e;

    public tr2(ka9 ka9Var, cb9 cb9Var, r0 r0Var, fme fmeVar, p3c p3cVar) {
        r0Var.getClass();
        fmeVar.getClass();
        p3cVar.getClass();
        this.a = ka9Var;
        this.b = cb9Var;
        this.c = r0Var;
        this.d = fmeVar;
        this.e = p3cVar;
    }

    public final void a(DrawCardSaves drawCardSaves) {
        if (drawCardSaves != null) {
            r0 r0Var = this.c;
            r0Var.getClass();
            r0Var.z1(drawCardSaves);
            ConcurrentHashMap concurrentHashMap = xfb.a;
            xfb.i(r0Var.I0, "shuffle");
            ka9.e(this.b, new UnifiedDrawingRoute(false, r0Var.q0(), 1, (rp3) null), null, 6);
        }
    }

    public final void b(DrawCardSaves drawCardSaves) {
        r0 r0Var = this.c;
        r0Var.getClass();
        r0Var.z1(drawCardSaves);
        boolean zM0 = r0Var.m0();
        cb9 cb9Var = this.b;
        if (!zM0) {
            ka9.e(cb9Var, DeckSelectionRoute.INSTANCE, null, 6);
            return;
        }
        ConcurrentHashMap concurrentHashMap = xfb.a;
        xfb.i(r0Var.I0, "shuffle");
        ka9.e(cb9Var, new UnifiedDrawingRoute(false, false, 3, (rp3) null), null, 6);
    }
}
