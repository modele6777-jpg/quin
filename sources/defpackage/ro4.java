package defpackage;

import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.model.DrawCardSaves;
import tech.chatmind.api.AdditionalInfoAudio;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ro4 extends gbe implements l26 {
    final /* synthetic */ fo4 $connector;
    final /* synthetic */ r0 $divinationViewModel;
    final /* synthetic */ j4a $paywallChecker;
    final /* synthetic */ DrawCardSaves $saves;
    final /* synthetic */ soa $vm;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro4(r0 r0Var, j4a j4aVar, soa soaVar, fo4 fo4Var, DrawCardSaves drawCardSaves, xn2 xn2Var) {
        super(2, xn2Var);
        this.$divinationViewModel = r0Var;
        this.$paywallChecker = j4aVar;
        this.$vm = soaVar;
        this.$connector = fo4Var;
        this.$saves = drawCardSaves;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ro4(this.$divinationViewModel, this.$paywallChecker, this.$vm, this.$connector, this.$saves, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            this.$divinationViewModel.getClass();
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            if (!((Boolean) obj).booleanValue()) {
                String string = this.$vm.f.d().c.toString();
                String str = !v4e.Q(string) ? string : null;
                AdditionalInfoAudio additionalInfoAudio = (AdditionalInfoAudio) this.$vm.X.getValue();
                fo4 fo4Var = this.$connector;
                DrawCardSaves drawCardSaves = this.$saves;
                dr2 dr2Var = (dr2) fo4Var;
                dr2Var.getClass();
                drawCardSaves.getClass();
                ynb.V(hwf.a(dr2Var.a.c), null, null, new cr2(dr2Var, drawCardSaves, str, additionalInfoAudio, null), 3);
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ro4 ro4Var = (ro4) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        ro4Var.r(wefVar);
        return wefVar;
    }
}
