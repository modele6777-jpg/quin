package defpackage;

import ai.askquin.ui.share.SharedDivination;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d7d extends gbe implements l26 {
    final /* synthetic */ x6d $configuration;
    final /* synthetic */ SharedDivination $divination;
    final /* synthetic */ String $language;
    final /* synthetic */ ihb $readingShareViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7d(ihb ihbVar, SharedDivination sharedDivination, x6d x6dVar, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.$readingShareViewModel = ihbVar;
        this.$divination = sharedDivination;
        this.$configuration = x6dVar;
        this.$language = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new d7d(this.$readingShareViewModel, this.$divination, this.$configuration, this.$language, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        ihb ihbVar = this.$readingShareViewModel;
        String divinationId = this.$divination.getDivinationId();
        x6d x6dVar = this.$configuration;
        String str = this.$language;
        str.getClass();
        ihbVar.f(divinationId, x6dVar, str);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        d7d d7dVar = (d7d) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        d7dVar.r(wefVar);
        return wefVar;
    }
}
