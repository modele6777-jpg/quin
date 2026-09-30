package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class va5 extends ks5 {
    public final a26 b;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va5(wkd wkdVar, a26 a26Var) {
        super(wkdVar);
        wkdVar.getClass();
        this.b = a26Var;
    }

    @Override // defpackage.ks5, defpackage.wkd
    public final void M0(f41 f41Var, long j) {
        if (this.c) {
            f41Var.c1(j);
            return;
        }
        try {
            this.a.M0(f41Var, j);
        } catch (IOException e) {
            this.c = true;
            this.b.d(e);
        }
    }

    @Override // defpackage.ks5, defpackage.wkd, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.c = true;
            this.b.d(e);
        }
    }

    @Override // defpackage.ks5, defpackage.wkd, java.io.Flushable
    public final void flush() {
        if (this.c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.c = true;
            this.b.d(e);
        }
    }
}
