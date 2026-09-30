package defpackage;

import android.app.Activity;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mf2 extends gbe implements l26 {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ h9g $sizeClass;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf2(h9g h9gVar, Activity activity, xn2 xn2Var) {
        super(2, xn2Var);
        this.$sizeClass = h9gVar;
        this.$activity = activity;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new mf2(this.$sizeClass, this.$activity, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Activity activity;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        int i = this.$sizeClass.b;
        Set set = d7g.b;
        if (i == 0 && (activity = this.$activity) != null) {
            activity.setRequestedOrientation(1);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        mf2 mf2Var = (mf2) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        mf2Var.r(wefVar);
        return wefVar;
    }
}
