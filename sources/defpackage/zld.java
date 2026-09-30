package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zld extends gbe implements l26 {
    final /* synthetic */ kmd $fileResolver;
    final /* synthetic */ e89 $showDownloadDialog$delegate;
    final /* synthetic */ TarotSkinIdentify $skin;
    final /* synthetic */ e89 $skinCheckDone$delegate;
    final /* synthetic */ e89 $skinToDownload$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zld(TarotSkinIdentify tarotSkinIdentify, kmd kmdVar, e89 e89Var, e89 e89Var2, e89 e89Var3, xn2 xn2Var) {
        super(2, xn2Var);
        this.$skin = tarotSkinIdentify;
        this.$fileResolver = kmdVar;
        this.$skinToDownload$delegate = e89Var;
        this.$showDownloadDialog$delegate = e89Var2;
        this.$skinCheckDone$delegate = e89Var3;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new zld(this.$skin, this.$fileResolver, this.$skinToDownload$delegate, this.$showDownloadDialog$delegate, this.$skinCheckDone$delegate, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        boolean z;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            if (this.$skin.getRequiresDownload()) {
                yld yldVar = new yld(this.$fileResolver, this.$skin, null);
                this.label = 1;
                obj = lw2.b(yldVar, this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            }
            this.$skinToDownload$delegate.setValue(z ? this.$skin : null);
            if (z) {
                this.$showDownloadDialog$delegate.setValue(Boolean.TRUE);
            } else if (!((Boolean) this.$skinCheckDone$delegate.getValue()).booleanValue()) {
                this.$skinCheckDone$delegate.setValue(Boolean.TRUE);
            }
            return wef.a;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        z = ((Boolean) obj).booleanValue();
        this.$skinToDownload$delegate.setValue(z ? this.$skin : null);
        if (z) {
            this.$showDownloadDialog$delegate.setValue(Boolean.TRUE);
        } else if (!((Boolean) this.$skinCheckDone$delegate.getValue()).booleanValue()) {
            this.$skinCheckDone$delegate.setValue(Boolean.TRUE);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((zld) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
