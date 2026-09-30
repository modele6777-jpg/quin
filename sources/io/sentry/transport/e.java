package io.sentry.transport;

import com.adjust.sdk.Constants;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import defpackage.ib8;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.n6;
import io.sentry.q5;
import io.sentry.z0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {
    public static final Charset e = Charset.forName(Constants.ENCODING);
    public final Proxy a;
    public final io.sentry.internal.debugmeta.c b;
    public final SentryAndroidOptions c;
    public final io.sentry.android.core.internal.tombstone.b d;

    public e(SentryAndroidOptions sentryAndroidOptions, io.sentry.internal.debugmeta.c cVar, io.sentry.android.core.internal.tombstone.b bVar) {
        Proxy proxy;
        this.b = cVar;
        this.c = sentryAndroidOptions;
        this.d = bVar;
        n6 proxy2 = sentryAndroidOptions.getProxy();
        if (proxy2 != null) {
            String str = proxy2.b;
            try {
                proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxy2.a, Integer.parseInt(str)));
            } catch (NumberFormatException e2) {
                this.c.getLogger().c(q5.ERROR, e2, ib8.j("Failed to parse Sentry Proxy port: ", str, ". Proxy is ignored"), new Object[0]);
                proxy = null;
            }
        } else {
            proxy = null;
        }
        this.a = proxy;
        if (proxy == null || sentryAndroidOptions.getProxy() == null) {
            return;
        }
        String str2 = sentryAndroidOptions.getProxy().c;
        String str3 = sentryAndroidOptions.getProxy().d;
        String str4 = sentryAndroidOptions.getProxy().a;
        if (str2 == null || str3 == null) {
            return;
        }
        Authenticator.setDefault(new l(str2, str3, str4));
    }

    public static void a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String b(HttpURLConnection httpURLConnection) {
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, e));
                try {
                    StringBuilder sb = new StringBuilder();
                    boolean z = true;
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (!z) {
                            sb.append("\n");
                        }
                        sb.append(line);
                        z = false;
                        if (errorStream != null) {
                            try {
                                errorStream.close();
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                        throw th;
                    }
                    String string = sb.toString();
                    bufferedReader.close();
                    if (errorStream != null) {
                        errorStream.close();
                    }
                    return string;
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                if (errorStream != null) {
                    errorStream.close();
                }
                throw th4;
            }
        } catch (IOException unused) {
            return "Failed to obtain error message while analyzing send failure.";
        }
    }

    public final io.sentry.config.a c(HttpURLConnection httpURLConnection) {
        q5 q5Var;
        SentryAndroidOptions sentryAndroidOptions = this.c;
        try {
            int responseCode = httpURLConnection.getResponseCode();
            e(httpURLConnection, responseCode);
            if (responseCode == 200) {
                sentryAndroidOptions.getLogger().i(q5.DEBUG, "Envelope sent successfully.", new Object[0]);
                return r.c;
            }
            if (responseCode == 413) {
                z0 logger = sentryAndroidOptions.getLogger();
                q5Var = q5.ERROR;
                logger.i(q5Var, "Envelope was discarded by the server because it was too large. Consider reducing the size of events, breadcrumbs, or attachments. You can use the `SentryOptions.onOversizedEvent` callback to customize how oversized events are handled.", new Object[0]);
            } else {
                z0 logger2 = sentryAndroidOptions.getLogger();
                q5Var = q5.ERROR;
                logger2.i(q5Var, "Request failed, API returned %s", Integer.valueOf(responseCode));
            }
            if (sentryAndroidOptions.isDebug()) {
                sentryAndroidOptions.getLogger().i(q5Var, "%s", b(httpURLConnection));
            }
            return new q(responseCode);
        } catch (IOException e2) {
            sentryAndroidOptions.getLogger().c(q5.ERROR, e2, "Error reading and logging the response stream", new Object[0]);
            return new q(-1);
        } finally {
            a(httpURLConnection);
        }
    }

    public final io.sentry.config.a d(io.sentry.internal.debugmeta.c cVar) {
        SentryAndroidOptions sentryAndroidOptions = this.c;
        sentryAndroidOptions.getSocketTagger().e();
        io.sentry.internal.debugmeta.c cVar2 = this.b;
        URL url = (URL) cVar2.b;
        Proxy proxy = this.a;
        HttpURLConnection httpURLConnection = (HttpURLConnection) (proxy == null ? (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()) : (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection(proxy)));
        for (Map.Entry entry : ((HashMap) cVar2.c).entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Connection", "close");
        httpURLConnection.setConnectTimeout(sentryAndroidOptions.getConnectionTimeoutMillis());
        httpURLConnection.setReadTimeout(sentryAndroidOptions.getReadTimeoutMillis());
        SSLSocketFactory sslSocketFactory = sentryAndroidOptions.getSslSocketFactory();
        if ((httpURLConnection instanceof HttpsURLConnection) && sslSocketFactory != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sslSocketFactory);
        }
        httpURLConnection.connect();
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    sentryAndroidOptions.getSerializer().e(cVar, gZIPOutputStream);
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    return c(httpURLConnection);
                } catch (Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (Throwable th5) {
            try {
                sentryAndroidOptions.getLogger().c(q5.ERROR, th5, "An exception occurred while submitting the envelope to the Sentry server.", new Object[0]);
            } finally {
                c(httpURLConnection);
                sentryAndroidOptions.getSocketTagger().a();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00f0  */
    public final void e(HttpURLConnection httpURLConnection, int i) {
        long j;
        String[] strArr;
        double d;
        long j2;
        String[] strArr2;
        String string;
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        String headerField2 = httpURLConnection.getHeaderField("X-Sentry-Rate-Limits");
        io.sentry.android.core.internal.tombstone.b bVar = this.d;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) bVar.b;
        double d2 = 1000.0d;
        if (headerField2 == null) {
            if (i == 429) {
                if (headerField != null) {
                    try {
                        j = (long) (Double.parseDouble(headerField) * 1000.0d);
                    } catch (NumberFormatException unused) {
                        j = 60000;
                    }
                } else {
                    j = 60000;
                }
                bVar.b(io.sentry.p.All, new Date(System.currentTimeMillis() + j), j);
                return;
            }
            return;
        }
        int i2 = -1;
        String[] strArrSplit = headerField2.split(",", -1);
        int length = strArrSplit.length;
        int i3 = 0;
        int i4 = 0;
        while (i4 < length) {
            String[] strArrSplit2 = strArrSplit[i4].replace(" ", "").split(":", i2);
            if (strArrSplit2.length <= 0) {
                strArr = strArrSplit;
                d = d2;
            } else {
                String str = strArrSplit2[i3];
                if (str != null) {
                    try {
                        j2 = (long) (Double.parseDouble(str) * d2);
                    } catch (NumberFormatException unused2) {
                        j2 = 60000;
                    }
                } else {
                    j2 = 60000;
                }
                if (strArrSplit2.length > 1) {
                    String str2 = strArrSplit2[1];
                    d = d2;
                    Date date = new Date(System.currentTimeMillis() + j2);
                    if (str2 == null || str2.isEmpty()) {
                        strArr = strArrSplit;
                        bVar.b(io.sentry.p.All, date, j2);
                    } else {
                        String[] strArrSplit3 = str2.split(";", i2);
                        int length2 = strArrSplit3.length;
                        int i5 = i3;
                        while (i5 < length2) {
                            String str3 = strArrSplit3[i5];
                            io.sentry.p pVarValueOf = io.sentry.p.Unknown;
                            try {
                                Charset charset = io.sentry.util.p.a;
                                if (str3 == null || str3.isEmpty()) {
                                    string = str3;
                                } else {
                                    String[] strArrSplit4 = io.sentry.util.p.b.split(str3, i2);
                                    StringBuilder sb = new StringBuilder();
                                    for (String str4 : strArrSplit4) {
                                        sb.append(io.sentry.util.p.b(str4));
                                    }
                                    string = sb.toString();
                                }
                                if (string != null) {
                                    pVarValueOf = io.sentry.p.valueOf(string);
                                    strArr2 = strArrSplit;
                                } else {
                                    strArr2 = strArrSplit;
                                    try {
                                        sentryAndroidOptions.getLogger().i(q5.ERROR, "Couldn't capitalize: %s", str3);
                                    } catch (IllegalArgumentException e2) {
                                        e = e2;
                                        sentryAndroidOptions.getLogger().c(q5.INFO, e, "Unknown category: %s", str3);
                                    }
                                }
                            } catch (IllegalArgumentException e3) {
                                e = e3;
                                strArr2 = strArrSplit;
                            }
                            if (!io.sentry.p.Unknown.equals(pVarValueOf)) {
                                bVar.b(pVarValueOf, date, j2);
                            }
                            i5++;
                            strArrSplit = strArr2;
                            i2 = -1;
                        }
                        strArr = strArrSplit;
                    }
                } else {
                    strArr = strArrSplit;
                    d = d2;
                }
            }
            i4++;
            d2 = d;
            strArrSplit = strArr;
            i2 = -1;
            i3 = 0;
        }
    }
}
