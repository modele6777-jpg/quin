package defpackage;

import ai.askquin.ui.conversation.r0;
import java.util.concurrent.CancellationException;
import tech.chatmind.api.AdditionalInfoAudio;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tf4 extends gbe implements l26 {
    final /* synthetic */ AdditionalInfoAudio $audioInfo;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf4(r0 r0Var, AdditionalInfoAudio additionalInfoAudio, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = r0Var;
        this.$audioInfo = additionalInfoAudio;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        tf4 tf4Var = new tf4(this.this$0, this.$audioInfo, xn2Var);
        tf4Var.L$0 = obj;
        return tf4Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        Object dzbVar;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                r0 r0Var = this.this$0;
                AdditionalInfoAudio additionalInfoAudio = this.$audioInfo;
                yt6 yt6Var = r0Var.d;
                fc4 fc4Var = r0Var.H0;
                if (fc4Var == null) {
                    pa7.g0("divinationKey");
                    throw null;
                }
                String str = fc4Var.a;
                uke ukeVar = (uke) yt6Var;
                ukeVar.getClass();
                str.getClass();
                additionalInfoAudio.getClass();
                wj5 wj5VarF = ndc.f(new rke(ukeVar, str, additionalInfoAudio, null));
                sf4 sf4Var = new sf4(2, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                obj = tm7.C(wj5VarF, sf4Var, this);
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
            dzbVar = (oyb) obj;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        r0 r0Var2 = this.this$0;
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            if (thA instanceof CancellationException) {
                throw thA;
            }
            r0Var2.d().c("Failed to submit post-draw audio info", thA);
        }
        r0 r0Var3 = this.this$0;
        if (!(dzbVar instanceof dzb)) {
            int i2 = r0.j2;
            r0Var3.c1((oyb) dzbVar, true);
        }
        r0 r0Var4 = this.this$0;
        int i3 = r0.j2;
        r0Var4.V0();
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((tf4) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
