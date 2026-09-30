package defpackage;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o8d extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ imb $launched;
    final /* synthetic */ String $operationId;
    final /* synthetic */ Uri $uri;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8d(Context context, Uri uri, String str, imb imbVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$context = context;
        this.$uri = uri;
        this.$operationId = str;
        this.$launched = imbVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new o8d(this.$context, this.$uri, this.$operationId, this.$launched, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        Context context = this.$context;
        Uri uri = this.$uri;
        uri.getClass();
        boolean zS = m7c.s(context, uri, this.$operationId);
        Boolean boolValueOf = Boolean.valueOf(zS);
        this.$launched.element = zS;
        return boolValueOf;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((o8d) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
