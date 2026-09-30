package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.graphics.BitmapFactory;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nc7 extends gbe implements l26 {
    final /* synthetic */ Context $context;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc7(Context context, xn2 xn2Var) {
        super(2, xn2Var);
        this.$context = context;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        nc7 nc7Var = new nc7(this.$context, xn2Var);
        nc7Var.L$0 = obj;
        return nc7Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object dzbVar;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        try {
            dzbVar = BitmapFactory.decodeResource(this.$context.getResources(), R.drawable.ic_logo);
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        if (dzbVar instanceof dzb) {
            return null;
        }
        return dzbVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((nc7) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
