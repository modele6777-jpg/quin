package ai.askquin.ui.conversation;

import defpackage.fd4;
import defpackage.gbe;
import defpackage.jzb;
import defpackage.l26;
import defpackage.qc0;
import defpackage.v4e;
import defpackage.vfb;
import defpackage.wef;
import defpackage.xfb;
import defpackage.xn2;
import java.time.Instant;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends gbe implements l26 {
    final /* synthetic */ String $additionalInfo;
    final /* synthetic */ fd4 $requisite;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(r0 r0Var, fd4 fd4Var, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = r0Var;
        this.$requisite = fd4Var;
        this.$additionalInfo = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new b0(this.this$0, this.$requisite, this.$additionalInfo, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.this$0.X1 = Instant.now();
        this.this$0.K1(fd4.b(this.$requisite, null, this.$additionalInfo, 1));
        if (!v4e.Q(this.$additionalInfo)) {
            ConcurrentHashMap concurrentHashMap = xfb.a;
            String str = this.this$0.I0;
            str.getClass();
            vfb vfbVar = (vfb) xfb.a.get(str);
            if (vfbVar != null) {
                synchronized (vfbVar) {
                    vfbVar.e = true;
                }
            }
        }
        this.this$0.d().e("submitAdditionalInfo success, proceeding to pattern");
        this.this$0.M0(Operation.Pattern.INSTANCE);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        b0 b0Var = (b0) k((xn2) obj2, (wef) obj);
        wef wefVar = wef.a;
        b0Var.r(wefVar);
        return wefVar;
    }
}
