package defpackage;

import ai.askquin.qa.bridge.QaResult;
import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hb3 implements d3b {
    public final Context a;

    public hb3(Context context) {
        this.a = context;
    }

    @Override // defpackage.d3b
    public final dm1 a() {
        return dm1.a;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        Context context = this.a;
        File dataDir = context.getDataDir();
        File externalFilesDir = context.getExternalFilesDir("qa-dump");
        if (externalFilesDir == null) {
            return new QaResult.Err("no external files dir available", "no_external_dir");
        }
        File file = new File(externalFilesDir, ks0.i(System.currentTimeMillis(), "dump-"));
        dataDir.getClass();
        List listI = t72.I("databases", "files/datastore", "shared_prefs");
        ArrayList arrayList = new ArrayList();
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            File file2 = new File(dataDir, (String) it.next());
            if (file2.isDirectory()) {
                ue5 ue5Var = new ue5(new ve5(new ie5(file2), true, new i73(6)));
                while (ue5Var.hasNext()) {
                    File file3 = (File) ue5Var.next();
                    String path = ne5.c0(file3, dataDir).getPath();
                    File file4 = new File(file, path);
                    File parentFile = file4.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    ne5.Z(file3, file4);
                    path.getClass();
                    arrayList.add(path);
                }
            }
        }
        iy9 iy9Var = new iy9("dump_dir", oh7.c(file.getAbsolutePath()));
        ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(oh7.c((String) it2.next()));
        }
        return new QaResult.Ok(new ti7(bm8.H(iy9Var, new iy9("files", new yg7(arrayList2)))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "data.dump-all";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "把本地 DB + DataStore + prefs 拷到外部目录，返回路径";
    }
}
