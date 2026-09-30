package defpackage;

import android.content.Context;
import io.sentry.config.a;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l8d extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ mmb $sharedFile;
    final /* synthetic */ File $this_saveToShareFile;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8d(File file, Context context, mmb mmbVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_saveToShareFile = file;
        this.$context = context;
        this.$sharedFile = mmbVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new l8d(this.$this_saveToShareFile, this.$context, this.$sharedFile, xn2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Closeable] */
    @Override // defpackage.pt0
    public final Object r(Object obj) throws IOException {
        File file;
        ?? r0 = this.label;
        try {
            if (r0 == 0) {
                jzb.q(obj);
                q8d q8dVarY = pa7.Y(this.$this_saveToShareFile);
                File file2 = new File(this.$context.getCacheDir(), "shared");
                if (!file2.mkdirs() && !file2.isDirectory()) {
                    qc0.p("Check failed.");
                    return null;
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - 86400000;
                File canonicalFile = this.$this_saveToShareFile.getCanonicalFile();
                File[] fileArrListFiles = file2.listFiles();
                if (fileArrListFiles != null) {
                    ArrayList arrayList = new ArrayList();
                    for (File file3 : fileArrListFiles) {
                        if (file3.isFile() && file3.lastModified() < jCurrentTimeMillis && !pa7.t(file3.getCanonicalFile(), canonicalFile)) {
                            arrayList.add(file3);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((File) it.next()).delete();
                    }
                }
                File fileCreateTempFile = File.createTempFile("shared_", "." + q8dVarY.a(), file2);
                this.$sharedFile.element = fileCreateTempFile;
                fileCreateTempFile.getClass();
                FileOutputStream fileOutputStreamE = a.e(new FileOutputStream(fileCreateTempFile), fileCreateTempFile);
                File file4 = this.$this_saveToShareFile;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = fileCreateTempFile;
                this.L$4 = fileOutputStreamE;
                this.L$5 = null;
                this.J$0 = jCurrentTimeMillis;
                this.label = 1;
                pa7.N(file4, fileOutputStreamE, this);
                wef wefVar = wef.a;
                bw2 bw2Var = bw2.a;
                if (wefVar == bw2Var) {
                    return bw2Var;
                }
                file = fileCreateTempFile;
                r0 = fileOutputStreamE;
            } else {
                if (r0 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Closeable closeable = (Closeable) this.L$4;
                file = (File) this.L$3;
                jzb.q(obj);
                r0 = closeable;
            }
            ym8.t(r0, null);
            return file;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ym8.t(r0, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((l8d) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
