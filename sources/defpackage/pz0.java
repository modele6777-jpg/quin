package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import io.sentry.config.a;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pz0 extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $prefix;
    final /* synthetic */ Bitmap $this_saveToShareFile;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz0(xn2 xn2Var, Context context, Bitmap bitmap, String str) {
        super(2, xn2Var);
        this.$context = context;
        this.$prefix = str;
        this.$this_saveToShareFile = bitmap;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        pz0 pz0Var = new pz0(xn2Var, this.$context, this.$this_saveToShareFile, this.$prefix);
        pz0Var.L$0 = obj;
        return pz0Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object dzbVar;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        File file = new File(this.$context.getCacheDir(), "shared");
        if (!file.exists()) {
            file.mkdirs();
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - 86400000;
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            ArrayList arrayList = new ArrayList();
            for (File file2 : fileArrListFiles) {
                if (file2.lastModified() < jCurrentTimeMillis) {
                    arrayList.add(file2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((File) it.next()).delete();
            }
        }
        File file3 = new File(file, this.$prefix + "_" + System.currentTimeMillis() + ".jpg");
        Bitmap bitmap = this.$this_saveToShareFile;
        try {
            FileOutputStream fileOutputStreamE = a.e(new FileOutputStream(file3), file3);
            try {
                boolean zCompress = bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStreamE);
                fileOutputStreamE.close();
                if (!zCompress) {
                    throw new IllegalStateException("Check failed.");
                }
                dzbVar = file3;
                if (ezb.a(dzbVar) == null) {
                    return dzbVar;
                }
                file3.delete();
                return null;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ym8.t(fileOutputStreamE, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            dzbVar = new dzb(th3);
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((pz0) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
