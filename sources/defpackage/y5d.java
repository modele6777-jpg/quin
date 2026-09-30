package defpackage;

import ai.askquin.R;
import ai.askquin.ui.share.ShareActivity;
import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y5d extends gbe implements l26 {
    final /* synthetic */ vb2 $activity;
    final /* synthetic */ oed $defaultShareType;
    final /* synthetic */ iad $payload;
    final /* synthetic */ String $scene;
    final /* synthetic */ Bitmap $screenshotBitmap;
    final /* synthetic */ xad $source;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5d(vb2 vb2Var, Bitmap bitmap, iad iadVar, oed oedVar, xad xadVar, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.$activity = vb2Var;
        this.$screenshotBitmap = bitmap;
        this.$payload = iadVar;
        this.$defaultShareType = oedVar;
        this.$source = xadVar;
        this.$scene = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        y5d y5dVar = new y5d(this.$activity, this.$screenshotBitmap, this.$payload, this.$defaultShareType, this.$source, this.$scene, xn2Var);
        y5dVar.L$0 = obj;
        return y5dVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        File file;
        Object dzbVar;
        aw2 aw2Var = (aw2) this.L$0;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                Context applicationContext = this.$activity.getApplicationContext();
                applicationContext.getClass();
                Bitmap bitmap = this.$screenshotBitmap;
                this.L$0 = aw2Var;
                this.label = 1;
                js3 js3Var = ga4.a;
                obj = ynb.p0(hr3.c, new uad(applicationContext, bitmap, null), this);
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
            String str = (String) obj;
            jzb.m(this.$screenshotBitmap);
            wef wefVar = wef.a;
            if (str == null) {
                kv2.u(R.string.image_save_failed, 0);
                return wefVar;
            }
            if (this.$activity.isFinishing() || this.$activity.a.i.compareTo(g48.e) < 0) {
                File file2 = new File(str);
                file = file2.isFile() ? file2 : null;
                if (file != null) {
                    file.delete();
                }
            } else {
                vb2 vb2Var = this.$activity;
                iad iadVar = this.$payload;
                oed oedVar = this.$defaultShareType;
                xad xadVar = this.$source;
                String str2 = this.$scene;
                try {
                    int i2 = ShareActivity.T0;
                    jy4.s(vb2Var, iadVar, oedVar, xadVar, str2, str);
                    dzbVar = wefVar;
                } catch (Throwable th) {
                    dzbVar = new dzb(th);
                }
                Throwable thA = ezb.a(dzbVar);
                if (thA != null) {
                    File file3 = new File(str);
                    file = file3.isFile() ? file3 : null;
                    if (file != null) {
                        file.delete();
                    }
                    hf8.Q.getClass();
                    ef8.a("ShareActivity").c("Failed to launch screenshot sharing", thA);
                }
            }
            return wefVar;
        } catch (Throwable th2) {
            jzb.m(this.$screenshotBitmap);
            throw th2;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((y5d) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
