package io.sentry.instrumentation.file;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements a {
    public final /* synthetic */ int a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Closeable e;

    public /* synthetic */ c(Closeable closeable, byte[] bArr, int i, int i2, int i3) {
        this.a = i3;
        this.e = closeable;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }

    @Override // io.sentry.instrumentation.file.a
    public final Object call() throws IOException {
        int i = this.a;
        int i2 = this.d;
        int i3 = this.c;
        byte[] bArr = this.b;
        Closeable closeable = this.e;
        switch (i) {
            case 0:
                return Integer.valueOf(((d) closeable).a.read(bArr, i3, i2));
            default:
                ((e) closeable).a.write(bArr, i3, i2);
                return Integer.valueOf(i2);
        }
    }
}
