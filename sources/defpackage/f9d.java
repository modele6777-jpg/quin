package defpackage;

import android.content.Context;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f9d extends gbe implements l26 {
    final /* synthetic */ e95 $operation;
    final /* synthetic */ dbd $origin;
    int label;
    final /* synthetic */ bad this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9d(bad badVar, e95 e95Var, dbd dbdVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = badVar;
        this.$operation = e95Var;
        this.$origin = dbdVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new f9d(this.this$0, this.$operation, this.$origin, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:30:0x0099 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a0  */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        boolean z;
        e95 e95Var = null;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        bad badVar = this.this$0;
        Context context = badVar.a;
        cbd cbdVar = badVar.m;
        e95 e95Var2 = this.$operation;
        dbd dbdVar = this.$origin;
        context.getClass();
        e95Var2.getClass();
        dbdVar.getClass();
        boolean z2 = false;
        if (pa7.t(e95Var2.h, "Failed") && q6c.e(e95Var2.e)) {
            f95 f95Var = f95.a;
            String str = e95Var2.a;
            synchronized (f95Var) {
                try {
                    str.getClass();
                    e95 e95VarK = f95Var.k(context, str);
                    if (e95VarK != null) {
                        if (pa7.t(e95VarK.h, "Failed")) {
                            String str2 = e95VarK.e;
                            if ((!pa7.t(str2, "wechat") && !pa7.t(str2, "wechat_moments")) || e95VarK.m) {
                                e95VarK = null;
                            }
                        } else {
                            e95VarK = null;
                        }
                        if (e95VarK != null) {
                            e95 e95VarA = e95.a(e95VarK, null, null, null, 0, null, null, 28671);
                            e95Var = context.getApplicationContext().getSharedPreferences("external_share_operation", 0).edit().putString(f95.l(e95VarA.a), f95.q(e95VarA).toString()).commit() ? e95VarA : null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (e95Var != null) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        Set set = cbdVar.a;
        String str3 = e95Var2.a;
        String str4 = e95Var2.h;
        if (str4 == null || set.contains(str3)) {
            return new ebd(cbdVar, bbd.a);
        }
        cbd cbdVar2 = new cbd(n3d.n(set, str3));
        if (q6c.e(e95Var2.e)) {
            z2 = z;
        } else if (dbdVar == dbd.a) {
            z2 = true;
        }
        return new ebd(cbdVar2, (str4.equals("Failed") && z2) ? bbd.b : bbd.a);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((f9d) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
