package defpackage;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tt5 extends gbe implements l26 {
    final /* synthetic */ LocalDateTime $countdownTarget;
    final /* synthetic */ e89 $remaining$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt5(LocalDateTime localDateTime, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$countdownTarget = localDateTime;
        this.$remaining$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new tt5(this.$countdownTarget, this.$remaining$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        bw2 bw2Var = bw2.a;
        int i = this.label;
        if (i != 0 && i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        do {
            e89 e89Var = this.$remaining$delegate;
            Long l = g3b.a;
            ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
            zoneIdSystemDefault.getClass();
            e89Var.setValue(Duration.between(g3b.a(zoneIdSystemDefault), this.$countdownTarget));
            this.label = 1;
        } while (vfh.q(1000L, this) != bw2Var);
        return bw2Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((tt5) k((xn2) obj2, (aw2) obj)).r(wef.a);
        return bw2.a;
    }
}
