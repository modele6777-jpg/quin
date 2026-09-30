package defpackage;

import android.net.Uri;
import android.view.InputEvent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class go8 extends gbe implements l26 {
    final /* synthetic */ Uri $attributionSource;
    final /* synthetic */ InputEvent $inputEvent;
    int label;
    final /* synthetic */ io8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public go8(io8 io8Var, Uri uri, InputEvent inputEvent, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = io8Var;
        this.$attributionSource = uri;
        this.$inputEvent = inputEvent;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new go8(this.this$0, this.$attributionSource, this.$inputEvent, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            y7h y7hVar = this.this$0.a;
            Uri uri = this.$attributionSource;
            InputEvent inputEvent = this.$inputEvent;
            this.label = 1;
            Object objK = y7hVar.K(uri, inputEvent, this);
            bw2 bw2Var = bw2.a;
            if (objK == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((go8) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
