package defpackage;

import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import ai.askquin.ui.draw.model.DrawCardSaves;
import ai.askquin.ui.persistence.database.InterruptedDrawing;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vo4 implements xj5, v26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;

    public /* synthetic */ vo4(r0 r0Var, int i) {
        this.a = i;
        this.b = r0Var;
    }

    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        int i = this.a;
        wef wefVar = wef.a;
        r0 r0Var = this.b;
        switch (i) {
            case 0:
                DrawCardSaves drawCardSaves = (DrawCardSaves) obj;
                r0Var.getClass();
                MixedDeckSnapshot mixedDeck = drawCardSaves.getMixedDeck();
                if (mixedDeck == null || !(r0Var.a0() instanceof zc4) || r0Var.L0) {
                    return wefVar;
                }
                r0Var.D1(mixedDeck);
                r0Var.I1 = new InterruptedDrawing(drawCardSaves.getChoices(), drawCardSaves.getPatterns(), drawCardSaves.getDrawnIndexes());
                return ((gq3) r0Var.f).h(r0Var.w(), xn2Var);
            default:
                DrawCardSaves drawCardSaves2 = (DrawCardSaves) obj;
                if (!r0Var.m0()) {
                    return wefVar;
                }
                r0Var.I1 = new InterruptedDrawing(drawCardSaves2.getChoices(), drawCardSaves2.getPatterns(), drawCardSaves2.getDrawnIndexes());
                r0Var.q1();
                hs3 hs3Var = xqa.e;
                xh7 xh7Var = fzc.a;
                xh7Var.getClass();
                return bsa.n(hs3Var.a, xh7Var.d(DrawCardSaves.Companion.serializer(), drawCardSaves2), xn2Var);
        }
    }

    @Override // defpackage.v26
    public final m26 b() {
        switch (this.a) {
            case 0:
                return new h36(2, 0, r0.class, this.b, "saveMixedDrawingCheckpoint", "saveMixedDrawingCheckpoint$Quin_conversation_gpRelease(Lai/askquin/ui/draw/model/DrawCardSaves;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
            default:
                return new h36(2, 0, r0.class, this.b, "saveOnboardingDrawingCheckpoint", "saveOnboardingDrawingCheckpoint$Quin_conversation_gpRelease(Lai/askquin/ui/draw/model/DrawCardSaves;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof xj5) && (obj instanceof v26)) {
                    return b().equals(((v26) obj).b());
                }
                return false;
            default:
                if ((obj instanceof xj5) && (obj instanceof v26)) {
                    return b().equals(((v26) obj).b());
                }
                return false;
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                break;
        }
        return b().hashCode();
    }
}
