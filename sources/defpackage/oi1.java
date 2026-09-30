package defpackage;

import ai.askquin.R;
import android.graphics.Bitmap;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oi1 extends gbe implements l26 {
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ pi1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi1(pi1 pi1Var, Uri uri, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = pi1Var;
        this.$uri = uri;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new oi1(this.this$0, this.$uri, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object value;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                js3 js3Var = ga4.a;
                hr3 hr3Var = hr3.c;
                ni1 ni1Var = new ni1(this.$uri, null);
                this.label = 1;
                obj = ynb.p0(hr3Var, ni1Var, this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                s0e s0eVar = this.this$0.f;
                do {
                    value = s0eVar.getValue();
                    ((aee) value).getClass();
                } while (!s0eVar.l(value, new aee(bitmap)));
            } else {
                jcc.k(0, new Integer(R.string.photo_decode_error));
            }
        } catch (Exception e) {
            this.this$0.d().b("Failed to load gallery image: " + e.getMessage());
            jcc.k(0, new Integer(R.string.photo_decode_error));
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((oi1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
