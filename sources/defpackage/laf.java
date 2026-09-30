package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class laf extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ gbd $direction;
    final /* synthetic */ x16 $onShareSuccess;
    final /* synthetic */ w6d $shareConfig;
    final /* synthetic */ wt6 $shareManager;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public laf(wt6 wt6Var, Context context, gbd gbdVar, w6d w6dVar, x16 x16Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$shareManager = wt6Var;
        this.$context = context;
        this.$direction = gbdVar;
        this.$shareConfig = w6dVar;
        this.$onShareSuccess = x16Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new laf(this.$shareManager, this.$context, this.$direction, this.$shareConfig, this.$onShareSuccess, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        x16 x16Var;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            wt6 wt6Var = this.$shareManager;
            Context context = this.$context;
            w6d w6dVar = this.$shareConfig;
            String str = w6dVar.a;
            String str2 = w6dVar.b;
            String str3 = w6dVar.c;
            BitmapFactory.decodeResource(context.getResources(), this.$shareConfig.e).getClass();
            this.label = 1;
            wt6Var.getClass();
            obj = wt6.a(context, str, str2, str3);
            bw2 bw2Var = bw2.a;
            if (obj == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        if (((Boolean) obj).booleanValue() && (x16Var = this.$onShareSuccess) != null) {
            x16Var.invoke();
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((laf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
