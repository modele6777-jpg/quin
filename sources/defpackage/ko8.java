package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ko8 extends y7h {
    public final MeasurementManager n;

    public ko8(MeasurementManager measurementManager) {
        this.n = measurementManager;
    }

    public static Object b0(ko8 ko8Var, lw3 lw3Var, xn2<? super wef> xn2Var) {
        new pl1(1, k99.D(xn2Var)).v();
        MeasurementManager measurementManager = ko8Var.n;
        throw null;
    }

    public static Object c0(ko8 ko8Var, xn2<? super Integer> xn2Var) {
        pl1 pl1Var = new pl1(1, k99.D(xn2Var));
        pl1Var.v();
        ko8Var.n.getMeasurementApiStatus(new mc0(1), new ao2(pl1Var));
        return pl1Var.t();
    }

    public static Object e0(ko8 ko8Var, ttd ttdVar, xn2<? super wef> xn2Var) {
        Object objO = jgb.O(new jo8(ko8Var, null), xn2Var);
        return objO == bw2.a ? objO : wef.a;
    }

    public static Object f0(ko8 ko8Var, Uri uri, InputEvent inputEvent, xn2<? super wef> xn2Var) {
        pl1 pl1Var = new pl1(1, k99.D(xn2Var));
        pl1Var.v();
        ko8Var.n.registerSource(uri, inputEvent, new mc0(1), new ao2(pl1Var));
        Object objT = pl1Var.t();
        return objT == bw2.a ? objT : wef.a;
    }

    public static Object g0(ko8 ko8Var, Uri uri, xn2<? super wef> xn2Var) {
        pl1 pl1Var = new pl1(1, k99.D(xn2Var));
        pl1Var.v();
        ko8Var.n.registerTrigger(uri, new mc0(1), new ao2(pl1Var));
        Object objT = pl1Var.t();
        return objT == bw2.a ? objT : wef.a;
    }

    public static Object i0(ko8 ko8Var, j0g j0gVar, xn2<? super wef> xn2Var) {
        new pl1(1, k99.D(xn2Var)).v();
        MeasurementManager measurementManager = ko8Var.n;
        throw null;
    }

    public static Object k0(ko8 ko8Var, k0g k0gVar, xn2<? super wef> xn2Var) {
        new pl1(1, k99.D(xn2Var)).v();
        MeasurementManager measurementManager = ko8Var.n;
        throw null;
    }

    @Override // defpackage.y7h
    public Object K(Uri uri, InputEvent inputEvent, xn2<? super wef> xn2Var) {
        return f0(this, uri, inputEvent, xn2Var);
    }

    @Override // defpackage.y7h
    public Object L(Uri uri, xn2<? super wef> xn2Var) {
        return g0(this, uri, xn2Var);
    }

    public Object a0(lw3 lw3Var, xn2<? super wef> xn2Var) {
        return b0(this, lw3Var, xn2Var);
    }

    public Object d0(ttd ttdVar, xn2<? super wef> xn2Var) {
        return e0(this, ttdVar, xn2Var);
    }

    public Object h0(j0g j0gVar, xn2<? super wef> xn2Var) {
        return i0(this, j0gVar, xn2Var);
    }

    public Object j0(k0g k0gVar, xn2<? super wef> xn2Var) {
        return k0(this, k0gVar, xn2Var);
    }

    @Override // defpackage.y7h
    public Object x(xn2<? super Integer> xn2Var) {
        return c0(this, xn2Var);
    }
}
