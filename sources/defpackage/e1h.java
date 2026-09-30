package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e1h implements Runnable {
    public final /* synthetic */ int a = 0;
    public final URL b;
    public final byte[] c;
    public final String d;
    public final Map e;
    public final Object f;
    public final /* synthetic */ m4 g;

    public e1h(g1h g1hVar, String str, URL url, byte[] bArr, Map map, b1h b1hVar) {
        Objects.requireNonNull(g1hVar);
        this.g = g1hVar;
        oa7.x(str);
        oa7.A(url);
        this.b = url;
        this.c = bArr;
        this.f = b1hVar;
        this.d = str;
        this.e = map;
    }

    public void a(final int i, final IOException iOException, final byte[] bArr, final Map map) {
        m3h m3hVar = ((w3h) ((m8h) this.g).b).g;
        w3h.h(m3hVar);
        m3hVar.J0(new Runnable() { // from class: j8h
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                e1h e1hVar = this.a;
                ((h8h) e1hVar.f).a(e1hVar.d, i, iOException, bArr, map);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:164:0x02be  */
    /* JADX WARN: Code duplicated, block: B:174:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:178:0x02a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x02e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0154  */
    /* JADX WARN: Code duplicated, block: B:91:0x0178  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [e1h] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.Map] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Throwable th;
        int responseCode;
        HttpURLConnection httpURLConnection;
        IOException iOException;
        Map map;
        q0h q0hVar;
        m3h m3hVar;
        InputStream inputStream;
        Throwable th2;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection2;
        ?? r6;
        IOException iOException2;
        OutputStream outputStream2;
        ?? r5;
        String str;
        Object obj;
        String str2;
        InputStream inputStream2;
        int i = this.a;
        String str3 = "Content-Encoding";
        byte[] bArr = this.c;
        Map map2 = this.e;
        URL url = this.b;
        m4 m4Var = this.g;
        int responseCode2 = 0;
        String str4 = this.d;
        switch (i) {
            case 0:
                OutputStream outputStream3 = null;
                Map map3 = null;
                outputStream = null;
                outputStream3 = null;
                outputStream = null;
                outputStream3 = null;
                OutputStream outputStream4 = null;
                b1h b1hVar = (b1h) this.f;
                g1h g1hVar = (g1h) m4Var;
                w3h w3hVar = (w3h) g1hVar.b;
                w3h w3hVar2 = (w3h) g1hVar.b;
                m3h m3hVar2 = w3hVar.g;
                w3h.h(m3hVar2);
                m3hVar2.E0();
                try {
                    URLConnection uRLConnectionOpenConnection = url.openConnection();
                    if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection.setDefaultUseCaches(false);
                    qqg qqgVar = w3hVar2.d;
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setReadTimeout(61000);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoInput(true);
                    if (map2 != null) {
                        try {
                            for (Map.Entry entry : map2.entrySet()) {
                                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                            }
                        } catch (IOException e) {
                            iOException = e;
                            responseCode = 0;
                            map = null;
                            if (outputStream4 != null) {
                                try {
                                    outputStream4.close();
                                } catch (IOException e2) {
                                    w0h w0hVar = w3hVar2.f;
                                    w3h.h(w0hVar);
                                    w0hVar.g.c(w0h.E0(str4), e2, "Error closing HTTP compressed POST connection output stream. appId");
                                }
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            m3hVar = w3hVar2.g;
                            w3h.h(m3hVar);
                            q0hVar = new q0h(this.d, b1hVar, responseCode, iOException, (byte[]) null, map);
                            m3hVar.J0(q0hVar);
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            responseCode = 0;
                            th = th;
                            if (outputStream3 != null) {
                                try {
                                    outputStream3.close();
                                } catch (IOException e3) {
                                    w0h w0hVar2 = w3hVar2.f;
                                    w3h.h(w0hVar2);
                                    w0hVar2.g.c(w0h.E0(str4), e3, "Error closing HTTP compressed POST connection output stream. appId");
                                }
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            m3h m3hVar3 = w3hVar2.g;
                            w3h.h(m3hVar3);
                            m3hVar3.J0(new q0h(this.d, b1hVar, responseCode, (IOException) null, (byte[]) null, map3));
                            throw th;
                        }
                    }
                    if (bArr != null) {
                        lch lchVar = g1hVar.c.g;
                        ich.S(lchVar);
                        byte[] bArrK1 = lchVar.k1(bArr);
                        w0h w0hVar3 = w3hVar2.f;
                        w3h.h(w0hVar3);
                        tz0 tz0Var = w0hVar3.Z;
                        int length = bArrK1.length;
                        tz0Var.b(Integer.valueOf(length), "Uploading data. size");
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                        httpURLConnection.setFixedLengthStreamingMode(length);
                        httpURLConnection.connect();
                        OutputStream outputStream5 = httpURLConnection.getOutputStream();
                        try {
                            outputStream5.write(bArrK1);
                            outputStream5.close();
                        } catch (IOException e4) {
                            iOException = e4;
                            responseCode = 0;
                            map = null;
                            outputStream4 = outputStream5;
                            if (outputStream4 != null) {
                                outputStream4.close();
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            m3hVar = w3hVar2.g;
                            w3h.h(m3hVar);
                            q0hVar = new q0h(this.d, b1hVar, responseCode, iOException, (byte[]) null, map);
                            m3hVar.J0(q0hVar);
                            return;
                        } catch (Throwable th4) {
                            th = th4;
                            responseCode = 0;
                            outputStream3 = outputStream5;
                            httpURLConnection = httpURLConnection;
                            th = th;
                            if (outputStream3 != null) {
                                outputStream3.close();
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            m3h m3hVar4 = w3hVar2.g;
                            w3h.h(m3hVar4);
                            m3hVar4.J0(new q0h(this.d, b1hVar, responseCode, (IOException) null, (byte[]) null, map3));
                            throw th;
                        }
                    }
                    responseCode = httpURLConnection.getResponseCode();
                    try {
                        try {
                            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                inputStream = httpURLConnection.getInputStream();
                                try {
                                    byte[] bArr2 = new byte[UserMetadata.MAX_ATTRIBUTE_SIZE];
                                    while (true) {
                                        int i2 = inputStream.read(bArr2);
                                        if (i2 <= 0) {
                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                            inputStream.close();
                                            httpURLConnection.disconnect();
                                            m3hVar = w3hVar2.g;
                                            w3h.h(m3hVar);
                                            q0hVar = new q0h(this.d, b1hVar, responseCode, (IOException) null, byteArray, headerFields);
                                            m3hVar.J0(q0hVar);
                                            return;
                                        }
                                        byteArrayOutputStream.write(bArr2, 0, i2);
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                inputStream = null;
                            }
                        } catch (IOException e5) {
                            iOException = e5;
                            map = null;
                            if (outputStream4 != null) {
                                outputStream4.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            m3hVar = w3hVar2.g;
                            w3h.h(m3hVar);
                            q0hVar = new q0h(this.d, b1hVar, responseCode, iOException, (byte[]) null, map);
                            break;
                        } catch (Throwable th7) {
                            th = th7;
                            th = th;
                            if (outputStream3 != null) {
                                outputStream3.close();
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            m3h m3hVar5 = w3hVar2.g;
                            w3h.h(m3hVar5);
                            m3hVar5.J0(new q0h(this.d, b1hVar, responseCode, (IOException) null, (byte[]) null, map3));
                            throw th;
                        }
                    } catch (IOException e6) {
                        iOException = e6;
                        if (outputStream4 != null) {
                            outputStream4.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        m3hVar = w3hVar2.g;
                        w3h.h(m3hVar);
                        q0hVar = new q0h(this.d, b1hVar, responseCode, iOException, (byte[]) null, map);
                        break;
                    } catch (Throwable th8) {
                        th = th8;
                        httpURLConnection = httpURLConnection;
                        th = th;
                        if (outputStream3 != null) {
                            outputStream3.close();
                            break;
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        m3h m3hVar6 = w3hVar2.g;
                        w3h.h(m3hVar6);
                        m3hVar6.J0(new q0h(this.d, b1hVar, responseCode, (IOException) null, (byte[]) null, map3));
                        throw th;
                    }
                } catch (IOException e7) {
                    iOException = e7;
                    responseCode = 0;
                    httpURLConnection = null;
                    map = null;
                } catch (Throwable th9) {
                    th = th9;
                    responseCode = 0;
                    httpURLConnection = null;
                    map3 = null;
                }
                break;
            default:
                m8h m8hVar = (m8h) m4Var;
                w3h w3hVar3 = (w3h) m8hVar.b;
                w3h w3hVar4 = (w3h) m8hVar.b;
                m3h m3hVar7 = w3hVar3.g;
                w3h.h(m3hVar7);
                m3hVar7.E0();
                try {
                    URLConnection uRLConnectionOpenConnection2 = url.openConnection();
                    if (!(uRLConnectionOpenConnection2 instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection2;
                    httpURLConnection2.setDefaultUseCaches(false);
                    qqg qqgVar2 = w3hVar4.d;
                    httpURLConnection2.setConnectTimeout(60000);
                    httpURLConnection2.setReadTimeout(61000);
                    httpURLConnection2.setInstanceFollowRedirects(false);
                    httpURLConnection2.setDoInput(true);
                    if (map2 != null) {
                        try {
                            try {
                                for (Map.Entry entry2 : map2.entrySet()) {
                                    httpURLConnection2.addRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                outputStream = null;
                                obj = null;
                                th2 = th;
                                r6 = obj;
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (IOException e8) {
                                        w0h w0hVar4 = w3hVar4.f;
                                        w3h.h(w0hVar4);
                                        w0hVar4.g.c(w0h.E0(str4), e8, "Error closing HTTP compressed POST connection output stream. appId");
                                    }
                                    break;
                                }
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                a(responseCode2, null, null, r6);
                                throw th2;
                            }
                        } catch (IOException e9) {
                            e = e9;
                            str = null;
                            iOException2 = e;
                            outputStream2 = null;
                            r5 = str;
                            if (outputStream2 != null) {
                                try {
                                    outputStream2.close();
                                } catch (IOException e10) {
                                    w0h w0hVar5 = w3hVar4.f;
                                    w3h.h(w0hVar5);
                                    w0hVar5.g.c(w0h.E0(str4), e10, "Error closing HTTP compressed POST connection output stream. appId");
                                }
                                break;
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            a(responseCode2, iOException2, null, r5);
                            return;
                        }
                    }
                    if (bArr != null) {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                            gZIPOutputStream.write(bArr);
                            gZIPOutputStream.close();
                            byteArrayOutputStream2.close();
                            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                            w0h w0hVar6 = w3hVar4.f;
                            w3h.h(w0hVar6);
                            tz0 tz0Var2 = w0hVar6.Z;
                            int length2 = byteArray2.length;
                            tz0Var2.b(Integer.valueOf(length2), "Uploading data. size");
                            httpURLConnection2.setDoOutput(true);
                            httpURLConnection2.addRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection2.setFixedLengthStreamingMode(length2);
                            httpURLConnection2.connect();
                            outputStream = httpURLConnection2.getOutputStream();
                            try {
                                outputStream.write(byteArray2);
                                outputStream.close();
                            } catch (IOException e11) {
                                iOException2 = e11;
                                outputStream2 = outputStream;
                                httpURLConnection2 = httpURLConnection2;
                                r5 = 0;
                                if (outputStream2 != null) {
                                    outputStream2.close();
                                    break;
                                }
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                a(responseCode2, iOException2, null, r5);
                                return;
                            } catch (Throwable th11) {
                                th = th11;
                                httpURLConnection2 = httpURLConnection2;
                                obj = null;
                                th2 = th;
                                r6 = obj;
                                if (outputStream != null) {
                                    outputStream.close();
                                    break;
                                }
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                a(responseCode2, null, null, r6);
                                throw th2;
                            }
                        } catch (IOException e12) {
                            w0h w0hVar7 = w3hVar4.f;
                            w3h.h(w0hVar7);
                            w0hVar7.g.b(e12, "Failed to gzip post request content");
                            throw e12;
                        }
                    }
                    responseCode2 = httpURLConnection2.getResponseCode();
                    try {
                        try {
                            Map<String, List<String>> headerFields2 = httpURLConnection2.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                inputStream2 = httpURLConnection2.getInputStream();
                                try {
                                    byte[] bArr3 = new byte[UserMetadata.MAX_ATTRIBUTE_SIZE];
                                    while (true) {
                                        int i3 = inputStream2.read(bArr3);
                                        if (i3 <= 0) {
                                            byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                                            inputStream2.close();
                                            httpURLConnection2.disconnect();
                                            a(responseCode2, null, byteArray3, headerFields2);
                                            return;
                                        }
                                        byteArrayOutputStream3.write(bArr3, 0, i3);
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                inputStream2 = null;
                            }
                        } catch (IOException e13) {
                            e = e13;
                            str2 = str3;
                            str = str2;
                            iOException2 = e;
                            outputStream2 = null;
                            r5 = str;
                            if (outputStream2 != null) {
                                outputStream2.close();
                                break;
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            a(responseCode2, iOException2, null, r5);
                            return;
                        } catch (Throwable th14) {
                            th = th14;
                            responseCode2 = responseCode2;
                            obj = "Content-Encoding";
                            outputStream = null;
                            httpURLConnection2 = httpURLConnection2;
                            th2 = th;
                            r6 = obj;
                            if (outputStream != null) {
                                outputStream.close();
                                break;
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            a(responseCode2, null, null, r6);
                            throw th2;
                        }
                    } catch (IOException e14) {
                        e = e14;
                        str2 = null;
                        str = str2;
                        iOException2 = e;
                        outputStream2 = null;
                        r5 = str;
                        if (outputStream2 != null) {
                            outputStream2.close();
                            break;
                        }
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        a(responseCode2, iOException2, null, r5);
                        return;
                    } catch (Throwable th15) {
                        th = th15;
                        responseCode2 = responseCode2;
                        outputStream = null;
                        obj = null;
                        th2 = th;
                        r6 = obj;
                        if (outputStream != null) {
                            outputStream.close();
                            break;
                        }
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        a(responseCode2, null, null, r6);
                        throw th2;
                    }
                } catch (IOException e15) {
                    iOException2 = e15;
                    outputStream2 = null;
                    httpURLConnection2 = null;
                } catch (Throwable th16) {
                    th2 = th16;
                    outputStream = null;
                    httpURLConnection2 = null;
                    r6 = 0;
                }
                break;
        }
    }

    public e1h(m8h m8hVar, String str, URL url, byte[] bArr, HashMap map, h8h h8hVar) {
        Objects.requireNonNull(m8hVar);
        this.g = m8hVar;
        oa7.x(str);
        this.b = url;
        this.c = bArr;
        this.f = h8hVar;
        this.d = str;
        this.e = map;
    }
}
