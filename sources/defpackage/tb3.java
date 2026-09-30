package defpackage;

import java.io.File;
import java.io.FileFilter;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tb3 implements FileFilter {
    public final /* synthetic */ int a;

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        switch (this.a) {
            case 0:
                if (file.isDirectory()) {
                    String name = file.getName();
                    name.getClass();
                    if (c5e.C(name, "dump-", false)) {
                        return true;
                    }
                }
                return false;
            case 1:
                file.getClass();
                return ne5.a0(file).equals("log") || pa7.t(file.getName(), "logcat.txt");
            default:
                file.getClass();
                return ne5.a0(file).equals("log");
        }
    }
}
