package ai.askquin.ui.conversation;

import defpackage.bw2;
import defpackage.ed4;
import defpackage.fd4;
import defpackage.gbe;
import defpackage.gd4;
import defpackage.jzb;
import defpackage.l26;
import defpackage.ok8;
import defpackage.qc0;
import defpackage.vfb;
import defpackage.wef;
import defpackage.xfb;
import defpackage.xn2;
import java.time.Instant;
import java.util.concurrent.ConcurrentHashMap;
import tech.chatmind.api.ReadingResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends gbe implements l26 {
    final /* synthetic */ Operation<?> $op;
    final /* synthetic */ gd4 $requisite;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(r0 r0Var, Operation operation, gd4 gd4Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = r0Var;
        this.$op = operation;
        this.$requisite = gd4Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        a0 a0Var = new a0(this.this$0, this.$op, this.$requisite, xn2Var);
        a0Var.L$0 = obj;
        return a0Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        ed4 ed4VarB;
        ReadingResponse readingResponse = (ReadingResponse) this.L$0;
        bw2 bw2Var = bw2.a;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            this.this$0.d().e("updateQuestion success, q: " + ((Operation.UpdateQuestion) this.$op).getQuestion());
            this.this$0.X1 = Instant.now();
            gd4 gd4VarB = gd4.b(this.$requisite, ((Operation.UpdateQuestion) this.$op).getQuestion(), readingResponse.isAdditionalInfoNeeded(), readingResponse.getAdditionalInfoQuestion(), 144);
            r0 r0Var = this.this$0;
            ed4VarB = ok8.B(gd4VarB, null, r0Var.V() != null || r0Var.o0());
            this.this$0.K1(ed4VarB);
            r0 r0Var2 = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = ed4VarB;
            this.label = 1;
            obj = r0Var2.O0(this);
            if (obj == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ed4VarB = (ed4) this.L$2;
            jzb.q(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            return wef.a;
        }
        ConcurrentHashMap concurrentHashMap = xfb.a;
        String str = this.this$0.I0;
        str.getClass();
        vfb vfbVar = (vfb) xfb.a.get(str);
        if (vfbVar != null) {
            synchronized (vfbVar) {
                vfbVar.d = true;
            }
        }
        this.this$0.D0(((Operation.UpdateQuestion) this.$op).getQuestion());
        boolean z = ed4VarB instanceof fd4;
        r0 r0Var3 = this.this$0;
        if (z) {
            r0Var3.q1();
            return wef.a;
        }
        r0Var3.M0(Operation.Pattern.INSTANCE);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((a0) k((xn2) obj2, (ReadingResponse) obj)).r(wef.a);
    }
}
