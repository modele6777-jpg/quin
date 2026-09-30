package defpackage;

import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import ai.askquin.ui.draw.model.DrawCardSaves;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mcf extends gbe implements a26 {
    final /* synthetic */ r0 $divinationViewModel;
    final /* synthetic */ rcf $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcf(xn2 xn2Var, rcf rcfVar, r0 r0Var) {
        super(1, xn2Var);
        this.$divinationViewModel = r0Var;
        this.$viewModel = rcfVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        mcf mcfVar = new mcf((xn2) obj, this.$viewModel, this.$divinationViewModel);
        wef wefVar = wef.a;
        mcfVar.r(wefVar);
        return wefVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        r0 r0Var = this.$divinationViewModel;
        if (r0Var != null) {
            DrawCardSaves drawCardSavesO = this.$viewModel.o();
            xd4 xd4VarI = r0Var.I();
            ud4 ud4Var = xd4VarI instanceof ud4 ? (ud4) xd4VarI : null;
            if (ud4Var != null) {
                zc4 zc4Var = ud4Var.a;
                if (!r0Var.L0) {
                    String chatId = drawCardSavesO.getChatId();
                    fc4 fc4Var = r0Var.H0;
                    if (fc4Var == null) {
                        pa7.g0("divinationKey");
                        throw null;
                    }
                    if (pa7.t(chatId, fc4Var.a) && r0Var.H() == null && !drawCardSavesO.getChoices().isEmpty() && drawCardSavesO.getChoices().size() == zc4Var.c.size()) {
                        MixedDeckSnapshot mixedDeck = drawCardSavesO.getMixedDeck();
                        if (mixedDeck == null) {
                            mixedDeck = r0Var.R();
                        }
                        r0Var.D1(mixedDeck);
                        r0Var.r1(drawCardSavesO.getPatterns(), drawCardSavesO.getChoices(), drawCardSavesO.getDrawnIndexes());
                        r0Var.R1(zc4Var, drawCardSavesO.getChoices());
                    }
                }
            }
        }
        return wef.a;
    }
}
