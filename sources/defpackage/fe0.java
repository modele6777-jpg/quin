package defpackage;

import io.sentry.config.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fe0 extends gbe implements l26 {
    final /* synthetic */ String $assetId;
    final /* synthetic */ File $cacheFile;
    final /* synthetic */ String $chatId;
    int label;
    final /* synthetic */ je0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe0(je0 je0Var, xn2 xn2Var, File file, String str, String str2) {
        super(2, xn2Var);
        this.this$0 = je0Var;
        this.$chatId = str;
        this.$assetId = str2;
        this.$cacheFile = file;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new fe0(this.this$0, xn2Var, this.$cacheFile, this.$chatId, this.$assetId);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws IOException {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            yt6 yt6Var = this.this$0.b;
            String str = this.$chatId;
            String str2 = this.$assetId;
            this.label = 1;
            obj = ((uke) yt6Var).b(str, str2, this);
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
        InputStream inputStream = (InputStream) obj;
        File file = this.$cacheFile;
        FileOutputStream fileOutputStreamE = a.e(new FileOutputStream(file), file);
        try {
            Long l = new Long(lmg.Y(inputStream, fileOutputStreamE));
            fileOutputStreamE.close();
            return l;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ym8.t(fileOutputStreamE, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((fe0) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
