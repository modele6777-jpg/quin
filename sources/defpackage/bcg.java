package defpackage;

import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bcg extends gbe implements l26 {
    final /* synthetic */ lr5 $foregroundUpdater;
    final /* synthetic */ v88 $worker;
    int label;
    final /* synthetic */ ccg this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcg(ccg ccgVar, v88 v88Var, lr5 lr5Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = ccgVar;
        this.$worker = v88Var;
        this.$foregroundUpdater = lr5Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new bcg(this.this$0, this.$worker, this.$foregroundUpdater, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            ccg ccgVar = this.this$0;
            Context context = ccgVar.b;
            lbg lbgVar = ccgVar.a;
            v88 v88Var = this.$worker;
            lr5 lr5Var = this.$foregroundUpdater;
            bbg bbgVar = ccgVar.d;
            this.label = 1;
            String str = rag.a;
            boolean z = lbgVar.q;
            Object obj2 = wef.a;
            if (z && Build.VERSION.SDK_INT < 31) {
                dd7 dd7Var = bbgVar.d;
                dd7Var.getClass();
                Object objP0 = ynb.p0(t72.z(dd7Var), new qag(v88Var, lbgVar, lr5Var, context, null), this);
                if (objP0 == bw2Var) {
                    obj2 = objP0;
                }
            }
            if (obj2 != bw2Var) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        String str2 = dcg.a;
        ccg ccgVar2 = this.this$0;
        ff8.h().e(str2, "Starting work for " + ccgVar2.a.c);
        pa1 pa1VarB = this.$worker.b();
        v88 v88Var2 = this.$worker;
        this.label = 2;
        Object objA = dcg.a(pa1VarB, v88Var2, this);
        return objA == bw2Var ? bw2Var : objA;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((bcg) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
