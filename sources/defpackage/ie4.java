package defpackage;

import ai.askquin.ui.conversation.r0;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ie4 extends gbe implements l26 {
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie4(r0 r0Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = r0Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ie4(this.this$0, xn2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                r0 r0Var = this.this$0;
                this.label = 1;
                int i2 = r0.j2;
                Object objV0 = r0Var.v0(this);
                bw2 bw2Var = bw2.a;
                this = objV0;
                if (objV0 == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
                this = this;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            m8b m8bVarD = this.this$0.d();
            fc4 fc4Var = this.this$0.H0;
            if (fc4Var == null) {
                pa7.g0("divinationKey");
                throw null;
            }
            m8bVarD.c("Refresh follow-up messages failed: chatId=" + fc4Var.a, e2);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ie4) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
