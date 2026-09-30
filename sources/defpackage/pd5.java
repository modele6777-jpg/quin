package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class pd5 implements z52 {
    public final File a;
    public final czc b;
    public final AtomicBoolean c;

    public pd5(File file, czc czcVar) {
        czcVar.getClass();
        this.a = file;
        this.b = czcVar;
        this.c = new AtomicBoolean(false);
    }

    @Override // defpackage.z52
    public final void close() {
        this.c.set(true);
    }
}
