package defpackage;

import android.content.ClipData;
import android.graphics.Point;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.ScrollCaptureTarget;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Arrays;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qm2 implements rm2, tm2 {
    public final /* synthetic */ int a;
    public Object b;

    public qm2(int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = q1c.f(Boolean.FALSE);
                break;
            default:
                this.b = LogSessionId.LOG_SESSION_ID_NONE;
                break;
        }
    }

    @Override // defpackage.rm2
    public void a(Uri uri) {
        ((ContentInfo.Builder) this.b).setLinkUri(uri);
    }

    @Override // defpackage.tm2
    public int b() {
        return ((ContentInfo) this.b).getFlags();
    }

    @Override // defpackage.rm2
    public um2 build() {
        return new um2(new qm2(((ContentInfo.Builder) this.b).build()));
    }

    @Override // defpackage.tm2
    public ClipData c() {
        return ((ContentInfo) this.b).getClip();
    }

    @Override // defpackage.rm2
    public void d(int i) {
        ((ContentInfo.Builder) this.b).setFlags(i);
    }

    @Override // defpackage.tm2
    public int e() {
        return ((ContentInfo) this.b).getSource();
    }

    @Override // defpackage.tm2
    public ContentInfo f() {
        return (ContentInfo) this.b;
    }

    public void g(AndroidComposeView androidComposeView, bxc bxcVar, pv2 pv2Var, Consumer consumer) {
        p89 p89Var = new p89(0, new sgc[16]);
        tgc.m(bxcVar.a(), 0, new d60(1, p89Var, p89.class, "add", "add(Ljava/lang/Object;)Z", 8, 3));
        Arrays.sort(p89Var.a, 0, p89Var.c, new va2(0, new a26[]{new pdc(13), new pdc(14)}));
        int i = p89Var.c;
        sgc sgcVar = (sgc) (i == 0 ? null : p89Var.a[i - 1]);
        if (sgcVar == null) {
            return;
        }
        a77 a77Var = sgcVar.c;
        gf2 gf2Var = new gf2(sgcVar.a, a77Var, jgb.k(pv2Var), this, androidComposeView);
        yf9 yf9Var = sgcVar.d;
        hkb hkbVarM = vd0.S(yf9Var).M(yf9Var, true);
        long jC = a77Var.c();
        ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(androidComposeView, ynb.j0(n16.U(hkbVarM)), new Point((int) (jC >> 32), (int) (jC & 4294967295L)), gf2Var);
        scrollCaptureTarget.setScrollBounds(ynb.j0(a77Var));
        consumer.accept(scrollCaptureTarget);
    }

    public void h(LogSessionId logSessionId) {
        pa7.J(((LogSessionId) this.b).equals(LogSessionId.LOG_SESSION_ID_NONE));
        this.b = logSessionId;
    }

    @Override // defpackage.rm2
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.b).setExtras(bundle);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "ContentInfoCompat{" + ((ContentInfo) this.b) + "}";
            default:
                return super.toString();
        }
    }

    public qm2(ContentInfo contentInfo) {
        this.a = 1;
        contentInfo.getClass();
        this.b = contentInfo;
    }

    public qm2(ClipData clipData, int i) {
        this.a = 0;
        this.b = wq.d(clipData, i);
    }
}
