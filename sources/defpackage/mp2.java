package defpackage;

import android.app.Activity;
import android.os.Build;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mp2 extends gbe implements l26 {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ boolean $darkTheme;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp2(Activity activity, boolean z, xn2 xn2Var) {
        super(2, xn2Var);
        this.$activity = activity;
        this.$darkTheme = z;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new mp2(this.$activity, this.$darkTheme, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        o7c j8gVar;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        Activity activity = this.$activity;
        if (activity != null) {
            boolean z = this.$darkTheme;
            Window window = activity.getWindow();
            activity.getWindow().getDecorView();
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                j8gVar = new l8g(window);
            } else {
                j8gVar = i >= 30 ? new j8g(window) : new i8g(window);
            }
            boolean z2 = !z;
            j8gVar.B(z2);
            j8gVar.A(z2);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        mp2 mp2Var = (mp2) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        mp2Var.r(wefVar);
        return wefVar;
    }
}
