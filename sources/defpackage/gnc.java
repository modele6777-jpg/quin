package defpackage;

import java.util.List;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gnc extends gbe implements l26 {
    final /* synthetic */ List<TarotCardChoice> $cameraResult;
    final /* synthetic */ x16 $onCameraResultConsumed;
    final /* synthetic */ jnc $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnc(List list, jnc jncVar, x16 x16Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$cameraResult = list;
        this.$viewModel = jncVar;
        this.$onCameraResultConsumed = x16Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new gnc(this.$cameraResult, this.$viewModel, this.$onCameraResultConsumed, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        List<TarotCardChoice> list = this.$cameraResult;
        if (list != null) {
            this.$viewModel.h(list);
            this.$onCameraResultConsumed.invoke();
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        gnc gncVar = (gnc) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        gncVar.r(wefVar);
        return wefVar;
    }
}
