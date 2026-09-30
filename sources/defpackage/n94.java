package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class n94 extends ls5 {
    public boolean b;
    public final /* synthetic */ w94 c;
    public final /* synthetic */ o94 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n94(mtd mtdVar, w94 w94Var, o94 o94Var) {
        super(mtdVar);
        this.c = w94Var;
        this.d = o94Var;
    }

    @Override // defpackage.ls5, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        if (this.b) {
            return;
        }
        this.b = true;
        w94 w94Var = this.c;
        o94 o94Var = this.d;
        synchronized (w94Var) {
            int i = o94Var.h - 1;
            o94Var.h = i;
            if (i == 0 && o94Var.f) {
                w94Var.W(o94Var);
            }
        }
    }
}
