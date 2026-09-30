package defpackage;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class me2 extends View.DragShadowBuilder {
    public final vw3 a;
    public final long b;
    public final a26 c;

    public me2(vw3 vw3Var, long j, a26 a26Var) {
        this.a = vw3Var;
        this.b = j;
        this.c = a26Var;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        xl1 xl1Var = new xl1();
        Canvas canvas2 = mp.a;
        lp lpVar = new lp();
        lpVar.a = canvas;
        wl1 wl1Var = xl1Var.a;
        sw3 sw3Var = wl1Var.a;
        cv7 cv7Var = wl1Var.b;
        vl1 vl1Var = wl1Var.c;
        long j = wl1Var.d;
        wl1Var.a = this.a;
        wl1Var.b = cv7.a;
        wl1Var.c = lpVar;
        wl1Var.d = this.b;
        lpVar.g();
        this.c.d(xl1Var);
        lpVar.o();
        wl1Var.a = sw3Var;
        wl1Var.b = cv7Var;
        wl1Var.c = vl1Var;
        wl1Var.d = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        vw3 vw3Var = this.a;
        point.set(vw3Var.D0(fIntBitsToFloat / vw3Var.getDensity()), vw3Var.D0(Float.intBitsToFloat((int) (j & 4294967295L)) / vw3Var.getDensity()));
        point2.set(point.x / 2, point.y / 2);
    }
}
