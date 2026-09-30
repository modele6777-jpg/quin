package defpackage;

import com.adjust.sdk.sig.r3;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tdh extends keh {
    public static final /* synthetic */ int b = 0;
    public final ArrayList a;

    public tdh(InputStream inputStream, ArrayList arrayList) {
        super(inputStream);
        this.a = arrayList;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                r3.f();
                return;
            }
            try {
                throw null;
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            Iterator it = this.a.iterator();
            if (it.hasNext()) {
                throw kv2.g(it);
            }
        }
        return i;
    }

    @Override // defpackage.keh, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i = ((FilterInputStream) this).in.read(bArr);
        if (i != -1) {
            Iterator it = this.a.iterator();
            if (it.hasNext()) {
                throw kv2.g(it);
            }
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (i3 != -1) {
            Iterator it = this.a.iterator();
            if (it.hasNext()) {
                throw kv2.g(it);
            }
        }
        return i3;
    }
}
