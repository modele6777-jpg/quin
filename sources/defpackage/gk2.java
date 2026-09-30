package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gk2 {
    public boolean a;
    public boolean b;
    public Object c;
    public Serializable d;

    public gk2(String str, String str2, boolean z) {
        this.a = z;
        this.c = str;
        this.d = TextUtils.isEmpty(str2) ? "api.mixpanel.com" : str2;
    }

    public hk2 a() {
        return new hk2(this.a, this.b, (String[]) this.c, (String[]) this.d);
    }

    public void b(qz1... qz1VarArr) {
        if (!this.a) {
            qc0.j("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(qz1VarArr.length);
        for (qz1 qz1Var : qz1VarArr) {
            arrayList.add(qz1Var.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.a) {
            qc0.j("no cipher suites for cleartext connections");
        } else if (strArr2.length != 0) {
            this.c = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            qc0.j("At least one cipher suite is required");
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0003 A[SYNTHETIC] */
    public vea c(int i, String str, HashMap map, HashMap map2, byte[] bArr, SSLSocketFactory sSLSocketFactory) throws Throwable {
        String str2;
        String string;
        Exception exc = null;
        int i2 = 0;
        while (i2 < 3) {
            xs6 xs6VarF = f(i, str, "Primary", map, map2, bArr, sSLSocketFactory);
            str2 = str;
            int i3 = 2;
            if (xs6VarF.b) {
                return new vea(i3, (byte[]) xs6VarF.c, (String) xs6VarF.e);
            }
            boolean z = xs6VarF.a;
            Exception exc2 = (Exception) xs6VarF.d;
            if (z) {
                throw ((dqb) exc2);
            }
            String str3 = (String) this.c;
            if (str3 == null || str3.isEmpty()) {
                exc2 = exc2;
            } else {
                String str4 = (String) this.c;
                try {
                    URL url = new URL(str2);
                    string = new URL(url.getProtocol(), str4, url.getPort(), url.getFile()).toString();
                } catch (Exception e) {
                    db6.G("MixpanelAPI.Message", "Failed to replace host", e);
                    string = str2;
                }
                if (string.equals(str2)) {
                    db6.h1("MixpanelAPI.Message", "Failed to replace host for backup, skipping backup attempt");
                } else {
                    db6.f1("MixpanelAPI.Message", "Primary failed, trying backup: ".concat(string));
                    xs6 xs6VarF2 = f(i, string, "Backup", map, map2, bArr, sSLSocketFactory);
                    exc = (Exception) xs6VarF2.d;
                    if (xs6VarF2.b) {
                        return new vea(i3, (byte[]) xs6VarF2.c, (String) xs6VarF2.e);
                    }
                    if (xs6VarF2.a) {
                        throw ((dqb) exc);
                    }
                    db6.h1("MixpanelAPI.Message", "Backup also failed: " + exc.getMessage());
                }
                i2++;
                if (i2 < 3) {
                    db6.D("MixpanelAPI.Message", "Attempt " + i2 + " failed, retrying...");
                    try {
                        Thread.sleep(i2 * 100);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            exc = exc2;
            i2++;
            if (i2 < 3) {
                db6.D("MixpanelAPI.Message", "Attempt " + i2 + " failed, retrying...");
                Thread.sleep(i2 * 100);
            }
        }
        str2 = str;
        db6.F("MixpanelAPI.Message", ib8.y(i) + " request to " + str2 + " failed after " + i2 + " attempts");
        if (exc instanceof eqb) {
            throw ((eqb) exc);
        }
        if (exc instanceof IOException) {
            throw ((IOException) exc);
        }
        if (exc != null) {
            throw new IOException(ib8.y(i) + " request failed after " + i2 + " attempts", exc);
        }
        throw new IOException(ib8.y(i) + " request failed after " + i2 + " attempts");
    }

    /* JADX WARN: Code duplicated, block: B:197:0x041e  */
    /* JADX WARN: Code duplicated, block: B:209:0x0414 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0078  */
    /* JADX WARN: Code duplicated, block: B:223:0x0419 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v6 */
    public byte[] d(int i, String str, Map map, Map map2, byte[] bArr, SSLSocketFactory sSLSocketFactory) throws Throwable {
        String strL;
        Exception exc;
        EOFException eOFException;
        Throwable th;
        ?? r4;
        HttpURLConnection httpURLConnection;
        ?? r1;
        IOException iOException;
        Object obj;
        String str2;
        InputStream errorStream;
        byte[] byteArray;
        int i2 = i;
        ?? r5 = 1;
        z = true;
        boolean z = true;
        if (i2 != 1 || map == null || map.isEmpty()) {
            strL = str;
        } else {
            StringBuilder sb = new StringBuilder();
            Iterator it = map.entrySet().iterator();
            boolean z2 = true;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (!z2) {
                    sb.append("&");
                }
                String strEncode = URLEncoder.encode((String) entry.getKey(), Constants.ENCODING);
                String strEncode2 = URLEncoder.encode(entry.getValue().toString(), Constants.ENCODING);
                sb.append(strEncode);
                sb.append("=");
                sb.append(strEncode2);
                z2 = false;
            }
            String string = sb.toString();
            if (string.isEmpty()) {
                strL = str;
            } else {
                strL = ks0.l(ub3.o(str), str.contains("?") ? "&" : "?", string);
            }
        }
        StringBuilder sb2 = new StringBuilder("Attempting ");
        sb2.append(ib8.y(i2));
        sb2.append(" request to ");
        sb2.append(strL);
        sb2.append((i2 != 2 || bArr == null) ? (i2 != 2 || map == null) ? "" : " (URL params)" : " (Raw Body)");
        db6.f1("MixpanelAPI.Message", sb2.toString());
        System.nanoTime();
        ?? r10 = 0;
        r10 = 0;
        r10 = 0;
        try {
            try {
                try {
                    URL url = new URL(strL);
                    try {
                        InetAddress.getByName(url.getHost()).getHostAddress();
                    } catch (Exception e) {
                        String str3 = "Could not resolve IP address for " + url.getHost();
                        if (db6.L0(2)) {
                            Log.v("MixpanelAPI.Message", str3, e);
                        }
                    }
                    httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
                    if (sSLSocketFactory != null) {
                        try {
                            try {
                                if (httpURLConnection instanceof HttpsURLConnection) {
                                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
                                }
                            } catch (EOFException e2) {
                                eOFException = e2;
                                db6.D("MixpanelAPI.Message", "EOFException, likely network issue for request to " + strL);
                                throw new IOException("EOFException during network request", eOFException);
                            } catch (IOException e3) {
                                iOException = e3;
                                throw iOException;
                            } catch (Exception e4) {
                                exc = e4;
                                throw new IOException("Unexpected exception during network request", exc);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r4 = 0;
                            if (r10 != 0) {
                                try {
                                    r10.close();
                                } catch (IOException unused) {
                                }
                            }
                            if (r4 != 0) {
                                try {
                                    r4.close();
                                } catch (IOException unused2) {
                                }
                            }
                            if (httpURLConnection != null) {
                                throw th;
                            }
                            httpURLConnection.disconnect();
                            throw th;
                        }
                    }
                    httpURLConnection.setConnectTimeout(2000);
                    httpURLConnection.setReadTimeout(Constants.CONNECTION_TIMEOUT_VERIFY);
                    httpURLConnection.setRequestMethod(ib8.x(i2));
                    if (i2 != 2 || (bArr == null && map == null)) {
                        z = false;
                    }
                    httpURLConnection.setDoOutput(z);
                    String str4 = i2 == 2 ? bArr != null ? "application/json; charset=utf-8" : "application/x-www-form-urlencoded; charset=utf-8" : null;
                    if (map2 != null) {
                        for (Map.Entry entry2 : map2.entrySet()) {
                            httpURLConnection.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                            if (((String) entry2.getKey()).equalsIgnoreCase("Content-Type")) {
                                str4 = (String) entry2.getValue();
                            }
                        }
                    }
                    if (i2 == 2 && str4 != null) {
                        httpURLConnection.setRequestProperty("Content-Type", str4);
                    }
                    httpURLConnection.setConnectTimeout(15000);
                    httpURLConnection.setReadTimeout(60000);
                    if (i2 == 2) {
                        if (bArr != null) {
                            long length = bArr.length;
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            db6.f1("MixpanelAPI.Message", "Sending raw body of size: " + length);
                            byteArray = bArr;
                        } else if (map != null) {
                            Uri.Builder builder = new Uri.Builder();
                            for (Map.Entry entry3 : map.entrySet()) {
                                builder.appendQueryParameter((String) entry3.getKey(), entry3.getValue().toString());
                            }
                            String encodedQuery = builder.build().getEncodedQuery();
                            Objects.requireNonNull(encodedQuery);
                            byte[] bytes = encodedQuery.getBytes(StandardCharsets.UTF_8);
                            long length2 = bytes.length;
                            db6.f1("MixpanelAPI.Message", "Sending URL params (raw size): " + length2);
                            if (this.a) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                                try {
                                    gZIPOutputStream.write(bytes);
                                    gZIPOutputStream.close();
                                    byteArray = byteArrayOutputStream.toByteArray();
                                    long length3 = byteArray.length;
                                    httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                                    httpURLConnection.setFixedLengthStreamingMode(length3);
                                    db6.f1("MixpanelAPI.Message", "Gzipping params, compressed size: " + length3);
                                } catch (Throwable th3) {
                                    try {
                                        gZIPOutputStream.close();
                                        throw th3;
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                        throw th3;
                                    }
                                }
                            } else {
                                httpURLConnection.setFixedLengthStreamingMode(length2);
                                byteArray = bytes;
                            }
                        } else {
                            byteArray = new byte[0];
                            httpURLConnection.setFixedLengthStreamingMode(0);
                            db6.f1("MixpanelAPI.Message", "Sending POST request with empty body.");
                        }
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                        try {
                            bufferedOutputStream.write(byteArray);
                            bufferedOutputStream.flush();
                            bufferedOutputStream.close();
                        } catch (EOFException e5) {
                            eOFException = e5;
                            db6.D("MixpanelAPI.Message", "EOFException, likely network issue for request to " + strL);
                            throw new IOException("EOFException during network request", eOFException);
                        } catch (IOException e6) {
                            iOException = e6;
                            throw iOException;
                        } catch (Exception e7) {
                            exc = e7;
                            throw new IOException("Unexpected exception during network request", exc);
                        } catch (Throwable th5) {
                            th = th5;
                            r5 = 0;
                            r1 = bufferedOutputStream;
                            r10 = r1;
                            r4 = r5;
                            if (r10 != 0) {
                                r10.close();
                            }
                            if (r4 != 0) {
                                r4.close();
                            }
                            if (httpURLConnection != null) {
                                throw th;
                            }
                            httpURLConnection.disconnect();
                            throw th;
                        }
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    String responseMessage = httpURLConnection.getResponseMessage();
                    db6.f1("MixpanelAPI.Message", "Response Code: " + responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            byte[] bArr2 = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
                            while (true) {
                                int i3 = inputStream.read(bArr2, 0, UserMetadata.MAX_INTERNAL_KEY_SIZE);
                                if (i3 == -1) {
                                    break;
                                }
                                byteArrayOutputStream2.write(bArr2, 0, i3);
                            }
                            byteArrayOutputStream2.flush();
                            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                            try {
                                inputStream.close();
                            } catch (IOException unused3) {
                            }
                            httpURLConnection.disconnect();
                            return byteArray2;
                        } catch (EOFException e8) {
                            e = e8;
                            eOFException = e;
                            db6.D("MixpanelAPI.Message", "EOFException, likely network issue for request to " + strL);
                            throw new IOException("EOFException during network request", eOFException);
                        } catch (IOException e9) {
                            e = e9;
                            iOException = e;
                            throw iOException;
                        } catch (Exception e10) {
                            e = e10;
                            exc = e;
                            throw new IOException("Unexpected exception during network request", exc);
                        } catch (Throwable th6) {
                            th = th6;
                            obj = inputStream;
                            th = th;
                            r4 = obj;
                            if (r10 != 0) {
                                r10.close();
                            }
                            if (r4 != 0) {
                                r4.close();
                            }
                            if (httpURLConnection != null) {
                                throw th;
                            }
                            httpURLConnection.disconnect();
                            throw th;
                        }
                    }
                    obj = ") for URL: ";
                    if (responseCode >= 500 && responseCode <= 599) {
                        db6.h1("MixpanelAPI.Message", "Server error " + responseCode + " (" + responseMessage + ") for URL: " + strL);
                        throw new eqb("Service Unavailable: " + responseCode, httpURLConnection.getHeaderField("Retry-After"));
                    }
                    try {
                        db6.h1("MixpanelAPI.Message", "Client error " + responseCode + " (" + responseMessage + ") for URL: " + strL);
                        try {
                            errorStream = httpURLConnection.getErrorStream();
                            if (errorStream != null) {
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                    byte[] bArr3 = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
                                    while (true) {
                                        int i4 = errorStream.read(bArr3, 0, UserMetadata.MAX_INTERNAL_KEY_SIZE);
                                        if (i4 == -1) {
                                            break;
                                        }
                                        byteArrayOutputStream3.write(bArr3, 0, i4);
                                        try {
                                            db6.i1("MixpanelAPI.Message", "Could not read error stream.", e);
                                            obj = errorStream;
                                        } catch (EOFException e11) {
                                            e = e11;
                                            eOFException = e;
                                            db6.D("MixpanelAPI.Message", "EOFException, likely network issue for request to " + strL);
                                            throw new IOException("EOFException during network request", eOFException);
                                        } catch (IOException e12) {
                                            e = e12;
                                            iOException = e;
                                            throw iOException;
                                        } catch (Exception e13) {
                                            e = e13;
                                            exc = e;
                                            throw new IOException("Unexpected exception during network request", exc);
                                        }
                                    }
                                    byteArrayOutputStream3.flush();
                                    str2 = new String(byteArrayOutputStream3.toByteArray(), StandardCharsets.UTF_8);
                                    try {
                                        db6.h1("MixpanelAPI.Message", "Error Body: " + str2);
                                        obj = errorStream;
                                    } catch (Exception e14) {
                                        e = e14;
                                        db6.i1("MixpanelAPI.Message", "Could not read error stream.", e);
                                        obj = errorStream;
                                    }
                                } catch (Exception e15) {
                                    e = e15;
                                    str2 = null;
                                }
                            } else {
                                str2 = null;
                                obj = errorStream;
                            }
                        } catch (Exception e16) {
                            e = e16;
                            str2 = null;
                            errorStream = null;
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("HTTP error response: ");
                        sb3.append(responseCode);
                        sb3.append(" ");
                        sb3.append(responseMessage);
                        sb3.append(str2 != null ? " - Body: " + str2 : "");
                        new IOException(sb3.toString());
                        throw new dqb(responseCode, responseMessage);
                    } catch (Throwable th7) {
                        th = th7;
                        th = th;
                        r4 = obj;
                        if (r10 != 0) {
                            r10.close();
                        }
                        if (r4 != 0) {
                            r4.close();
                        }
                        if (httpURLConnection != null) {
                            throw th;
                        }
                        httpURLConnection.disconnect();
                        throw th;
                    }
                } catch (EOFException e17) {
                    eOFException = e17;
                } catch (IOException e18) {
                    throw e18;
                } catch (Exception e19) {
                    exc = e19;
                }
            } catch (Throwable th8) {
                th = th8;
                r4 = 0;
                httpURLConnection = null;
            }
        } catch (Throwable th9) {
            th = th9;
            httpURLConnection = null;
            r1 = i2;
        }
    }

    /* JADX WARN: Type inference failed for: r7v7, types: [java.io.Serializable, java.lang.String[]] */
    public void e(tye... tyeVarArr) {
        if (!this.a) {
            qc0.j("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(tyeVarArr.length);
        for (tye tyeVar : tyeVarArr) {
            arrayList.add(tyeVar.a());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.a) {
            qc0.j("no TLS versions for cleartext connections");
        } else if (strArr2.length != 0) {
            this.d = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            qc0.j("At least one TLS version is required");
        }
    }

    public xs6 f(int i, String str, String str2, Map map, Map map2, byte[] bArr, SSLSocketFactory sSLSocketFactory) throws Throwable {
        try {
            byte[] bArrD = d(i, str, map, map2, bArr, sSLSocketFactory);
            if (bArrD != null) {
                return new xs6(str, bArrD);
            }
            db6.f1("MixpanelAPI.Message", str2.concat(" request returned null response"));
            return new xs6(new IOException(str2.concat(" host returned null response")), false, str);
        } catch (dqb e) {
            StringBuilder sbP = tec.p("Client error from ", str2, " host, not attempting backup: ");
            sbP.append(e.getMessage());
            db6.h1("MixpanelAPI.Message", sbP.toString());
            return new xs6(e, true, str);
        } catch (IOException e2) {
            StringBuilder sbQ = kv2.q(str2, " request failed: ");
            sbQ.append(e2.getMessage());
            db6.f1("MixpanelAPI.Message", sbQ.toString());
            return new xs6(e2, false, str);
        } catch (Exception e3) {
            StringBuilder sbQ2 = kv2.q(str2, " request failed with exception: ");
            sbQ2.append(e3.getMessage());
            db6.f1("MixpanelAPI.Message", sbQ2.toString());
            return new xs6(e3, false, str);
        }
    }

    public gk2() {
        this.a = true;
    }
}
