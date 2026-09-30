package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import io.sentry.config.a;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uad extends gbe implements l26 {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ Context $context;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uad(Context context, Bitmap bitmap, xn2 xn2Var) {
        super(2, xn2Var);
        this.$context = context;
        this.$bitmap = bitmap;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        uad uadVar = new uad(this.$context, this.$bitmap, xn2Var);
        uadVar.L$0 = obj;
        return uadVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009e  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        File file;
        Object dzbVar;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        Context context = this.$context;
        Bitmap bitmap = this.$bitmap;
        try {
            File file2 = new File(context.getCacheDir(), "share_screenshots");
            file2.mkdirs();
            long jCurrentTimeMillis = System.currentTimeMillis() - 86400000;
            File[] fileArrListFiles = file2.listFiles();
            if (fileArrListFiles != null) {
                for (File file3 : fileArrListFiles) {
                    if (file3.lastModified() < jCurrentTimeMillis) {
                        file3.delete();
                    }
                }
            }
            file = new File(file2, UUID.randomUUID() + ".jpg");
            try {
                FileOutputStream fileOutputStreamE = a.e(new FileOutputStream(file), file);
                try {
                    boolean zCompress = bitmap.compress(Bitmap.CompressFormat.JPEG, 92, fileOutputStreamE);
                    fileOutputStreamE.close();
                    if (!zCompress) {
                        throw new IllegalStateException("Check failed.");
                    }
                    dzbVar = file.getAbsolutePath();
                    if (ezb.a(dzbVar) != null && file != null) {
                        file.delete();
                    }
                    if (dzbVar instanceof dzb) {
                        return null;
                    }
                    return dzbVar;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ym8.t(fileOutputStreamE, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                dzbVar = new dzb(th);
                if (ezb.a(dzbVar) != null) {
                    file.delete();
                }
                if (dzbVar instanceof dzb) {
                    return null;
                }
                return dzbVar;
            }
        } catch (Throwable th4) {
            th = th4;
            file = null;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((uad) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
