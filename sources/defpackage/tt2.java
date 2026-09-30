package defpackage;

import java.time.LocalDateTime;
import java.time.ZoneId;
import tech.chatmind.api.credits.QuotaUsage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tt2 extends gbe implements l26 {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ wt2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt2(wt2 wt2Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = wt2Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new tt2(this.this$0, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0080  */
    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        LocalDateTime localDateTime;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            fab fabVar = this.this$0.b;
            this.label = 1;
            obj = ((rab) fabVar).b(this);
            if (obj != bw2Var) {
            }
            return bw2Var;
        }
        if (i == 1) {
            jzb.q(obj);
        } else {
            if (i != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            localDateTime = (LocalDateTime) this.L$2;
            jzb.q(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            qv5 qv5Var = qv5.a;
            qv5.i(this.this$0.f, localDateTime, 4);
        }
        return wefVar;
        QuotaUsage quotaUsage = (QuotaUsage) obj;
        if (quotaUsage != null && y41.w(quotaUsage)) {
            mic.a.getClass();
            yic yicVarC = rmc.c(mic.b);
            Long l = g3b.a;
            ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
            zoneIdSystemDefault.getClass();
            LocalDateTime localDateTimeA = g3b.a(zoneIdSystemDefault);
            if (jpc.b(yicVarC, localDateTimeA) != null) {
                qv5 qv5Var2 = qv5.a;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = localDateTimeA;
                this.label = 2;
                obj = qv5Var2.e(yicVarC, this);
                if (obj != bw2Var) {
                    localDateTime = localDateTimeA;
                    if (((Boolean) obj).booleanValue()) {
                        qv5 qv5Var3 = qv5.a;
                        qv5.i(this.this$0.f, localDateTime, 4);
                    }
                }
                return bw2Var;
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((tt2) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
