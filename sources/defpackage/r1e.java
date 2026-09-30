package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r1e implements ac3 {
    public final ac3 a;
    public long b;
    public Uri c;
    public Map d;

    public r1e(ac3 ac3Var) {
        ac3Var.getClass();
        this.a = ac3Var;
        this.c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override // defpackage.ac3
    public final long b(dc3 dc3Var) {
        ac3 ac3Var = this.a;
        this.c = dc3Var.a;
        this.d = Collections.EMPTY_MAP;
        try {
            return ac3Var.b(dc3Var);
        } finally {
            Uri uri = ac3Var.getUri();
            if (uri != null) {
                this.c = uri;
            }
            this.d = ac3Var.i();
        }
    }

    @Override // defpackage.ac3
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.ac3
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.ac3
    public final Map i() {
        return this.a.i();
    }

    @Override // defpackage.ac3
    public final void m(lp3 lp3Var) {
        lp3Var.getClass();
        this.a.m(lp3Var);
    }

    @Override // defpackage.sb3
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.a.read(bArr, i, i2);
        if (i3 != -1) {
            this.b += (long) i3;
        }
        return i3;
    }
}
