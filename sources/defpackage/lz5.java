package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lz5 implements h9e {
    public final Context a;
    public final String b;
    public final sug c;
    public final boolean d;
    public final boolean e;
    public final ace f;
    public boolean g;

    public lz5(Context context, String str, sug sugVar, boolean z, boolean z2) {
        sugVar.getClass();
        this.a = context;
        this.b = str;
        this.c = sugVar;
        this.d = z;
        this.e = z2;
        this.f = new ace(new uo2(22, this));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ace aceVar = this.f;
        if (aceVar.b()) {
            ((kz5) aceVar.getValue()).close();
        }
    }

    @Override // defpackage.h9e
    public final f9e d0() {
        return ((kz5) this.f.getValue()).b(false);
    }

    @Override // defpackage.h9e
    public final String getDatabaseName() {
        return this.b;
    }

    @Override // defpackage.h9e
    public final f9e j0() {
        return ((kz5) this.f.getValue()).b(true);
    }

    @Override // defpackage.h9e
    public final void setWriteAheadLoggingEnabled(boolean z) {
        ace aceVar = this.f;
        if (aceVar.b()) {
            ((kz5) aceVar.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.g = z;
    }
}
