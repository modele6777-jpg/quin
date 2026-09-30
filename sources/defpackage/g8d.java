package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g8d {
    public final File a;
    public final int b;
    public final int c;
    public int d = 1;

    public g8d(File file, int i, int i2) {
        this.a = file;
        this.b = i;
        this.c = i2;
    }

    public final void a() {
        int i = this.d;
        if (i <= 0) {
            qc0.p("Check failed.");
            return;
        }
        int i2 = i - 1;
        this.d = i2;
        if (i2 == 0) {
            this.a.delete();
        }
    }

    public final void b() {
        int i = this.d;
        if (i > 0) {
            this.d = i + 1;
        } else {
            qc0.p("Check failed.");
        }
    }
}
