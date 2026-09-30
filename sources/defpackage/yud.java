package defpackage;

import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yud {
    public static final float a = ViewConfiguration.getScrollFriction();

    public static final ph3 a(l46 l46Var) {
        sw3 sw3Var = (sw3) l46Var.k(zg2.h);
        boolean zD = l46Var.d(sw3Var.getDensity());
        Object objR = l46Var.R();
        if (zD || objR == sf2.a) {
            objR = new qh3(new g5b(sw3Var));
            l46Var.p0(objR);
        }
        return (ph3) objR;
    }
}
