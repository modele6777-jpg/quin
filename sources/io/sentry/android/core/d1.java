package io.sentry.android.core;

import defpackage.mfg;
import defpackage.rx0;
import io.sentry.p2;
import io.sentry.q5;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class d1 {
    public boolean a;
    public final Object b;
    public final Object c;

    public d1(SentryAndroidOptions sentryAndroidOptions) {
        this.c = new ArrayList();
        this.a = false;
        this.b = sentryAndroidOptions;
    }

    public static void d(BufferedInputStream bufferedInputStream, long j) {
        while (j > 0) {
            long jSkip = bufferedInputStream.skip(j);
            if (jSkip != 0) {
                j -= jSkip;
            } else {
                if (bufferedInputStream.read() == -1) {
                    throw new EOFException("Unexpected end of stream while skipping bytes");
                }
                j--;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0058 A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:5:0x0011, B:6:0x001d, B:8:0x0025, B:21:0x0058, B:13:0x0038, B:15:0x0040, B:18:0x0047, B:20:0x004f, B:24:0x005f, B:27:0x0069), top: B:50:0x0011, outer: #4 }] */
    public c1 a(BufferedInputStream bufferedInputStream, int i, File file) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.b;
        c1 c1Var = null;
        try {
            mfg mfgVar = new mfg(bufferedInputStream, i);
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(mfgVar, StandardCharsets.UTF_8);
                try {
                    io.sentry.j2 j2Var = new io.sentry.j2(inputStreamReader);
                    io.sentry.vendor.gson.stream.a aVar = j2Var.a;
                    j2Var.beginObject();
                    String strO = null;
                    Date dateO0 = null;
                    while (aVar.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strNextName = aVar.nextName();
                        int iHashCode = strNextName.hashCode();
                        if (iHashCode != 55126294) {
                            if (iHashCode == 1874684019 && strNextName.equals("platform")) {
                                strO = j2Var.O();
                            } else {
                                j2Var.skipValue();
                            }
                        } else if (strNextName.equals("timestamp")) {
                            dateO0 = j2Var.o0(sentryAndroidOptions.getLogger());
                        } else {
                            j2Var.skipValue();
                        }
                        if (strO != null && dateO0 != null) {
                            break;
                        }
                    }
                    if ("native".equals(strO) && dateO0 != null) {
                        c1Var = new c1(file, dateO0.getTime());
                    }
                    inputStreamReader.close();
                    mfgVar.close();
                    return c1Var;
                } catch (Throwable th) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    mfgVar.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            sentryAndroidOptions.getLogger().c(q5.DEBUG, th5, "Error parsing event JSON from: %s", file.getName());
            return null;
        }
    }

    public Properties b() {
        p2 p2Var = (p2) this.c;
        String str = (String) this.b;
        try {
            File file = new File(str.trim());
            if (!file.isFile() || !file.canRead()) {
                if (file.isFile()) {
                    if (!file.canRead()) {
                        p2Var.i(q5.ERROR, "Failed to load Sentry configuration since it is not readable: %s", str);
                    }
                } else if (this.a) {
                    p2Var.i(q5.ERROR, "Failed to load Sentry configuration since it is not a file or does not exist: %s", str);
                    return null;
                }
                return null;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                bufferedInputStream.close();
                return properties;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            p2Var.c(q5.ERROR, th3, "Failed to load Sentry configuration from file: %s", str);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:4:0x0011, B:5:0x001d, B:7:0x0025, B:20:0x0054, B:12:0x0038, B:14:0x0040, B:17:0x0047, B:19:0x004f, B:24:0x005d), top: B:40:0x0011, outer: #2 }] */
    public rx0 c(String str) {
        try {
            Charset charset = StandardCharsets.UTF_8;
            InputStreamReader inputStreamReader = new InputStreamReader(new ByteArrayInputStream(str.getBytes(charset)), charset);
            try {
                io.sentry.j2 j2Var = new io.sentry.j2(inputStreamReader);
                io.sentry.vendor.gson.stream.a aVar = j2Var.a;
                j2Var.beginObject();
                int iNextInt = -1;
                String strO = null;
                while (aVar.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName = aVar.nextName();
                    int iHashCode = strNextName.hashCode();
                    if (iHashCode != -1106363674) {
                        if (iHashCode == 3575610 && strNextName.equals("type")) {
                            strO = j2Var.O();
                        } else {
                            j2Var.skipValue();
                        }
                    } else if (strNextName.equals("length")) {
                        iNextInt = j2Var.nextInt();
                    } else {
                        j2Var.skipValue();
                    }
                    if (strO != null && iNextInt >= 0) {
                        break;
                    }
                }
                if (iNextInt < 0) {
                    inputStreamReader.close();
                    return null;
                }
                rx0 rx0Var = new rx0();
                rx0Var.a = strO;
                rx0Var.b = iNextInt;
                inputStreamReader.close();
                return rx0Var;
            } catch (Throwable th) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            ((SentryAndroidOptions) this.b).getLogger().c(q5.DEBUG, th3, "Error parsing item header", new Object[0]);
            return null;
        }
        ((SentryAndroidOptions) this.b).getLogger().c(q5.DEBUG, th3, "Error parsing item header", new Object[0]);
        return null;
    }

    public d1(String str, p2 p2Var, boolean z) {
        this.b = str;
        this.c = p2Var;
        this.a = z;
    }
}
