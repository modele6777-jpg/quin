package defpackage;

import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.model.DrawCardSaves;
import ai.askquin.ui.persistence.database.InterruptedDrawing;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ff4 extends gbe implements l26 {
    final /* synthetic */ DrawCardSaves $saves;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff4(r0 r0Var, DrawCardSaves drawCardSaves, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = r0Var;
        this.$saves = drawCardSaves;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ff4(this.this$0, this.$saves, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object objE;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            uc4 uc4Var = this.this$0.f;
            String chatId = this.$saves.getChatId();
            this.label = 1;
            objE = ((gq3) uc4Var).e(chatId, this);
            bw2 bw2Var = bw2.a;
            if (objE == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            objE = obj;
        }
        yc4 yc4Var = (yc4) objE;
        wef wefVar = wef.a;
        if (yc4Var == null) {
            return wefVar;
        }
        r0 r0Var = this.this$0;
        int i2 = r0.j2;
        r0Var.L1.setValue(Boolean.TRUE);
        r0.c0(this.this$0, zf4.a(yc4.a(yc4Var, null, false, null, null, 0, null, new InterruptedDrawing(this.$saves.getChoices(), this.$saves.getPatterns(), this.$saves.getDrawnIndexes()), null, null, null, null, null, null, 4193279)), null, null, null, 14);
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ff4) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
