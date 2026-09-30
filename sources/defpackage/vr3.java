package defpackage;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vr3 implements Closeable {
    public final /* synthetic */ int a;
    public final Object b;

    public vr3() {
        this.a = 1;
        this.b = new Inflater(true);
    }

    public static String h(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    public String b() {
        boolean z;
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.b;
        try {
            z = httpURLConnection.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
        } catch (NullPointerException e) {
            e = e;
            gf8.c("get error failed ", e);
            return e.getMessage();
        }
        if (z) {
            return null;
        }
        try {
            return "Unable to fetch " + httpURLConnection.getURL() + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + h(httpURLConnection);
        } catch (IOException | NullPointerException e2) {
            e = e2;
            gf8.c("get error failed ", e);
            return e.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((HttpURLConnection) obj).disconnect();
                break;
            default:
                ((Inflater) obj).end();
                break;
        }
    }

    public vr3(HttpURLConnection httpURLConnection) {
        this.a = 0;
        this.b = httpURLConnection;
    }
}
