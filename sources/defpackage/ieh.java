package defpackage;

import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ieh extends keh implements eeh {
    public final FileInputStream a;
    public final File b;

    public ieh(File file, FileInputStream fileInputStream) {
        super(fileInputStream);
        this.a = fileInputStream;
        this.b = file;
    }

    @Override // defpackage.eeh
    public final File b() {
        return this.b;
    }
}
