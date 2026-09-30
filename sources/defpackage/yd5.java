package defpackage;

import com.google.firebase.crashlytics.internal.persistence.FileStore;
import io.sentry.android.replay.k;
import io.sentry.z;
import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yd5 implements FilenameFilter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yd5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return FileStore.lambda$cleanupFileSystemDirs$0((String) obj, file, str);
            case 1:
                return ((z) obj).a(str);
            default:
                k kVar = (k) obj;
                str.getClass();
                if (c5e.u(str, ".jpg", false)) {
                    File file2 = new File(file, str);
                    String name = file2.getName();
                    name.getClass();
                    int iT = v4e.T(name, ".", 0, 6);
                    if (iT != -1) {
                        name = name.substring(0, iT);
                    }
                    Long lE = c5e.E(name);
                    if (lE != null) {
                        kVar.b(file2, null, lE.longValue());
                    }
                }
                return false;
        }
    }
}
