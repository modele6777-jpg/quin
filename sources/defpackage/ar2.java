package defpackage;

import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import ai.askquin.ui.draw.model.DrawCardSaves;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ar2 extends gbe implements l26 {
    final /* synthetic */ DrawCardSaves $saves;
    int label;
    final /* synthetic */ dr2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar2(dr2 dr2Var, DrawCardSaves drawCardSaves, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = dr2Var;
        this.$saves = drawCardSaves;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ar2(this.this$0, this.$saves, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        if (i == 0) {
            jzb.q(obj);
            boolean zQ0 = this.this$0.a.c.q0();
            dr2 dr2Var = this.this$0;
            if (zQ0) {
                r0 r0Var = dr2Var.a.c;
                DrawCardSaves drawCardSaves = this.$saves;
                this.label = 1;
                obj = r0Var.s1(drawCardSaves, this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            } else if (!dr2Var.a.c.g0()) {
                r0 r0Var2 = this.this$0.a.c;
                DrawCardSaves drawCardSaves2 = this.$saves;
                r0Var2.getClass();
                drawCardSaves2.getClass();
                MixedDeckSnapshot mixedDeck = drawCardSaves2.getMixedDeck();
                if (mixedDeck == null) {
                    mixedDeck = r0Var2.R();
                }
                r0Var2.D1(mixedDeck);
                r0Var2.d().e("Drawing interrupted, saving drawing state: " + drawCardSaves2);
                r0Var2.r1(drawCardSaves2.getPatterns(), drawCardSaves2.getChoices(), drawCardSaves2.getDrawnIndexes());
            }
            this.this$0.a.c.z1(null);
            this.this$0.c.d(Boolean.TRUE);
            return wefVar;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (!((Boolean) obj).booleanValue()) {
            return wefVar;
        }
        this.this$0.a.c.z1(null);
        this.this$0.c.d(Boolean.TRUE);
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ar2) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
