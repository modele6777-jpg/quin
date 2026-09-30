package defpackage;

import ai.askquin.ui.share.ShareActivity;
import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z5d extends gbe implements l26 {
    final /* synthetic */ oed $defaultShareType;
    final /* synthetic */ iad $payload;
    final /* synthetic */ String $shareScene;
    final /* synthetic */ xad $shareSource;
    Object L$0;
    int label;
    final /* synthetic */ ShareActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5d(ShareActivity shareActivity, iad iadVar, oed oedVar, xad xadVar, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = shareActivity;
        this.$payload = iadVar;
        this.$defaultShareType = oedVar;
        this.$shareSource = xadVar;
        this.$shareScene = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new z5d(this.this$0, this.$payload, this.$defaultShareType, this.$shareSource, this.$shareScene, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        ShareActivity shareActivity;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            shareActivity = this.this$0;
            String str = shareActivity.R0;
            this.L$0 = shareActivity;
            this.label = 1;
            js3 js3Var = ga4.a;
            obj = ynb.p0(hr3.c, new tad(str, null), this);
            bw2 bw2Var = bw2.a;
            if (obj == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            shareActivity = (ShareActivity) this.L$0;
            jzb.q(obj);
        }
        shareActivity.S0 = (Bitmap) obj;
        ShareActivity shareActivity2 = this.this$0;
        Bitmap bitmap = shareActivity2.S0;
        wef wefVar = wef.a;
        if (bitmap == null) {
            shareActivity2.finish();
            return wefVar;
        }
        shareActivity2.w(this.$payload, this.$shareSource, this.$shareScene);
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((z5d) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
