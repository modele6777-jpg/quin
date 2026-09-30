package defpackage;

import android.net.Uri;
import com.adjust.sdk.network.ErrorCodes;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class im9 extends qt0 {
    public long X;
    public final hm9 e;
    public final w84 f;
    public final w84 g;
    public dc3 v;
    public ryb w;
    public InputStream x;
    public boolean y;
    public long z;

    static {
        pp8.a("media3.datasource.okhttp");
    }

    public im9(hm9 hm9Var, w84 w84Var) {
        super(true);
        this.e = hm9Var;
        this.g = w84Var;
        this.f = new w84(12);
    }

    @Override // defpackage.ac3
    public final long b(dc3 dc3Var) throws ns6 {
        ct6 ct6VarA;
        long j;
        etb etbVar;
        byte[] bArrB;
        this.v = dc3Var;
        this.X = 0L;
        this.z = 0L;
        p();
        long j2 = dc3Var.f;
        int i = dc3Var.c;
        long j3 = dc3Var.g;
        String string = dc3Var.a.toString();
        string.getClass();
        try {
            bt6 bt6Var = new bt6();
            bt6Var.d(null, string);
            ct6VarA = bt6Var.a();
        } catch (IllegalArgumentException unused) {
            ct6VarA = null;
        }
        if (ct6VarA == null) {
            throw new ns6("Malformed URL", dc3Var, ErrorCodes.PROTOCOL_EXCEPTION);
        }
        zsb zsbVar = new zsb();
        zsbVar.a = ct6VarA;
        HashMap map = new HashMap();
        map.putAll(this.g.Y0());
        map.putAll(this.f.Y0());
        map.putAll(dc3Var.e);
        for (Map.Entry entry : map.entrySet()) {
            zsbVar.a((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = dt6.a(j2, j3);
        if (strA != null) {
            zsbVar.c.a("Range", strA);
        }
        if ((dc3Var.i & 1) != 1) {
            zsbVar.c.a("Accept-Encoding", "identity");
        }
        byte[] bArr = dc3Var.d;
        if (bArr != null) {
            int i2 = ftb.a;
            int length = bArr.length;
            j = 0;
            ieg.a(bArr.length, 0L, length);
            etbVar = new etb(null, length, bArr);
        } else {
            j = 0;
            if (i == 2) {
                byte[] bArr2 = pqf.b;
                int i3 = ftb.a;
                bArr2.getClass();
                int length2 = bArr2.length;
                ieg.a(bArr2.length, 0L, length2);
                etbVar = new etb(null, length2, bArr2);
            } else {
                etbVar = null;
            }
        }
        zsbVar.b(dc3.b(i), etbVar);
        cib cibVar = new cib(this.e, new btb(zsbVar));
        try {
            o3d o3dVar = new o3d();
            FirebasePerfOkHttpClient.enqueue(cibVar, new kb6(24, o3dVar));
            try {
                ryb rybVar = (ryb) o3dVar.get();
                this.w = rybVar;
                vyb vybVar = rybVar.g;
                vybVar.getClass();
                this.x = vybVar.b();
                int i4 = rybVar.d;
                if (!rybVar.F0) {
                    if (i4 == 416 && j2 == dt6.c(rybVar.f.c("Content-Range"))) {
                        this.y = true;
                        q(dc3Var);
                        return j3 != -1 ? j3 : j;
                    }
                    try {
                        InputStream inputStream = this.x;
                        inputStream.getClass();
                        bArrB = o61.b(inputStream);
                    } catch (IOException unused2) {
                        bArrB = pqf.b;
                    }
                    byte[] bArr3 = bArrB;
                    TreeMap treeMapD = rybVar.f.d();
                    r();
                    throw new ps6(i4, rybVar.c, i4 == 416 ? new bc3(2008) : null, treeMapD, dc3Var, bArr3);
                }
                vybVar.l();
                long j4 = (i4 != 200 || j2 == j) ? j : j2;
                if (j3 != -1) {
                    this.z = j3;
                } else {
                    String strC = rybVar.f.c("Content-Length");
                    if (strC == null) {
                        strC = null;
                    }
                    String strC2 = rybVar.f.c("Content-Range");
                    long jB = dt6.b(strC, strC2 != null ? strC2 : null);
                    this.z = jB != -1 ? jB - j4 : -1L;
                }
                this.y = true;
                q(dc3Var);
                try {
                    s(j4, dc3Var);
                    return this.z;
                } catch (ns6 e) {
                    r();
                    throw e;
                }
            } catch (InterruptedException unused3) {
                cibVar.cancel();
                throw new InterruptedIOException();
            } catch (ExecutionException e2) {
                throw new IOException(e2);
            }
        } catch (IOException e3) {
            throw ns6.a(e3, dc3Var, 1);
        }
    }

    @Override // defpackage.ac3
    public final void close() {
        if (this.y) {
            this.y = false;
            n();
            r();
        }
        this.w = null;
        this.v = null;
    }

    @Override // defpackage.ac3
    public final Uri getUri() {
        ryb rybVar = this.w;
        if (rybVar != null) {
            return Uri.parse(rybVar.a.a.i);
        }
        dc3 dc3Var = this.v;
        if (dc3Var != null) {
            return dc3Var.a;
        }
        return null;
    }

    @Override // defpackage.ac3
    public final Map i() {
        ryb rybVar = this.w;
        return rybVar == null ? Collections.EMPTY_MAP : rybVar.f.d();
    }

    public final void r() {
        ryb rybVar = this.w;
        if (rybVar != null) {
            vyb vybVar = rybVar.g;
            vybVar.getClass();
            vybVar.close();
        }
        this.x = null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // defpackage.sb3
    public final int read(byte[] bArr, int i, int i2) throws ns6 {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.z;
            if (j != -1) {
                long j2 = j - this.X;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                    InputStream inputStream = this.x;
                    String str = pqf.a;
                    i3 = inputStream.read(bArr, i, i2);
                    if (i3 != -1) {
                        this.X += (long) i3;
                        j(i3);
                        return i3;
                    }
                }
            } else {
                InputStream inputStream2 = this.x;
                String str2 = pqf.a;
                i3 = inputStream2.read(bArr, i, i2);
                if (i3 != -1) {
                    this.X += (long) i3;
                    j(i3);
                    return i3;
                }
            }
            return -1;
        } catch (IOException e) {
            dc3 dc3Var = this.v;
            String str3 = pqf.a;
            throw ns6.a(e, dc3Var, 2);
        }
    }

    public final void s(long j, dc3 dc3Var) throws ns6 {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            try {
                int iMin = (int) Math.min(j, 4096L);
                InputStream inputStream = this.x;
                String str = pqf.a;
                int i = inputStream.read(bArr, 0, iMin);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (i == -1) {
                    throw new ns6(dc3Var, 2008);
                }
                j -= (long) i;
                j(i);
            } catch (IOException e) {
                if (!(e instanceof ns6)) {
                    throw new ns6(dc3Var, 2000);
                }
                throw ((ns6) e);
            }
        }
    }
}
