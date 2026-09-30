package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a81 implements Closeable, Flushable {
    public final w94 a;

    public a81(File file) {
        tl7 tl7Var = zd5.a;
        String str = e1a.b;
        e1a e1aVarT = y25.t(file);
        tl7Var.getClass();
        kle kleVar = kle.l;
        kleVar.getClass();
        this.a = new w94(tl7Var, e1aVarT, kleVar);
    }

    public final void b(btb btbVar) {
        btbVar.getClass();
        w94 w94Var = this.a;
        String strG = urg.G(btbVar.a);
        synchronized (w94Var) {
            strG.getClass();
            w94Var.x();
            w94Var.b();
            w94.h0(strG);
            o94 o94Var = (o94) w94Var.w.get(strG);
            if (o94Var == null) {
                return;
            }
            w94Var.W(o94Var);
            if (w94Var.g <= w94Var.c) {
                w94Var.Z = false;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.a.flush();
    }
}
