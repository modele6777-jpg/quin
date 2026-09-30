package defpackage;

import ai.askquin.R;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.model.DrawCardSaves;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ze4 extends gbe implements l26 {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze4(r0 r0Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = r0Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ze4(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        DrawCardSaves drawCardSavesJ;
        String str;
        int i = this.label;
        boolean z = true;
        try {
            try {
                if (i == 0) {
                    jzb.q(obj);
                    r0 r0Var = this.this$0;
                    if (r0Var.A1) {
                        return Boolean.FALSE;
                    }
                    drawCardSavesJ = r0Var.J();
                    if (drawCardSavesJ == null) {
                        return Boolean.FALSE;
                    }
                    fc4 fc4Var = this.this$0.H0;
                    if (fc4Var == null) {
                        pa7.g0("divinationKey");
                        throw null;
                    }
                    str = fc4Var.a;
                    if (!pa7.t(drawCardSavesJ.getChatId(), str) || !drawCardSavesJ.getChoices().isEmpty() || !drawCardSavesJ.getDrawnIndexes().isEmpty()) {
                        return Boolean.FALSE;
                    }
                    if (this.this$0.R() == null && drawCardSavesJ.getMixedDeck() == null) {
                        return Boolean.TRUE;
                    }
                    r0 r0Var2 = this.this$0;
                    r0Var2.A1 = true;
                    yc4 yc4VarW = r0Var2.w();
                    uc4 uc4Var = this.this$0.f;
                    yc4 yc4VarA = yc4.a(yc4VarW, null, false, null, null, 0, fb4.a(yc4VarW.h, null, null, null, null, null, null, null, null, null, 255), null, null, null, null, null, null, null, 4194175);
                    this.L$0 = drawCardSavesJ;
                    this.L$1 = str;
                    this.L$2 = null;
                    this.label = 1;
                    Object objH = ((gq3) uc4Var).h(yc4VarA, this);
                    bw2 bw2Var = bw2.a;
                    if (objH == bw2Var) {
                        return bw2Var;
                    }
                } else {
                    if (i != 1) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) this.L$1;
                    drawCardSavesJ = (DrawCardSaves) this.L$0;
                    jzb.q(obj);
                }
                if (this.this$0.J() == drawCardSavesJ) {
                    fc4 fc4Var2 = this.this$0.H0;
                    if (fc4Var2 == null) {
                        pa7.g0("divinationKey");
                        throw null;
                    }
                    if (pa7.t(fc4Var2.a, str)) {
                        this.this$0.D1(null);
                        r0 r0Var3 = this.this$0;
                        DrawCardSaves drawCardSavesB = nm4.b(DrawCardSaves.Companion, drawCardSavesJ.getChatId(), drawCardSavesJ.getPatterns(), drawCardSavesJ.getChoices(), drawCardSavesJ.getDrawnIndexes());
                        r0Var3.getClass();
                        r0Var3.z1(drawCardSavesB);
                        this.this$0.J1.setValue(null);
                        this.this$0.A1 = false;
                        return Boolean.valueOf(z);
                    }
                }
                Boolean bool = Boolean.FALSE;
                this.this$0.A1 = false;
                return bool;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                this.this$0.d().c("Failed to prepare physical drawing", e2);
                jcc.k(0, new Integer(R.string.network_common_error));
                this.this$0.A1 = false;
                z = false;
            }
        } catch (Throwable th) {
            this.this$0.A1 = false;
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ze4) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
