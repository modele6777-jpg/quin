package defpackage;

import tech.chatmind.api.credits.QuotaUsage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i4d extends gbe implements l26 {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ k4d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4d(k4d k4dVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = k4dVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        i4d i4dVar = new i4d(this.this$0, xn2Var);
        i4dVar.L$0 = obj;
        return i4dVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        lb8 lb8Var;
        QuotaUsage quotaUsage;
        boolean zBooleanValue;
        iy9 iy9Var = (iy9) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            lb8Var = (lb8) iy9Var.a();
            quotaUsage = (QuotaUsage) iy9Var.b();
            if (quotaUsage != null) {
                x1g x1gVar = this.this$0.e;
                this.L$0 = null;
                this.L$1 = lb8Var;
                this.L$2 = quotaUsage;
                this.label = 1;
                obj = vd0.Q(quotaUsage, x1gVar, this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            } else {
                zBooleanValue = false;
            }
            k4d k4dVar = this.this$0;
            boolean z = lb8Var.e;
            int i2 = k4d.g;
            k4dVar.getClass();
            return k4d.f(z, quotaUsage, zBooleanValue);
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        quotaUsage = (QuotaUsage) this.L$2;
        lb8Var = (lb8) this.L$1;
        jzb.q(obj);
        zBooleanValue = ((Boolean) obj).booleanValue();
        k4d k4dVar2 = this.this$0;
        boolean z2 = lb8Var.e;
        int i3 = k4d.g;
        k4dVar2.getClass();
        return k4d.f(z2, quotaUsage, zBooleanValue);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((i4d) k((xn2) obj2, (iy9) obj)).r(wef.a);
    }
}
