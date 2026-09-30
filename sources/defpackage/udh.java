package defpackage;

import com.adjust.sdk.sig.r3;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class udh extends leh {
    public static final /* synthetic */ int b = 0;
    public final ArrayList a;

    public udh(OutputStream outputStream, ArrayList arrayList) {
        super(outputStream);
        this.a = arrayList;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
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

    @Override // defpackage.leh, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        ((FilterOutputStream) this).out.write(bArr);
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                r3.f();
            } else {
                int length = bArr.length;
                throw null;
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            throw kv2.g(it);
        }
    }

    @Override // defpackage.leh, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            throw kv2.g(it);
        }
    }
}
