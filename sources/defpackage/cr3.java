package defpackage;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cr3 extends qt0 {
    public long X;
    public final w84 e;
    public final w84 f;
    public dc3 g;
    public HttpURLConnection v;
    public InputStream w;
    public boolean x;
    public int y;
    public long z;

    public cr3(w84 w84Var) {
        super(true);
        this.e = w84Var;
        this.f = new w84(12);
    }

    @Override // defpackage.ac3
    public final long b(dc3 dc3Var) throws ns6 {
        byte[] bArrB;
        this.g = dc3Var;
        long j = 0;
        this.X = 0L;
        this.z = 0L;
        p();
        try {
            Thread threadCurrentThread = Thread.currentThread();
            TrafficStats.setThreadStatsTag((int) (Build.VERSION.SDK_INT < 36 ? threadCurrentThread.getId() : threadCurrentThread.threadId()));
            HttpURLConnection httpURLConnectionS = s(new URL(dc3Var.a.toString()), dc3Var.c, dc3Var.d, dc3Var.f, dc3Var.g, (dc3Var.i & 1) == 1, true, dc3Var.e);
            long j2 = dc3Var.g;
            long j3 = dc3Var.f;
            this.v = httpURLConnectionS;
            this.y = httpURLConnectionS.getResponseCode();
            String responseMessage = httpURLConnectionS.getResponseMessage();
            int i = this.y;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionS.getHeaderFields();
                if (this.y == 416 && j3 == dt6.c(httpURLConnectionS.getHeaderField("Content-Range"))) {
                    this.x = true;
                    q(dc3Var);
                    if (j2 != -1) {
                        return j2;
                    }
                    return 0L;
                }
                InputStream errorStream = httpURLConnectionS.getErrorStream();
                try {
                    bArrB = errorStream != null ? o61.b(errorStream) : pqf.b;
                } catch (IOException unused) {
                    bArrB = pqf.b;
                }
                r();
                throw new ps6(this.y, responseMessage, this.y == 416 ? new bc3(2008) : null, headerFields, dc3Var, bArrB);
            }
            httpURLConnectionS.getContentType();
            if (this.y == 200 && j3 != 0) {
                j = j3;
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionS.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase || j2 != -1) {
                this.z = j2;
            } else {
                long jB = dt6.b(httpURLConnectionS.getHeaderField("Content-Length"), httpURLConnectionS.getHeaderField("Content-Range"));
                this.z = jB != -1 ? jB - j : -1L;
            }
            try {
                this.w = httpURLConnectionS.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.w = new GZIPInputStream(this.w);
                }
                this.x = true;
                q(dc3Var);
                try {
                    t(j, dc3Var);
                    return this.z;
                } catch (IOException e) {
                    r();
                    if (e instanceof ns6) {
                        throw ((ns6) e);
                    }
                    throw new ns6(e, dc3Var, 2000, 1);
                }
            } catch (IOException e2) {
                r();
                throw new ns6(e2, dc3Var, 2000, 1);
            }
        } catch (IOException e3) {
            r();
            throw ns6.a(e3, dc3Var, 1);
        }
    }

    @Override // defpackage.ac3
    public final void close() {
        try {
            InputStream inputStream = this.w;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    dc3 dc3Var = this.g;
                    String str = pqf.a;
                    throw new ns6(e, dc3Var, 2000, 3);
                }
            }
            this.w = null;
            r();
            if (this.x) {
                this.x = false;
                n();
            }
            this.v = null;
            this.g = null;
            TrafficStats.clearThreadStatsTag();
        } catch (Throwable th) {
            this.w = null;
            r();
            if (this.x) {
                this.x = false;
                n();
            }
            this.v = null;
            this.g = null;
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    @Override // defpackage.ac3
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.v;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        dc3 dc3Var = this.g;
        if (dc3Var != null) {
            return dc3Var.a;
        }
        return null;
    }

    @Override // defpackage.ac3
    public final Map i() {
        HttpURLConnection httpURLConnection = this.v;
        return httpURLConnection == null ? dpb.g : new br3(httpURLConnection.getHeaderFields());
    }

    public final void r() {
        HttpURLConnection httpURLConnection = this.v;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                xo1.y("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
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
                    InputStream inputStream = this.w;
                    String str = pqf.a;
                    i3 = inputStream.read(bArr, i, i2);
                    if (i3 != -1) {
                        this.X += (long) i3;
                        j(i3);
                        return i3;
                    }
                }
            } else {
                InputStream inputStream2 = this.w;
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
            dc3 dc3Var = this.g;
            String str3 = pqf.a;
            throw ns6.a(e, dc3Var, 2);
        }
    }

    public final HttpURLConnection s(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        httpURLConnection.setConnectTimeout(8000);
        httpURLConnection.setReadTimeout(8000);
        HashMap map2 = new HashMap();
        map2.putAll(this.e.Y0());
        map2.putAll(this.f.Y0());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = dt6.a(j, j2);
        if (strA != null) {
            httpURLConnection.setRequestProperty("Range", strA);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(dc3.b(i));
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    public final void t(long j, dc3 dc3Var) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int iMin = (int) Math.min(j, 4096L);
            InputStream inputStream = this.w;
            String str = pqf.a;
            int i = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new ns6(new InterruptedIOException(), dc3Var, 2000, 1);
            }
            if (i == -1) {
                throw new ns6(dc3Var, 2008);
            }
            j -= (long) i;
            j(i);
        }
    }
}
